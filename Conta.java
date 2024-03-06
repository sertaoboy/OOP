import java.util.Scanner;

public class Conta {
    public int cpf;
    public int numeroRepr;
    public double saldo;

    public Conta(int cpf, int numeroRepr, double saldo){
        this.cpf = cpf;
        this.numeroRepr = numeroRepr;
        this.saldo = saldo;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setNumerorepr(int numeroRepr){
        this.numeroRepr = numeroRepr;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getCpf(){
        return cpf;
    }
    public int getNumerorepr() {
        return numeroRepr;
    }
    public double getSaldo() {
        return saldo;
    }

    // acima : metodos construtor, setters e getters respectivamente

    public int retornaBonificacao() {
        int bonificacao = (int) (saldo * 0.1);
        return bonificacao;
    }

    public void saque(Scanner leitura) {
            System.out.println("Digite o valor desejado do saque: ");
            double valor = leitura.nextDouble();
            double saldo = getSaldo();

            if(valor > saldo) {
                System.out.println("Saldo insuficiente");
            }else{
                saldo = saldo - valor;
                System.out.println("Saque realizado, seu saldo agora e de: "+ saldo);
            }
    }

    public void deposito(Scanner leitura) {
            System.out.println("Digite o valor para deposito: ");
            double valor = leitura.nextDouble();
            saldo = saldo + valor;
            System.out.println("Seu saldo agora e de: " + saldo);
    }

    public void status(){
        System.out.println("-----------Conta-----------");
        System.out.println("CPF: " + getCpf());
        System.out.println("Numero representativo: " + getNumerorepr());
        System.out.println("Saldo: R$"+saldo);
        System.out.println("-------------------------------");
    }

    public void menu () {
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("---------Menu-------");
            System.out.println("1- Saque");
            System.out.println("2- Deposito");
            System.out.println("3- Saldo");
            System.out.println("4- Sair");
            System.out.println("--------------------");
            int opcao;
            //Scanner leitura = new Scanner(System.in);   #Alteracao numero 1
            System.out.println("Digite a opcao desejada: ");
            opcao = leitura.nextInt();
            if(opcao == 1) {
                saque(leitura);
            }else if(opcao == 2) {
                deposito(leitura);
            }else if(opcao == 3) {
                status();
            }else if(opcao == 4) {
                System.out.println("Saindo...");
                break;
            }else{
                System.out.println("Opcao invalida");
            }
        }while(true);
    }
    
    public static void main(String[] args)throws Exception {
        Conta conta1 = new Conta(0, 0, 0);
        conta1.cpf = 111111;
        conta1.numeroRepr = 1;
        conta1.saldo = 10.0;

        conta1.menu();

        //conta1.status();

        //conta1.deposito();
        //conta1.status();
    }
    
}
