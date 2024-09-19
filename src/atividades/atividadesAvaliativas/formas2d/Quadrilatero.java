package atividades.atividadesAvaliativas.formas2d;

public abstract class Quadrilatero extends Poligono{
    
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[]{p1, p2, p3, p4});
    }
    
    public Ponto getP1() {
        return getPonto(0);
    }

    public Ponto getP2() {
        return getPonto(1);
    }

    public Ponto getP3() {
        return getPonto(2);
    }

    public Ponto getP4() {
        return getPonto(3);
    }

}
