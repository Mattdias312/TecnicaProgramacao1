
package Questionario;

import Cnae.CnaeModel;
import RamoEmpresa.RamoEmpresaModel;
import TipoEmpresa.TipoEmpresaModel;
import java.time.LocalDate;


public class QuestionarioModel {
    private int idQuestionario;
    private LocalDate dataQuestionario;
    private CnaeModel CnaeModel;
    private RamoEmpresaModel RamoEmpresaModel; 
    private TipoEmpresaModel TipoEmpresaModel; 

    public QuestionarioModel(int idQuestionario, LocalDate dataQuestionario, CnaeModel CnaeModel) {
        this.idQuestionario = idQuestionario;
        this.dataQuestionario = dataQuestionario;
        this.CnaeModel = CnaeModel;
    }

    public void setDataQuestionario(LocalDate dataQuestionario) {
        this.dataQuestionario = dataQuestionario;
    }

    public void setIdQuestionario(int idQuestionario) {
        this.idQuestionario = idQuestionario;
    }

    public void setCnaeModel(CnaeModel CnaeModel) {
        this.CnaeModel = CnaeModel;
    }

    public void setRamoEmpresaModel(RamoEmpresaModel RamoEmpresaModel) {
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public void setTipoEmpresaModel(TipoEmpresaModel TipoEmpresaModel) {
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public int getIdQuestionario() {
        return idQuestionario;
    }

    public LocalDate getDataQuestionario() {
        return dataQuestionario;
    }

    public CnaeModel getCnaeModel() {
        return CnaeModel;
    }

    public RamoEmpresaModel getRamoEmpresaModel() {
        return RamoEmpresaModel;
    }

    public TipoEmpresaModel getTipoEmpresaModel() {
        return TipoEmpresaModel;
    }
}
