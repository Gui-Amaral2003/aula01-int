package atividades.atividadesAvaliativas.formas2d;
import java.lang.Math;

public class Elipse extends FormaGeometrica{
    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getSemiEixoA() {
        return semiEixoA;
    }

    public double getSemiEixoB() {
        return semiEixoB;
    }

    public double area() {
        return Math.PI * this.getSemiEixoMaior() * this.getSemiEixoMenor();
    }

    public double altura() {
        return 2 * getSemiEixoMenor();
    }

    public double largura() {
        return 2 * getSemiEixoMaior();
    }

    public double getSemiEixoMenor() {
        if(semiEixoA < semiEixoB) {
            return semiEixoA;
        }
        return semiEixoB;
    }
    public double getSemiEixoMaior() {
        if(semiEixoA > semiEixoB) {
            return semiEixoA;
        }
        return semiEixoB;
    }

    public double circunferencia() {
        double A = getSemiEixoMaior();
        double B = getSemiEixoMenor();
        double raiz = (Math.pow(A, 2) + Math.pow(B, 2)) / 2;
        double circunferencia = 2*Math.PI*Math.sqrt(raiz);

        return circunferencia;
    }

    public double perimetro() {
        double A = getSemiEixoMaior();
        double B = getSemiEixoMenor();
        double raiz = (Math.pow(A, 2) + Math.pow(B, 2)) / 2;
        double circunferencia = 2*Math.PI*Math.sqrt(raiz);

        return circunferencia;
    }
}
