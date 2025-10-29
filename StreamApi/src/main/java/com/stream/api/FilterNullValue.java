package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//14) Filter null values from a list 
		List<String> list = Arrays.asList("aniket",null,"","raj");
		
		List<String> reslList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(reslList);

	}

}
