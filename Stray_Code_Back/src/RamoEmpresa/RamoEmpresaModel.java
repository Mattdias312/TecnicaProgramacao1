
package RamoEmpresa;

import TipoEmpresa.TipoEmpresaModel;

public class RamoEmpresaModel {
    private int idRamoEmpresa;
    private String Secao;
    private String NomeRamoEmpresa;
    private TipoEmpresaModel TipoEmpresaModel;

    public RamoEmpresaModel(int idRamoEmpresa, String Secao, String NomeRamoEmpresa, TipoEmpresaModel TipoEmpresaModel) {
        this.idRamoEmpresa = idRamoEmpresa;
        this.Secao = Secao;
        this.NomeRamoEmpresa = NomeRamoEmpresa;
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public void setIdRamoEmpresa(int idRamoEmpresa) {
        this.idRamoEmpresa = idRamoEmpresa;
    }

    public void setSecao(String Secao) {
        this.Secao = Secao;
    }

    public void setNomeRamoEmpresa(String NomeRamoEmpresa) {
        this.NomeRamoEmpresa = NomeRamoEmpresa;
    }

    public void setTipoEmpresaModel(TipoEmpresaModel TipoEmpresaModel) {
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public int getIdRamoEmpresa() {
        return idRamoEmpresa;
    }

    public String getSecao() {
        return Secao;
    }

    public String getNomeRamoEmpresa() {
        return NomeRamoEmpresa;
    }

    public TipoEmpresaModel getTipoEmpresaModel() {
        return TipoEmpresaModel;
    }
}
