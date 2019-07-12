package com.qf.webservice.client;

import com.qf.webserver.WeatherServerImpl;
import com.qf.webserver.WeatherServerImplService;

public class Client {

	public static void main(String[] args) {
		String city1 ="����";
		String city2= "����";				
		//1.����������ͼ����
		WeatherServerImplService service =new WeatherServerImplService();
		//2.��ȡ����ʵ����
		WeatherServerImpl port=	service.getPort(WeatherServerImpl.class);
		//3.���÷���
		System.out.println("----------------");
		String query1= port.query(city1);
		System.out.println("���ѯ��"+city1+"����Ϊ��"+query1);
		System.out.println("----------------");
		String query2= port.query(city2);
		System.out.println("���ѯ��"+city2+"����Ϊ��"+query2);
		System.out.println("----------------");
		//�����µķ���
		String other =port.other();
		System.out.println(other);
	}

}