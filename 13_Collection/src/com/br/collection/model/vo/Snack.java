package com.br.collection.model.vo;

import java.util.Objects;

public class Snack {
	private String flavor;
	private int kcal;
	
	public Snack() {
		
	}

	public Snack(String flavor, int kcal) {
		super();
		this.flavor = flavor;
		this.kcal = kcal;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", kcal=" + kcal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(flavor, kcal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return Objects.equals(flavor, other.flavor) && kcal == other.kcal;
	}
	
	
}
