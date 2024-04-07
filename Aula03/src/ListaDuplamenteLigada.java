
public class ListaDuplamenteLigada {
    NoDuplo primeiroNo;
    NoDuplo ultimoNo;
    int tamanhoLista;
    
    public ListaDuplamenteLigada(){
        tamanhoLista=0;
        primeiroNo= ultimoNo =null; 
    }
    
    public void add(int elemento){
        NoDuplo aux = new NoDuplo(elemento,null,null);
        
        if(primeiroNo==null && ultimoNo==null){
            primeiroNo = ultimoNo = aux;
            tamanhoLista++;
        }else{
            ultimoNo.setProximoNo(aux);
            tamanhoLista++;
            aux.setAnteriorNo(ultimoNo);
            ultimoNo = aux;
            
        }
    }
    
    public void add(int elemento, int indice){
        if(indice>0 && indice<tamanhoLista){
            NoDuplo noAnterior = getNo(indice-1);
            NoDuplo noAtual = new NoDuplo(elemento,noAnterior.getProximoNo(),noAnterior);
            noAnterior.setProximoNo(noAtual);
            tamanhoLista++;
        }else if(indice == 0){
            NoDuplo noProximo = getNo(indice);
            NoDuplo noAtual = new NoDuplo(elemento,noProximo,null);
            primeiroNo = noAtual;
            tamanhoLista++;
        }
    }
    
    public void Remover(int indice){
            NoDuplo noRemovido = getNo(indice);
            NoDuplo noAnterior = getNo(indice-1);
            NoDuplo noProximo = getNo(indice+1);
        if(indice>0 && indice<tamanhoLista && tamanhoLista>2){
            noProximo.setAnteriorNo(noAnterior);
            noAnterior.setProximoNo(noRemovido.getProximoNo());
            noRemovido.setProximoNo(null);
            noRemovido.setAnteriorNo(null);
            tamanhoLista--;
        }else if(indice>0 && indice<tamanhoLista){
            noAnterior.setProximoNo(noRemovido.getProximoNo());
            noRemovido.setProximoNo(null);
            tamanhoLista--;
        }else if(indice==0){
            primeiroNo=noProximo;
        }
    }
    
    
    public int getInfo(int indice){
        
        if(indice >=0 && indice<tamanhoLista){
        return percorreLista(indice).getInfo();
        }else{
            return -1;
        }
    }
    
    public NoDuplo getNo(int indice){
        
        if(indice >=0 && indice<tamanhoLista){
        return percorreLista(indice);
        }else{
            return null;
        }
    }

    private NoDuplo percorreLista(int indice) {
        
        NoDuplo buscaNo = primeiroNo;
        for(int i=0;i<indice;i++){
            buscaNo = buscaNo.getProximoNo();
        }
        
        return buscaNo;
    }
    
    public void adicionarOrdenacao(int valor, TipoOrdenacao tipo){
               
        
        if(tamanhoLista==0){
            add(valor);
            return;
        }else if(tipo.equals(TipoOrdenacao.CRESCENTE)){
            for(int i=0;i<tamanhoLista;i++){
                if(getInfo(i)>valor){
                    add(valor, i);
                    return;
                }else if(tamanhoLista==i+1){
                    add(valor);
                    return;
                }
            }
        }
        else{
            for(int i=0;i<tamanhoLista;i++){
                if(getInfo(i)<valor){
                    add(valor, i);
                    return;
                }else if(tamanhoLista==i+1){
                    add(valor);
                    return;
                }
            }

        }        
    }
}
