package com.br.chap01_poly.controller;

import com.br.chap01_poly.model.vo.Electronic;

public class ElectronicShop2 {
//가게
	//부모타입의 배열로 모든 자식 객체 다루기 
	private Electronic[] elec =new Electronic[3];
	private int count = 0;

	public void insert(Electronic any) {
		elec[count++] = any;
	}

	public Electronic select(int index) {
	 return elec[index];
	}
}
