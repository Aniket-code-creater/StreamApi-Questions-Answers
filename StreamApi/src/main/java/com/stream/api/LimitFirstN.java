package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LimitFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21) Limit a stream to the first N elements 
		List<Integer> list = Arrays.asList(2,4,5,7,8,2,1);
		int n=3;
		List<Integer> reList = list.stream().limit(n).collect(Collectors.toList());
		System.out.println(reList);
		
		List<Integer> resList= IntStream.range(0,Math.min(n, list.size())).mapToObj(list::get).collect(Collectors.toList());
		System.out.println(resList);
	}

}
