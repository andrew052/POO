package polimorfismoReto4;

import java.util.Scanner;

import clase1.prueba;

public class Circulo extends Figura {
    Scanner read = new Scanner(System.in);
    private double radio;
    private double pi = 3.14;
    
    
    public double getPi() {
        return pi;
    }


    public void setPi(Double pi) {
        this.pi = pi;
    }


    public double getRadio() {
        return radio;
    }


    public void setRadio(Double radio) {
        this.radio = radio;
    }


    @Override
    public void caculcarArea() {
        System.out.println("Digite el radio");
        radio= read.nextDouble();
        Double area = pi * radio * radio;
        System.out.println("Pi equivale a : " + pi + "y su radio es de: "+ radio + "y su area es de:" + area);
        

    }
    
}
