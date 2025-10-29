package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommSepratedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//17) Join a list of strings into a single comma-separated string 
		
		List<String> list = Arrays.asList("a","b","c");
		String reString = list.stream().collect(Collectors.joining(","));
		System.out.println(reString);
		
		String res2 = String.join(",",list);
		System.out.println(res2);

	}

}
