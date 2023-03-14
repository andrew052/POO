package Ejercicio1;
import java.util.Scanner;

public class Movie {
    
    Scanner read = new Scanner(System.in);
    private String nomPeli;
    private String category;
    private int year ;
    private int duration;

    public Movie(){
     }
    
    public Movie(String nomPeli, String category, int year, int duration ){
        this.nomPeli=nomPeli;
        this.category=category;
        this.year=year;
        this.duration=duration;
    }
    
    public void  mostrar(){
        System.out.println("El nombre de las peliculas que hay son:" +this.nomPeli+ " De la categoria " + this.category + " del año " + this.year + " y dura " + this.duration + " minutos");
    }    

    public void mostrar(int year, String nomPeli,int duration, String category ){
        System.out.println("El año de la pelicula es " + this.year + " La peli se llama " + this.nomPeli + " Su duracion es" + this.duration + " Su categoria es " + this);

    }
    public void mostrar(String nomPeli, int duration ){
        System.out.println("El nombre de la peli es: " + this.nomPeli + " Y su duracion es de" + this.duration);
    }

    public String getNomPeli(){
    return nomPeli;
    }
    public String getCategory(){
        return category;
    }
    public int getYear(){// metodo get o getter 
        return year;
    }
    public int getDuration(){
        return duration;
    }
    public void setNompeli(String nomPeli){
        this.nomPeli=nomPeli;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    
    
    

        
    
    
}

