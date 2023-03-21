package polimorfismoReto4;

import java.util.Scanner;

public class Carisellazo implements Juego {
    private String name;
    private int eleccion;
    private int lanzamiento;
    Scanner read = new Scanner(System.in);
    public void iniciar(){
        System.out.println("digite el nombre del jugador");
        name = read.nextLine();
    }
    public void jugar (){
        int lanzamiento=(int)(Math.random()*2+1);
        System.out.println("1= cara 2=sello");
        eleccion=read.nextInt();


    }
    public void finalizar(){
        if(lanzamiento==1 && eleccion==1){
            System.out.println(name + " ha salido cara usted ha selecionado cara");
            

        }

    }
}
