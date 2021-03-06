package cn.com.webxml.client;

import java.util.List;

import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Client {
	public static void main(String[] args) {
		//<wsdl:service name="WeatherWS">
		//1.生成
		WeatherWS service=new WeatherWS();
		//2.获取实现类
		//<wsdl:portType name="WeatherWSSoap">
		WeatherWSSoap port =service.getPort(WeatherWSSoap.class);
		//3.调用方法
		//ArrayOfString arrString=port.getWeather("重庆", null);
		//List<String> list=arrString.getString();
		List<String> list = port.getWeather("重庆", null).getString();
		for (String str:list) {
			System.out.println(str);
		}
	}
}
