package clase1;

public class Ave extends Animal {
    // atributo propio
    private String envergadura;
   
    

    public Ave (String nombre, int edad, String envergadura ){
        super (name, age);
        this.envergadura=envergadura;
    }
    public String getEnvergadura() {
        return  envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }
    
    public void mostrarAve(){
        System.out.println("El nombre del animal es "+ getNombre()+"y tiene"+ getNombre() +"la envergadura del ave es "+ this.envergadura);
    }

}