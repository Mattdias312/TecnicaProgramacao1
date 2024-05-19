
import AbrirEmpresa.AbrirEmpresaModel;
import Cnae.CnaeModel;
import EscolherContabilidade.EscolherContabilidadeModel;
import NotaFiscal.NotaFiscalModel;
import Questionario.QuestionarioModel;
import RamoEmpresa.RamoEmpresaModel;
import TipoEmpresa.TipoEmpresaModel;
import Tributacao.TributacaoModel;
import Usuario.UsuarioModel;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModelTeste {
    
    @Test
    public void testeModel(){
        TipoEmpresaModel tipoEmpresa = new TipoEmpresaModel(1,"TipoEmpresa1","descrição Tipo Emrepsa1");
        NotaFiscalModel notaFiscal = new NotaFiscalModel(1,"notaFical1","descrição nota Fical1",tipoEmpresa);
        RamoEmpresaModel ramoEmpresa = new RamoEmpresaModel(1,"Seção1","Ramo Empresa1",tipoEmpresa);
        CnaeModel cnae = new CnaeModel(1,"123-4/00","Cnae1",ramoEmpresa);
        QuestionarioModel questionario = new QuestionarioModel(1,LocalDate.of(2024, 5, 18),cnae);
        UsuarioModel usaurio = new UsuarioModel(1,"usuario1", "123456","Usuario","111.111.111-11","usuario@gmail.com");
        TributacaoModel tributacao = new TributacaoModel(1,"Tributação1","descrição Tributação",cnae);
        AbrirEmpresaModel abrirEmpresa = new AbrirEmpresaModel(1,"forma de Abrir Empresa","descrição Abrir Empresa",tributacao);
        EscolherContabilidadeModel escolherContabilidade = new EscolherContabilidadeModel(1,"Escolhendo Contabilidade","descrição Escolher Contabilidade",tributacao);
        
    }
    
}
