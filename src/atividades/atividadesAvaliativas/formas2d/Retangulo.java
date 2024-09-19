package atividades.atividadesAvaliativas.formas2d;

public class Retangulo extends Paralelogramo{
    
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    

    @Override
    public double largura() {
        SegmentoReta largura = new SegmentoReta(getPonto(3), getPonto(2));

        return largura.comprimento();
    }

    public double altura() {
        SegmentoReta altura = new SegmentoReta(getPonto(1), getPonto(2));

        return altura.comprimento();
    }
    
    public boolean quadrado() {
        if(largura() == altura()) {
            return true;
        }
        return false;
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta p1P2 = new SegmentoReta(p1, p2);
        SegmentoReta p3P4 = new SegmentoReta(p3, p4);
        SegmentoReta p1P4 = new SegmentoReta(p1, p4);
        SegmentoReta p2P3 = new SegmentoReta(p2, p3);

        if(p1P2.comprimento() == p3P4.comprimento() && p2P3.comprimento() == p1P4.comprimento()) {
            return true;
        }
        return false;

    }

    @Override
    public double area() {
        return altura() * largura();
    }

    @Override
    public double perimetro() {
        SegmentoReta p1P2 = new SegmentoReta(getPonto(0), getPonto(1));
        SegmentoReta p2P3 = new SegmentoReta(getPonto(1), getPonto(2));

        return 2*(p1P2.comprimento() + p2P3.comprimento());
    }


}
