package atividades.atividadesAvaliativas.circuito;

public class ParallelCircuit extends CompositeCircuit{
    public ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    @Override
    public double getResistance() {
        double inversoResistencia = 0;
        for(Circuit c : getCircuits()) {
            inversoResistencia += 1.0 / c.getResistance();
        }

        return 1.0 / inversoResistencia;
    }
}
