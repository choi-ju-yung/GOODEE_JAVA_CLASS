package com.inter.model.vo;

import java.util.Objects;

public abstract class Animal {
	private String mae;
	private String type;
	private double height;
	private double weight;
	private String area;
	
	public Animal() {}

	public Animal(String mae, String type, double height, double weight, String area) {
		super();
		this.mae = mae;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.area = area;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Animal [mae=" + mae + ", type=" + type + ", height=" + height + ", weight=" + weight + ", area=" + area
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, height, mae, type, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(area, other.area)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(mae, other.mae) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	

}
