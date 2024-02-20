
package Classes;

public class Pessoa {

    //Atributos da classe
    String nome;
    int qtdFilhoAux, qtdIrmaos;
    String[] nomeFilhos = new String[20];
    
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
    
}
