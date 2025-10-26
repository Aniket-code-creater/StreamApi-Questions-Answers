package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//) Count the number of strings starting with a specific letter 
		List<String> list = Arrays.asList("aniket","ram", "raj", "akhand", "suraj");
		
		long count =list.stream().filter(s->s.startsWith("a")).count();
		System.out.println(count);
		solution2(list);
		

	}
	
	public static void solution2(List<String> list) {
		long res = list.stream().collect(Collectors.filtering(s -> s.startsWith("a"), Collectors.counting()));
		System.out.println(res);
		
	}

}
