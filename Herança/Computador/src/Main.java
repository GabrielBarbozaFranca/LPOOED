public class Main {
    public static void main(String[] args) {

        Computador computador = new Computador(
            "Computador",
            "Asus",
            65.00,
            "Notebook"
        );

        computador.exibirInformacoes();
        computador.liga();
        computador.liga(10);

    }
}
