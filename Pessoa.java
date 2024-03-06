public class Pessoa{
    public String nome;
    public int nascimento;
    public double peso;
    public double altura;

    public Pessoa(String nome, int nascimento, double peso, double altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
        this.altura = altura;
    }
    //Metodo construtor


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Metodos setters


    public String getNome(){
        return nome;
    }
    public int getNascimento(){
        return nascimento;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    //Metodos getters





    public void mostraImc(){
        double imc =peso/(altura *altura);
        if(imc < 18.5) {
            System.out.println("Recomendado procurar um medico");
        }else if(imc >= 40.0) {
            System.out.println("Obesidade grau III");
        }else if( imc > 35.0 && imc < 39.9) {
            System.out.println("Obesidade grau II");
        }else if(imc> 30.0 && imc < 34.9) {
            System.out.println("Obesidade grau I");
        }else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        }else if(imc > 18.5 && imc < 24.9) {
            System.out.println("Peso adequado");
        }
    }





    public void mostraIdade() {
        int idade = 2024 - nascimento;
        System.out.println(idade + " anos");
    }

    public void mostraAgua() {
        double ml = peso * 35;
        System.out.println("voce precisa tomar " + ml +" ml de agua por dia");

    }





    public static void main(String[] args) {
        Pessoa pessoaExemplo = new Pessoa(null, 0, 0, 0);
        pessoaExemplo.nome = "Andre";
        pessoaExemplo.nascimento = 1986;
        pessoaExemplo.peso = 72.3;
        pessoaExemplo.altura = 1.78;
        //definindo os atributos da instancia (objeto) pessoaExemplo

        pessoaExemplo.mostraAgua();
        pessoaExemplo.mostraIdade();
        pessoaExemplo.mostraImc();
        //realizando casting dos metodos da classe Pessoa
    }


}