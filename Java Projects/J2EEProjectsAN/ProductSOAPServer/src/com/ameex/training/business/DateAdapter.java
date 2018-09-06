package com.ameex.training.business;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter{

	@Override
	public Object unmarshal(Object v) throws Exception {
		String s=(String) v;
		Date d=new SimpleDateFormat("dd-MMM-yyyy").parse(s);
		return d;
		
	}

	@Override
	public Object marshal(Object v) throws Exception {
		Date d=(Date) v;
		String s=new SimpleDateFormat("dd-MMM-yyyy").format(d);
		
		return s;
		
	}
	

}
