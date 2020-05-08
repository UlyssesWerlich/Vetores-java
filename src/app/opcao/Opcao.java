package app.opcao;

import javax.swing.JOptionPane;

import app.matriz.Matriz;
import app.vetor.Vetor;

/**
 *
 * @author Ulysses Werlich
 */
public class Opcao {
    
    public static void opcaoV(){
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho:"));
        Vetor vetor1 = new Vetor(tamanho);
        Vetor vetor2 = new Vetor(tamanho);
        
        String mensagem = "O que deseja fazer?\n1. Gerar um vetor\n2. Soma de vetores\n3. Subtração de vetores\n4. Multiplicação de vetores";       
        String escolha2 = JOptionPane.showInputDialog(mensagem);
                
        switch (escolha2) {
            case "1":
                Opcao.opcaoTipoVetor(vetor1);
                Opcao.mostrarVetor(vetor1, tamanho);
                break;
                
            case "2":
                Opcao.opcaoTipoVetor(vetor1);
                Opcao.opcaoTipoVetor(vetor2);
                vetor1.soma(vetor2);
                Opcao.mostrarVetor(vetor1, tamanho);                 
                break;
            case "3":
                Opcao.opcaoTipoVetor(vetor1);
                Opcao.opcaoTipoVetor(vetor2);
                vetor1.subtrai(vetor2);
                Opcao.mostrarVetor(vetor1, tamanho);                 
                break;
            case "4":
                Opcao.opcaoTipoVetor(vetor1);
                Opcao.opcaoTipoVetor(vetor2);
                vetor1.multiplica(vetor2);
                Opcao.mostrarVetor(vetor1, tamanho);                 
                break;
            default:
                break;
        }           
    }
    
    private static void opcaoTipoVetor(Vetor vetor){
        String mensagem = "Tipo de Vetor:\n1. Numerar\n2. Numerar fibonacci\n3. Numerar ao contrário\n4. Escrever";       
        String escolha2 = JOptionPane.showInputDialog(mensagem);        
        switch (escolha2) {
            case "1":
                vetor.numera();
                break;
            case "2":
                vetor.numeraFibonacci();
                break;
            case "3":
                vetor.numeraContrario();
                break;
            case "4":
                vetor.escreve();
                break;
            default:
                break;
        }
    }
    
    private static void mostrarVetor(Vetor vetor, int tamanho){
        JOptionPane.showMessageDialog(null, vetor.getVetor());        
    }
    
    
    public static void opcaoM(){
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Colunas:"));
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Linhas:"));
        Matriz matriz1 = new Matriz(coluna, linha);
        Matriz matriz2 = new Matriz(coluna, linha);
        
        String mensagem = "O que deseja fazer?\n1. Gerar uma matriz\n2. Soma de matrizes\n3. Subtração de matrizes\n4. Multiplicação de matrizes";       
        String escolha = JOptionPane.showInputDialog(mensagem);        
        
        switch (escolha) {
            case "1":
                Opcao.opcaoTipoMatriz(matriz1);
                Opcao.mostraMatriz(matriz1);
                break;
                
            case "2":
                Opcao.opcaoTipoMatriz(matriz1);
                Opcao.opcaoTipoMatriz(matriz2);
                matriz1.somaMatriz(matriz2);
                Opcao.mostraMatriz(matriz1);                 
                break;
            case "3":
                Opcao.opcaoTipoMatriz(matriz1);
                Opcao.opcaoTipoMatriz(matriz2);
                matriz1.subtraiMatriz(matriz2);
                Opcao.mostraMatriz(matriz1);                 
                break;
            case "4":
                Opcao.opcaoTipoMatriz(matriz1);
                Opcao.opcaoTipoMatriz(matriz2);
                matriz1.multiplicaMatriz(matriz2);
                Opcao.mostraMatriz(matriz1);                 
                break;
            default:
                break;
        } 
    }    
        
    public static void opcaoTipoMatriz(Matriz matriz){
        String mensagem = "Tipo de matriz:\n1. Numera\n2. Numera ao contrario\n3. Numera em Fibonacci\n4. Numera em Multiplo";
        mensagem += "\n5. Numera em X\n6. Numera em xadrez";       
        String escolha = JOptionPane.showInputDialog(mensagem);
        
        switch (escolha) {
            case "1":
                matriz.numera();
                break;
                
            case "2":
                matriz.numeraContrario();              
                break;
                
            case "3":
                matriz.numeraFibonacci();                 
                break;
                
            case "4":
                int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Multiplo:"));
                matriz.numeraMultiplo(multiplo);
                break;
                
            case "5":
                matriz.numeraX();
                break;
                
            case "6":
                matriz.numeraXadrez(); 
                break;
                
            default:
                break;
        }         
    }
    
    public static void mostraMatriz(Matriz matriz){
        JOptionPane.showMessageDialog(null, matriz.getMatriz());
    } 
}
