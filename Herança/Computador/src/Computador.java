public class Computador extends Equipamento {

    protected String tipo;

    public Computador (String nome, String marca, double potencia, String tipo){
        super(nome, marca, potencia);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Potencia: " + potencia);
        System.out.println("Tipo: " + tipo);
    }

}
