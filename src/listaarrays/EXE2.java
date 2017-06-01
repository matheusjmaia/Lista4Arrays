
package listaarrays;


public class EXE2 {
    static double SomaAllVetor(double [] vetor){
        double soma = 0;
        for (int i = 0; i<vetor.length;i++){
            soma = soma + vetor[i];
        }
    return soma;
    }
    
    public static void main(String[] args) {
        double[] vetor = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        double soma = SomaAllVetor(vetor);
        System.out.println("A soma de todos os elementos de desse vetor é: "+soma);
    }
    
}
