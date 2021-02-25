package com.company;

public class Num {
    //Atributos
private double num1;
private double num2;
//Constructores
    public Num(double num1) {
	this (num1,0);
    }
    public Num(double num1, double num2){
        this.num1 = num1;
    }
    //Return
    public double getNum1(){
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
   public void restar(double num1){
        this.num1-=num1;
   }
}

