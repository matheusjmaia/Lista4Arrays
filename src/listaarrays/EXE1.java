
package listaarrays;

import java.util.Scanner;


public class EXE1 {
static Scanner console = new Scanner (System.in);
static double[] criaVetor(){
    System.out.print("Qual vai ser o tamanho do vetor? ");
    int i = console.nextInt();
    double[] vetor = new double[i];
return vetor;
}
static double[] populaVetor(double[] vetor){
    for (int i = 0; i<vetor.length;i++){
        System.out.print("Insira um número para o vetor de posição "+i+": ");
        vetor [i]= console.nextDouble();
    }
return vetor;
}
static void Imprimevetor (double[] vetor){
    for (int i = 0; i<vetor.length;i++){
        System.out.print("Vetor["+i+"]: "+vetor[i]+"\n");
    }
}

    public static void main(String[] args) {
        double vetor[] = criaVetor();
        vetor = populaVetor(vetor);
        Imprimevetor(vetor);
    }
    
}
