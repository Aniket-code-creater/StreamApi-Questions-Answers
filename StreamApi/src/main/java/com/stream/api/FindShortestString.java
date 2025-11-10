package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindShortestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4) Find the shortest string in a list 
		
		List<String> list = Arrays.asList("Aniket","anu","raj","sahil","amar");
		Optional<String> strOptional = list.stream().min(Comparator.comparingInt(String::length));
		System.out.println(strOptional.get());
		
		Optional<String> str1 = list.stream().reduce((a,b) ->a.length()<=b.length()?a :b);
		System.out.println(str1.get());

	}

}
