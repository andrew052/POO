package Ejercicio1;
import Ejercicio1.Movie;
public class Regis {
    
    public static void main(String[] args) throws Exception { 
    Movie up = new Movie("Up", "Infantil", 2009, 230 );
    Movie Demon = new Movie("Noche del demonio", "terror", 2015, 130 );
    Movie avatar = new Movie("avatar", "accion", 2022, 300);
    up.mostrar();
    
    up.mostrar(null, 0);
    Demon.mostrar();
    up.setNompeli("up");
    up.setCategory("infantil");
    up.setDuration(10);
    up.setYear(2009);
    System.out.println("El nombre de la pelicula es"+ up.getNomPeli() + "Y su categoria es " + up.getCategory() + "Su duracion es de " + up.getDuration()+ " y su año es" + up.getYear());
    Demon.setNompeli("up");
    Demon.setCategory("infantil");
    Demon.setDuration(10);
    Demon.setYear(2009);
    System.out.println("El nombre de la pelicula es"+ up.getNomPeli() + "Y su categoria es " + up.getCategory() + "Su duracion es de " + up.getDuration()+ " y su año es" + up.getYear());
    avatar.setNompeli("up");
    avatar.setCategory("infantil");
    avatar.setDuration(10);
    avatar.setYear(2009);
    System.out.println("El nombre de la pelicula es"+ up.getNomPeli() + "Y su categoria es " + up.getCategory() + "Su duracion es de " + up.getDuration()+ " y su año es" + up.getYear());
    }
    
    
    
}
