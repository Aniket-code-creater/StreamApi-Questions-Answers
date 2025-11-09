package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//22) Convert a primitive array to a stream and process it 
		List<Integer> list = Arrays.asList(2,4,6,5,1,7,8);
		
		int[] array= {2,4,6,5,1,7,8};
		int sum=Arrays.stream(array).filter(n->n%2==0).sum();
		System.out.println(sum);
		
		int sum2=IntStream.of(array).filter(n->n%2==0).sum();
		System.out.println(sum2);
		
		
		//3) Use mapToInt() to sum a list of numbers 
		int sum3 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum3);

	}

}
