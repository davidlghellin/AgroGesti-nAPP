/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal.nuevo;

import conexion.ConexionBBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author david
 */
public class InternalNuevaVariedad extends javax.swing.JInternalFrame
{

    JTable jTable;
    String id;
    boolean modificar;

    /**
     * Creates new form InternalNuevaVariedad
     */
    public InternalNuevaVariedad(JTable jt)
    {
        initComponents();
        modificar = false;
        jTable = jt;
        jtfNombre.setEditable(true);
        rellenarCombo();
    }

    public InternalNuevaVariedad(JTable jt, String id)
    {
        initComponents();
        modificar = true;
        jTable = jt;
        jtfNombre.setEditable(false);
        this.id = id;
        rellenarCombo();
        jtfNombre.setText(id);
        // TODO no funciona
        // XXX
       jcbTipo.setSelectedIndex(3);
          // jcbTipo.setSelectedItem(id);
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

        jPanel1 = new javax.swing.JPanel();
        btnCancelarVariedad = new javax.swing.JButton();
        btnAceptarVariedad = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setVisible(true);

        btnCancelarVariedad.setText("Cancelar");
        btnCancelarVariedad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarVariedadActionPerformed(evt);
            }
        });

        btnAceptarVariedad.setText("Aceptar");
        btnAceptarVariedad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarVariedadActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo");

        jLabel1.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptarVariedad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(btnCancelarVariedad))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbTipo, 0, 259, Short.MAX_VALUE)
                            .addComponent(jtfNombre))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVariedad)
                    .addComponent(btnAceptarVariedad))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarVariedadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarVariedadActionPerformed
    {//GEN-HEADEREND:event_btnAceptarVariedadActionPerformed
        String nombre = jtfNombre.getText().toString();
        String tipo = (String) jcbTipo.getSelectedItem();

        ConexionBBDD c = null;
        if (modificar)
        {
            try
            {
                c = new ConexionBBDD();
                String SQL = "UPDATE TVariedad SET IdTipo = \"" + tipo + "\" WHERE Nombre = \"" + id + "\";";
                System.out.println(SQL);
                c.hacerInsercion(SQL);
                c.cerrarConexion();
                utils.Utilidades.actualizarJtable(jTable, "TVariedad");
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            try
            {
                c = new ConexionBBDD();
                String SQL = "INSERT INTO TVariedad (Nombre,IdTipo) VALUES (\"" + nombre + "\",\"" + tipo + "\");";
                c.hacerInsercion(SQL);
                c.cerrarConexion();
                utils.Utilidades.actualizarJtable(jTable, "TVariedad");
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dispose();
    }//GEN-LAST:event_btnAceptarVariedadActionPerformed

    private void btnCancelarVariedadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarVariedadActionPerformed
    {//GEN-HEADEREND:event_btnCancelarVariedadActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVariedadActionPerformed
    void rellenarCombo()
    {
        try
        {
            conexion.ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT Nombre FROM TTipo";
            ResultSet rs = c.hacerConsulta(SQL);
            while (rs.next())
            {
                jcbTipo.addItem(rs.getString("Nombre"));
            }
            c.cerrarConexion();
           
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarVariedad;
    private javax.swing.JButton btnCancelarVariedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}