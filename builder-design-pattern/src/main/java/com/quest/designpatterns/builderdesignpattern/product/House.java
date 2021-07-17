package com.quest.designpatterns.builderdesignpattern.product;

import com.quest.designpatterns.builderdesignpattern.builder.HousePlan;

public class House implements HousePlan{

	private String basement;
	private String structure;
	private String roof;
	private String interior;
	
	@Override
	public void setBasement(String basement) {
		this.basement = basement;
	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;
	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("House [basement=");
		builder.append(basement);
		builder.append(", structure=");
		builder.append(structure);
		builder.append(", roof=");
		builder.append(roof);
		builder.append(", interior=");
		builder.append(interior);
		builder.append("]");
		return builder.toString();
	}
}
