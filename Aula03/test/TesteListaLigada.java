

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
        assertEquals("Rodrigo", minhaLista.get(0));
        assertEquals("Julia", minhaLista.get(1));
        assertEquals("Maria", minhaLista.get(2));
}
    
}
