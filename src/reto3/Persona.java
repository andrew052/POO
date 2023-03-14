package reto3;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class Persona {
    Scanner read = new Scanner(System.in);
    private String cargo, departamento;
    private int horasTrabajadas;
    private int valorHora;
    private int reteica;
    
    private int honorarios;
    
    public Persona (){
    
    
    }

    public Persona(String cargo, String departamento, int horasTrabajadas, int valorHora){
        valorHora = 3600;
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }

   
    public void registrarDatos() {
        // cuerpo del metodo
        System.out.println("Ingrese su cargo ");
        cargo = read.nextLine();

        System.out.println("Ingrese las horas trabajadas  ");
        horasTrabajadas = read.nextInt();

        System.out.println("Ingrese el departamento en el que se encuentra");
        departamento = read.nextLine();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
   
}
