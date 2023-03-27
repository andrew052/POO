package clase1.reto4y5;

public class Rectangulo extends Figura{

    private float baseR;
    private float heightR;
    private float areaR;

    //Método de getters y setters
    public float getAreaR(){
        return areaR;
    }
    public float getBaseR(){
        return baseR;
    }
    public float getHeightR(){
        return heightR;
    }
    public void setBaseR(float baseR){
        this.baseR=baseR;
    }
    public void setAreaR(float areaR){
        this.areaR=areaR;
    }
    public void setHeightR(float heightR){
        this.heightR=heightR;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        areaR=baseR*heightR;
        System.out.println("El area del rectangulo es: "+areaR);
    }

    
}
