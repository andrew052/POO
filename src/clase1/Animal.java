package clase1;

import java.time.Year;
import java.util.Scanner;

public class Animal {
    Scanner read = new Scanner(System.in);
    public static String name;
    public static int age;
    private int edad;
    private String nombre;

    //metodo constructor
    public Animal(String nombre, int edad){

    }
    
    
    
    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    //Metodos
    public void registrarAnimal() {
        // cuerpo del metodo
        System.out.println("Ingrese el nombre del animal ");
        name = read.nextLine();

        System.out.println("Ingrese la edad del animal ");
        age = read.nextInt();
        
    }
    public void mostrarAnimal() {
        System.out.println("El nombre del animal es " + name + " Y su edad es " + age);
    }
    public String getNombre(){//metodo getter
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){//metodo setter
        this.edad=edad;
    }
    public void setNombre( String nombre ){//metodo setter
        this.nombre=nombre;

    }

}
