package academia.enums;

public enum TipoCadastro {
    cliente("cliente"),
    funcionario("funcionario");

    private final String descricao;

    private TipoCadastro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
