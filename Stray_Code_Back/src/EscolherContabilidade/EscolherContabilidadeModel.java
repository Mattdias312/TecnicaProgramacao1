
package EscolherContabilidade;

import Tributacao.TributacaoModel;

public class EscolherContabilidadeModel {
    private int idEscolherContabilidade;
    private String escolherContabilidade;
    private String descricao;
    private TributacaoModel TributacaoModel;

    public EscolherContabilidadeModel(int idEscolherContabilidade, String escolherContabilidade, String descricao, TributacaoModel TributacaoModel) {
        this.idEscolherContabilidade = idEscolherContabilidade;
        this.escolherContabilidade = escolherContabilidade;
        this.descricao = descricao;
        this.TributacaoModel = TributacaoModel;
    }

    public void setIdEscolherContabilidade(int idEscolherContabilidade) {
        this.idEscolherContabilidade = idEscolherContabilidade;
    }

    public void setEscolherContabilidade(String escolherContabilidade) {
        this.escolherContabilidade = escolherContabilidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTributacaoModel(TributacaoModel TributacaoModel) {
        this.TributacaoModel = TributacaoModel;
    }

    public int getIdEscolherContabilidade() {
        return idEscolherContabilidade;
    }

    public String getEscolherContabilidade() {
        return escolherContabilidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public TributacaoModel getTributacaoModel() {
        return TributacaoModel;
    }
}
