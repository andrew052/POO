package clase1.reto2;

import java.util.Scanner;

public class Persona {
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    double peso;
    double altura;
    int edad;
    String genero;

    //Método Constructor

    Scanner reading=new Scanner(System.in);

    public void requestData(){
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=reading.nextLine();
        System.out.println("Ingrese su numero de documento");
        documento=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=reading.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=reading.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        peso=reading.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        altura=reading.nextDouble();
        System.out.println("Ingrese su edad");
        edad=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su sexo");
        genero=reading.nextLine();
    }

    public void datosPersona() {
        System.out.println("Su tipo de documento es: "+tipoDoc + " Su numero de documento es: " + documento + " Y su apellido es: "  + apellido);
        System.out.println("Su peso es: "+ peso +"kg");
        System.out.println("Su altura es: "+ altura +"m");
        System.out.println("Su edad es: "+ edad +"años");
        System.out.println("Su sexo es: "+ genero);
     }
     public String calculateImc(String weightString) {
        weightString="";
        double altura2= Math.pow(altura,2);
        double pesoActual= peso/altura2;
        if (pesoActual<20) {
            weightString="PESOBAJO";
        }
        else if(pesoActual>=20 && pesoActual<=25){
            weightString="PESOIDEAL";
        }
        else if(pesoActual>25){
            weightString="SOBREPESO";
        }
        System.out.println(weightString);
        return weightString;
        
    }
    public void mayoressAge(){
        System.out.println("Su edad es: "+edad);
        if (edad<18) {
            System.out.println("usted es menor de edad");
        } else {
            System.out.println("usted es mayor de edad");
        }
    }
 }