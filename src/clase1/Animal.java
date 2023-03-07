package clase1;

import java.time.Year;
import java.util.Scanner;

public class Animal {
    Scanner read = new Scanner(System.in);
    public String name;
    public int age;

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
}
