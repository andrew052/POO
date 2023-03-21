package polimorfismoReto4;

public class Cuadrado extends Figura{

    private float lado;
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    @Override
    public void caculcarArea() {
        float area = lado * lado;
        System.out.println("El lado del cuadro es: " + lado + "y su area es de:" + area);
    }

    
    
}
