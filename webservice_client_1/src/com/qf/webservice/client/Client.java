package com.qf.webservice.client;

import com.qf.webserver.WeatherServerImpl;
import com.qf.webserver.WeatherServerImplService;

public class Client {

	public static void main(String[] args) {
		String city1 ="重庆";
		String city2= "深圳";				
		//1.创建服务视图对象
		WeatherServerImplService service =new WeatherServerImplService();
		//2.获取服务实现类
		WeatherServerImpl port=	service.getPort(WeatherServerImpl.class);
		//3.调用方法
		System.out.println("----------------");
		String query1= port.query(city1);
		System.out.println("你查询的"+city1+"天气为："+query1);
		System.out.println("----------------");
		String query2= port.query(city2);
		System.out.println("你查询的"+city2+"天气为："+query2);
		System.out.println("----------------");
		//调用新的服务
		String other =port.other();
		System.out.println(other);
	}

}
