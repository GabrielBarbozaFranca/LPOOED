public class Vendedor {

    private double totalVendas;

    public Vendedor(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
        setTotalVendas(totalVendas);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        if(totalVendas < 0){
            System.out.println("Valor invalido");
            return;
        }
        this.totalVendas = totalVendas;
    }

    @Override 
    public double calcularPagamento() {
        double comissao = totalVendas * 0.05;
		return getSalarioBase() + getValeTransporte() + comissao;
	}
}
