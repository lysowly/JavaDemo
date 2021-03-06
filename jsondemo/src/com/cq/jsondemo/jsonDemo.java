package com.cq.jsondemo;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

public class jsonDemo {

	public static void main(String[] args) {
		System.out.println("这是一个json Demo");
		Student student =new Student();
		Student student2 =new Student("李四",25);
		Student student3 =new Student("王五");
		Student student4 =new Student(28);
		
		student3.setAge(35);
		student4.setName("二妹");
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		JSON s = JSONSerializer.toJSON(student);
		JSON s2=JSONSerializer.toJSON(student4);
		
		System.out.println(s2.toString());
		
	}

}



class Student{
	private String name;
	private int	age;
	
	public Student(){
		this.name="张三";
		this.age=18;
	}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	
}