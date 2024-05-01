

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
    
    @Test
    public void testeCalcularMediaAlunos(){
        triangulo teste = new triangulo();
        double[][] vetor = {
            {00001.0, 8.0, 5.0, 7.0, 0.0},
            {00002.0, 3.0, 7.0, 5.0, 0.0},
            {00003.0, 7.0, 4.0, 8.0, 0.0},
            {00004.0, 0.0, 8.0, 7.0, 0.0},
            {00005.0, 7.0, 4.0, 5.0, 0.0}
        };
        double[][] vetor2 = {
            {00001.0, 8.0, 5.0, 7.0, 6.666666666666667},
            {00002.0, 3.0, 7.0, 5.0, 5.0},
            {00003.0, 7.0, 4.0, 8.0, 6.333333333333333},
            {00004.0, 0.0, 8.0, 7.0, 5.0},
            {00005.0, 7.0, 4.0, 5.0, 5.333333333333333}
        };
        Assert.assertArrayEquals(vetor2,teste.calcularMediaAlunos(vetor));
    }
    
}
