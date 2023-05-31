package com.epicode.GodfathersPizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class PizzaFamilySize extends Pizza  {
	
	private Pizza pizza;
	private String name;
	private double calories;
	private double price;

	public PizzaFamilySize(Pizza pizza) {
		super();
		this.name = pizza != null ? "Family Size for Pizza ( " + pizza.getName() + " )" : "Family Size for Pizza";
		this.price = pizza != null ? pizza.getPrice() + 4.15 : 4.15;
		this.calories = pizza != null ? pizza.getCalories() * 1.95 : 1.95;
		this.pizza = pizza;
	}
	
	
	
	public String getMenuItemLine() {
		return this.name + " - calories: " + this.calories + " - price: " + this.price;
	}



	public PizzaFamilySize() {
		super();
	}
}
