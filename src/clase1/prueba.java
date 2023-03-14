package clase1;
public class prueba {
    public static void main(String[] args) throws Exception {
        Animal guacamaya =new Animal("juan", 0);
        Movie titanic =new Movie();
        Animal panda = new Animal(10, "BAMBU");
        guacamaya.setNombre("juan");
        guacamaya.setEdad(8);

        panda.mostrarAnimal();
        guacamaya.registrarAnimal();
        System.out.println("El nombre del animal es "+ guacamaya.getNombre() + "Y su edad es " + guacamaya);
        
    }
    
    
}
