public class questao5 {
        public static void main(String[] args) {
            int anterior = 0;
            int atual = 1;
            
            while (atual <= 100) {
                System.out.print(anterior + " ");
                int proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }
