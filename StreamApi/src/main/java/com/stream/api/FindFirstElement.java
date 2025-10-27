package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0) Find the first element of a list 
		
		List<String> list = Arrays.asList("a","b","c");
		String firstString=list.stream().findFirst().orElse("null");
		System.out.println(firstString);
		
		String firString2= list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), l->l.isEmpty()?null:l.get(0)));

		System.out.println(firString2);
	}

}
