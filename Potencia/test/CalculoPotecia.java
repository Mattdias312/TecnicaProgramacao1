
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoPotecia {
    
    @Test
    public void testeCalculaPotenciaDeDois(){
    Matematica mat = new Matematica();
    
    int b = 2;
    int p = 0;
    
    assertEquals(1, mat.pot(b,p));
    
    b = 2;
    p = 1;
    
    assertEquals(2, mat.pot(b,p));
    b = 2;
    p = 2;
    
    assertEquals(4, mat.pot(b,p));
            
        
    }
    
}
