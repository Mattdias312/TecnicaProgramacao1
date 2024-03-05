
package aula03;

public class Pessoa {
     //Atributos da Classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilho = new Pessoa[10];
    private int qtdFilho = 0;
    private Pessoa[] listaIrmao = new Pessoa[10];
    private int qtdIrmao = 0;
    //************************//
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, Pessoa mae){
        this(nome);
        this.mae = mae;
    }
    public Pessoa(String nome, Pessoa mae, Pessoa Pai){
        this(nome,mae);
        this.pai = pai;
    }
    //Método de acesso aos atributos//
    //***** Método Get *****//
    
    public String getNome(){
       /* if(this.genero.equals("M")){
            return "Sr. " + this.nome;   
        }else if(this.genero.equals("F")){
            return "Sra. " + this.nome;
        } else{*/
            return this.nome;
        //}
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public Pessoa getMae(){
        return this.mae;
    }
    public void setMae(Pessoa mae){
        this.mae = mae;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    public Pessoa[] getListaFilho(){
        return this.listaFilho;
    }
    public void setListaFilho(Pessoa[] listaFilho){
        this.listaFilho = listaFilho;
    }
    public Pessoa[] getListaIrmao(){
        return this.listaIrmao;
    }
    public void setListaIrmao(Pessoa[] listaIrmao){
        this.listaIrmao = listaIrmao;
    }
    // Método para adicionar um filho a lista //
    public void addFilho(Pessoa filho){
        listaFilho[qtdFilho] = filho;
        /*if(qtdFilho>0){;
            this.addIrmao(filho);
        }*/
        qtdFilho++;
        
    }
    public void addIrmao(Pessoa irmao){
        listaIrmao[qtdIrmao] = irmao;
        qtdIrmao++;
        
    }
    public String retornaListaFilhos(Pessoa pais){
        String filhos = "";
        for(int i =0; i<this.qtdFilho;i++){
            if(i<qtdFilho-1){
                filhos += pais.getListaFilho()[i].getNome() + ", ";
            }else{
                filhos += pais.getListaFilho()[i].getNome();
            }
        }
        
        return filhos;
    }
    public String retornaListaIrmaos(Pessoa irmao){
        String irmaos = "";
        for(int i =0; i<this.qtdIrmao;i++){
            if(i<qtdIrmao-1){
                irmaos += irmao.getListaIrmao()[i].getNome() + ", ";
            }else{
                irmaos += irmao.getListaIrmao()[i].getNome();
            }
        }
        
        return irmaos;
    }
    
}
