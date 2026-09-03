package br.com.senai.patrimonio.avaliacao;

public class Participante extends Pessoa {
    private String matricula;
    private String Nivel;

    public Participante() {
    }

    public Participante(String matricula, String nivel) {
        this.matricula = matricula;
        Nivel = nivel;
    }

    public Participante(String nome, String email, String telefone, String matricula, String nivel) {
        super(nome, email, telefone);
        this.matricula = matricula;
        Nivel = nivel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }
}

