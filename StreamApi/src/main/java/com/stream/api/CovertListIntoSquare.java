package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertListIntoSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5) Convert a list of integers to their square values 
		List<Integer> list = Arrays.asList(2,4,5,7,8,9,1);
		List<Integer> resList = list.stream().map(n-> n*n).collect(Collectors.toList());
		System.out.println(resList);
		
		int[] list2 = list.stream().mapToInt(n-> n*n).toArray();
		System.out.println(Arrays.toString(list2));

	}

}
