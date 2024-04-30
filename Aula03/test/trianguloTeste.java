

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class trianguloTeste {
    
    @Test
    public void testeCalculaArea(){
        triangulo teste = new triangulo();
        double vetor[]={3,4};
        assertEquals(5,teste.calcularMédia(vetor),1);
    }
    
    @Test
    public void testeVerificaPositivoNegativo(){
        triangulo teste = new triangulo();
        String vetor[]={"-3","2","4","-5","-2"};
        String vetor2[]={"N","P","P","N","N"};
        
        Assert.assertArrayEquals(vetor2,teste.verificaPositivoNegativo(vetor));
    }
    
}
