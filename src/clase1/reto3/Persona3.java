package clase1.reto3;

import java.util.Scanner;

public class Persona3 {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;
    private int edad;
    private String genero;

    //Método Constructor
    public Persona3(){
    }
    public Persona3(String tipoDoc, int documento, String nombre, String apellido, double peso, double altura, int edad, String genero){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.altura=altura;
        this.edad=edad;
        this.genero=genero;
    }
    //Getters
    public String getTipoDoc() {
        return tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }
    public Scanner getRead() {
        return read;
    }

    

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setReading(Scanner reading) {
        this.read = read;
    }

    Scanner read=new Scanner(System.in);

    public void requestData(){
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=read.nextLine();
        System.out.println("Ingrese su numero de documento");
        documento=read.nextInt();
        read.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=read.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=read.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        peso=read.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        altura=read.nextDouble();
        System.out.println("Ingrese su edad");
        edad=read.nextInt();
        read.nextLine();
        System.out.println("Ingrese su sexo");
        genero=read.nextLine();
    }

    public void showPerson() {
        System.out.println("Su tipo de documento es: "+ tipoDoc);
        System.out.println("Su numero de documento es: "+ documento);
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su apellido es: "+ apellido);
        System.out.println("Su peso es: "+ peso +"kg");
        System.out.println("Su altura es: "+altura+"m");
        System.out.println("Su edad es: "+edad+"años");
        System.out.println("Su sexo es: "+genero);
    }
    public String calculateImc(String pesoString) {
        pesoString="";
        double height2= Math.pow(altura,2);
        double pesoNow= peso/height2;
        if (pesoNow<20) {
            pesoString="PESOBAJO";
        }
        else if(pesoNow>=20 && pesoNow<=25){
            pesoString="PESOIDEAL";
        }
        else if(pesoNow>25){
            pesoString="SOBREPESO";
        }
        System.out.println(pesoString);
        return pesoString;
        
    }
    public void mayoressAge(){
        System.out.println("Su edad es: "+edad);
        if (edad<18) {
            System.out.println("por lo tanto, usted es menor de edad");
        } else {
            System.out.println("por lo tanto, usted es mayor de edad");
        }
    }
}