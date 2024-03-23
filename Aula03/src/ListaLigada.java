
public class ListaLigada {
    No primeiroNo;
    No ultimoNo;
    int tamanhoLista;
    
    public ListaLigada(){
        tamanhoLista=0;
        primeiroNo= ultimoNo =null; 
    }
    
    public void add(Object elemento){
        No aux = new No(elemento,null);
        
        if(primeiroNo==null && ultimoNo==null){
            primeiroNo = ultimoNo = aux;
            tamanhoLista++;
        }else{
            ultimoNo.setNo(aux);
            tamanhoLista++;
            ultimoNo = aux;
            
        }
    }
    
    public void add(Object elemento, int indice){
        
    }
    
    public Object Remover(int indice){
        
        return null;
    }
    
    public String concatenaNos(){
        //retorna a info de todos os nós concatenados
        return "";
    }
    
    
    public Object get(int indice){
        
        if(indice >=0 && indice<tamanhoLista){
        return percorreLista(indice).getInfo();
        }else{
            return null;
        }
    }

    private No percorreLista(int indice) {
        
        No buscaNo = primeiroNo;
        for(int i=0;i<indice;i++){
            buscaNo = buscaNo.getNo();
        }
        
        return buscaNo;
    }
    
    
}
