package com.quest.designpatterns.builderdesignpattern.builder;

import com.quest.designpatterns.builderdesignpattern.product.House;

public class IglooHouseBuilder implements HouseBuilder{

	private House house;
	
	public IglooHouseBuilder() {
		this.house = new House();
	}
	@Override
	public void buildBasement() {
		house.setBasement("Ice bars!");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks!");
		
	}

	@Override
	public void buildInterior() 
    {
        house.setInterior("Ice Carvings");
    }
  
	@Override
    public void bulidRoof() 
    {
        house.setRoof("Ice Dome");
    }
  
	@Override
    public House getHouse() 
    {
        return this.house;
    }

}
