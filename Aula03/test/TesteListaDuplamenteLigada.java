

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteListaDuplamenteLigada {
    
 @Test
    public void testeCriacaoDeNos(){
        int info=5;
        NoDuplo proximoNo=null;
        NoDuplo anteriorNo=null;
        NoDuplo meuPrimeiroNo = new NoDuplo(info,proximoNo,anteriorNo);
        assertEquals(5, meuPrimeiroNo.getInfo());
}
    
    @Test
    public void testeCriacaoLista(){
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(6);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(3, minhaLista.getInfo(1));
        assertEquals(6, minhaLista.getInfo(2));
}
    
    @Test
    public void testeAdicionarNovoNoPeloIndice(){
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(6);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(3, minhaLista.getInfo(1));
        assertEquals(6, minhaLista.getInfo(2));
        minhaLista.add(2,1);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(2, minhaLista.getInfo(1));
        assertEquals(3, minhaLista.getInfo(2));
        assertEquals(6, minhaLista.getInfo(3));       
}
    
    @Test
    public void testeRemoveUmNo(){
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(6);
        minhaLista.add(2);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(3, minhaLista.getInfo(1));
        assertEquals(6, minhaLista.getInfo(2));
        assertEquals(2, minhaLista.getInfo(3));

        minhaLista.Remover(1);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(6, minhaLista.getInfo(1));
        assertEquals(2, minhaLista.getInfo(2));
        minhaLista.Remover(1);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(2, minhaLista.getInfo(1));
        minhaLista.Remover(0);
        assertEquals(2, minhaLista.getInfo(0));

}
    
    @Test
    public void testeOrdenacaoCrescente(){
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        minhaLista.add(4);
        minhaLista.add(3);
        minhaLista.add(6);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(3, minhaLista.getInfo(1));
        assertEquals(6, minhaLista.getInfo(2));
        minhaLista.adicionarOrdenacao(5, TipoOrdenacao.CRESCENTE);
        assertEquals(4, minhaLista.getInfo(0));
        assertEquals(3, minhaLista.getInfo(1));
        assertEquals(5, minhaLista.getInfo(2));
        assertEquals(6, minhaLista.getInfo(3));
        
        
}
    
    @Test
    public void testeOrdenacaoDecrescente(){
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        minhaLista.add(6);
        minhaLista.add(4);
        minhaLista.add(3);
        assertEquals(6, minhaLista.getInfo(0));
        assertEquals(4, minhaLista.getInfo(1));
        assertEquals(3, minhaLista.getInfo(2));
        minhaLista.adicionarOrdenacao(5, TipoOrdenacao.DECRESCENTE);
        assertEquals(6, minhaLista.getInfo(0));
        assertEquals(5, minhaLista.getInfo(1));
        assertEquals(4, minhaLista.getInfo(2));
        assertEquals(3, minhaLista.getInfo(3));
        
        
}
    
}
