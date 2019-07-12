package com.qf.webserver.mian;

import javax.xml.ws.Endpoint;

import com.qf.webserver.WeatherServerImpl;

/**
 * 采用JDK的方式来发布服务
 * @author Administrator
 *
 */
public class mian {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/weatherService", new WeatherServerImpl());
		System.out.println("发布成功！！！");
	}
}
