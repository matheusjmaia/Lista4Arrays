/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaarrays;

/**
 *
 * @author matheus.jmaia
 */
public class EXE4 {
    static double MenorVetor (double [] vetor){
    double menor = 999999999;
        for(int i = 0;i< vetor.length;i++){
            if(vetor[i]<menor){
                menor = vetor[i]; 
            }
        }
    return menor;
    }
    public static void main(String[] args) {
        double vetor[] = EXE1.criaVetor();
        vetor = EXE1.populaVetor(vetor);
        double menor = MenorVetor(vetor);
        System.out.println("O menor elemento desse vetor é: "+menor);
        
        
    }
}
