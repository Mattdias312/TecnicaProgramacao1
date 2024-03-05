
package Classes;

  
public class Pessoas {
    
    /*Metodo contrutor*/
    public Pessoas(String nome){
        this.nome = nome;
    }
    
    public Pessoas(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    /*Método Setter e Getters*/
    public void setCpf(String cpf){
        if(this.cpf == null)
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setNomeFilhos(String[] nomeFilhos){
        this.nomeFilhos = nomeFilhos;
    }
    public String[] getNomeFilhos(){
        return this.nomeFilhos;
    }
    
    public void setNomeIrmao(String[] nomeIrmao){
        this.nomeIrmao = nomeIrmao;
    }
    public String[] getNomeIrmao(){
        return this.nomeIrmao;
    }
    
    public void setQtdIrmaos(int qtdIrmaos){
        this.qtdIrmaos = qtdIrmaos;
    }
    public int getQtdIrmaos(){
        return this.qtdIrmaos;
    }
    public void setQtdFilhoAux(int qtdFilhoAux){
        this.qtdFilhoAux = qtdFilhoAux;
    }
    public int getQtdFilhoAux(){
        return this.qtdFilhoAux;
    }

    //Atributos da classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private int qtdFilhoAux, qtdIrmaos, qtdIrmaoAux;
    private String[] nomeFilhos = new String[20];
    private String[] nomeIrmao = new String[20];
    
    /*Método Apresentar, responde com o Nome 
    concatenado com a quantidade de Filhos.
    */
    
    public String Aprensentar(){
        return nome + " possui " + qtdFilhoAux + " filhos!";
    }
    
    public String ApresentarFilhos(){
        String resposta = "Meus filhos são ";
        int qtdFilhoAux = 0;
        
        for(int i=0;i<20;i++){
        if(nomeFilhos[i] != null){
            qtdFilhoAux++;
           resposta +=  nomeFilhos[i] + ", ";
            }
        }
        if(qtdFilhoAux > 0)
            return resposta + "QTD Filhos: " + qtdFilhoAux;
        else
            return "Não tem filhos!";
    }
    
    public String ApresentarIrmaos(){
        String resposta = "Meus irmãos são ";
        int qtdIrmaoAux = 0;
        
        for(int i=0;i<20;i++){
        if(nomeIrmao[i] != null){
            qtdIrmaoAux++;
           resposta +=  nomeIrmao[i] + ", ";
            }
        }
        if(qtdIrmaoAux > 0)
            return resposta + "QTD Irmãos: " + qtdIrmaoAux;
        else
            return "Não tem Irmãos!";
    }
    
}
