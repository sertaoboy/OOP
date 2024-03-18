public class Main {
    public static void main(String[] args) {
        Fornecedor jose = new Fornecedor();
        jose.setValorCredito(1200);
        jose.setValorDivida(150.45);
        jose.obterSaldo();


        Empregado carlos = new Empregado();
        carlos.setSalario(2100);
        carlos.setImposto(0.15);
        carlos.calculaSalario();

    }
}
