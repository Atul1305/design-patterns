package com.quest.designpatterns.builderdesignpattern.builder;

import com.quest.designpatterns.builderdesignpattern.product.House;

public interface HouseBuilder {

	public void buildBasement();
	  
    public void buildStructure();
  
    public void bulidRoof();
  
    public void buildInterior();
  
    public House getHouse();
}
