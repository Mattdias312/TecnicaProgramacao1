
package Persistencia;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testeMotocicleta {
    
    public static void main(String[] args){
        Motocicleta motoca = new Motocicleta("Honada", "CG 150", 100);
        Motocicleta motoca2=null;
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        try{
            Serializador.gravar("motoca.dat", motoca);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        try{
            motoca2 = (Motocicleta) Serializador.ler("motoca.dat");
        }catch(IOException ex){
            System.out.println("Erro Ler: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testeMotocicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("motoca 2 = " + motoca2.getVelocidade());
    }
    
}
