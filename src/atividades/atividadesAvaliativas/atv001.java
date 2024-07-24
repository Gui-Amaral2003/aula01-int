package atividades.atividadesAvaliativas;
public class atv001 {
    public class Main {
        public static int abs(int n) {
            if( n < 0) {
                return -n;
            }
            else {
                return n;
            }
        }
        
        public static double sqrt(double n, double epsilon) {
            double xn1, xn = n / 2.0;
            if(n == 0) {
                return 0;
            }
            while (true) {
                //Aplicacao da formula
                xn1 = 0.5 * (xn + (n / xn));
                //definindo a diferenca e obtendo o valor absoluto
                double diff = xn1 - xn;
                if(diff < 0) {
                    diff = -diff;
                }

                if (diff < epsilon) {
                    break;
                }
                xn = xn1;
            }
            return xn1;
        }
        
        public static boolean isPerfectNumber(long number) {
            int sum = 0;
            for(int i = 1; i <= number / 2; i++) {
                if(sum > number) {
                    break;
                }
                else if(number % i == 0 && sum < number) {
                    sum += i;
                }
                
            }
            if(sum != number)
                return false;
            else {
                return true;
            }
        }
    
        public static String encrypt(String message, int key) {
            char[] caracteres = message.toCharArray();

            for (int i = 0; i < caracteres.length; i++) {

            if(((int) caracteres[i] + key) <= 122){
                int ascii_new = (int) caracteres[i] + key;
                char char_new = (char) ascii_new;
                caracteres[i] = char_new;
            }

            else {
                int key2 = abs(26 - key);
                int ascii_new = (int) caracteres[i]  - key2;
                char char_new = (char) ascii_new;
                caracteres[i] = char_new;
            }
        }

            String string_new = new String(caracteres);
                return string_new;
        }
    
        public static String decrypt(String encryptedMessage, int key) {
            char[] caracteres = encryptedMessage.toCharArray();

            for (int i = 0; i < caracteres.length; i++) {

                if(((int) caracteres[i] - key) >= 97){
                    int ascii_new = (int) caracteres[i] - key;
                    char char_new = (char) ascii_new;
                    caracteres[i] = char_new;
                }

                else {
                    int key2 = abs(26 - key);
                    int ascii_new = (int) caracteres[i] + key2;
                    char char_new = (char) ascii_new;
                    caracteres[i] = char_new;
                }
            }

            String string_new = new String(caracteres);
            return string_new;
        }
        
        public static void main(String[] args) throws Exception {
            double i = sqrt(15, 0.001);
            System.out.println(i);
        }
    }
}
