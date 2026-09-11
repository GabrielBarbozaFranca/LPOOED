public class FuncionarioPJ extends Funcionario{

    private double percentualImposto;
	
	public FuncionarioPJ(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
		setPercentualImposto(percentualImposto);
	}

	public double getPercentualImposto() {
		return percentualImposto;
	}

	public void setPercentualImposto(double percentualImposto) {
		if (percentualImposto < 0) {
			System.out.println("Valor invalido");
			return;
		}
		this.percentualImposto = percentualImposto;
	}
	
	@Override
	public double calcularPagamento() {
		return getSalarioBase() - (getSalarioBase() * percentualImposto);
	}
}
