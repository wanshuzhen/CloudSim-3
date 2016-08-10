package org.iti.designpattern.decorator.serviceimpl;

import org.iti.designpattern.decorator.service.Beverage;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
	}
}
