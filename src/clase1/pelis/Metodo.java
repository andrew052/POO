package clase1.reto3;


import java.util.Scanner;

public class Metodo extends Persona3 {
    Scanner read=new Scanner(System.in);
    
    //Atributos propios

    private String correo;
    private double pagoHora=4800;
    private double horaTrabajo;
    private String departamento;
    //Métodos propios

    public void calculateFee() {
        System.out.println("Ingresa que cargo tienes");
        correo=read.nextLine();
        System.out.println("Ingresa de que departamento eres");
        departamento=read.nextLine();
        System.out.println("Ingresa cuántas horas trabajaste");
        horaTrabajo=read.nextDouble();
        double total=pagoHora*horaTrabajo;
        double reteica=(total*0.966)/100;
        double calculateFee = total-reteica;
        System.out.println("Tu tipo de documento es: "+getTipoDoc());
        System.out.println("Tu numero de documento es: "+getDocumento());
        System.out.println("Tu nombre es: "+getNombre());
        System.out.println("Tu apellido es es: "+getApellido());
        System.out.println("Tu cargo es "+correo);
        System.out.println("Tus horas trabajadas fueron: "+horaTrabajo);
        System.out.println("El valor  por hora es de: "+pagoHora+" pesos");
        System.out.println("Tu departamento es: "+departamento);
        System.out.println("El calculo de los honorarios o horas que te pagaremos son: "+calculateFee+" Pesos");
    }
}
