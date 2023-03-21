package polimorfismoReto4;

public class Rectangulo extends Figura {
    private float largo, ancho;
    
    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    @Override
    public void caculcarArea() {
        float area = largo * ancho;
        System.out.println("El largo es: " + largo + " y su ancho es de: " + ancho + "terminando en un area de: " + area);
    }
    
}
