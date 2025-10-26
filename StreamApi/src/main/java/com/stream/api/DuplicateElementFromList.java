package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7) Remove duplicate elements from a list 
		List<Integer> list = Arrays.asList(1,3,4,6,1,5,3,6,7,7,9,0);
		List<Integer> resList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(resList);

	}

}
