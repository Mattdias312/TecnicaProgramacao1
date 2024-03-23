package aula03;


import aula03.Pessoa;


public class Principal {


    public static void main(String[] args) {
        Pessoa maeJoao = new Pessoa("Maria");
        Pessoa paiJoao = new Pessoa("Pedro");
        Pessoa irmaoJoao = new Pessoa("Jorel",maeJoao);
        Pessoa joao = new Pessoa("João",maeJoao,paiJoao);
        maeJoao.addFilho(joao);
        maeJoao.addFilho(irmaoJoao);
        joao.addIrmao(irmaoJoao);
        irmaoJoao.addIrmao(joao);
        System.out.println("Mãe do João: " + joao.getMae().getNome());
        System.out.println("Irmão do João: " + joao.retornaListaIrmaos(joao));
        System.out.println("Os filhos de Maria: " + maeJoao.retornaListaFilhos(maeJoao));
        
        
    }
    
}
