package br.com.senai.patrimonio.model;

public class Bem {
    private Long id;
    private String nome;
    private String code;
    private Empresa empresa;

    public Bem () {
    }

    public Bem(Long id, String nome, String code, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.code = code;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
