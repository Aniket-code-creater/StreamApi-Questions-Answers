package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class FindAllMatche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2) Check if all elements match a condition 
		List<Integer> list=Arrays.asList(2,6,8);
		
		boolean hasEven = list.stream().allMatch(n-> n%2==0);

		System.out.println(hasEven);

	}

}
