package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//) Convert a list of strings to uppercase 
		List<String> list = Arrays.asList("Akhand", "Aniket", "Suraj", "Ankush");
		List<String> reslList= list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(reslList);
		Solution2(list);
	}
	
	public static void Solution2(List<String> list) {
		List<String> resList = list.stream().collect(Collectors.mapping(n-> n.toUpperCase(), Collectors.toList()));
		System.out.println(resList);
	}

}
