package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class AnyMatchInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11) Check if any element in the list matches a condition 
		List<Integer> list = Arrays.asList(4,8,6,5,3,1);
		
		boolean hasEven= list.stream().anyMatch(n-> n%2==0);
		
		System.out.println(hasEven);
		
		boolean haseven1 = list.stream().filter(n-> n%2==0).findAny().isPresent();
		
		System.out.println(haseven1);

	}

}
