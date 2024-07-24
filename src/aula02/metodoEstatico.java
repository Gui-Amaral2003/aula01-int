package aula02;
public class metodoEstatico {
    int soma(int a, int b) {

        return a + b;
    }
    public static void main(String[] args) {
        int c = new metodoEstatico().soma(10, 20);

        System.out.println(c);
    }
}
