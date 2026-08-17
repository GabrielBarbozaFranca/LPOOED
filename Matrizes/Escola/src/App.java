import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Quantas notas deseja digitar? ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        for (int i = 0; i < n; i++){
            notas[i] = sc.nextDouble();
        }
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];   
        }
        double media = soma / notas.length;

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++){
            if (notas[i] > maior){
                maior = notas[i];
            } if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= 7){
                aprovados++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Menor nota: " + menor);
        System.out.println("Maior nota: " + maior);
        System.out.println("Quantidade de aprovados: " + aprovados);

        sc.close();
    }
}
