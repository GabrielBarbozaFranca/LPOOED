public class Equipamento{
    
    protected String nome;
    protected String marca;
    protected double potencia;

    
    public Equipamento(String nome, String marca, double potencia) {
        this.nome = nome;
        this.marca = marca;
        this.potencia = potencia;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void liga(){
        System.out.println("O equipamento ta ligado");
    }

    public void liga(int tempo){
        System.out.println("O equipamento ta ligado por " + tempo + " s");
    }

    public void exibirInformacoes(){
        System.out.println();
    }



    
}
