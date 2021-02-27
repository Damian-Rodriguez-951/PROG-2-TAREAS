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


//CODIGO AGREGADO
package com.company;

import java.lang.reflect.Type;

public class Calculo {

    //Atributos
    private double num1;
    private double num2;

    public Calculo(double v, double num1) {
    }

    //Constructores
    public void Num(double num1) {
        this (num1,
                0);
    }
    public Calculo Num(double num1, double num2){

        this.num1 = num1;
    }
    //Return
    public double getNum1(){
        return num1;
    }

    public Calculo setNum1(double num1) {

        this.num1 = num1;
    }

    public double getNum2() {

        return num2;
    }

    public void (double num2) {

        this.num2 = num2;

        switch (Type) {
            Case 1 ->{
                double sum = num1 + num2;
                System.out.print("Your result is " + sum);
            }
            Case 2 ->{
                double sub = num1 - num2;
                System.out.print("Your result is " + sub);
            }
            Case 3 ->{
                double mult = num1 * num2;
                System.out.print("Your result is " + mult);
            }
            Case 4 ->{
                double div = num1 / num2;
                System.out.print("Your result is " + div);
            }
        }
    }
}
