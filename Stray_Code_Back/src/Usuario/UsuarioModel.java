
package Usuario;

import Questionario.QuestionarioModel;

public class UsuarioModel {
    private  int idUsuario;
    private String usuario;
    private String senha;
    private String Nome;
    private String Cpf;
    private String Email;
    private QuestionarioModel QuestionarioModel;

    public UsuarioModel(int idUsuario, String usuario, String senha, String Nome, String Cpf, String Email) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.senha = senha;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Email = Email;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setQuestionarioModel(QuestionarioModel QuestionarioModel) {
        this.QuestionarioModel = QuestionarioModel;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getEmail() {
        return Email;
    }

    public QuestionarioModel getQuestionarioModel() {
        return QuestionarioModel;
    }
}
