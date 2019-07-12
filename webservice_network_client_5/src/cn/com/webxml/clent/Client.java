package cn.com.webxml.clent;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public interface Client {
	public static void main(String[] args) {
		//1.����
		// <wsdl:service name="EnglishChinese">
		EnglishChinese service=new EnglishChinese();
		//2.ʵ��
		//<wsdl:portType name="EnglishChineseSoap">
		EnglishChineseSoap port=service.getPort(EnglishChineseSoap.class);
		//3.����
		//<wsdl:operation name="translatorReferString">
		ArrayOfString fyInfo=port.translatorReferString("��ƽ");
		List<String> list=fyInfo.getString();
		for (String str:list) {
		System.out.println(str);	
		}
		//4.���÷���2
		System.out.println("----------------------------");	
		//<wsdl:operation name="TranslatorString">
		ArrayOfString fyInfo2=port.translatorString("ˮ��");
		List<String> list2=fyInfo2.getString();
		for (String str2:list2) {
		System.out.println(str2);	
		}

		
	}
}