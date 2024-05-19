
package Cnae;

import RamoEmpresa.RamoEmpresaModel;

public class CnaeModel {
    private int idCnae;
    private String NumeroCnae;
    private String descricao;
    private RamoEmpresaModel RamoEmpresaModel;

    public CnaeModel(int idCnae, String NumeroCnae, String descricao, RamoEmpresaModel RamoEmpresaModel) {
        this.idCnae = idCnae;
        this.NumeroCnae = NumeroCnae;
        this.descricao = descricao;
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public void setNumeroCnae(String NumeroCnae) {
        this.NumeroCnae = NumeroCnae;
    }

    public void setIdCnae(int idCnae) {
        this.idCnae = idCnae;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRamoEmpresaModel(RamoEmpresaModel RamoEmpresaModel) {
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public int getIdCnae() {
        return idCnae;
    }

    public String getNumeroCnae() {
        return NumeroCnae;
    }

    public String getDescricao() {
        return descricao;
    }

    public RamoEmpresaModel getRamoEmpresaModel() {
        return RamoEmpresaModel;
    }
}
