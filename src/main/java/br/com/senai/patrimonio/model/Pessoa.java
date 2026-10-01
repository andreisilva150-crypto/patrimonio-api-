package br.com.senai.patrimonio.model;

public class Pessoa {
    private long id;
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;}
    /**
    * Metodo com implementação padrao na super classe mas que pode ser
     sobrescrito com (@Override) pelas subclasses
    ver {@link Funcionario#getIdentificacao()).
    * Isso caracteriza o POLIMORFIRMO: a mesma chamada getIdentificao()
    * Se comporta de forma diferente dependendo do objeto em memória
    */
    public String getIdentificacao(){
        return this.nome + " (CPF: " + this.cpf + ")";

    }
}
