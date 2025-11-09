package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//28) Partition a list into even and odd numbers 
		List<Integer> list = Arrays.asList(1,3,5,9,4,0,2,6);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(map);

	}

}
