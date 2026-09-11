public abstract class Funcionario extends Pagamento{
    
    private String nome;
	private String cpf;
	private double salarioBase;
	
	public Funcionario(String nome, String cpf, double salarioBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if(salarioBase < 0) {
			System.out.println("Valor invalido");
			return;
		}
		this.salarioBase = salarioBase;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salario base: R$ " + salarioBase);
	}
	
	@Override
	public abstract double calcularPagamento();
}
