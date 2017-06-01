
package listaarrays;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXE7 {
    static void multiplicaImprime (double [] vetor,int n){
        for(int i = 0;i< vetor.length;i++){
            System.out.println("Vetor["+i+"]: "+vetor[i]+" vezes "+n+" é igual a: "+(vetor[i]*n));
        }
    }
    
    public static void main(String[] args) {
        double [] vetor = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        System.out.print("Insira um número para multiplicar: ");
        Scanner console = new Scanner (System.in);
        int n = console.nextInt();
        multiplicaImprime(vetor, n);
        
    }
}
