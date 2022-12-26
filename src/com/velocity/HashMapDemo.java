package com.velocity;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Kaustubh", "Rohini");
		map.put("Roshan", "Supriya");
		map.put("Kartik", "Sakshi");
		map.put("Sumit", "Mamta");
		map.forEach((x,y)->System.out.println(x+" "+y));

	}

}
