package atividades.atividadesAvaliativas.circuito;

public class Resistor implements Circuit{
    private double resistance;

    public Resistor(double resistor) {
        this.resistance = resistor;
    }

    public double getResistance() {
        return this.resistance;
    }
}
