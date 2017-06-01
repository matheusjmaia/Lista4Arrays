package listaarrays;

import java.util.Scanner;


public class EXE8 {
static void verifica(double []vetor){
    boolean tem = false;
    System.out.print("Digite um número para verificar se o mesmo está presente no vetor ");
    Scanner console = new Scanner (System.in);
    double n = console.nextDouble();
    for(int i =0; i < vetor.length;i++){
        if(vetor[i] == n){
            System.out.println(n+" está presente no vetor de posição ["+i+"]");
            break;
        }
    }

}
    public static void main(String[] args) {
        double[] vetor = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        verifica(vetor);
    }
}
