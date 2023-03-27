package clase1.reto4y5;

public class Triangulo extends Figura {
    private float baseT;
    private float heightT;
    private float areaT;

    //Método de getters y setters
    public float getAreaT(){
        return areaT;
    }
    public float getBaseT(){
        return baseT;
    }
    public float getHeightT(){
        return heightT;
    
    }
    public void setAreaC(float areaT){
        this.areaT=areaT;
    }
    public void setBaseT(float baseT){
        this.baseT=baseT;
    }
    public void setHeightT(float heightT){
        this.heightT=heightT;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        areaT=(baseT*heightT)/2;
        System.out.println("El area del triángulo es:" + areaT);
    }
    
}
