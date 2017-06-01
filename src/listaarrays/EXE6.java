
package listaarrays;


public class EXE6 {
    static double ProdutoVetor(double[] vetor){
        double produto = 1;
        for (int i =0; i<vetor.length;i++){
            produto = produto * vetor [i];
        }
    return produto;
    }
    public static void main(String[] args) {
        double [] vetor = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        double produto = ProdutoVetor(vetor);
        System.out.printf(" O produto dos números desse vetor é: %.0f ",produto);
    }
 
   
}
