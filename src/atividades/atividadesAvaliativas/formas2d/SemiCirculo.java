package atividades.atividadesAvaliativas.formas2d;
import java.lang.Math;
public class SemiCirculo extends FormaGeometrica{
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return (Math.PI*Math.pow(raio, 2)) / 2;
    }

    public double altura() {
        return 2*raio;
    }

    public double largura() {
        return 2*raio;
    }

    public double perimetro() {
        return raio*(Math.PI + 2);
    }
}
