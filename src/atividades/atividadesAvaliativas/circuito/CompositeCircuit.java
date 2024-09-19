package atividades.atividadesAvaliativas.circuito;

public abstract class CompositeCircuit implements Circuit{
    protected Circuit[] circuits;

    public CompositeCircuit(Circuit[] c) {
        setCircuits(c);
    }

    private void setCircuits(Circuit[] c) {
        this.circuits = new Circuit[c.length];

        for(int i = 0; i < c.length;i++) {
            circuits[i] = c[i];
        }
    }

    protected Circuit[] getCircuits() {
        return circuits;
    }

}
