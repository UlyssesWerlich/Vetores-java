package app;

import javax.swing.JOptionPane;

import app.opcao.Opcao;

/**
 *
 * @author Ulysses Werlich
 */
public class App {
    
    public static void main(String[] args) {
        
        String escolha = JOptionPane.showInputDialog("Vetor ou Matriz? (v/m)");
        switch ( escolha ){
            case "v":
                Opcao.opcaoV();
            break;
            
            case "m":
                Opcao.opcaoM(); 
            break;
            
            default:           
        }
    }   
}
