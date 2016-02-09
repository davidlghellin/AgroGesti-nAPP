package gui.internal;

import com.mysql.jdbc.Connection;
import conexion.ConexionBBDD;
import gui.internal.nuevo.InternalNuevoTrabajador;
import gui.trabajador.FrameTrabajador;
import jasper.AbstractaJasperReports;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalTTrabajador extends javax.swing.JInternalFrame
{

    private JButton btnTrabajador;
    private JLabel lblTrabajador;

    public InternalTTrabajador(JButton btnTrabajador) throws SQLException, Exception
    {
        initComponents();
        this.btnTrabajador = btnTrabajador;
        jtbTrabajador = utils.UtilisSql.rellenarJTable("SELECT * FROM TTrabajador;", jtbTrabajador);
        //Botones
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnSeleccionar.setVisible(false);
    }

    public InternalTTrabajador(JLabel lblDNI) throws SQLException, Exception
    {
        initComponents();
        lblTrabajador = lblDNI;
        jtbTrabajador = utils.UtilisSql.rellenarJTable("SELECT * FROM TTrabajador;", jtbTrabajador);
        //Botones
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnAlta.setVisible(false);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTrabajador = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfDNIBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombreBuscar = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmInformeRealizados = new javax.swing.JMenuItem();
        jmInformeRealizadosPendientesCobro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Trabajador");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });

        jtbTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbTrabajador);

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Baja");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jtfDNIBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfDNIBuscarKeyReleased(evt);
            }
        });

        jLabel2.setText("Nombre");

        jtfNombreBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfNombreBuscarKeyReleased(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSeleccionar))
                .addContainerGap())
        );

        jMenu2.setText("Informe");

        jmInformeRealizados.setText("Trabajos realizados");
        jmInformeRealizados.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmInformeRealizadosActionPerformed(evt);
            }
        });
        jMenu2.add(jmInformeRealizados);

        jmInformeRealizadosPendientesCobro.setText("Trabajos realizados y pendientes de cobro");
        jmInformeRealizadosPendientesCobro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmInformeRealizadosPendientesCobroActionPerformed(evt);
            }
        });
        jMenu2.add(jmInformeRealizadosPendientesCobro);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Gráficos");

        jMenuItem1.setText("Evolución de cobros");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cobrado último año");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevoTrabajador internal = new InternalNuevoTrabajador(jtbTrabajador);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal, 300);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TTrabajador", jtbTrabajador);
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbTrabajador.getRootPane(), "Tiene que selecionar la fila a eliminar");
            Logger.getLogger(InternalTTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            String id = (String) jtbTrabajador.getValueAt(jtbTrabajador.getSelectedRow(), 0);
            System.out.println(id);
            InternalNuevoTrabajador internal = new InternalNuevoTrabajador(jtbTrabajador, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 300);
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbTrabajador.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        try
        {
            btnTrabajador.setEnabled(true);
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfNombreBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfNombreBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfNombreBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfNombreBuscarKeyReleased

    private void jtfDNIBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDNIBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfDNIBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfDNIBuscarKeyReleased

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSeleccionarActionPerformed
    {//GEN-HEADEREND:event_btnSeleccionarActionPerformed
        lblTrabajador.setText(jtbTrabajador.getValueAt(jtbTrabajador.getSelectedRow(), 0) + "");
        dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void jmInformeRealizadosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmInformeRealizadosActionPerformed
    {//GEN-HEADEREND:event_jmInformeRealizadosActionPerformed
        try
        {
            String dni = (String) jtbTrabajador.getValueAt(jtbTrabajador.getSelectedRow(), 0);
            InternalTrabajadorFechas internal = new InternalTrabajadorFechas(dni);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmInformeRealizadosActionPerformed

    private void jmInformeRealizadosPendientesCobroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmInformeRealizadosPendientesCobroActionPerformed
    {//GEN-HEADEREND:event_jmInformeRealizadosPendientesCobroActionPerformed

        try
        {

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            String DNI = (String) jtbTrabajador.getValueAt(jtbTrabajador.getSelectedRow(), 0);
            parametros.put("dni", DNI);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c10_Landscape.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(FrameTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jmInformeRealizadosPendientesCobroActionPerformed
    private void buscarFiltro() throws SQLException, Exception
    {
        String dni = jtfDNIBuscar.getText().toString();
        String nombre = jtfNombreBuscar.getText().toString();

        this.jtbTrabajador = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TTrabajador WHERE DNI LIKE \'%" + dni
                + "%\' AND Nombre LIKE \'%" + nombre + "%\' ;", jtbTrabajador);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmInformeRealizados;
    private javax.swing.JMenuItem jmInformeRealizadosPendientesCobro;
    private javax.swing.JTable jtbTrabajador;
    private javax.swing.JTextField jtfDNIBuscar;
    private javax.swing.JTextField jtfNombreBuscar;
    // End of variables declaration//GEN-END:variables
}
