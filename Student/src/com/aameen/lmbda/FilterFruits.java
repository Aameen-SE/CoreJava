package com.aameen.lmbda;

import java.util.ArrayList;
import java.util.List;

public class FilterFruits {
	
	
	public List<Fruit> filterMango(List<Fruit> originalList ){
		List<Fruit> mangoList = new ArrayList<>();
		for(Fruit fruit : originalList) {
			if(fruit.getName().equals("mango")) {
				mangoList.add(fruit);
			}
		}
		return mangoList;
	}
	public List<Fruit> filterByName(List<Fruit> originalList, String name){
		List<Fruit> list = new ArrayList<>();
		for(Fruit fruit : originalList) {
			if(fruit.getName().equals(name)) {
				list.add(fruit);
			}
		}
		return list;
	}

}
