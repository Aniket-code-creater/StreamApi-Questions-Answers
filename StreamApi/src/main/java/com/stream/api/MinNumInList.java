package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class MinNumInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//) Find the minimum number in a list 
		List<Integer> list = Arrays.asList(1,3,5,9,4,0,-1,-2);
		Integer min = list.stream().mapToInt(Integer::intValue).min().orElseThrow();
		System.out.println(min);
		solution2(list);

	}

	public static void solution2(List<Integer> list) {
		Integer mInteger = list.stream().reduce(0, Integer::min);
		System.out.println(mInteger);
	}
}
