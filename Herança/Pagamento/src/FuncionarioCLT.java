public abstract class FuncionarioCLT extends Funcionario{
    
    private double valeTransporte;
	
	public FuncionarioCLT(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
		this.valeTransporte = 220.00;
	}
	
	public double getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(double valeTransporte) {
		if(valeTransporte < 0) {
			System.out.println("Valor invalido");
			return;
		}
		this.valeTransporte = valeTransporte;
	}
}
