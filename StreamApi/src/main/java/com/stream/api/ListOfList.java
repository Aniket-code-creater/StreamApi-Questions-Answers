package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//24) Convert a list of lists into a single list (flatMap) 
		List<List<Integer>> loList = Arrays.asList(Arrays.asList(2,4,5,6,7,8),Arrays.asList(2,4,5,6,7,8));
		
		List<Integer> singList = loList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(singList);

	}

}
