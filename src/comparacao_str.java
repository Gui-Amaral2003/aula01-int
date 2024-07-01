public class comparacao_str {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello"); 
        String d = "hello";
        System.out.println(a == b);// Nao usar. Compara ref e nao conteudo
        System.out.println(a == c);
        System.out.println(a.equals(d));//Utilizar, compara conteudo
    }
}
