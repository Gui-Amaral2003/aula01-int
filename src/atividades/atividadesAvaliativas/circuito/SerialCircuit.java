package atividades.atividadesAvaliativas.circuito;

public class SerialCircuit extends CompositeCircuit{
    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double total = 0;

        for(Circuit c: getCircuits()) {
            total += c.getResistance();
        }

        return total;
    }
}
