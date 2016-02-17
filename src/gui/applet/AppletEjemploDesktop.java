package gui.applet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David López González
 */
public class AppletEjemploDesktop extends JApplet
{

    
    JDesktopPane escritorio;
    int i=0;
    int intervalo=10;
  
    public void init(){
      
        escritorio=new JDesktopPane();
        add(escritorio);
      
        JMenuBar barra=new JMenuBar();
        JMenu archivo=new JMenu("Archivo");
        JMenuItem nuevo=new JMenuItem("Nuevo");
        nuevo.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent arg0) {
                i++;
                JInternalFrame ventanaInterna=new JInternalFrame("Ventana "+i,true,true,true,true);
                JTextArea texto=new JTextArea();
                JScrollPane scroll=new JScrollPane(texto);
                ventanaInterna.add(scroll);
                ventanaInterna.setBounds(0+intervalo,0+intervalo,200,200);
                intervalo+=10;
                escritorio.add(ventanaInterna);
                ventanaInterna.setVisible(true);
              
            }
        });
        archivo.add(nuevo);
        barra.add(archivo);
        setJMenuBar(barra);
      
    }
}