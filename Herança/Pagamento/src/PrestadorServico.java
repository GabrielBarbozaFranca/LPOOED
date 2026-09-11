public class PrestadorServico implements Pagavel{

    private String nome;
    private double horasTrabalhadas;
    private double valorHora;

    public PrestadorServico(String nome, double horasTrabalhadas, double valorHora) {
		super(nome, horasTrabalhadas, valorHora);
        this.nome = nome;
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }
   
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if(horasTrabalhadas < 0){
            System.out.println("Valor invalido");
            return;
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0){
            System.out.println("Valor invalido");
            return;
        }
        this.valorHora = valorHora;
    }

    @Override 
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}
