package com.stream.api;

import java.security.Identity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2) Count the frequency of each element in a list 
		List<Integer> list = Arrays.asList(1,3,5,2,2,1,9,9,4,0,2,6);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		List<String> list2 = Arrays.asList("a","v","c","L","A","L","b","c");
		Map<String, Long> map2 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
		
		Map<String, Integer> resmap= list2.stream().collect(Collectors.toMap(Function.identity(), v->1,Integer::sum));
		System.out.println(resmap);
		
		
	}

}
