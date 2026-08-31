package br.com.senai.patrimonio.model.enums;

public enum PagamentoComposto {
    PIX("Pix", "Ativo"),
    CARTAO_CREDITO("Cartao de Crédito", "Ativo"),
    CARTAO_DEBITO("Catao de Débito", "Ativo"),
    BOLETO("Boleto", "Inativo"),
    PERMUTA("Permuta", "Inativo"),
    DINHEIRO("Dinheiro", "Ativo");

    private final String descricao;
    private final String situacao;

    PagamentoComposto(String descricao, String situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSituacao() {
        return situacao;
    }
}
