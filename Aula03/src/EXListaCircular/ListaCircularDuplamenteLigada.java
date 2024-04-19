
package ExListaCircular;

public class ListaCircularDuplamenteLigada {
    
    //Atributos da Lista
    private int qtdNos ;
    private NoDuplo primeiroNo;
    
    
    public ListaCircularDuplamenteLigada(){
        qtdNos=0;
        primeiroNo=null;        
    }
    
    //Método que realiza a adição de um novo elemento no final da lista
    public void adicionar(Object item){
         NoDuplo novoNo;
        //Se a lista está vazia, cria o primeiro item da lista e atribui ao primeiroNo
        if(primeiroNo==null){
            novoNo=new NoDuplo(null, null, item);
            novoNo.setProximo(novoNo);
            novoNo.setAnterior(novoNo);
            primeiroNo=novoNo;
            qtdNos++;
        }
        else{
            //Se a lista não está vazia, adiciona na ultima posição da lista
            novoNo=new NoDuplo(primeiroNo, primeiroNo.getAnterior(), item);
            primeiroNo.getAnterior().setProximo(novoNo);
            primeiroNo.setAnterior(novoNo);
            qtdNos++;
        }
        
    }
     public void adicionar(Object item, int indice){
        //adiciona o item na posição referenciada pelo indice começando por zero
        NoDuplo aux;
        NoDuplo novoNo;
        
        aux=percorreLista(indice);
        
        novoNo = new NoDuplo(aux, aux.getAnterior(), item);
        novoNo.getAnterior().setProximo(novoNo);
        aux.setAnterior(novoNo);
        
        /* ****Implemente o código necessário para permitir adiciona em qualquer posição da lista *****/
            
        
        
            
        /********************************************************************************************/
        /*Se o índice se refere ao primeiro item, realiza a atualização da referencia do primeiroNo
        Utiliza indice MODULO qtdNos para identificar se o índice se refere ao primeiro Nó*/
        if((indice%qtdNos)==0){
            primeiroNo=novoNo;
        }
        qtdNos++;
   
    }
     
     public void remover(int indice){
        NoDuplo aux;
        NoDuplo auxAnterior;
        NoDuplo auxProximo;
        if((indice%qtdNos)==0 ){
            //% calcula o modulo da divisão do índice pela qtdNos
            //remove da primeira posição da lista e modifica a referencia do primeiroNo
            aux=primeiroNo.getAnterior();
            primeiroNo=primeiroNo.getProximo();
            primeiroNo.setAnterior(aux);
            qtdNos--;
        }
        else{
            /**********Implemente o código que permita remove de qualquer outra posição da lista **********/
            aux=percorreLista(indice);
            auxAnterior=aux.getAnterior();
            auxProximo=aux.getProximo();
            auxAnterior.setProximo(aux.getProximo());
            auxProximo.setAnterior(auxAnterior);
            qtdNos--;
            
            
            /*********************************************************************************************/
        }     
    }
    
    public String imprimirLista(){
       return imprimirLista("Inicio>>", primeiroNo, 0);
   }
   
    public String imprimirLista(String resposta, NoDuplo auxiliar, int contador){
        // Retorna as INFO de todos os Nos concatenados em uma string
        // O método deve ser recusivo.
        
        resposta+= " " + auxiliar.getInfo().toString();
        if(contador< qtdNos-1)//Condicional de Parada
            return imprimirLista(resposta, auxiliar.getProximo(), contador+1);//** Adicione aqui a chamada recursiva **
        else
            return resposta + " <<Fim";//** Adicione aqui a resposta do condicional de parada **        
    }
    
    public Object getLista(int indice){
        return percorreLista(indice).getInfo();
    }
    
    private NoDuplo percorreLista(int indice){
        //Se o indice for negativo percorre no sentido anti horario
        // Se o indice for positivo percorre no sentido horario
        // Se o índice for zero retorna o primeiroNo
        NoDuplo noAux=primeiroNo;
        
        if(indice>0){
            for(int i=0; i<indice;i++){
               noAux =  noAux.getProximo();
            }
        }
        else if(indice<0){
            for(int i=indice; i<0;i++){
               noAux =  noAux.getAnterior();
            }
        }
        return noAux;
    }
    
   public int tamanho(){
        return qtdNos;
    }
     
    
   
    
}
