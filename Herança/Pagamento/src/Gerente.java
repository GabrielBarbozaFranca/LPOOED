public class Gerente extends FuncionarioCLT implements Bonificavel{

    public Gerente(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
	}
	
	@Override
	public double calcularBonus() {
		return getSalarioBase() * 0.20;
	}
	
	@Override
	public double calcularPagamento() {
		return getSalarioBase() + getValeTransporte() + calcularBonus();
	}
}