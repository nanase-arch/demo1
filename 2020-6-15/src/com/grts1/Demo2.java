package com.grts1;

import java.util.HashMap;
import java.util.Set;

public class Demo2 {
public static void main(String[] args) {
	HashMap<String, HashMap> h=new HashMap<String, HashMap>();
	HashMap<String, String> h1=new HashMap<String, String>();
	h1.put("se", "sdg");
	h1.put("s", "sdg");
	h1.put("e", "sdg");
	h1.put("sei", "sdg");
	HashMap<String, String> h2=new HashMap<String, String>();
	h2.put("se", "sdg");
	h2.put("s", "sdg");
	h2.put("e", "sdg");
	h2.put("sei", "sdg");
	h.put("sdfsd", h1);
	h.put("sdfs", h2);
	Set<String> keySet = h.keySet();
	for (String string : keySet) {
		Set keySet2 = h.get(string).keySet();
		for (Object object : keySet2) {
			System.out.println(h.get(string).get(object));
		}
	}
}
}
