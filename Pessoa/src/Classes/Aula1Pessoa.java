
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
        pai = new Pessoa("Marcelo","1111");
        pai.setQtdFilhoAux(2);
        pai.setQtdIrmaos(4);
        
        System.out.println(pai.Aprensentar());
        System.out.println("CPF Pai: " + pai.getCpf());
        pai.setCpf("0000");
        System.out.println("CPF Pai Novo: " + pai.getCpf());
        
        Pessoa mae = new Pessoa("Gisele","2222");
        mae.setQtdFilhoAux(3);
        mae.setQtdIrmaos(2);
        System.out.println(mae.Aprensentar());
        
        String[] filhos = {"Matheus","Gabriela"};
        String[] irmaos = {"Regiane","Rafaela"};
        mae.setNomeFilhos(filhos);
        mae.setNomeIrmao(irmaos);

        System.out.println(mae.ApresentarFilhos());
        System.out.println(mae.ApresentarIrmaos());
        
        
    }
    
}
