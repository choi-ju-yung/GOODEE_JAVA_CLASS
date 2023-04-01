package com.collection.model.vo;

import java.util.Objects;

public class Fruit {
	private String name;
	private String where;
	private int cnt;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String where, int cnt, int price) {
		super();
		this.name = name;
		this.where = where;
		this.cnt = cnt;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", where=" + where + ", cnt=" + cnt + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnt, name, price, where);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return cnt == other.cnt && Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(where, other.where);
	}
	
	
}
