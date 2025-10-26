package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class MaxNumInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the maximum number in a list 
		List<Integer> list=Arrays.asList(1,2,4,6,7,9,12,13);
		Integer max = list.stream().reduce(0, Integer::max);
		System.out.println(max);
		solution2(list);
	}
	
	public static void solution2(List<Integer> list) {
		Integer sum = list.stream().mapToInt(Integer::intValue).max().orElseThrow() ;
		System.out.println(sum);
	}

}



