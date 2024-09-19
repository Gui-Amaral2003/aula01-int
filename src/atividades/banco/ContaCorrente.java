package atividades.banco;
import java.lang.Math;

public class ContaCorrente extends ContaBancaria implements Tributos{
    private double divida = 0;
    final double JUROS_DIVIDA = 0.87;
    final double JUROS_RENDIMENTO = 0.012;
     
    public ContaCorrente(double valorConta) {
        super(valorConta);
    }

    @Override
    public void depositar(double valor) {
        if(divida == 0){
           setValorConta(valor + getValorConta()); 
        }
        else {
            setValorConta(valor - divida);
            divida -= valor;
        }
        

    }

    @Override
    public void saque(double valor) {
        double saldo = getValorConta() - valor;

        if(saldo < 0) {
            chequeEspecial(saldo);
            setValorConta(saldo);
            System.out.println("Você está no cheque especial");
        }
        else {
            setValorConta(saldo);
        }
    }

    private void chequeEspecial(double saldo) {
        divida += Math.abs(saldo);
    }

    private boolean devendo() {
        if(divida > 0) {
            return true;
        }
        return false;
    }

    public void calcularDivida() {
        if(devendo()) {
            double valor = divida + (divida * JUROS_DIVIDA);
            System.out.printf("Voce esta devendo %.2f, pague ate o fechamento da fatura.", valor); 
        }
        else {
            System.out.printf("Voce nao esta devendo.");
        }
    }

    public void calcularJuros() {
        double valor = getValorConta() * JUROS_RENDIMENTO;
        System.out.printf("Rendimento ao final do mes %.2f", valor);
    }
}
