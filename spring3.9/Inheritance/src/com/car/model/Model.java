package com.car.model;

import com.car.basic.Car;

public class Model extends Car  {
	String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Model [model=" + model + ", color=" + color + ", make=" + make + "]";
	}

	
}
