package com.qf.webserver;
/**
  *定义一个查询天气的服务
 * @author Administrator
 *
 */
public interface IWeatherServer {
	
	public String query(String cityName);
	
	public String other();
	
}
