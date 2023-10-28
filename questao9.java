import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o salário do colaborador: ");
        double salario = scanner.nextDouble();
        scanner.close();
        
        double percentualAumento;
        double valorAumento;
        
        if (salario <= 280.00) {
            percentualAumento = 20.0;
        } else if (salario <= 700.00) {
            percentualAumento = 15.0;
        } else if (salario <= 1500.00) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }
        
        valorAumento = (percentualAumento / 100) * salario;
        double novoSalario = salario + valorAumento;
        
        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);
    }
}
