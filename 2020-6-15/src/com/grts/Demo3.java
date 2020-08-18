package com.grts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {
public static void main(String[] args) {
	HashMap<String, Student> h=new HashMap<String ,Student>();
	h.put("1", new Student("王瑞", 12, 23, 34,100));
	h.put("2", new Student("王瑞", 12, 23, 34,100));
	h.put("3", new Student("王瑞", 12, 23, 34,100));
	h.put("4", new Student("王瑞", 12, 23, 34,100));
	h.put("5", new Student("王瑞", 12, 23, 34,100));
	System.out.println(h);
	Set<String> keySet = h.keySet();
	System.out.println(keySet);
	Collection<Student> values = h.values();
	System.out.println(values);
	Set<Entry<String, Student>> entrySet = h.entrySet();
	System.out.println(entrySet);
}
}
