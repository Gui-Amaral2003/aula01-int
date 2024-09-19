package atividades.atividadesAvaliativas.formas2d;

public class Triangulo extends Poligono{
    
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{p1, p2, p3});
    }

    @Override
    public double altura() {
        return getPonto(0).getCoordY();
    }

    @Override
    public double largura() {
        return getPonto(1).getCoordX() - getPonto(2).getCoordX();
    }

    @Override
    public double area() {
        double altura = this.altura();
        double base = this.largura();

        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        SegmentoReta p1P2 = new SegmentoReta(getPonto(0), getPonto(1));
        SegmentoReta p2P3 = new SegmentoReta(getPonto(1), getPonto(2));
        SegmentoReta p3P1 = new SegmentoReta(getPonto(2), getPonto(0));

        double tamanhoP1P3 = p1P2.comprimento();
        double tamanhoP2P3 = p2P3.comprimento();
        double tamanhoP3P1 = p3P1.comprimento();

        return tamanhoP1P3 + tamanhoP2P3 + tamanhoP3P1;
    }
    
}
