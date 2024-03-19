
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
        
        Pessoas pai;
        pai = new Pessoas("Marcelo","1111");
        pai.setQtdFilhoAux(2);
        pai.setQtdIrmaos(4);
        
        System.out.println(pai.Aprensentar());
        System.out.println("CPF Pai: " + pai.getCpf());
        pai.setCpf("0000");
        System.out.println("CPF Pai Novo: " + pai.getCpf());
        
        Pessoas mae = new Pessoas("Gisele","2222");
        mae.setQtdFilhoAux(3);
        mae.setQtdIrmaos(2);
        System.out.println(mae.Aprensentar());
        
        String[] filhos = {"Matheus","Gabriela"};
        String[] irmaos = {"Regiane","Rafaela"};
        mae.setNomeFilhos(filhos);
        mae.setNomeIrmao(irmaos);

        System.out.println(mae.ApresentarFilhos());
        System.out.println(mae.ApresentarIrmaos());
        
        //#######################################################
        
        Pessoa maeDoJoao = new Pessoa("Maria");
        Pessoa Joao = new Pessoa("João",maeDoJoao);
        Pessoa irmaoJoao = new Pessoa("Jorel",maeDoJoao);
           System.out.println("Nome: " + Joao.getNome());
           Joao.setNome("João dos Santos");
           System.out.println("Nome: " + Joao.getNome());
           maeDoJoao.addFilho(Joao);
           maeDoJoao.addFilho(irmaoJoao);
           System.out.println("Mãe do João: "+Joao.getMae().getNome());
           System.out.println("Irmão do João: "+Joao.getMae().getListaFilhos()[1].getNome());
        
     
    }
    
}
