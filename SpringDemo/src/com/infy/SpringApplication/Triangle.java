package com.infy.SpringApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Triangle {
	
	public int beauty(long number)
	{
		int beat=0;
		while(number>0)
		{
			beat+=(number&1);
			number=number/2;
		}
		return beat;
	}
	Integer t=Integer.parseInt("1");
	Long t1=Long.parseLong("1233665421");
	
	public void draw(){
		HashMap<String,String> test=new HashMap<String,String>();
		test.put("test","test");
	}

}
