
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
            ultimoNo.setProximoNo(aux);
            tamanhoLista++;
            ultimoNo = aux;
            
        }
    }
    
    public void add(Object elemento, int indice){
        if(indice>0 && indice<tamanhoLista){
            No noAnterior = getNo(indice-1);
            No noAtual = new No(elemento,noAnterior.getProximoNo());
            noAnterior.setProximoNo(noAtual);
            tamanhoLista++;
        }else if(indice == 0){
            No noProximo = getNo(indice);
            No noAtual = new No(elemento,noProximo);
            primeiroNo = noAtual;
            tamanhoLista++;
        }
    }
    
    public void Remover(int indice){
        if(indice>=0 && indice<tamanhoLista){
            No noRemovido = getNo(indice);
            No noAnterior = getNo(indice-1);
            noAnterior.setProximoNo(noRemovido.getProximoNo());
            noRemovido.setInfo(null);
            noRemovido.setProximoNo(null);
            tamanhoLista--;
        }
        
    }
    
    public String concatenaNos(){
        //retorna a info de todos os nós concatenados
        No buscaNo = primeiroNo;
        //String infosNos = buscaNo.getInfo().toString();
        String infosNos = "";
        
        for(int i=1;i<tamanhoLista;i++){
            infosNos += buscaNo.getInfo().toString() + ", ";
            buscaNo = buscaNo.getProximoNo();
        }
        infosNos += buscaNo.getInfo().toString();
            
        return infosNos;
    }
    
    
    public Object getInfo(int indice){
        
        if(indice >=0 && indice<tamanhoLista){
        return percorreLista(indice).getInfo();
        }else{
            return null;
        }
    }
    
    public No getNo(int indice){
        
        if(indice >=0 && indice<tamanhoLista){
        return percorreLista(indice);
        }else{
            return null;
        }
    }

    private No percorreLista(int indice) {
        
        No buscaNo = primeiroNo;
        for(int i=0;i<indice;i++){
            buscaNo = buscaNo.getProximoNo();
        }
        
        return buscaNo;
    }
    
    
}
