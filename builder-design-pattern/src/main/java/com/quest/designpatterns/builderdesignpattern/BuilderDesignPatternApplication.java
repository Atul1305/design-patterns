package com.quest.designpatterns.builderdesignpattern;

import com.quest.designpatterns.builderdesignpattern.builder.HouseBuilder;
import com.quest.designpatterns.builderdesignpattern.builder.IglooHouseBuilder;
import com.quest.designpatterns.builderdesignpattern.director.CivilEngineer;
import com.quest.designpatterns.builderdesignpattern.product.House;

public class BuilderDesignPatternApplication {

	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
  
        engineer.constructHouse();
  
        House house = engineer.getHouse();
  
        System.out.println("Builder constructed: "+ house);
	}

}
