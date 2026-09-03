package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {
    EVENTO_PLANEJADO (1,"Evento_Planejado"),
    INSCRICOES_ABERTAS (2, "Inscricoes_Abertas"),
    EVENTO_EM_ANDAMENTO (3, "Evento_em_Andamento"),
    EVENTO_ENCERRADO (4, "Evento_Encerrado"),
    EVENTO_CANCELADO (5, "Evento_Cancelado");

        private final String descricao;
        private final int codigo;

    StatusEvento(int codigo,String descricao) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
