package com.aameen.lmbda;

import java.util.ArrayList;
import java.util.List;

public class PracticeFilter {
	
	
	
	public List<Fruit> filterMango(List<Fruit> originalList){
		List<Fruit> mangoList = new ArrayList<>();
		for(Fruit fruit : originalList) {
			if(fruit.getName().equals("mango")) {
				mangoList.add(fruit);
			}
		}
		return mangoList;
	}
	
	
	}


