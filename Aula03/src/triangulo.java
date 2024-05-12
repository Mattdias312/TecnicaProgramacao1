
public class triangulo {
    
    public double calcularMédia(double vetor[]){
        double area=0;
        area = (vetor[0] * vetor[1])/2;
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
    
   public double[][] calcularMediaModaDesvioPadrao(double vetor[][]){
        vetor = this.calcularMediaAlunos(vetor);
        double[] p1 = new double[5];
        double[] p2 = new double[5];
        double[] p3 = new double[5];
        double[] media = new double[5];
        double matriz[][] = new double[4][3];
        for(int j=1; j<5;j++){
            for(int i=0;i<5;i++){
                switch (j) {
                    case 1:
                        p1[i]=vetor[i][j];
                        break;
                    case 2:
                        p2[i]=vetor[i][j];
                        break;
                    case 3:
                        p3[i]=vetor[i][j];
                        break;
                    case 4:
                        media[i]=vetor[i][j];
                        break;
                    default:
                        break;
                }
            }
               
        }
        for(int i=0;i<3;i++){
            for (int k=0;k<3;k++){
                switch (k) {
                    case 0:
                        matriz[0][k]=this.calcularMedia(p1);
                        matriz[1][k]=this.calcularMedia(p2);
                        matriz[2][k]=this.calcularMedia(p3);
                        matriz[3][k]=this.calcularMedia(media);
                        break;
                    case 1:
                        matriz[0][k]=this.calcularModa(p1);
                        matriz[1][k]=this.calcularModa(p2);
                        matriz[2][k]=this.calcularModa(p3);
                        matriz[3][k]=this.calcularModa(media);
                        break;
                    default:
                        matriz[0][k]=this.calcularDesvioPadrao(p1,matriz[0][0]);
                        matriz[1][k]=this.calcularDesvioPadrao(p2,matriz[1][0]);
                        matriz[2][k]=this.calcularDesvioPadrao(p3,matriz[2][0]);
                        matriz[3][k]=this.calcularDesvioPadrao(media,matriz[3][0]);
                        break;
                }
            }
        }
       return vetor;
   }

    public double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i=0;i<notas.length;i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public double calcularModa(double[] notas) {
        int[] count = new int[]{0,0,0,0,0};
        for(int i=0;i<5;i++){
            double nota = notas[i];
            for(int j=0;j<5;j++){
                if(nota==notas[j]){
                    count[i]++;
                }
            }
        }
            int[] moda= new int[]{0,0};
        for(int k=0;k<5;k++){
            if(moda[0]<count[k]){
                moda[1]=k;
            }
        }
        return notas[moda[1]];
    }

    public double calcularDesvioPadrao(double[] notas, double media) {
        double soma = 0;
        for (int i=0;i<notas.length;i++) {
            soma += Math.pow(notas[i] - media, 2);
        }
        double variancia = soma / notas.length;
        return Math.sqrt(variancia);
    }
    
}


