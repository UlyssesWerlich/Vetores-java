/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.matriz;

/**
 *
 * @author Administrador
 */
public class Matriz {
    private int[][] matriz;
    private int coluna;
    private int linha;
    
    public Matriz(int coluna, int linha){
        this.coluna = coluna;
        this.linha = linha;
        this.matriz = new int[coluna][linha];
    }
    
    public String getMatriz(){
        String tela = "";
        for (int j = 0; j < this.linha; j++){
            tela += "\n ";
            for (int i = 0; i < this.coluna; i++){
                tela += this.matriz[i][j] + " ";
            }
        }
        return tela;
    }
    
    public void numera(){
        int m = 0;
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
                m += 1;
                this.matriz[i][j] = m;
            }
        }
    }
    
    public void numeraContrario() {
        int m = this.coluna * this.linha;
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
                this.matriz[i][j] = m;
                m -= 1;
            }
        }
    }
    
    public void numeraX(){
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
                this.matriz[i][j] = 0;
            }
        }
        int i = 0;
        int j = this.linha - 1;
        if ( this.coluna >= this.linha){
            for (i = 0; i < this.linha; i++){
                this.matriz[j][j] = 1; 
                this.matriz[i][j] = 1;
                j -= 1;
            }
        } else {
            for (j = this.coluna - 1; j >= 0; j--){
                this.matriz[j][j] = 1;
                this.matriz[i][j] = 1;
                i += 1; 
            }   
        }
    }
    
    public void numeraFibonacci(){
        int n = 1;
        int m = 0;
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
            n = n + m;
            m = n - m;
            this.matriz[i][j] = n;
            }
        }
    }
    
    public void numeraMultiplo(int multiplo){
        int m = 0;
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
            this.matriz[i][j] = m * multiplo;
            m += 1;
            }
        }  
    }
    
    public void numeraXadrez(){
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
                if ( (j + i) % 2 == 0){
                    this.matriz[i][j] = 0;
                } else {
                    this.matriz[i][j] = 1;
                }
            }
        }
    }
    
    public void somaMatriz(Matriz matriz2){
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
            this.matriz[i][j] += matriz2.matriz[i][j];
            }
        }          
    }
    
    public void subtraiMatriz(Matriz matriz2){
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
            this.matriz[i][j] -= matriz2.matriz[i][j];
            }
        }          
    }
 
    public void multiplicaMatriz(Matriz matriz2){
        for (int j = 0; j < this.linha; j++){
            for (int i = 0; i < this.coluna; i++){
            this.matriz[i][j] = this.matriz[i][j] * matriz2.matriz[i][j];
            }
        }          
    }
    
    
    
}
