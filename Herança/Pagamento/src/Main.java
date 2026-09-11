public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Gustavo", "111.111.111-11", 3640.00);
        Vendedor vendedor = new Vendedor("Gabriel", "222.222.222-22", 2720.00);
        FuncionarioPJ pj new FuncionarioPJ("Jaiminho", "333.333.333-33", 4700.00);
        PrestadorServico prestadorServico = new prestadorServico("Joao", "444.444.444-44", 1200.00);

        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(pj);
        System.out.println(prestadorServico);
    }
}
