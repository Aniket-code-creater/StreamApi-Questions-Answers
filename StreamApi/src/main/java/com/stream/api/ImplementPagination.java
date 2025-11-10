package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//35) Implement pagination using skip() and limit()
		List<String> list = Arrays.asList("Aniket","anu","raj","sahil","Amar","akhand");
		int page =3;
		int size =2;
		
		List<String> str1= list.stream().skip((long)(page-1)).limit(size).collect(Collectors.toList());
		
		System.out.println(str1);

	}

}
