package atividades.stack;

public class StackEmptyException extends Exception{
    public StackEmptyException(int tamanho, int capacidade) {
        super(String.format("Stack is empty, Size %d, Capacity, %d", tamanho, capacidade));
    }
}
