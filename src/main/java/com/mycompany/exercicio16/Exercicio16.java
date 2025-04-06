/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio16 {

    public static void main(String[] args) {
        String  calculadora;
        double resultado;
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número: "));
        calculadora = JOptionPane.showInputDialog("Qual operação você quer executar?"
                + " \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão");
        switch(calculadora){
            case "1":
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case "2":
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case "3":
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case "4":
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! ");
                break;
        }
    }

}

