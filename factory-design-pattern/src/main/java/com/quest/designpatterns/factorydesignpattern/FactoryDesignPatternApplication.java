package com.quest.designpatterns.builderdesignpattern;

import com.quest.designpatterns.builderdesignpattern.builder.HouseBuilder;
import com.quest.designpatterns.builderdesignpattern.builder.IglooHouseBuilder;
import com.quest.designpatterns.builderdesignpattern.director.CivilEngineer;
import com.quest.designpatterns.builderdesignpattern.product.House;
import com.quest.designpatterns.factorydesignpattern.OperatingSystemFactory;

public class FactoryDesignPatternApplication {

	public static void main(String[] args) {
		System.out.println(OperatingSystemFactory.getInstance("WINDOWS", "11", "ULTIMATE"));
	}

}
