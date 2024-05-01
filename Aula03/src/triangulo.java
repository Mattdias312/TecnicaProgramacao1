
public class triangulo {
    public double calcularMédia(double vetor[]){
        double area=0;
        area = Math.sqrt(Math.pow(vetor[0], 2)+ Math.pow(vetor[1], 2));
        return area;
    }
    
    public String[] verificaPositivoNegativo(String vetor[]){
     int aux=0;
        for (int i = 0; i < 5; i++) {
            aux=Integer.parseInt(vetor[i]);
            if(aux<0){
                vetor[i]="N";
            }else{
                vetor[i]="P";
            }
        }
        return vetor;
    }
    
    public double[][] calcularMediaAlunos(double vetor[][]){
        for(int i=0;i<5;i++){
            double media =0;
            for(int j=1; j<4;j++){
                
                media=media+vetor[i][j];
            }
            media=media/3;
            vetor[i][4]=media;
        }
        return vetor;
    }
    
}
