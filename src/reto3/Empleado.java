package reto3;
import reto3.Persona;
public class Empleado extends Persona {
    private int honorarios;
    
    public Empleado (String cargo, int valorHora, int horasTrabajadas, String departamento ){
        

    }
    

    public void calcularHonorarios(){
        honorarios= valorHora * horasTrabajadas;
        
    }
}
