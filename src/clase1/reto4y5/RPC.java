package clase1.reto4y5;

import java.util.Scanner;

public class RPC implements Juego{
    Scanner reading=new Scanner(System.in);
    private int random;
    private int decision;
    private String result;

    @Override
    public void start() {
        System.out.println("Jugaremos piedra, papel y tijeras, deberas elegir cuál");
        System.out.println("Piedra=1, Papel=2, Tijera=3");
        decision=reading.nextInt();
    }

    @Override
    public void play() {
        random= (int)(Math.random()*3+1);
        if (decision==1&&random==1) {
            result="Empate, tu sacaste piedra y la maquina también";
        }
        else if(decision==2&&random==2){
            result="Empate, tu sacaste papel y la maquina también";
        }
        else if(decision==3&&random==3){
            result="Empate, tu sacaste tijera y la maquina también";
        }
        else if(decision==1&&random==2){
            result="Perdiste, sacaste piedra y la maquina papel";
        }
        else if(decision==1&&random==3){
            result="Ganaste, sacaste piedra y la maquina tijera";
        }
        else if(decision==2&&random==3){
            result="Perdiste, sacaste papel y la maquina tijera";
        }
        else if(decision==2&&random==1){
            result="Ganaste, sacaste papel y la maquina piedra";
        }
        else if(decision==3&&random==1){
            result="Perdiste, sacaste tijera y la maquina piedra";
        }
        else{
            result="Ganaste, sacaste tijera y la maquina papel";
        }
    }

    @Override
    public void finish() {
        System.out.println(result);
    }
    
}
