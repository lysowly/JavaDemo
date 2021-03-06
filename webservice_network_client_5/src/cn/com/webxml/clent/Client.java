package cn.com.webxml.clent;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public interface Client {
	public static void main(String[] args) {
		// 1.生成
		// <wsdl:service name="EnglishChinese">
		EnglishChinese service = new EnglishChinese();
		// 2.实例
		// <wsdl:portType name="EnglishChineseSoap">
		EnglishChineseSoap port = service.getPort(EnglishChineseSoap.class);
		// 3.调用
		// <wsdl:operation name="translatorReferString">
		ArrayOfString fyInfo = port.translatorReferString("天平");
		List<String> list = fyInfo.getString();
		for (String str : list) {
			System.out.println(str);
		}
		// 4.调用方法2
		System.out.println("----------------------------");
		// <wsdl:operation name="TranslatorString">
		ArrayOfString fyInfo2 = port.translatorString("水杯");
		List<String> list2 = fyInfo2.getString();
		for (String str2 : list2) {
			System.out.println(str2);
		}

	}
}
