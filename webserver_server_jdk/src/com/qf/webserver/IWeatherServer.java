package com.qf.webserver;
/**
  *����һ����ѯ�����ķ���
 * @author Administrator
 *
 */
public interface IWeatherServer {
	
	public String query(String cityName);
	
	public String other();
	
}