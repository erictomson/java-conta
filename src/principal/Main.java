package principal;

import dados.Conta;
import dados.Cliente;

public class Main {

    // *** ASSINATURA DO MÉTODO main() ***
    // public: modificador de acesso: determina a visibilidade
    // static: vemos em outro momento
    // void: tipo de dado retornado pelo método
    // main: nome no método
    // String[] args: parâmetro do método
    // *** ASSINATURA DO MÉTODO main() ***

    public static void main(String[] args) {

        // Exercício5
        // novoCliente1: usando construtor com parâmetros
        Cliente novoCliente1 = new Cliente("Eric","Tomson");
        // Construtor sem parâmetros
        Conta novaConta1 = new Conta("123456",novoCliente1);
        novaConta1.depositar(100);
        novaConta1.sacar(95);

        // novoCliente1: usando construtor sem parâmetros
        Cliente novoCliente2 = new Cliente();
        novoCliente2.setNome("Paty");
        novoCliente2.setSobrenome("Miyazaki");
        //Construtor com parâmetros
        Conta contaPlus = new Conta("987654",novoCliente2);
        contaPlus.depositar(9000);
        contaPlus.sacar(500);

    }
}
