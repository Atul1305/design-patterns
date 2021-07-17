package com.quest.designpatterns.builderdesignpattern.builder;

public interface HousePlan {

	public void setBasement(String basement);
	
	public void setStructure(String structure);
	
	public void setRoof(String roof);
	
	public void setInterior(String interior);
}
