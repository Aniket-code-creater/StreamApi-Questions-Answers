package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//) Sort a list in descending order 
		List<Integer> list = Arrays.asList(2,4,6,8,2,12,1);
		
		List<Integer> resList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(resList);
		
		
		List<Integer> resList1 = list.stream().sorted((a,b)->Integer.compare(b, a)).collect(Collectors.toList());
		System.out.println(resList1);

	}

}
