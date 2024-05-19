
package Persistencia;

import java.io.Serializable;

public class Motocicleta implements Serializable {
    private String marca,modelo;
    private float velocidade;
    
    public Motocicleta(String marca, String modelo,float velocidade){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidade=velocidade;
    }
    
    public float alterarVelocidade(float fatorAceleracao){
        velocidade=velocidade*fatorAceleracao;
        return velocidade;
    }
    
    public float parar(){
        velocidade=0;
        return velocidade;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }
}
