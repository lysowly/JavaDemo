package cn.com.webxml.client;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Client {
	public static void main(String[] args) {
		//<wsdl:service name="MobileCodeWS">
		//1.创建一个服务视图
		MobileCodeWS service =new MobileCodeWS();
		//2.创建服务类
		//<wsdl:portType name="MobileCodeWSSoap">
		MobileCodeWSSoap port=service.getPort(MobileCodeWSSoap.class);
		//3.调用方法
		//<wsdl:operation name="getMobileCodeInfo">
		String info=port.getMobileCodeInfo("13829232212", null);
		System.out.println(info);
		
		
	}
}
