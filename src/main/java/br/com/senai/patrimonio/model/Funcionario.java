package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa{
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResponsaveis;

    public Funcionario (){}

    public Funcionario(Cargo cargo, Empresa empresa, Sala salasResponsaveis) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResponsaveis = salasResponsaveis;
    }

    public Funcionario(long id, String nome, String cpf, Cargo cargo, Empresa empresa, Sala salasResponsaveis) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResponsaveis = salasResponsaveis;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Sala getSalasResponsaveis() {
        return salasResponsaveis;
    }

    public void setSalasResponsaveis(Sala salasResponsaveis) {
        this.salasResponsaveis = salasResponsaveis;
    }
}
