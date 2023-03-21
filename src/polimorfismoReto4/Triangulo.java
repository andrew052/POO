package polimorfismoReto4;

import java.util.Scanner;

public class Triangulo extends Figura {
    Scanner read = new Scanner(System.in);
    private float base, altura;
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public void caculcarArea() {
        System.out.println("Digite la base");
        base = read.nextFloat();
        System.out.println("Digite la altura:");
        altura = read.nextFloat();
        float area = base *altura / 2;
        System.out.println("La base del triangulo es: " + base + "y su altura es de:" + altura + " terminando en area de: " + area);

       
    }
    
}
