package atividades.atividadesAvaliativas.formas2d;
import java.lang.Math;

public class Circulo extends Elipse{
    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
    }

    public double circunferencia() {
        return 2*Math.PI*getSemiEixoA();
    }

    public double perimetro() {
        return 2*Math.PI*getSemiEixoA();
    }

    
}
