package gui.internal;

import gui.internal.nuevo.InternalNuevaFinca;
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
public class InternalTFinca extends javax.swing.JInternalFrame
{

    /**
     * Referencia a un botón para poder trabajar con él (deshabilitar)
     */
    private JButton btnFinca;
    /**
     * Vble. donde guardaremos datos referentes a la finca en otra pantalla,
     * para tenerlo asociado
     */
    private JLabel lblFinca;

    /**
     * Constructor pasando un botón al abrir se deshabilitará, este botón se
     * habilitará cuando se cierre el frame
     *
     * @param btnFinca
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws Exception
     */
    public InternalTFinca(JButton btnFinca) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.btnFinca = btnFinca;
        this.jtbFinca = utils.UtilisSql.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);

        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        btnSelecionar.setVisible(false);
    }

    /**
     *
     * @param lblFinca
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws Exception
     */
    public InternalTFinca(JLabel lblFinca) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.jtbFinca = utils.UtilisSql.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);
        this.lblFinca = lblFinca;
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

        jPanel2 = new javax.swing.JPanel();
        jteNombreBuscar = new javax.swing.JTextField();
        jteLocalizacionBuscar = new javax.swing.JTextField();
        jteDescripcionBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFinca = new javax.swing.JTable();

        setBackground(new java.awt.Color(237, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Finca");
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
        addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                formFocusGained(evt);
            }
        });

        jteNombreBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteNombreBuscarKeyTyped(evt);
            }
        });

        jteLocalizacionBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteLocalizacionBuscarKeyTyped(evt);
            }
        });

        jteDescripcionBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteDescripcionBuscarKeyTyped(evt);
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

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Localizacón");

        jLabel3.setText("Descripción");

        btnSelecionar.setText("Selecionar finca");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelecionarActionPerformed(evt);
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
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jteNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jteLocalizacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jteDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jteNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jteLocalizacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jteDescripcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        jtbFinca.setAutoCreateRowSorter(true);
        jtbFinca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbFinca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevaFinca internal = new InternalNuevaFinca(jtbFinca);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            String id = (String) jtbFinca.getValueAt(jtbFinca.getSelectedRow(), 0);
            InternalNuevaFinca internal = new InternalNuevaFinca(jtbFinca, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbFinca.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TFinca", jtbFinca);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_formFocusGained
    {//GEN-HEADEREND:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jteNombreBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteNombreBuscarKeyTyped
    {//GEN-HEADEREND:event_jteNombreBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteNombreBuscarKeyTyped

    private void jteLocalizacionBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteLocalizacionBuscarKeyTyped
    {//GEN-HEADEREND:event_jteLocalizacionBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteLocalizacionBuscarKeyTyped

    private void jteDescripcionBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteDescripcionBuscarKeyTyped
    {//GEN-HEADEREND:event_jteDescripcionBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteDescripcionBuscarKeyTyped

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        try
        {
            btnFinca.setEnabled(true);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelecionarActionPerformed
    {//GEN-HEADEREND:event_btnSelecionarActionPerformed
        lblFinca.setText(jtbFinca.getValueAt(jtbFinca.getSelectedRow(), 0) + "");
        dispose();
    }//GEN-LAST:event_btnSelecionarActionPerformed
    private void buscarFiltro() throws SQLException, Exception
    {
        String descripcion = jteDescripcionBuscar.getText();
        String localizacion = jteLocalizacionBuscar.getText();
        String nombre = jteNombreBuscar.getText();
        this.jtbFinca = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TFinca WHERE Nombre LIKE \'%" + nombre
                + "%\' AND Localizacion LIKE \'%" + localizacion
                + "%\' AND Descripcion LIKE \'%" + descripcion + "%\' ;", jtbFinca);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbFinca;
    private javax.swing.JTextField jteDescripcionBuscar;
    private javax.swing.JTextField jteLocalizacionBuscar;
    private javax.swing.JTextField jteNombreBuscar;
    // End of variables declaration//GEN-END:variables
}
