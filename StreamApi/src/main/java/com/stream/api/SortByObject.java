package com.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.stream.api.entity.Employe;

public class SortByObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6) Sort a list of objects by a field 
		List<Employe> list = new ArrayList<>();
		Employe employe = new Employe("Aniket",24,42000);
		Employe employe1 = new Employe("suraj",31,45000);
		Employe employe2 = new Employe("ankush",26,40000);
		list.add(employe);
		list.add(employe1);
		list.add(employe2);
		
		List<Employe> resList=list.stream().sorted(Comparator.comparing(Employe::getAge)).collect(Collectors.toList());
		
		System.out.println(resList);
		
		List<Employe> resList1=list.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
				System.out.println(resList1);

	}

}
