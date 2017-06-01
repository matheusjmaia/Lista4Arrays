
package listaarrays;


public class EXE3 {
    static double MaiorVetor (double [] vetor){
        double maior = 0;
        for(int i = 0;i< vetor.length;i++){
            if(vetor[i]>maior){
                maior = vetor[i]; 
            }
        }
    return maior;
    }
    public static void main(String[] args) {
        double vetor[] = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        double maior = MaiorVetor(vetor);
        System.out.println("O maior elemento desse vetor é: "+maior);
        
        
    }
  
}
