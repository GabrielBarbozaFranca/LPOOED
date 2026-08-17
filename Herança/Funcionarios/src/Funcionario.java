public class Funcionario{
    
    protected String nome;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void trabalhar(){
        System.out.println("O funcionario ta trabalhando");
    }

    public void trabalhar(int tempo){
        System.out.println("O funcionario ta trabalhando por " + tempo + " d");
    }

    public void exibirInformacoes(){
        System.out.println();
    }
}
