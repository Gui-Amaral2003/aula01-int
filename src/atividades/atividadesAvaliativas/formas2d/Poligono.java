package atividades.atividadesAvaliativas.formas2d;

public abstract class Poligono extends FormaGeometrica{
    private final Ponto[] pontos;
    Poligono(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public Ponto getPonto(int i) {
        return pontos[i];
    }

}
