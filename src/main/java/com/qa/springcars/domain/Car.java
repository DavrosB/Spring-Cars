package com.qa.springcars.domain;

public class Car {

//	Variables

	private int engine;
	private boolean spoiler;
	private String make;
	private String model;

//	Methods
	
	
//	Constructor - a special method for the Class
//	Default constructor
	public Car() {}
	
//	Another constructor with all variables
	
	public Car (int engine, boolean spoiler, String make, String model) {
		this.engine = engine;
		this.spoiler = spoiler;
		this.make=make;
		this.model=model;
	}
	
	
	
	
	
//	Getters and setters

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public boolean isSpoiler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
