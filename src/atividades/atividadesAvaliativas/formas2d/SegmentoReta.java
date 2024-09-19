package atividades.atividadesAvaliativas.formas2d;
import java.lang.Math;

public class SegmentoReta extends ObjetoGeometrico{
    final private Ponto p1;
    final private Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Ponto getP1() {
        return p1;
    }


    public Ponto getP2() {
        return p2;
    }


    public double comprimento() {
        double p1X = p1.getCoordX();
        double p2X = p2.getCoordX();
        double p1Y = p1.getCoordY();
        double p2Y = p2.getCoordY();

        double subtracaoX = Math.pow((p2X - p1X), 2);
        double subtracaoY = Math.pow((p2Y - p1Y), 2);
        double soma = subtracaoX + subtracaoY;

        return Math.sqrt(soma);
    }

    public double coeficienteAngular() {
        double p1X = p1.getCoordX();
        double p2X = p2.getCoordX();
        double p1Y = p1.getCoordY();
        double p2Y = p2.getCoordY();

        double subtracaoY = p2Y - p1Y;
        double subtracaoX = p2X - p1X;

        if(subtracaoX != 0) {
           return subtracaoY / subtracaoX; 
        }

        else {
            return Double.POSITIVE_INFINITY;
        }
    }

    public boolean paralelo(SegmentoReta s) {
        return this.coeficienteAngular() == s.coeficienteAngular();
    }
}
