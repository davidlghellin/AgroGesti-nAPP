/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author david
 */
public class UtilsBotones
{

    public static void crearBotonAlta(JButton b)
    {
        b.setText("Alta");
        b.setSize(200,100);
        b.setMaximumSize(new Dimension(200, 20));
        b.repaint();
        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                System.out.println("eeeee");}
        });
    }

    public static void crearBotonModificar(JButton b)
    {
        b.setText("Modificar");
    }

    public static void crearBotonEliminar(JButton b)
    {
        b.setText("Eliminar");
    }

    public static void crearBotonAceptar(JButton b)
    {
        b.setText("Aceptar");
    }

    public static void crearBotonCancelar(JButton b)
    {
        b.setText("Cancelar");
    }
}
