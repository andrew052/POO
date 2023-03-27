package clase1.reto4y5;

import java.util.Scanner;

public class FOS implements Juego {
    Scanner reading=new Scanner(System.in);

    private String name;
    private int decision;
    private int launch;
    private String result="";
    
    @Override
    public void start() {
        System.out.println("Ingrese el nombre del jugador");
        name=reading.nextLine();
        System.out.println("Jugaremos el caricellazo, deberas elegir entre cara o sello y jugarás contra la máquina. 1=cara y 2=sello");
        decision=reading.nextInt();
    }

    @Override
    public void play() {
        launch=(int)(Math.random()*2+1);

        if (decision==1&&launch==1) {
            result="Ganaste, elegiste cara y salió cara";
        }
        else if(decision==2&&launch==2){
            result="Ganaste, elegiste sello y salió sello";
        }
        else if(decision==1&&launch==2){
            result="Perdiste, elegiste cara y salió sello";
        }
        else{
            result="Perdiste, elegiste sello y salió cara";
        }
    }

    @Override
    public void finish() {
        System.out.println("Tu nombre de jugador es: "+name);
        System.out.println(result);
    }
    
}
