package clase1.reto4y5;

public class Cuadrado extends Figura {
     private float side; //atributo encapsulado
    private float areaS; 

    //Métodos de getters y setters
    public float getAreaS(){
        return areaS;
    }
    public float getSide(){
        return side;
    }
    public void getAreaS(float areaS){
        this.areaS=areaS;
    }
    public void setSide(float side) {
        this.side=side;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        areaS=side*side;
        System.out.println("El area de su cuadrado es: "+areaS);
    }
    
}
