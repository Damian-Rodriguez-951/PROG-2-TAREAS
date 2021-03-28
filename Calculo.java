package com.company;
class Calculo{

    //atributos
    private double num1;
    private double num2;
    private double resultado;

    // Constructor
    public Calculo(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters y setters
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    // Métodos especiales
    public double suma() {
        return this.num1+ this.num2;
    }
    public double resta() {
        return this.num1 - this.num2;
    }
    public double multiplicacion() {
        return this.num1 * this.num2;
    }
    public double division() {
        return this.num1 / this.num2;
    }
}
