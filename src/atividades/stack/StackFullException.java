package atividades.stack;

public class StackFullException extends Exception{
    public StackFullException(int tamanho, int capacidade) {
        super(String.format("Stack is full, Size %d, Capacity, %d", tamanho, capacidade));
    }
}
