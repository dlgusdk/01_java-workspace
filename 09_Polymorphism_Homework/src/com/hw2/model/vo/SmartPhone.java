package com.hw2.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
   
   public SmartPhone() {
      
   }
   
   public abstract void printMaker();//추상메소드
}