
package AbrirEmpresa;

import Tributacao.TributacaoModel;

public class AbrirEmpresaModel {
    private int idAbrirEmpresa;
    private String formasAbrirEmpresa;
    private String descricao;
    private TributacaoModel TributacaoModel;

    public AbrirEmpresaModel(int idAbrirEmpresa, String formasAbrirEmpresa, String descricao, TributacaoModel TributacaoModel) {
        this.idAbrirEmpresa = idAbrirEmpresa;
        this.formasAbrirEmpresa = formasAbrirEmpresa;
        this.descricao = descricao;
        this.TributacaoModel = TributacaoModel;
    }

    public void setIdAbrirEmpresa(int idAbrirEmpresa) {
        this.idAbrirEmpresa = idAbrirEmpresa;
    }

    public void setFormasAbrirEmpresa(String formasAbrirEmpresa) {
        this.formasAbrirEmpresa = formasAbrirEmpresa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTributacaoModel(TributacaoModel TributacaoModel) {
        this.TributacaoModel = TributacaoModel;
    }

    public int getIdAbrirEmpresa() {
        return idAbrirEmpresa;
    }

    public String getFormasAbrirEmpresa() {
        return formasAbrirEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public TributacaoModel getTributacaoModel() {
        return TributacaoModel;
    }
}
