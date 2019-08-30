package com.car.basic;


public class Car  {
	public String color;
	public String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + "]";
	}
	
}
