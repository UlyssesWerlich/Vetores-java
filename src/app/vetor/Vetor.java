/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.vetor;

import java.util.Scanner;
/**
 *
 * @author Ulysses Werlich
 */
public class Vetor {
    
    private int[] vetor;
    
    public Vetor(int a) {
        this.vetor = new int[a];
    }
    
    public String getVetor(){
        String tela = "";
        for (int i = 0; i < this.vetor.length; i++){
            tela += this.vetor[i] + " ";
        }
        tela += "\n ";
        return tela;
    }    
    
    public void numera(){
        for (int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = i;
        }
    }
    
    public void numeraFibonacci(){
        int n = 1;
        int m = 0;
        for (int i = 0; i < this.vetor.length; i++){
            n = n + m;
            m = n - m;
            this.vetor[i] = n;
        }
    }
    
    public void numeraContrario(){
        int m = this.vetor.length;
        for (int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = m;
            m -= 1;
        }
    }
    
    public void escreve(){
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = ler.nextInt();
        }
        ler.close();
    }
            
    
    public Vetor soma(Vetor b){
        for ( int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = this.vetor[i] + b.vetor[i];
        }
        return this;
    }
    
    public Vetor subtrai(Vetor b){
        for ( int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = this.vetor[i] - b.vetor[i];
        }
        return this;
    }
    
    public Vetor multiplica(Vetor b){
        for ( int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = this.vetor[i] * b.vetor[i];
        }
        return this;
    }
}
