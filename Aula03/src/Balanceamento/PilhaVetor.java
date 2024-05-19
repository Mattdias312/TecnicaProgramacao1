package Balanceamento;


public class PilhaVetor {
    int registraTopo;
    String[] pilhaVetor;
    
    public PilhaVetor(int tamanho){
        registraTopo=0;
        pilhaVetor=new String[tamanho];
    }
    
    public void empilhar(String entrada) {
        if(!verificaPilhaCheia()){
            pilhaVetor[registraTopo]=entrada;
            registraTopo++;
        }
    }
    public String desempilha(){
        if(!verificaPilhaVazia()){
            registraTopo--;
            return pilhaVetor[registraTopo];
        }else{
            return null;
        }
    }
    
    public boolean verificaPilhaCheia() {
        return registraTopo==pilhaVetor.length;
    }
    
    public boolean verificaPilhaVazia() {
        return registraTopo==0;
    }
    
    public boolean verificaPalindromo(String palavra){
        for(int i=0; i<palavra.length();i++){
        empilhar(palavra.substring(i, i+1));
        }
        for(int i=0; i<palavra.length();i++){
        if(!desempilha().equals(palavra.substring(i, i+1))){
            return false;
            }
        }
        return true;
    }
    
    public boolean validaBalanceamento(String[] balanco){
        while(this.desempilha()!=null){
            this.desempilha();
        }
        
        for(int i=0;i<balanco.length;i++){
            this.empilhar(balanco[i]);
            if(i>0){
                if(pilhaVetor[i-1]!="(" && pilhaVetor[i]==")" ){
                    return false;
                }else{
                    this.desempilha();
                    this.desempilha();
                }
            }
            
        }
        
        return true;
    }
}
