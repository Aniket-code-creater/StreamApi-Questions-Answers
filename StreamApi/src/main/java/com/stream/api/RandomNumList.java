package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//26) Generate a list of random numbers using streams 
		List<Double> list = Stream.generate(Math::random).limit(5).collect(Collectors.toList());
		System.out.println(list);

	}

}
