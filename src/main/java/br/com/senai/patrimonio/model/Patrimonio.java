package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.EstadoConservacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Patrimonio implements BuscarConservacao {
    private Long Id;
    private Bem bem;
    private Sala sala;
    private Funcionario funcionario;
    private Integer quantidfade;
    private EstadoConservacao estado;
    private LocalDate dataAquisicao;
    private BigDecimal valor;

    public Patrimonio() {
    }

    //Alocar este patrimonio em uma sala e garantir que ele saia da responsabilidade de um funcionário//
    public void alocarEmSala(Sala sala) {
        this.sala = sala;
        this.funcionario = null;
    }

    // Retorna true se possuir uma sala ou um funcionario vinculado ao patrimonio//
    public boolean possuiLocalizacaoValida() {
        return (sala != null) || (funcionario != null);
    }

    public Localizavel getlocalizacaoAtual() {
        return this.sala != null ? sala : funcionario;
    }

    //Aloca este patrimônio sob responsabilidade de um funcionário//
    public void alocarParaFuncionario(Funcionario Funcionario) {
        this.funcionario = funcionario;
        this.sala = null;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Bem getBem() {
        return bem;
    }

    public void setBem(Bem bem) {
        this.bem = bem;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getQuantidfade() {
        return quantidfade;
    }

    public void setQuantidfade(Integer quantidfade) {
        this.quantidfade = quantidfade;
    }

    public EstadoConservacao getEstado() {
        return estado;
    }

    public void setEstado(EstadoConservacao estado) {
        this.estado = estado;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


    //override serve para sobre escrever um metodo//
    @Override
    public String validarEstadoConservacao() {
        return this.estado != null ? this.estado.toString() : "SEM ESTADO DE CONSERVAÇAO";
    }
}
