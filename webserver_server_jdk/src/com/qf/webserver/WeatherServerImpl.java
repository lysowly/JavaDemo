package com.qf.webserver;

import javax.jws.WebService;

@WebService

public class WeatherServerImpl implements IWeatherServer {

	@Override
	public String query(String cityName) {
		System.out.println("��ѯ"+cityName);
		if (cityName.equals("����")) {
			return "������";
		}else {
		return "����";			
		}
	}
	@Override
	public String other() {
		return "���ǲ�ѯ�����ķ���2";
	}

}
