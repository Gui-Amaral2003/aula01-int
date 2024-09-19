package atividades.atividadesAvaliativas.formas2d;

public class Trapezio extends Quadrilatero{

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public SegmentoReta baseMenor() {
        SegmentoReta p1P2 = new SegmentoReta(getPonto(0), getPonto(1));
        SegmentoReta p3P4 = new SegmentoReta(getPonto(2), getPonto(3));

        double comprimentoP1P2 = p1P2.comprimento();
        double comprimentoP3P4 = p3P4.comprimento();

        if(comprimentoP1P2 < comprimentoP3P4) {
            return p1P2;
        }
        else{
            return p3P4;
        }
    }

    public SegmentoReta baseMaior() {
        SegmentoReta p1P2 = new SegmentoReta(getPonto(0), getPonto(1));
        SegmentoReta p3P4 = new SegmentoReta(getPonto(2), getPonto(3));

        double comprimentoP1P2 = p1P2.comprimento();
        double comprimentoP3P4 = p3P4.comprimento();

        if(comprimentoP1P2 > comprimentoP3P4) {
            return p1P2;
        }
        else{
            return p3P4;
        }
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta p1P2 = new SegmentoReta(p1, p2);
        SegmentoReta p3P4 = new SegmentoReta(p3, p4);

        return p1P2.paralelo(p3P4);
    }

    @Override
    public double altura() {
        double altura = baseMaior().getP1().getCoordY() - baseMenor().getP1().getCoordY();

        if(altura < 0) {
            return -altura;
        }
        return altura;
    }

    @Override
    public double area() {
        double somaBase = baseMaior().comprimento() + baseMenor().comprimento();
        double altura = altura();

        return (somaBase * altura) / 2;
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double perimetro() {
        SegmentoReta ladoP1P4 = new SegmentoReta(baseMenor().getP1(), baseMaior().getP2());
        SegmentoReta ladoP2P3 = new SegmentoReta(baseMenor().getP2(), baseMaior().getP1());

        return baseMaior().comprimento() + baseMenor().comprimento() + ladoP1P4.comprimento() + ladoP2P3.comprimento();
    }
    
}
