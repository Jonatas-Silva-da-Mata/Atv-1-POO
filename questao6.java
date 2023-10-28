public class questao6 {
        public static void main(String[] args) {
            for (int n = 0; n <= 10; n++) {
                int fatorial = 1;
                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                }
                System.out.println("O fatorial de " + n + " é " + fatorial);
            }
        }
    }
    
