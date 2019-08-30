package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
@Id
		int id;
		String color;
		String price;
		String model;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
}
