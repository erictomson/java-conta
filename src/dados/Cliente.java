package dados;

// JAVABEANS
// 1) Atributos de classe privados (encapsulamento/POO)
// 2) Getters e Setters
// 3) Construtor sem parâmetros inicializando os atributos com vazio, zero ou nulo

public class Cliente {
    //private: acessível somente dentro desta classe
    //alterando o ESTADO da classe
    private String nome;
    private String sobrenome;

    // Construtor sem parâmetros
    public Cliente(){
        this.setNome("");
        this.setSobrenome("");
    }

    // Construtor com parâmetros
    public Cliente(String nome, String sobrenome) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    //camelCase
    //Getters e Setters para alterar o estado da classe
    //Trabalhar com os atributos da classe, lendo-os e alterando os seus valores
    //de forma indireta => é a classe Cliente quem irá retornar e alterar o valor dos atributos
    //para nós (ENCAPSULAMENTO)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome=sobrenome;
    }
}
