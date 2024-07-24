package atividades.atividadesAvaliativas;

public class atv003 {

    static class MDC {
        public static int mdc(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
    static class Racional {
        int numerador;
        int denominador;

        // Construtor
        public Racional(int numerador, int denominador) {
            this.numerador = numerador;
            this.denominador = denominador;
        }

        Racional adiciona(Racional c) {
            int somaNumerador = (this.numerador*c.denominador) + (this.denominador*c.numerador);
            int somaDenominador = (this.denominador*c.denominador);

            return new Racional(somaNumerador, somaDenominador);
        }

        Racional subtrai(Racional c) {
            int subtraiNumerador = (this.numerador*c.denominador) - (this.denominador*c.numerador);
            int subtraiDenominador = (this.denominador*c.denominador);

            return new Racional(subtraiNumerador, subtraiDenominador);
        }

        Racional multiplica(Racional c) {
            int multiplicaNumerador = (this.numerador)*(c.numerador);
            int multiplicaDenominador = (this.denominador)*(c.denominador);

            return new Racional(multiplicaNumerador, multiplicaDenominador);
        }

        Racional divide(Racional c) {
            Racional inversoC = new Racional(c.denominador, c.numerador);
            Racional res = this.multiplica(inversoC);

            return res;
        }

        boolean igual(Racional c) {
            int mdc1 = MDC.mdc(this.numerador, this.denominador);
            int mdc2 = MDC.mdc(c.numerador, c.denominador);


            int minNumerador1 = this.numerador/mdc1;
            int minDenominador1 = this.denominador/mdc1;
            
            int minNumerador2 = c.numerador/mdc2;
            int minDenominador2 = c.denominador/mdc2;

            if((minNumerador1 == minNumerador2) && (minDenominador1 == minDenominador2)){
                return true;
            }

            return false;
        }

        String converteParaString() {
            int mdc1 = MDC.mdc(this.numerador, this.denominador);

            int minNumerador1 = this.numerador/mdc1;
            int minDenominador1 = this.denominador/mdc1;

            if(minDenominador1 < 0 && minNumerador1 > 0){
                minNumerador1 = -minNumerador1;
                minDenominador1 = -minDenominador1;
                return minNumerador1 + "/" + minDenominador1;
            }
            else if(minNumerador1 < 0 && minDenominador1 < 0) {
                minNumerador1 = -minNumerador1;
                minDenominador1 = -minDenominador1;
                return minNumerador1 + "/" + minDenominador1;
            }

            return minNumerador1 + "/" + minDenominador1;
        }

    }

    public static void main(String[] args) {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(-1, 3);
        Racional c = new Racional(1, -3);
        Racional d = new Racional(-1, -2);
        Racional e = new Racional(2, 4);

        System.out.printf("%s %s %s %s\n", a, b, c, d);
        System.out.println(a.converteParaString());
        System.out.println(b.converteParaString());
        System.out.println(c.converteParaString());
        System.out.println(d.converteParaString());
        System.out.println(e.converteParaString());
    }
}
