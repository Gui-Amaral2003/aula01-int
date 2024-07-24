package atividades.retangulos;

public class Retangulos {
    int largura;
    int altura;

    public Retangulos(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    int calculoArea() {
        return this.altura * this.largura;
    }

    int calculoPerimetro() {
        return 2*(this.altura + this.largura);
    }

    boolean verificaPonto(int x, int y) {
        if((x >= 0 && x <= largura) && (y >= 0 && y <= altura)) {
            return true;
        }
        return false;
    }
}
