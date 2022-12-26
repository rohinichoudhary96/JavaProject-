package com.velocity;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rohini");
		list.add("Sandip");
		list.add("Akshay");
		list.add("Swati");
		list.add("Agastya");
		list.add("Aga");
		for(String str:list){
		sysout(str);
		}
		
		list.stream().forEach(x->System.out.println(x));

	}

}
