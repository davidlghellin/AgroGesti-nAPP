/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author David López González
 */
public class UtilsTamanyo
{

    /**
     * Método para controlar el número máximo de caracteres
     *
     * @param textArear
     * @param max máximo de caracteres
     */
    public static void maxTamanyo(JTextField textArear, int max)
    {
        if (textArear.getText().length() > max - 1)
        {
            textArear.setText(textArear.getText().toString().substring(0, max - 1));
        }
    }

    /**
     * Método para controlar el número máximo de caracteres
     *
     * @param textArear
     * @param max máximo de caracteres
     */
    public static void maxTamanyo(JTextArea textArear, int max)
    {
        if (textArear.getText().length() > max - 1)
        {
            textArear.setText(textArear.getText().toString().substring(0, max - 1));
        }
    }

}
