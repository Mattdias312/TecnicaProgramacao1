
package heranca;

import Classes.*;


public class Pessoa {
    //****Atributos da Classe****//
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos=new Pessoa[10];   
    private int qtdFilhos=0;
    private Pessoa[] listaIrmaos=new Pessoa[10];   
    private int qtdIrmaos=0;
    
//********************//
    public Pessoa(String nome){
        this.nome=nome;
    }
    public Pessoa(String nome, Pessoa mae){
        this(nome);
        this.mae=mae;
        mae.addFilho(this);
    }
    public Pessoa(String nome, Pessoa mae, Pessoa pai){
        this(nome, mae);
        this.pai=pai;
    }
    // Métodos de acesso aos atributos //
    //***** Métodos Getter *****//
    public String getNome(){
        return "Sr."+this.nome;
    }
    public Pessoa[] getListaFilhos(){
        return listaFilhos;
    }
    // ******* Métodos Setter ******
    public void setNome(String nome){
        this.nome=nome;
    }
     public String getCpf() {
        return cpf;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }
   //****************************//
    
    //*** Método para adicionar um filha a lista ****
    public void addFilho(Pessoa filho){
        //Deve verificar se na lista de filhos se
        //ja existe o objeto antes de adiconá-lo
        
        boolean encontrei = false;
        for(int i=0;i<qtdFilhos;i++){
            if(filho.equals(listaFilhos[i])){
                encontrei = true;
            }
        }
        if(!encontrei){
        listaFilhos[qtdFilhos]=filho;
        qtdFilhos++;
        }
    }
    public void addIrmaos(Pessoa irmao){
        listaIrmaos[qtdIrmaos]=irmao;
        qtdIrmaos++;
        this.mae.addFilho(irmao);
    }
    public String retornaListaFilhos(){
        // Este método deve retornar uma string com todos os filhos
        // concatenados e separados por ", "
        String retorno="";
        
        for (int i =0; i<qtdFilhos; i++){            
            retorno+=listaFilhos[i].nome ;
            if (i== qtdFilhos-1) retorno+= ", ";            
        }        
        return"";
    }
    
    public String arvoreGenealogica(){
        
        if(mae==null){
            return nome;
        }else{
            return mae.arvoreGenealogica() + " -> " + nome;
        }
    }
   
}

