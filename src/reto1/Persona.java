package reto1;
import java.util.Scanner;
public class Persona {
    Scanner read = new Scanner(System.in);
    String docType;
    String name, lastName;
    double weight, height;
    int age;
    String document;
    String gender;
     
    public void requestData(){
        System.out.println( "Ingrese su tipo de documento:");
        docType = read.nextLine();

        System.err.println("Ingrese su nombre:");
        name = read.nextLine();

        System.out.println("Ingrese su apellido:");
        lastName = read.nextLine();

        System.out.println("Ingrese su peso en kilogramos:");
        weight = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese su altura:");
        height = read.nextDouble();

        System.out.println("Ingrese su edad:");
        age = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese su genero:");
        gender = read.nextLine();   
        
    }
    public void doc(){
        System.out.println("Su tipo de documento es:" + docType);
        System.out.println("Usted se llama:" + name);
        System.out.println("Su apellido es:" + lastName);
        System.out.println("Su peso actual es de: " + weight + " kg");
        System.out.println("Su altura es de: " + height + " m");
        System.out.println("Su edad es de:" + age);
        System.out.println("Su genero es" + gender);
        
    }
    public void calculate (){
        System.out.println("Este es su analisis");
        double height2 = Math.pow(height, 2);
        double actualWeight = weight / height2;
        System.out.println(actualWeight);
    
        actualWeight = height*height / weight;

        if (actualWeight<20){
        System.out.println(" El peso esta por debajo de lo ideal");
        }
        else if(actualWeight >=20 && actualWeight <=25){
         System.out.println(" Su peso es el ideal");
        }
        else if (actualWeight <25) {
            System.out.println("Usted esta gordooooo");
        }
    }
}
