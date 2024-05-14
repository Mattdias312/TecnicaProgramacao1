
package Arvores;

public class ArvoreBinaria {
    private NoBinario raiz;
    
    public ArvoreBinaria(Object info){
        raiz = new NoBinario(info,null,null);
    }
    
    public void imprimir(NoBinario no){
        System.out.println("No: " + no.getInfo());
        if(no.getEsquerda()!=null){
            imprimir(no.getEsquerda());
        }
        if(no.getDireita()!=null){
            imprimir(no.getDireita());
        }
    }
    
    public int buscar(int valor){
        return buscar(valor,raiz,0);
    }
    
    private int buscar(int valor, NoBinario no, int profundidade){
        int resposta=-1;
        if((int)no.getInfo()==valor){
            return profundidade;
        }else{
            if(no.getEsquerda()!=null){
                resposta = buscar(valor, no.getEsquerda(), profundidade++);
            }else if(no.getDireita()!=null){
                resposta = buscar(valor, no.getDireita(), profundidade++);
            }
        }
        return resposta;
    }
    
    public void addNoOrdenado(int valor,NoBinario no){
        
        if(valor<(int)no.getInfo()){
            if(no.getEsquerda()!= null){
            no.setEsquerda(new NoBinario(valor,null,null));
            }else{
            addNoOrdenado(valor, no.getEsquerda());
            }
        }else{
            if(no.getDireita()!= null){
            no.setDireita(new NoBinario(valor,null,null));
            }else{
            addNoOrdenado(valor, no.getDireita());
            }
        }
        
    }
}
