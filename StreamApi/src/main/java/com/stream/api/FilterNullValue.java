package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//14) Filter null values from a list 
		List<String> list = Arrays.asList("aniket",null,"","raj");
		
		List<String> reslList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(reslList);
		solution2(list);

	}
	
	public static void solution2(List<String> list) {
		
		List<String> list2 = list.stream().flatMap(s->s==null? Stream.empty():Stream.of(s)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
