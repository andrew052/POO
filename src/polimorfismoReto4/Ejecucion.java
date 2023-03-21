package polimorfismoReto4;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int op;
        do {
            System.out.println("escoga el tipo de figura para sacar su area: Circulo, Rectangulo, Cuadrado y Triangulo");
            String decidir = read.nextLine();
            Circulo circle = new Circulo();
            Triangulo triangle = new Triangulo();
            Rectangulo rectangle = new Rectangulo();


            if(decidir.equals("Circulo")){

                circle.caculcarArea();   
            }
            else if (decidir.equals("Rectangulo")){
                triangle.caculcarArea();
            }
            else if(decidir.equals("Triangulo")){
                triangle.caculcarArea();
            }
            else if(decidir.equals("Rectangulo")){
                rectangle.caculcarArea();
            }
            else{
                System.out.println("su respuesta no se capturo correcta mente");
            }
            read.nextLine();
            System.out.println("Quiere volver a jugar 1= si 2=no");
           
            op=read.nextInt();
        } while (op==1); 
        read.close();
    }
    
}
