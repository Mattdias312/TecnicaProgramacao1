

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteListaLigada {
    
    @Test
    public void testeCriacaoDeNos(){
        Object info="Rodrigo";
        No proximoNo=null;
        No meuPrimeiroNo = new No(info,proximoNo);
        assertEquals("Rodrigo", meuPrimeiroNo.getInfo());
}
    
    @Test
    public void testeCriacaoLista(){
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Rodrigo");
        minhaLista.add("Julia");
        minhaLista.add("Maria");
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Julia", minhaLista.getInfo(1));
        assertEquals("Maria", minhaLista.getInfo(2));
}
    
    @Test
    public void testeAdicionarNovoNoPeloIndice(){
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Rodrigo");
        minhaLista.add("Julia");
        minhaLista.add("Maria");
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Julia", minhaLista.getInfo(1));
        assertEquals("Maria", minhaLista.getInfo(2));
        minhaLista.add("Matheus",1);
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Matheus", minhaLista.getInfo(1));
        assertEquals("Julia", minhaLista.getInfo(2));
        assertEquals("Maria", minhaLista.getInfo(3));        
}
    
    @Test
    public void testeRemoveUmNo(){
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Rodrigo");
        minhaLista.add("Julia");
        minhaLista.add("Maria");
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Julia", minhaLista.getInfo(1));
        assertEquals("Maria", minhaLista.getInfo(2));

        minhaLista.Remover(1);
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Maria", minhaLista.getInfo(1));
        
}
    
    @Test
    public void testeConcatenaNos(){
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Rodrigo");
        minhaLista.add("Julia");
        minhaLista.add("Maria");
        assertEquals("Rodrigo", minhaLista.getInfo(0));
        assertEquals("Julia", minhaLista.getInfo(1));
        assertEquals("Maria", minhaLista.getInfo(2));
        assertEquals("Rodrigo, Julia, Maria", minhaLista.concatenaNos());
        
}
    
}
