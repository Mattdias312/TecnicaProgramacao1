
package Principal;


public class Cliente {
   
    String nome;
    int cpf;
    String endereco;
    
    public Cliente (String nome, int cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    
}
     public String getNome(){
        return this.nome;
     }
     public void setNome(String nome){
        this.nome=nome;
     }
    
}
