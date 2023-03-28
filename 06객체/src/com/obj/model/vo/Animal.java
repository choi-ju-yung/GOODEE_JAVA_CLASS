package com.obj.model.vo;

public class Animal {
		public String kindof;
		public String name;
		public double weight;
		public int len;
		public String address;
		
		public Animal(){} // 기본생성자 
		
		// 매개변수가 있는 생성자
		public Animal(String paraKindof,String paraName,double paraWeight,int paraLen,String paraAddress) {
			kindof = paraKindof;  
			name = paraName;
			weight = paraWeight;
			len = paraLen;
			address = paraAddress;
		}
}
