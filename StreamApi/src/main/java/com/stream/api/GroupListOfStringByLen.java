package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupListOfStringByLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Group a list of strings by their length 
		List<String> list = Arrays.asList("Aniket","anuj","raj","sahil","amar");
		
		Map<Integer, List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		Map<Integer, Set<String>> map1=list.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));
		System.out.println(map1);
	}

}
