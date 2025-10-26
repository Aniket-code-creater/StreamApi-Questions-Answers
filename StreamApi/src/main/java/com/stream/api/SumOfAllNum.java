package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//) Find the sum of all numbers in a list 
		List<Integer> list= Arrays.asList(2,4,5,7,8,912,24);
		Integer sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		solution2(list);
	}
	
	public static void solution2(List<Integer> list) {
		Integer sum = list.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
