
package Arvores;

public class NoBinario {

    private Object info;
    private NoBinario esquerda, direita;
    
     public NoBinario(Object info, NoBinario esquerda, NoBinario direita){
        this.info=info;
        this.esquerda=esquerda;
        this.direita=direita;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }

    public Object getInfo() {
        return info;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }
    
   
          
    
}
