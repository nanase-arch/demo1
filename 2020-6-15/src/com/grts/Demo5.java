package com.grts;

import java.util.Set;
import java.util.TreeMap;

public class Demo5 {
public static void main(String[] args) {
	TreeMap<Student, String> t=new TreeMap<Student, String>();
	t.put(new Student("王瑞", 12, 23, 34,100), "1");
	t.put(new Student("王瑞", 15, 23, 34,100), "1");
	t.put(new Student("王瑞", 12, 28, 34,100), "1");
	t.put(new Student("王瑞", 12, 23, 90,100), "1");
	t.put(new Student("王瑞", 12, 23, 34,10), "1");
	t.put(new Student("王瑞", 67, 23, 34,100), "1");
	Set<Student> keySet = t.keySet();
	for (Student student : keySet) {
		System.out.println(t.get(student)+student);
	}
}
}
