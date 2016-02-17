/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author David López González
 */
public class FConexionServidor extends JDialog
{

    JLabel jLabel5 = new JLabel();
    JTextField tbIP = new JTextField();
    JButton bConectar = new JButton();
    JButton bSalir = new JButton();
    String IpServidor;

    public FConexionServidor(Frame frame, String title, boolean modal)
    {
        super(frame, title, modal);
        try
        {
            jbInit();
            tbIP.setText("127.0.0.1");
            pack();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public FConexionServidor()
    {
        this(null, "", false);
    }

    private void jbInit() throws Exception
    {
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16));
        jLabel5.setForeground(Color.darkGray);
        jLabel5.setText("Dirección IP del servidor");
        jLabel5.setBounds(new Rectangle(24, 21, 298, 23));

        this.setSize(new Dimension(518, 470));

        //Centrar la ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height)
        {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width)
        {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

        this.setModal(true);
        this.setTitle("Conexión con el servidor");
        this.getContentPane().setLayout(null);
        tbIP.setAlignmentX((float) 0.5);
        tbIP.setText("");
        tbIP.setHorizontalAlignment(SwingConstants.CENTER);
        tbIP.setBounds(new Rectangle(79, 56, 180, 24));
        bConectar.setBounds(new Rectangle(67, 106, 88, 29));
        bConectar.setText("Conectar");
        bConectar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ConectarServidor(e);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CerrarVentana(e);
            }
        });
        bSalir.setBounds(new Rectangle(178, 106, 88, 29));
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(tbIP, null);
        this.getContentPane().add(bSalir, null);
        this.getContentPane().add(bConectar, null);
    }

    //Establece la IP del servidor al que conectarnos
    void ConectarServidor(ActionEvent e)
    {
        IpServidor = tbIP.getText();
        this.setVisible(false);
    }

    //Devuelve la IP a la que nos queremos conectar
    public String getIPServidor()
    {
        return IpServidor;
    }

    //Cierra la ventana
    void CerrarVentana(ActionEvent e)
    {
        this.setVisible(false);
    }
}
