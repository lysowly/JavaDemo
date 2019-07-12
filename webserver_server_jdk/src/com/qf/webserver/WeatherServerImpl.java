package com.qf.webserver;

import javax.jws.WebService;

@WebService

public class WeatherServerImpl implements IWeatherServer {

	@Override
	public String query(String cityName) {
		System.out.println("查询"+cityName);
		if (cityName.equals("重庆")) {
			return "下雨天";
		}else {
		return "晴天";			
		}
	}
	@Override
	public String other() {
		return "这是查询天气的方法2";
	}

}
