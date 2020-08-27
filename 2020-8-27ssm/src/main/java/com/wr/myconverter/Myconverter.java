package com.wr.myconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class Myconverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf=new SimpleDateFormat();
		try {
			Date parse = sdf.parse(source);
			return parse;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
