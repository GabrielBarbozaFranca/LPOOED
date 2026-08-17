import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo");
        String modelo = sc.nextLine();

        System.out.println("Digite a marca");
        String marca = sc.nextLine();

        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        System.out.println("Digite a quantidade de portas");
        int portas = sc.nextInt();

        System.out.println("Digite o tempo que ta ligado");
        int tempo = sc.nextInt();

        Carro carro = new Carro(modelo, marca, ano, portas);

        carro.exibirInformacoes();
        carro.liga();
        carro.liga(tempo);

        sc.close();
    }
}
