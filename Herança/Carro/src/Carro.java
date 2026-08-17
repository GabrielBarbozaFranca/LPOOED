public class Carro extends Veiculo {
    
    protected int portas;

    public Carro (String modelo, String marca, int ano, int portas){
        super(modelo, marca, ano);
        setPortas(portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade de portas: " + portas);
    }
    
}
