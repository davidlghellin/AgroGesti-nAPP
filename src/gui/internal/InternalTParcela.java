package gui.internal;

import gui.internal.nuevo.InternalNuevaParcela;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalTParcela extends javax.swing.JInternalFrame
{

    private JButton btnParcela;
    private JLabel lblParcela;

    /**
     * Creates new form InternalTParcela
     */
    public InternalTParcela(JButton btnParcela) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.btnParcela = btnParcela;
        this.jtbParcela = utils.UtilisSql.rellenarJTable("SELECT * FROM TParcela;", jtbParcela);
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnSelecionar.setVisible(false);
    }

    public InternalTParcela(JLabel lblParcela) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.jtbParcela = utils.UtilisSql.rellenarJTable("SELECT * FROM TParcela;", jtbParcela);
        //Botones
        btnAlta.setVisible(false);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        this.lblParcela = lblParcela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtbParcela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfParcelaBuscar = new javax.swing.JTextField();
        jtfFincaBuscar = new javax.swing.JTextField();
        jtfDescripcionBuscar = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Parcela");
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

        jtbParcela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtbParcela);

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

        jLabel1.setText("Parcela");

        jLabel2.setText("Finca");

        jLabel3.setText("Descripción");

        jtfParcelaBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfParcelaBuscarKeyTyped(evt);
            }
        });

        jtfFincaBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfFincaBuscarKeyTyped(evt);
            }
        });

        jtfDescripcionBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfDescripcionBuscarKeyTyped(evt);
            }
        });

        btnSelecionar.setText("Seleccionar parcela");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfParcelaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfFincaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfParcelaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFincaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevaParcela internal = new InternalNuevaParcela(jtbParcela);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            String id = (String) jtbParcela.getValueAt(jtbParcela.getSelectedRow(), 0);
            InternalNuevaParcela internal = new InternalNuevaParcela(jtbParcela, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbParcela.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TParcela", jtbParcela);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        try
        {
            dispose();
            btnParcela.setEnabled(true);
        } catch (Exception e)
        {
            Logger.getLogger(InternalTParcela.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfParcelaBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfParcelaBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfParcelaBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfParcelaBuscarKeyTyped

    private void jtfFincaBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfFincaBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfFincaBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfFincaBuscarKeyTyped

    private void jtfDescripcionBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDescripcionBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfDescripcionBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfDescripcionBuscarKeyTyped

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelecionarActionPerformed
    {//GEN-HEADEREND:event_btnSelecionarActionPerformed
        lblParcela.setText(jtbParcela.getValueAt(jtbParcela.getSelectedRow(), 0) + "");
        dispose();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void buscarFiltro() throws SQLException, Exception
    {
        String parcela = jtfParcelaBuscar.getText().toString();
        String finca = jtfFincaBuscar.getText().toString();
        String descripcion = jtfDescripcionBuscar.getText().toString();
        this.jtbParcela = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TParcela WHERE IdParcela LIKE \'%" + parcela
                + "%\' AND IdFinca LIKE \'%" + finca
                + "%\' AND Descripcion LIKE \'%" + descripcion + "%\' ;", jtbParcela);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbParcela;
    private javax.swing.JTextField jtfDescripcionBuscar;
    private javax.swing.JTextField jtfFincaBuscar;
    private javax.swing.JTextField jtfParcelaBuscar;
    // End of variables declaration//GEN-END:variables
}
