
package NotaFiscal;

import TipoEmpresa.TipoEmpresaModel;

public class NotaFiscalModel {
    private int idNotaFical;

   
    private String tiposNota;
    private String descricao;
    private TipoEmpresaModel tipoEmpresaModel;

    public NotaFiscalModel(int idNotaFical, String tiposNota, String descricao, TipoEmpresaModel tipoEmpresaModel) {
        this.idNotaFical = idNotaFical;
        this.tiposNota = tiposNota;
        this.descricao = descricao;
        this.tipoEmpresaModel = tipoEmpresaModel;
    }

    public void setIdNotaFical(int idNotaFical) {
        this.idNotaFical = idNotaFical;
    }
     
    public void setTiposNota(String tiposNota) {
        this.tiposNota = tiposNota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoEmpresaModel(TipoEmpresaModel tipoEmpresaModel) {
        this.tipoEmpresaModel = tipoEmpresaModel;
    }

    public int getIdNotaFical() {
        return idNotaFical;
    }

    public String getTiposNota() {
        return tiposNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoEmpresaModel getTipoEmpresaModel() {
        return tipoEmpresaModel;
    }
    
}
