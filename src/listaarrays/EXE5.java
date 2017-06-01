
package listaarrays;


public class EXE5 {
    static double mediaVetor (double[] vetor){
        double media = 0;
        for (int i=0;i<vetor.length;i++){
            media = media + vetor[i];
        }
        return (media/vetor.length);
    }
    public static void main(String[] args) {
        double vetor[] = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        double media = mediaVetor(vetor);
        System.out.printf("A média desse vetor é: %.1f ",media);
    }
}
