
package Tributacao;

import Cnae.CnaeModel;

public class TributacaoModel {
    private int idTributacao;
    private String tiposNota;
    private String descricao;
    private CnaeModel CnaeModel;

    public TributacaoModel(int idTributacao, String tiposNota, String descricao, CnaeModel CnaeModel) {
        this.idTributacao = idTributacao;
        this.tiposNota = tiposNota;
        this.descricao = descricao;
        this.CnaeModel = CnaeModel;
    }

    
    public void setIdTributacao(int idTributacao) {
        this.idTributacao = idTributacao;
    }

    public void setTiposNota(String tiposNota) {
        this.tiposNota = tiposNota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCnaeModel(CnaeModel CnaeModel) {
        this.CnaeModel = CnaeModel;
    }
    
    public int getIdTributacao() {
        return idTributacao;
    }

    public String getTiposNota() {
        return tiposNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public CnaeModel getCnaeModel() {
        return CnaeModel;
    }
}
