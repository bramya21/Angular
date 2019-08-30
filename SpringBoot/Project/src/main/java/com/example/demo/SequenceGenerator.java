package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SequenceGenerator {
	@Id
	@GeneratedValue
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
