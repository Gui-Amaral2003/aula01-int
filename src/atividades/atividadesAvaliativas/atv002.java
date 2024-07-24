package atividades.atividadesAvaliativas;

public class atv002 {

    static class Complexo {
        double real;
        double imaginario;

        //Construtor
        public Complexo(double r, double i) {
            this.real = r;
            this.imaginario = i;
        }

        Complexo adiciona(Complexo c) {
            double somaReal = this.real + c.real;
            double somaImaginario = this.imaginario + c.imaginario;

            return new Complexo(somaReal, somaImaginario);
        }

        Complexo subtrai(Complexo c) {
            double subtraiReal = this.real - c.real;
            double subtraiImaginario = this.imaginario - c.imaginario;

            return new Complexo(subtraiReal, subtraiImaginario);
        }

        Complexo multiplica(Complexo c) {
            Double multiplicaReal = ((this.real*c.real) - (this.imaginario*c.imaginario));
            Double multiplicaImaginario = ((this.real * c.imaginario) + (this.imaginario * c.real));

            return new Complexo(multiplicaReal, multiplicaImaginario);
        }

        Complexo divide(Complexo c) {
            double divisaoReal = 0.0;
            double divisaoImaginario = 0.0;
            
            return new Complexo(divisaoReal, divisaoImaginario);
        }

        public String converteParaString() {

            return String.format("%.2f + %.2fi", this.real, this.imaginario);
        }
    }
    


    public static void main(String[] args) {
        
        Complexo c = new Complexo(1, 2);
        
        Complexo c2 = new Complexo(3, 4);

        Complexo c3 = c.subtrai(c2);

        System.out.println(c3.converteParaString());
    }
}
