package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class NoneEleMentMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13) Check if no elements match a condition 
		List<String> list = Arrays.asList("Aniket","akhand","Ankush","Suraj");
		
		boolean match = list.stream().noneMatch(s->s.length()>5);
		System.out.println(match);

	}

}
