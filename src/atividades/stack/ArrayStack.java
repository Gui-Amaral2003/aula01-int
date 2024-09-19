package atividades.stack;

public class ArrayStack implements Stack{
    private int[] elements;
    private int top;

    public ArrayStack(int capacidade) {
        if(capacidade < 0) {
            throw new IllegalArgumentException("Capacidade invalida");
        }

        elements = new int[capacidade];
        top = 0;
    }

    @Override
    public void push(int elemento) throws StackFullException {
        if(isFull()) {
            throw new StackFullException(size(), capacity());
        }

        elements[top] = elemento;
        top ++;
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public int pop() throws StackEmptyException {
        if(isEmpty()) {
            throw new StackEmptyException(size(), capacity());
        }

        int element = elements[top - 1];
        top--;
        return element;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int top() throws StackEmptyException {
        if(isEmpty()) {
            throw new StackEmptyException(size(), capacity());
        }
        return elements[top - 1];
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == capacity();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stack top -> [");

        for(int i = top - 1; i >= 0; i--) {
            builder.append(elements[i]);
            if(i > 0) {
                builder.append(",");
            }
        }

        builder.append("]");
        return builder.toString();
    }

}
