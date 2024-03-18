public class Empregado extends Pessoa{
    private double salario;
    private String matricula;
    private int codigoSetor;
    private double imposto;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void valorInss(){

    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void calculaSalario(){
        double salarioAtual = getSalario() - getImposto();
        System.out.println("Seu salario e de: R$"+salarioAtual);
    }
}
