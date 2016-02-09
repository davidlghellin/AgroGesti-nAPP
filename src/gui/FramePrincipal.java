package gui;

import gui.internal.InternalTCultivar;
import gui.internal.InternalTFinca;
import gui.internal.InternalTGastoManoObra;
import gui.internal.InternalTGastoOtro;
import gui.internal.InternalTGastoProducto;
import gui.internal.InternalTIngresoOtro;
import gui.internal.InternalTIngresoVenta;
import gui.internal.InternalTParcela;
import gui.internal.InternalTTipo;
import gui.internal.InternalTTrabajador;
import gui.internal.InternalTVariedad;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  David López González
 */
public class FramePrincipal extends javax.swing.JFrame
{

    // Variables para controlar los parámetros de alto y ancho de los JInternalFrame con los que se trabajará

    /**
     * Constante para el ancho de los JInternalFrame
     */
    static final int ANCHO_INTERNAL = 700;
     /**
     * Constante para el alto de los JInternalFrame
     */
    static final int ALTO_INTERNAL = 400;
     /**
     * Constante para el ancho de los JInternalFrame más grandes
     */
    static final int ANCHO_INTERNAL_GRANDE = 1000;

    public FramePrincipal()
    {
        initComponents();
        jdpPrincipal.setBorder(new FondoDesktop());
        this.setExtendedState(FramePrincipal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnFinca = new javax.swing.JButton();
        btnParcela = new javax.swing.JButton();
        btnVariedad = new javax.swing.JButton();
        btnTipo = new javax.swing.JButton();
        btnCultivar = new javax.swing.JButton();
        btnIngresoVenta = new javax.swing.JButton();
        btnIngresoOtro = new javax.swing.JButton();
        btnTrabajador = new javax.swing.JButton();
        btnGastosManoObra = new javax.swing.JButton();
        btnGastoProducto = new javax.swing.JButton();
        btnGastoOtros = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiAPP = new javax.swing.JMenuItem();
        jmiVersion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AgroGestiónApp");

        jdpPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jdpPrincipal.setBorder(new javax.swing.border.MatteBorder(null));

        btnFinca.setText("Finca");
        btnFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFincaActionPerformed(evt);
            }
        });

        btnParcela.setText("Parcela");
        btnParcela.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnParcelaActionPerformed(evt);
            }
        });

        btnVariedad.setText("Variedad");
        btnVariedad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVariedadActionPerformed(evt);
            }
        });

        btnTipo.setText("Tipo producto");
        btnTipo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTipoActionPerformed(evt);
            }
        });

        btnCultivar.setText("Cultivar");
        btnCultivar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCultivarActionPerformed(evt);
            }
        });

        btnIngresoVenta.setText("Ingreso por Venta");
        btnIngresoVenta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIngresoVentaActionPerformed(evt);
            }
        });

        btnIngresoOtro.setText("Otro ingreso");
        btnIngresoOtro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIngresoOtroActionPerformed(evt);
            }
        });

        btnTrabajador.setText("Trabajador");
        btnTrabajador.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTrabajadorActionPerformed(evt);
            }
        });

        btnGastosManoObra.setText("Gastos de mano de obra");
        btnGastosManoObra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGastosManoObraActionPerformed(evt);
            }
        });

        btnGastoProducto.setText("Gasto producto");
        btnGastoProducto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGastoProductoActionPerformed(evt);
            }
        });

        btnGastoOtros.setText("Otros gastos");
        btnGastoOtros.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGastoOtrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinca)
                .addGap(18, 18, 18)
                .addComponent(btnParcela)
                .addGap(18, 18, 18)
                .addComponent(btnTipo)
                .addGap(18, 18, 18)
                .addComponent(btnVariedad)
                .addGap(18, 18, 18)
                .addComponent(btnCultivar)
                .addGap(18, 18, 18)
                .addComponent(btnIngresoVenta)
                .addGap(18, 18, 18)
                .addComponent(btnIngresoOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGastosManoObra)
                .addGap(18, 18, 18)
                .addComponent(btnGastoProducto)
                .addGap(18, 18, 18)
                .addComponent(btnGastoOtros)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinca)
                    .addComponent(btnParcela)
                    .addComponent(btnVariedad)
                    .addComponent(btnTipo)
                    .addComponent(btnCultivar)
                    .addComponent(btnIngresoVenta)
                    .addComponent(btnIngresoOtro)
                    .addComponent(btnTrabajador)
                    .addComponent(btnGastosManoObra)
                    .addComponent(btnGastoProducto)
                    .addComponent(btnGastoOtros))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Información");

        jMenuItem1.setText("APP");
        jMenu2.add(jMenuItem1);

        jmiAPP.setText("Versión");
        jmiAPP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmiAPPActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAPP);

        jmiVersion.setText("Autor");
        jmiVersion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmiVersionActionPerformed(evt);
            }
        });
        jMenu2.add(jmiVersion);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFincaActionPerformed
    {//GEN-HEADEREND:event_btnFincaActionPerformed
        try
        {
            InternalTFinca internal = new InternalTFinca(btnFinca);
            jdpPrincipal.add(internal);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
            btnFinca.setEnabled(false);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFincaActionPerformed

    private void btnParcelaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnParcelaActionPerformed
    {//GEN-HEADEREND:event_btnParcelaActionPerformed
        try
        {
            InternalTParcela internal = new InternalTParcela(btnParcela);
            jdpPrincipal.add(internal);
            btnParcela.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnParcelaActionPerformed

    private void btnVariedadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVariedadActionPerformed
    {//GEN-HEADEREND:event_btnVariedadActionPerformed
        try
        {
            InternalTVariedad internal = new InternalTVariedad(btnVariedad);
            jdpPrincipal.add(internal);
            btnVariedad.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVariedadActionPerformed

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTipoActionPerformed
    {//GEN-HEADEREND:event_btnTipoActionPerformed
        try
        {
            InternalTTipo internal = new InternalTTipo(btnTipo);
            jdpPrincipal.add(internal);
            btnTipo.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTipoActionPerformed

    private void btnCultivarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCultivarActionPerformed
    {//GEN-HEADEREND:event_btnCultivarActionPerformed
        try
        {
            InternalTCultivar internal = new InternalTCultivar(btnCultivar);
            jdpPrincipal.add(internal);
            btnCultivar.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCultivarActionPerformed

    private void btnIngresoVentaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIngresoVentaActionPerformed
    {//GEN-HEADEREND:event_btnIngresoVentaActionPerformed
        try
        {
            InternalTIngresoVenta internal = new InternalTIngresoVenta(btnIngresoVenta);
            jdpPrincipal.add(internal);
            btnIngresoVenta.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL_GRANDE, ALTO_INTERNAL);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresoVentaActionPerformed

    private void btnIngresoOtroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIngresoOtroActionPerformed
    {//GEN-HEADEREND:event_btnIngresoOtroActionPerformed
        try
        {
            InternalTIngresoOtro internal = new InternalTIngresoOtro(btnIngresoOtro);
            jdpPrincipal.add(internal);
            btnIngresoOtro.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL_GRANDE, ALTO_INTERNAL);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnIngresoOtroActionPerformed

    private void btnTrabajadorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTrabajadorActionPerformed
    {//GEN-HEADEREND:event_btnTrabajadorActionPerformed
        try
        {
            InternalTTrabajador internal = new InternalTTrabajador(btnTrabajador);
            jdpPrincipal.add(internal);
            btnTrabajador.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL, ALTO_INTERNAL);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTrabajadorActionPerformed

    private void btnGastosManoObraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGastosManoObraActionPerformed
    {//GEN-HEADEREND:event_btnGastosManoObraActionPerformed
        try
        {
            InternalTGastoManoObra internal = new InternalTGastoManoObra(btnGastosManoObra);
            jdpPrincipal.add(internal);
            btnGastosManoObra.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL_GRANDE, ALTO_INTERNAL);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGastosManoObraActionPerformed

    private void btnGastoProductoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGastoProductoActionPerformed
    {//GEN-HEADEREND:event_btnGastoProductoActionPerformed
        try
        {
            InternalTGastoProducto internal = new InternalTGastoProducto(btnGastoProducto);
            jdpPrincipal.add(internal);
            btnGastoProducto.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL_GRANDE, ALTO_INTERNAL);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGastoProductoActionPerformed

    private void btnGastoOtrosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGastoOtrosActionPerformed
    {//GEN-HEADEREND:event_btnGastoOtrosActionPerformed
        try
        {
            InternalTGastoOtro internal = new InternalTGastoOtro(btnGastoOtros);
            jdpPrincipal.add(internal);
            btnGastoOtros.setEnabled(false);
            utils.UtilsFrame.centrar(internal, ANCHO_INTERNAL_GRANDE, ALTO_INTERNAL);
        } catch (Exception ex)
        {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGastoOtrosActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmiSalirActionPerformed
    {//GEN-HEADEREND:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiVersionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmiVersionActionPerformed
    {//GEN-HEADEREND:event_jmiVersionActionPerformed
        JOptionPane.showMessageDialog(this, "David López González\nDesarrollo de Interfaces\nDAM\nIES Alquerías", "Autor:", 1);
    }//GEN-LAST:event_jmiVersionActionPerformed

    private void jmiAPPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmiAPPActionPerformed
    {//GEN-HEADEREND:event_jmiAPPActionPerformed
        JOptionPane.showMessageDialog(this, "Alpha", "Versión", 1);
    }//GEN-LAST:event_jmiAPPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCultivar;
    private javax.swing.JButton btnFinca;
    private javax.swing.JButton btnGastoOtros;
    private javax.swing.JButton btnGastoProducto;
    private javax.swing.JButton btnGastosManoObra;
    private javax.swing.JButton btnIngresoOtro;
    private javax.swing.JButton btnIngresoVenta;
    private javax.swing.JButton btnParcela;
    private javax.swing.JButton btnTipo;
    private javax.swing.JButton btnTrabajador;
    private javax.swing.JButton btnVariedad;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem jmiAPP;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiVersion;
    // End of variables declaration//GEN-END:variables
}
