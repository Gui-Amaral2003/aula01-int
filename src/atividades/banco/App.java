package atividades.banco;

public class App {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(100);

        c1.saque(150);

        c1.calcularDivida();
        
        c1.saque(200);

        c1.calcularDivida();

        c1.depositar(1000);

        c1.calcularDivida();

        System.out.println(c1.getValorConta());
    }
}
