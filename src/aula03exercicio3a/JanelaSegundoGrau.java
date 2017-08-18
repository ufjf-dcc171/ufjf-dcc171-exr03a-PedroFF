package aula03exercicio3a;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaSegundoGrau extends JFrame {

    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();
    private JLabel etiqueta3 = new JLabel();
    private JLabel etiqueta4 = new JLabel();
    private final JTextField texto;
    private final JTextField texto2;
    private final JTextField texto3;
    private double valor1;
    private double valor2;
    private double valor3;
    private final JButton btnResultado = new JButton("Aperte para o resultado");
    
    public JanelaSegundoGrau() throws HeadlessException {
        super("Equação Segundo Grau");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        etiqueta1 = new JLabel("Primeiro coeficiente: ");
        texto = new JTextField(10);
        add(etiqueta1);
        add(texto);

        etiqueta2 = new JLabel("Segundo coeficiente: ");
        texto2 = new JTextField(10);
        add(etiqueta2);
        add(texto2);

        etiqueta3 = new JLabel("Segundo coeficiente: ");
        texto3 = new JTextField(10);
        add(etiqueta3);
        add(texto3);
        
        etiqueta4 = new JLabel("Raízes");
        
        add(btnResultado);
        btnResultado.addActionListener(new BotaoClicado());
    }

    private class BotaoClicado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(texto.getText());
            valor2 = Double.parseDouble(texto2.getText());
            valor3 = Double.parseDouble(texto3.getText());
            double delta = (Math.pow(valor2, 2)-4*valor1*valor3);
            double raiz1 = ((-valor2 + Math.sqrt(delta))/(2*valor1));
            double raiz2 = ((-valor2 - Math.sqrt(delta))/(2*valor1));
            
            JOptionPane.showMessageDialog(null,String.format("As raizes são: %.3f e %.3f",raiz1,raiz2),"botão enfeitado",
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
