import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("QUAL OPERAÇÃO VOCÊ DESEJA REALIZAR");
        System.out.println("0 = adição");
        System.out.println("1 = multiplicação");
        System.out.println("2 = divisão");
        System.out.println("3 = subtração");
        int operacao = sc.nextInt();

        if (operacao == 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int r = i + j;
            System.out.println(r);

        } else if (operacao == 1){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int r = i * j;
            System.out.println(r);

        } else if (operacao == 2){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int r = i / j;
            System.out.println(r);

        } else {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int r = i - j;
            System.out.println(r);
        }     
        sc.close();  
    }
}
