
package GUI;

import javax.swing.JFrame;

public class calcular {
    
    private JFrame janela;
    
    public calcular(){
        /*janela = new JFrame("Minha Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setVisible(true);
        */
    }
    
    public static void main(String[] args){
        System.out.println("Método principal");
        calcular p = new calcular();
        
    }
    
    public double Somar(double n1, double n2){
        return n1+n2;
    }
    
    public double subtrair(double n1, double n2){
        return n1-n2;
    }
    
    public double Multiplicar(double n1, double n2){
        return n1*n2;
    }
    
    public double Dividir(double n1, double n2){
        return n1/n2;
    }
}
