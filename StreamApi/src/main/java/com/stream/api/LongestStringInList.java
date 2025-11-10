package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) Find the longest string in a list 
		List<String> list = Arrays.asList("Aniket","anuj","raj","sahil","amar");
		
		Optional<String> longest=list.stream().max(Comparator.comparingInt(String::length));
		System.out.println(longest.get());
		
		Optional<String> longsstr=list.stream().reduce((a,b) -> a.length()>=b.length() ? a: b);
		System.out.println(longsstr.get());

	}

}
