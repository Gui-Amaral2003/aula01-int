package atividades.atividadesAvaliativas.circuito;

public class App {
    public static void main(String[] args) {
    Circuit[] circuits = new Circuit[] {
        new Resistor(200.0),
        new Resistor(470.0),
        new SerialCircuit(new Circuit[] {
            new Resistor(1_000.0),
            new Resistor(2_000.0),
        }),
        new Resistor(220.0),
        new Resistor(130.0)
    };
    ParallelCircuit parallel = new ParallelCircuit(circuits);
    System.out.println(parallel.getResistance());
        
    for (Circuit circuit : parallel.getCircuits()) {
        System.out.println(circuit.getResistance());
        }
    }  
    
}
