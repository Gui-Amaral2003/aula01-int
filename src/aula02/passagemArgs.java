package aula02;
public class passagemArgs {
    
    // Referencia somente para funções não primarias
    // Por valor somente para funções primarias

    
    public static int inc(int a, int b) {
        a++;
        b++;

        return a + b;
    }

    public void incRef(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i]++;
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        
        System.out.printf("%d %d\n", a, b);

        inc(a, b);

        System.out.printf("%d %d\n", a, b);




    }
}
