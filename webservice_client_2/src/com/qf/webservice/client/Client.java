
package com.qf.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.qf.webserver.WeatherServerImpl;

public class Client {

	public static void main(String[] args) throws MalformedURLException   {
		// 
		URL url= new URL("http://localhost:8080/weatherService?wsdl");
		
		QName qName=new QName("http://webserver.qf.com/","WeatherServerImplService");
		Service service=Service.create(url, qName);
		//
		WeatherServerImpl post=service.getPort(WeatherServerImpl.class);
		//
		String query=post.query("÷ÿ«Ï");
		System.out.println(query);
	}

}
