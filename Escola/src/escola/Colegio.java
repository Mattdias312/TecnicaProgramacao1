
package escola;

public class Colegio extends Aluno {
    
    public Colegio(String nome, String genero) {
        super(nome, genero);
    }
    public Colegio(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
    @Override
    public float getNota(){
        return super.nota;
    }
    
}
