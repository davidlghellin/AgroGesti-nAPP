/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import conexion.ConexionBBDD;
import gui.internal.nuevo.InternalNuevaFinca;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class InternalTFinca extends javax.swing.JInternalFrame
{

    DefaultTableModel modelo;

    /**
     * Creates new form internalP1
     */
    public InternalTFinca() throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        modelo = new DefaultTableModel();
        this.jtbFinca = utils.Utilidades.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        btnAltaFinca = new javax.swing.JButton();
        btnModificarFinca = new javax.swing.JButton();
        btnEliminarFinca = new javax.swing.JButton();
        jteNombreBuscarFinca = new javax.swing.JTextField();
        jteLocalizacionBuscarFinca = new javax.swing.JTextField();
        jteDescripcionBuscarFinca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFinca = new javax.swing.JTable();

        setBackground(new java.awt.Color(237, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);
        addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                formFocusGained(evt);
            }
        });

        btnAltaFinca.setText("Alta");
        btnAltaFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaFincaActionPerformed(evt);
            }
        });

        btnModificarFinca.setText("Modificar");
        btnModificarFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarFincaActionPerformed(evt);
            }
        });

        btnEliminarFinca.setText("Eliminar");
        btnEliminarFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarFincaActionPerformed(evt);
            }
        });

        jteNombreBuscarFinca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteNombreBuscarFincaKeyTyped(evt);
            }
        });

        jteLocalizacionBuscarFinca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteLocalizacionBuscarFincaKeyTyped(evt);
            }
        });

        jteDescripcionBuscarFinca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jteDescripcionBuscarFincaKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Localizacón");

        jLabel3.setText("Descripción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jteNombreBuscarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jteLocalizacionBuscarFinca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAltaFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(206, 206, 206)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jteDescripcionBuscarFinca)
                    .addComponent(btnEliminarFinca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jteLocalizacionBuscarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jteDescripcionBuscarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jteNombreBuscarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAltaFinca)
                            .addComponent(btnModificarFinca)
                            .addComponent(btnEliminarFinca))
                        .addContainerGap(109, Short.MAX_VALUE))))
        );

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaFincaActionPerformed
    {//GEN-HEADEREND:event_btnAltaFincaActionPerformed
        InternalNuevaFinca internal = new InternalNuevaFinca(jtbFinca);
        this.getParent().add(internal);
        internal.toFront();
    }//GEN-LAST:event_btnAltaFincaActionPerformed

    private void btnModificarFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarFincaActionPerformed
    {//GEN-HEADEREND:event_btnModificarFincaActionPerformed
        try
        {
            String id = (String) jtbFinca.getValueAt(jtbFinca.getSelectedRow(), 0);
            System.out.println("iddd_"+id);
            InternalNuevaFinca internal = new InternalNuevaFinca(jtbFinca, id);
            this.getParent().add(internal);
            internal.toFront();
        } catch (Exception ex)
        {
            JOptionPane.showInternalMessageDialog(jtbFinca.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
    }//GEN-LAST:event_btnModificarFincaActionPerformed

    private void btnEliminarFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarFincaActionPerformed
    {//GEN-HEADEREND:event_btnEliminarFincaActionPerformed
        /* try
         {
         String id = (String) jtbFinca.getValueAt(jtbFinca.getSelectedRow(), 0);
         ConexionBBDD c = null;
         try
         {
         c = new ConexionBBDD();
         } catch (ClassNotFoundException ex)
         {
         Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
         }
         String SQL = "DELETE FROM TFinca WHERE Nombre = \"" + id + "\";";
         c.hacerBorrado(SQL);
         c.cerrarConexion();
         } catch (Exception e)
         {
         JOptionPane.showInternalMessageDialog(jtbFinca.getRootPane(), "Tiene que selecionar la fica a eliminar");
         }
         try
         {
         this.jtbFinca = utils.Utilidades.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);
         } catch (SQLException ex)
         {
         Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
         } catch (Exception ex)
         {
         Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        try
        {
            utils.Utilidades.borrar("TFinca", jtbFinca);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarFincaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_formFocusGained
    {//GEN-HEADEREND:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jteNombreBuscarFincaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteNombreBuscarFincaKeyTyped
    {//GEN-HEADEREND:event_jteNombreBuscarFincaKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteNombreBuscarFincaKeyTyped

    private void jteLocalizacionBuscarFincaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteLocalizacionBuscarFincaKeyTyped
    {//GEN-HEADEREND:event_jteLocalizacionBuscarFincaKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteLocalizacionBuscarFincaKeyTyped

    private void jteDescripcionBuscarFincaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jteDescripcionBuscarFincaKeyTyped
    {//GEN-HEADEREND:event_jteDescripcionBuscarFincaKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jteDescripcionBuscarFincaKeyTyped
    public void crear() throws ClassNotFoundException, SQLException
    {
        ConexionBBDD c = new ConexionBBDD();
        ResultSet rs = c.hacerConsulta("SELECT * FROM TFinca;");
        modelo = (DefaultTableModel) this.jtbFinca.getModel();
        ResultSetMetaData rsmd = rs.getMetaData();

        int cantidadColumnas = rsmd.getColumnCount();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        for (int i = 1; i <= cantidadColumnas; i++)
        {
            modelo.addColumn(rsmd.getColumnLabel(i));
        }
        while (rs.next())
        {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++)
            {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
        rs.close();
    }

    //Actualizar en las busquedas
    void buscarFiltro() throws SQLException, Exception
    {
        String descripcion = jteDescripcionBuscarFinca.getText();
        String localizacion = jteLocalizacionBuscarFinca.getText();
        String nombre = jteNombreBuscarFinca.getText();
        //select * from TPersonas WHERE Apellido1 LIKE '
        this.jtbFinca = utils.Utilidades.rellenarJTable(
                "SELECT * FROM TFinca WHERE Nombre LIKE \'%" + nombre
                + "%\' AND Localizacion LIKE \'%" + localizacion
                + "%\' AND Descripcion LIKE \'%" + descripcion + "%\' ;", jtbFinca);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaFinca;
    private javax.swing.JButton btnEliminarFinca;
    private javax.swing.JButton btnModificarFinca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbFinca;
    private javax.swing.JTextField jteDescripcionBuscarFinca;
    private javax.swing.JTextField jteLocalizacionBuscarFinca;
    private javax.swing.JTextField jteNombreBuscarFinca;
    // End of variables declaration//GEN-END:variables
}
