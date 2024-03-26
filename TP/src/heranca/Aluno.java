
package heranca;

public class Aluno extends Pessoa{
    
    private float[] nota = new float[10];
    private int aux = 0;

    
    public Aluno(String nome) {
        super(nome);
    }
    
    public float[] getNota(){
        return nota;
    }
    
    public void setNota(float[] nota){
        this.nota = nota;
    }
    
    public float calculaMedia(){
        float media=0;
        float notas=0;
        int auxMadia=0;
        for(int i=0; i<nota.length;i++){
            if(nota[i]>=0 && nota[i]<=10){
                notas +=  nota[i];
                auxMadia++;
            }
        }
        
        return media = notas/auxMadia;
    }
    
    public void addNota(float nota){
        if(nota>=0 && nota<=10){
        this.nota[aux] = nota;
        aux++;
        }
    }
    
}
