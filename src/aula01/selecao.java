package aula01;
public class selecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a == b) {
            System.err.println("A = B");
        }
        else{
            System.out.println("Não igual");
        }

        int dia = 1;
        String diasemana;

        switch (dia) {
            case 1:
                diasemana = "Dom";
                break;
            case 2:
                diasemana = "Seg";
                break;
            case 3:
                diasemana = "Ter";
                break;
            default:
                diasemana = "invalido";
                break;
        }

        System.out.println(diasemana);
    }
}
