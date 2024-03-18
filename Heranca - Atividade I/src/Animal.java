public class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome=nome;
        this.peso=peso;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome()+", Peso: " + getPeso();
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

    public String getNome(){
        return nome;
    }
    public double getPeso() {
        return peso;
    }



}
