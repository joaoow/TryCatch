/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somastrycatch;

import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class SomasTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º número: ");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º número: ");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showInputDialog(null, "Tecla cancelar pressionada\n" + erro.toString(),
                    "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
    
}
