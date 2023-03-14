package clase1;

public class App {
    public static void main(String[] args) throws Exception {
        Animal tigre = new Animal(10, "tigre");
        Ave condorito = new Ave("condorito", 5, "largo");
        condorito.getNombre();
        condorito.getEdad();
        condorito.getEnvergadura();
        condorito.mostrarAve();
        
    }
    
}
