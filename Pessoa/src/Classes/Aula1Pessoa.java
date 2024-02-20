
package Classes;

/**
 *
 * @author Alunos
 */
public class Aula1Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pai;
        pai = new Pessoa();
        pai.nome = "Marcelo";
        pai.qtdFilhoAux = 2;
        pai.qtdIrmaos = 4;
        System.out.println(pai.Aprensentar());
        
        Pessoa mae = new Pessoa();
        mae.nome = "Gisle";
        mae.qtdFilhoAux = 3;
        mae.qtdIrmaos = 1;
        System.out.println(mae.Aprensentar());
        
        mae.nomeFilhos[0] = "Matheus";
        mae.nomeFilhos[1] = "Gabriela";

        System.out.println(mae.ApresentarFilhos());
        
        
    }
    
}
