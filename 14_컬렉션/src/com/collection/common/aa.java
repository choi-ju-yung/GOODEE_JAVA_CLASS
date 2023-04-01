package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Food;

public class aa implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Food a = (Food)o1;
		Food b = (Food)o2;
		
		if(a.getPrice() > b.getPrice()) {
			return 1;
		}else {
			return -1;
		}
	}
}
