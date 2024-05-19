
package Balanceamento;

public class Balanceamento {
    public static void main(String[] args){
        String vetor[] = new String[]{"{","}","}"};
        System.out.println(validaBalancemanto(vetor));
        
        String vetor2[] = new String[]{"{","}"};
        System.out.println(validaBalancemanto(vetor2));
        
    }
    public static boolean validaBalancemanto(String[] vetor){
        PilhaVetor pilha = new PilhaVetor(vetor.length);
        for(int i=0;i<vetor.length;i++){
        if(vetor[i].equals("{") || vetor[i].equals("(") || vetor[i].equals("[")){
            if(vetor[i]== "("){
                pilha.empilhar(")");
            }else if(vetor[i]== "{"){
                pilha.empilhar("}");
            }else if(vetor[i]== "["){
                pilha.empilhar("]");
            }
        }else if(vetor[i].equals("}") || vetor[i].equals(")") || vetor[i].equals("]")){
            if(pilha.verificaPilhaVazia()){
                return false;
            }else if(vetor[i]!= pilha.desempilha()){
                return false;
            } 
        }
    }
        if(!pilha.verificaPilhaVazia()){
                return false;
            }
        return true;
    }
    
}
