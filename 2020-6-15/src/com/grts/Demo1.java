package com.grts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
public static void main(String[] args) {
	HashMap<String, String> h=new HashMap<String,String>();
	h.put("ewrwegjn", "fdgfgwe");
	h.put("ewrwegj", "fdgfwe");
	h.put("ewregjn", "fdgfgwe");
	h.put("ewrwegjn", "fdgfgwe");
	h.put("ewrwegjn", "fdgfge");
	h.put("ewregjn", "fdgfwe");
	System.out.println(h.get("ewrwegjn"));
	Set<String> keySet = h.keySet();
	System.out.println(keySet);
	Collection<String> values = h.values();
	System.out.println(values);
	Set<Entry<String, String>> entrySet = h.entrySet();
System.out.println(entrySet);
	}
}	


