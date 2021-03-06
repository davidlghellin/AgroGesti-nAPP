package gui.internal;

import gui.internal.nuevo.InternalNuevaVariedad;
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
public class InternalTVariedad extends javax.swing.JInternalFrame
{

    private JButton btnVariedad;
    private JLabel lblVariedad;

    public InternalTVariedad(JButton btnVariedad) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.btnVariedad = btnVariedad;
        this.jtbProducto = utils.UtilisSql.rellenarJTable("SELECT * FROM TVariedad;", jtbProducto);
        //Botones
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnSelecionar.setVisible(false);
    }

    public InternalTVariedad(JLabel lblVariedad) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.jtbProducto = utils.UtilisSql.rellenarJTable("SELECT * FROM TVariedad;", jtbProducto);
        //Botones
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnAlta.setVisible(false);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        this.lblVariedad = lblVariedad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProducto = new javax.swing.JTable();
        btnAlta = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfNombreBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfVariedadBuscar = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Variedad producto");
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

        jtbProducto.setAutoCreateRowSorter(true);
        jtbProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbProducto);

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
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

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jtfNombreBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfNombreBuscarKeyTyped(evt);
            }
        });

        jLabel2.setText("Variedad");

        jtfVariedadBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfVariedadBuscarKeyTyped(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfVariedadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfVariedadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevaVariedad internal = new InternalNuevaVariedad(jtbProducto);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TVariedad", jtbProducto);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            String id = (String) jtbProducto.getValueAt(jtbProducto.getSelectedRow(), 0);
            InternalNuevaVariedad internal = new InternalNuevaVariedad(jtbProducto, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila a modificar");
            Logger.getLogger(InternalTVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        try
        {
            btnVariedad.setEnabled(true);
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfVariedadBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfVariedadBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfVariedadBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfVariedadBuscarKeyTyped

    private void jtfNombreBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfNombreBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfNombreBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfNombreBuscarKeyTyped

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelecionarActionPerformed
    {//GEN-HEADEREND:event_btnSelecionarActionPerformed
        lblVariedad.setText(jtbProducto.getValueAt(jtbProducto.getSelectedRow(), 0) + "");
        System.out.println("eee");
        dispose();
    }//GEN-LAST:event_btnSelecionarActionPerformed
    private void buscarFiltro() throws SQLException, Exception
    {
        String nombre = jtfNombreBuscar.getText().toString();
        String variedad = jtfVariedadBuscar.getText().toString();
        this.jtbProducto = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TVariedad WHERE Nombre LIKE \'%" + nombre
                + "%\' AND IdTipo LIKE \'%" + variedad + "%\' ;", jtbProducto);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProducto;
    private javax.swing.JTextField jtfNombreBuscar;
    private javax.swing.JTextField jtfVariedadBuscar;
    // End of variables declaration//GEN-END:variables
}
