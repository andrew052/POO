package clase1.reto4y5;

import java.util.Scanner;

public class Ejecutar5 {
    public static void main(String[] args) {
        Scanner reading= new Scanner(System.in);
        
        
        String op="si";
        int numPlays=0;
        do {
            numPlays=numPlays+1;
            System.out.println("Que quieres jugar? puede elegir entre caricellazo o piedra, papel y tijera, si quieres digita caricellazo=1 y si quieres piedra, papel y tijera=2");
            int decision=reading.nextInt();
            if (decision==1) {
                System.out.println("Elegiste caricellazo");
                FOS game=new FOS();
                game.start();
                game.play();
                game.finish();
            }
            else if(decision==2){
                System.out.println("Elegiste piedra papel y tijera");
                RPC game=new RPC();
                game.start();
                game.play();
                game.finish();
            }
            else{
                System.out.println("Lo siento, no pudimos entender tu respuesta, vuelve a intentarlo");
                numPlays=numPlays-1;
            }
            System.out.println("Quieres volver a jugar?");
            
        } while (op.equals("si"));
        System.out.println("El numero de veces que jugaste fue: "+numPlays);
        reading.close();


    }
}
