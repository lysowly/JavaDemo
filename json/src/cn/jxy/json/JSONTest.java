package cn.jxy.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JSONTest {

	private static Grade grade;

	private static Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("----测试方法执行之前执行----");
		student = new Student();
		grade = new Grade();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("----测试方法执行之后执行----");
		student = null;
		grade = null;
	}

	@Test
	// 测试Java对象转成Json的格式
	public void test() {
		grade.setId(1);
		grade.setName("java net");
		System.out.println(JSONSerializer.toJSON(grade));
	}

	@Test
	// 测试数组的JSON表现形式
	public void test2() {
		grade.setId(1);
		grade.setName("java");
		Student student = new Student();
		student.setName("小王");
		student.setDate(new Date());
		Student student2 = new Student();
		student2.setName("小李");
		student2.setDate(new Date());
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(student);
		stuList.add(student2);
		grade.setStulist(stuList);
		System.out.println(JSONSerializer.toJSON(grade));
	}

	@Test // 测试static是不能转化为json属性的
	public void test3() {
		student.setDate(new Date());
		student.setName("admin");
		student.setAge(18);
		System.out.println(JSONSerializer.toJSON(student));
		// 如果返回的是static,或者返回的类型不确定,那么可以采用map或者自己构建json格式
		JSONObject object = new JSONObject();
		object.put("age", student.getAge());
		object.put("date", student.getDate());
		object.put("name", student.getName());
		System.out.println(object.toString());
	}
	
	@Test // 解决自关联的问题
	public void test4() {
		student.setDate(new Date());
		student.setName("admin");
		//student.setStudent(new Student());
		// 通过配置jsonConfig来过滤相应的参数
		JsonConfig config=new JsonConfig();
		// 设置需要排除哪些字段, 例如排除密码字段
		config.setExcludes(new String[]{"date"});
		// 设置如果有些字段是自关联则过滤  STRICT: 缺省值,是否自关联都要转化
		// LENIENT: 如果有自关联对象,则值设置为null
		// NOPROP: 如果自关联则忽略属性
		config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		System.out.println(JSONObject.fromObject(student, config));
	}
	
	@Test // 通过自定义日期的处理类,来格式化日期数据
	public void test5() {
		student.setDate(new Date());
		student.setName("admin");
		JsonConfig config=new JsonConfig();
		// 指定某个Json类型的处理方式
		DataJsonValueProcessor dataValue=new DataJsonValueProcessor();
		config.registerJsonValueProcessor(Date.class, dataValue);
		System.out.println(JSONObject.fromObject(student, config));
	}
	
	@Test // 通过自定义日期的处理类,来格式化日期数据
	public void test6() {
		// JSONObject 可以自定义对象,JSONArray可以自定义数组
		JSONObject obj=new JSONObject();
		obj.put("id", 123);
		obj.put("name","admin");
		JSONObject obj2=new JSONObject();
		obj2.put("id", 234);
		obj2.put("name","xyz");
		JSONArray array=new JSONArray();
		array.add(obj);
		array.add(obj2);
		// 吧array对象在存储到obj对象中
		JSONObject temp=new JSONObject();
		temp.put("array", array); // {array:[{id:123,name:'admin'},{.....}]}
		System.out.println(JSONObject.fromObject(temp));
	}
	
	
	
}
