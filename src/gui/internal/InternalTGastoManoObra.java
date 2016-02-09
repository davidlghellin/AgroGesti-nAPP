package gui.internal;

import conexion.ConexionBBDD;
import gui.internal.nuevo.InternalNuevoGastoManoObra;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalTGastoManoObra extends javax.swing.JInternalFrame
{

    private JButton btnGastosManoObra;

    public InternalTGastoManoObra(JButton btnGastosManoObra) throws SQLException, Exception
    {
        initComponents();
        this.btnGastosManoObra = btnGastosManoObra;
        this.jtbTGastosManoObra = utils.UtilisSql.rellenarJTable("SELECT * FROM TGastosManoObra;", jtbTGastosManoObra);

        //Imagenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDescripcionBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDNIBuscar = new javax.swing.JTextField();
        btnPagado = new javax.swing.JButton();
        btnNoPagado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTGastosManoObra = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gasto de mano de obra");
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

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Días/Horas", "Días", "Horas" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcbTipoActionPerformed(evt);
            }
        });
        jcbTipo.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jcbTipoPropertyChange(evt);
            }
        });

        jLabel1.setText("Tipo");

        jLabel2.setText("Descripción");

        jtfDescripcionBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfDescripcionBuscarKeyReleased(evt);
            }
        });

        jLabel3.setText("DNI");

        jtfDNIBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfDNIBuscarKeyReleased(evt);
            }
        });

        btnPagado.setText("Pagado");
        btnPagado.setToolTipText("Seleccione fila para pagar");
        btnPagado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPagadoActionPerformed(evt);
            }
        });

        btnNoPagado.setText("No pagado");
        btnNoPagado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNoPagadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNoPagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoPagado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnPagado))
                .addContainerGap())
        );

        jtbTGastosManoObra.setAutoCreateRowSorter(true);
        jtbTGastosManoObra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtbTGastosManoObra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TGastosManoObra", jtbTGastosManoObra, 1);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevoGastoManoObra internal = new InternalNuevoGastoManoObra(jtbTGastosManoObra);
        this.getParent().add(internal);
        utils.UtilsFrame.centrar(internal, 300, 600);
        internal.toFront();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        btnGastosManoObra.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfDNIBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDNIBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfDNIBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfDNIBuscarKeyReleased

    private void jtfDescripcionBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDescripcionBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfDescripcionBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfDescripcionBuscarKeyReleased

    private void jcbTipoPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jcbTipoPropertyChange
    {//GEN-HEADEREND:event_jcbTipoPropertyChange

    }//GEN-LAST:event_jcbTipoPropertyChange

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jcbTipoActionPerformed
    {//GEN-HEADEREND:event_jcbTipoActionPerformed
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            int id = (int) jtbTGastosManoObra.getValueAt(jtbTGastosManoObra.getSelectedRow(), 0);
            InternalNuevoGastoManoObra internal = new InternalNuevoGastoManoObra(jtbTGastosManoObra, id);
            this.getParent().add(internal);
            utils.UtilsFrame.centrar(internal, 300, 600);
            internal.toFront();
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbTGastosManoObra.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnPagadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPagadoActionPerformed
    {//GEN-HEADEREND:event_btnPagadoActionPerformed
        int[] filas = jtbTGastosManoObra.getSelectedRows();
        if (filas.length == 0)
        {
            JOptionPane.showInternalMessageDialog(jtbTGastosManoObra.getRootPane(), "Tiene que selecionar las filas a pagar");
        } else
        {
            for (int f : filas)
            {
                System.out.println(jtbTGastosManoObra.getValueAt(f, 11).toString());
                if (!((String) jtbTGastosManoObra.getValueAt(f, 11).toString()).equals("Pagado"))
                {
                    int id = Integer.parseInt((String) jtbTGastosManoObra.getValueAt(f, 0).toString());

                    String SQL = "UPDATE  TGastosManoObra SET Pagado= \"Pagado\" WHERE Id = \"" + id + "\";";

                    try
                    {
                        ConexionBBDD c = new ConexionBBDD();
                        c.hacerInsercion(SQL);
                        c.cerrarConexion();
                        utils.UtilisSql.actualizarJtable(jtbTGastosManoObra, "TGastosManoObra");
                    } catch (Exception ex)
                    {
                        Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnPagadoActionPerformed

    private void btnNoPagadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNoPagadoActionPerformed
    {//GEN-HEADEREND:event_btnNoPagadoActionPerformed
        int[] filas = jtbTGastosManoObra.getSelectedRows();
        if (filas.length == 0)
        {
            JOptionPane.showInternalMessageDialog(jtbTGastosManoObra.getRootPane(), "Tiene que selecionar las filas a marcar como no pagado");
        } else
        {
            for (int f : filas)
            {
                if (!((String) jtbTGastosManoObra.getValueAt(f, 11).toString()).equals("No pagado"))
                {
                    int id = Integer.parseInt((String) jtbTGastosManoObra.getValueAt(f, 0).toString());

                    String SQL = "UPDATE  TGastosManoObra SET Pagado= \"No pagado\" WHERE Id = \"" + id + "\";";

                    try
                    {
                        ConexionBBDD c = new ConexionBBDD();
                        c.hacerInsercion(SQL);
                        c.cerrarConexion();
                        utils.UtilisSql.actualizarJtable(jtbTGastosManoObra, "TGastosManoObra");
                    } catch (Exception ex)
                    {
                        Logger.getLogger(InternalTGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnNoPagadoActionPerformed
    private void buscarFiltro() throws SQLException, Exception
    {
        String dni = jtfDNIBuscar.getText().toString();
        String descripcion = jtfDescripcionBuscar.getText().toString();
        String tipo = "";
        if (jcbTipo.getSelectedIndex() == 1)
        {
            tipo = "Dias";
        } else if (jcbTipo.getSelectedIndex() == 2)
        {
            tipo = "Horas";
        }
        System.out.println(tipo);
        this.jtbTGastosManoObra = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TGastosManoObra WHERE DNI LIKE \'%" + dni + "%\'"
                + " AND Descripcion LIKE \'%" + descripcion + "%\' "
                + " AND Tipo LIKE \'%" + tipo + "%\';", jtbTGastosManoObra);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNoPagado;
    private javax.swing.JButton btnPagado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JTable jtbTGastosManoObra;
    private javax.swing.JTextField jtfDNIBuscar;
    private javax.swing.JTextField jtfDescripcionBuscar;
    // End of variables declaration//GEN-END:variables
}
