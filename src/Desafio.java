import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor do salário: ");
        double salario = entrada.nextDouble();
        double porcentagem;
        double novosalario;
        double ganhoreal;

        if (salario <= 280) {
            porcentagem = ((salario * 20) / 100);
            novosalario = (salario + porcentagem);
            ganhoreal = (porcentagem / (1 + 0.038));
            System.out.printf("Salário base: R$ %.2f\n", salario);
            System.out.println("Reajuste de: 20%");
            System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
            System.out.printf("Novo salário pós aumento: R$ %.2f\n", novosalario);
            System.out.printf("Valor do aumento real descontando a inflação: R$ %.2f", ganhoreal);
        } else if ((salario > 280) && (salario <= 700)) {
            porcentagem = ((salario * 15) / 100);
            novosalario = (salario + porcentagem);
            ganhoreal = (porcentagem / (1 + 0.038));
            System.out.printf("Salário base: R$ %.2f\n", salario);
            System.out.println("Reajuste de: 15%");
            System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
            System.out.printf("Novo salário pós aumento: R$ %.2f\n", novosalario);
            System.out.printf("Valor do aumento real descontando a inflação: R$ %.2f", ganhoreal);
        } else if ((salario > 700) && (salario <= 1500)) {
            porcentagem = ((salario * 10) / 100);
            novosalario = (salario + porcentagem);
            ganhoreal = (porcentagem / (1 + 0.038));
            System.out.printf("Salário base: R$ %.2f\n", salario);
            System.out.println("Reajuste de: 10%");
            System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
            System.out.printf("Novo salário pós aumento: R$ %.2f\n", novosalario);
            System.out.printf("Valor do aumento real descontando a inflação: R$ %.2f", ganhoreal);
        }  else {
            porcentagem = ((salario * 5) / 100);
            novosalario = (salario + porcentagem);
            ganhoreal = (porcentagem / (1 + 0.038));
            System.out.printf("Salário base: R$ %.2f\n", salario);
            System.out.println("Reajuste de: 5%");
            System.out.printf("Valor do aumento: R$ %.2f\n", porcentagem);
            System.out.printf("Novo salário pós aumento: R$ %.2f\n", novosalario);
            System.out.printf("Valor do aumento real descontando a inflação: R$ %.2f", ganhoreal);
        }

    }
}