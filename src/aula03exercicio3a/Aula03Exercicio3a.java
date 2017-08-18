
package aula03exercicio3a;

import javax.swing.JFrame;

public class Aula03Exercicio3a {

  
    public static void main(String[] args) {
       JanelaSegundoGrau janela = new JanelaSegundoGrau();
       janela.setSize(600, 500);
       janela.setLocationRelativeTo(null);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setVisible(true);
    }
    
}
