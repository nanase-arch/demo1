package com.grts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
public static void main(String[] args) {
	HashMap<Integer, String> h=new HashMap<Integer,String>();
	h.put(23, "sdff");
	h.put(22, "sdff");
	h.put(21, "sdff");
	h.put(20, "sdff");
	h.put(19, "sdff");
	h.put(18, "sdff");
	System.out.println(h);
	Set<Entry<Integer, String>> entrySet = h.entrySet();
	System.out.println(entrySet);
	boolean empty = h.isEmpty();
	System.out.println(empty);
	boolean containsKey = h.containsKey(18);
	System.out.println(containsKey);
}
}
