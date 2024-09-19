package atividades.banco;

public abstract class ContaBancaria {
    private double valorConta;

    public ContaBancaria(double valorConta) {
        setValorConta(valorConta);
    }

    public abstract void depositar(double deposito);

    public abstract void saque(double valor);

    public double getValorConta() {
        return valorConta;
    }

    protected void setValorConta(double valor) {
        this.valorConta = valor;
    }

    
}
