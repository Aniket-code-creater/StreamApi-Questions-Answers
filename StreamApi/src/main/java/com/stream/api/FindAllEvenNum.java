package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Find all even numbers from a list 
		List<Integer> list=Arrays.asList(1,2,4,6,7,9,12,13);
		List<Integer> resList= list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		resList.forEach(n-> System.out.println(n));
		Solution1(list);
	}
	
	public static void Solution1(List<Integer> list) {
		List<Integer> resList=list.stream().collect(Collectors.filtering(n->n%2==0, Collectors.toList()));
		System.out.println(resList);
	}
}
