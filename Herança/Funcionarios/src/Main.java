import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nome = sc.nextLine();

        System.out.println("Digite o cargo");
        String cargo = sc.nextLine();

        System.out.println("Digite o salario");
        double salario = sc.nextDouble();

        System.out.println("Digite o tempo de trabalho");
        int tempo = sc.nextInt();

        Gerente gerente = new Gerente(nome, cargo, salario);

        gerente.exibirInformacoes();
        gerente.trabalhar();
        gerente.trabalhar(tempo);
        
        sc.close();
    }

}
