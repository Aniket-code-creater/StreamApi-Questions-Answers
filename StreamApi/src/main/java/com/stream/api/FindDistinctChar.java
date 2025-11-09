package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		
		List<Character> list = str.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList());

		System.out.println(list);
	}

}
