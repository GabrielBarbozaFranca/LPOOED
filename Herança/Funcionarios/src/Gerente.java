public class Gerente extends Funcionario {

    public Gerente(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
    
}
