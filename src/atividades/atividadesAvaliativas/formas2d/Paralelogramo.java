package atividades.atividadesAvaliativas.formas2d;

//TODO: FAZER O OVERRIDE DA AREA
public class Paralelogramo extends Trapezio{
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta p1P2 = new SegmentoReta(p1, p2);
        SegmentoReta p3P4 = new SegmentoReta(p3, p4);
        SegmentoReta p1P4 = new SegmentoReta(p1, p4);
        SegmentoReta p2P3 = new SegmentoReta(p2, p3);

        double comprimentoP1P2 = p1P2.comprimento();
        double comprimentoP3P4 = p3P4.comprimento();
        double comprimentoP1P4 = p1P4.comprimento();
        double comprimentoP2P3 = p2P3.comprimento();

        if(comprimentoP1P2 == comprimentoP3P4 && comprimentoP1P4 == comprimentoP2P3) {
            return true;
        }
        return false;
    }
}
