package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAvrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8) Find the average of a list of numbers 
		List<Integer> list = Arrays.asList(1,6,7,8,3,12,34,78,12,34,23);
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(avg);
		
		
		//Solution two
		
		double avg2 = list.stream().collect(Collectors.averagingDouble(Integer::intValue));
		System.out.println(avg2);

	}

}
