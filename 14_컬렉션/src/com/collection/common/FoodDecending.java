package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class FoodDecending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Food)o2).getName().compareTo(((Food)o1).getName());
	}
	
		
}
