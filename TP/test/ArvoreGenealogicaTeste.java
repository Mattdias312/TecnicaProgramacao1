

import Classes.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreGenealogicaTeste {
    
    @Test
    public void testeArvoreGenealogica(){
    Pessoa vovo = new Pessoa("Maria");
    Pessoa mamae = new Pessoa("Ana",vovo);
    Pessoa neta = new Pessoa("Natalia",mamae);

        assertEquals("Maria -> Ana -> Natalia", neta.arvoreGenealogica());
        
    }
    
}
