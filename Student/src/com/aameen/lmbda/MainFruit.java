package com.aameen.lmbda;

import java.util.ArrayList;
import java.util.List;

public class MainFruit {
	
	public static List<Fruit> listofFruit() {
		//Fruit f1 = new Fruit(String name, String color, String taste, double weight);
		
		Fruit f1 = new Fruit("mango", "green", "sweet", 200.8);
		Fruit f2 = new Fruit("apple", "red", "sweet", 300.9);
		Fruit f3 = new Fruit("orange", "orange", "sour", 100.7);
		Fruit f4 = new Fruit("banana", "yellow", "sweet", 100.8);
		Fruit f5 = new Fruit("mango", "yellow", "sour", 500.8);
		Fruit f6 = new Fruit("banana", "yellow", "sweet", 700.8);
		Fruit f7 = new Fruit("mango", "green", "sweet", 100.8);
		Fruit f8 = new Fruit("apple", "red", "sweet", 600.8);
		Fruit f9 = new Fruit("banana", "yellow", "sweet", 500.8);
		Fruit f10 = new Fruit("apple", "red", "sweet", 400.8);
		
		List<Fruit> fruitList = new ArrayList<>();
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);
		fruitList.add(f4);
		fruitList.add(f5);
		fruitList.add(f6);
		fruitList.add(f7);
		fruitList.add(f8);
		fruitList.add(f9);
		fruitList.add(f10);
		
		return fruitList;
		
	}
	public static void main(String[] args) {
		
        List<Fruit> fruitList = listofFruit();

        FilterFruits filterFruit = new FilterFruits();
        //List<Fruit> mangoList =	filterFruit.filterMango(fruitList);
//        List<Fruit> list =filterFruit.filterByName(fruitList, "apple");
//        System.out.println(list);

        FilterInterface fi = (List<Fruit> l, String s) -> {
            List<Fruit> fl = new ArrayList<>();
            for (Fruit f: l) {
                if (f.getColor().equals(s)) {
                    fl.add(f);
                }
            }
            return fl;
        };
//        List<Fruit> result = fi.filterFruits(fruitList, "yellow");
//        System.out.println(result);
        FilterInterface f2 = (List<Fruit> l, String s) -> {
            List<Fruit> fl = new ArrayList<>();
            for (Fruit f: l) {
                if (f.getName().equals(s)) {
                    fl.add(f);
                }
            }
            return fl;
        };
        List<Fruit> result = f2.filterFruits(fruitList, "apple");
        System.out.println(result);

    

	

	}

}
