package com.qf.webserver.mian;

import javax.xml.ws.Endpoint;

import com.qf.webserver.WeatherServerImpl;

/**
 * ����JDK�ķ�ʽ����������
 * @author Administrator
 *
 */
public class mian {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/weatherService", new WeatherServerImpl());
		System.out.println("�����ɹ�������");
	}
}
