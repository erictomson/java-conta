package dados;

public class Conta {
    //private: esconde (encapsula) os atributos da classe
    private String numero;
    private double saldo; //saldo: 200.00
    private Cliente titular;

    // Construtor sem parâmetros
    // Inicializa os atributos com vazio ou zero
    public Conta() {
        this.setNumero("");
        this.setSaldo(0);
        this.setTitular(null);
    }

    public Conta(String numero) {
        this.setNumero(numero);
        this.setSaldo(0);
        this.setTitular(null);
    }

    // Construtor com parâmetros
    // Inicializa os atributos com valores passados
    // Na instanciação da classe
    public Conta(String numero, Cliente titular) {
        this.setNumero(numero);
        this.setSaldo(0);
        this.setTitular(titular);
    }

    private String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        //sacar somente até o valor disponível
        //Autenticado?
        this.saldo = saldo;
    }

    private Cliente getTitular() {
        return titular;
    }

    private void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //depositar: 100.00 => //valor: -100.00
    public void depositar(double valor) {
        //***REGRA DE NEGÓCIO**
        //valor < 0: não depositar
        if(valor>0) {
            System.out.println("Saldo atual......: " + getSaldo());
            System.out.println("Valor a depositar: " + valor);
            this.setSaldo(getSaldo() + valor);
            System.out.println("Novo saldo.......: " + getSaldo());
        } else {
            System.out.println("Valor inválido! Digite um valor positivo!");
        }
    }

    public void sacar(double valor) {
        //somente efetuar o saque se o saldo disponível for suficiente
        if(getSaldo()>=valor) {
            System.out.println("Saldo atual..: " + getSaldo());
            System.out.println("Valor a sacar: " + valor);
            this.setSaldo(getSaldo() - valor);
            System.out.println("Novo saldo...: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Operação cancelada!");
        }
    }
}
