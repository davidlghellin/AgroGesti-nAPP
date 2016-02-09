package gui.internal.nuevo;

import conexion.ConexionBBDD;
import gui.internal.InternalTFinca;
import gui.internal.InternalTTipo;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author David López González
 */
public class InternalNuevaVariedad extends javax.swing.JInternalFrame
{

    JTable jTable;
    String id;
    boolean modificar;

    public InternalNuevaVariedad(JTable jt)
    {
        initComponents();
        modificar = false;
        jTable = jt;
        jtfNombre.setEditable(true);
        // rellenarCombo();
    }

    public InternalNuevaVariedad(JTable jt, String id)
    {
        initComponents();
        modificar = true;
        jTable = jt;
        this.id = id;
        //   rellenarCombo();
        jtfNombre.setText(id);
        jtfNombre.setEditable(false);
        jtfNombre.setBackground(new Color(200, 200, 200));
        rellenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnCancelarVariedad = new javax.swing.JButton();
        btnAceptarVariedad = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
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

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Tipo");

        jLabel1.setText("Nombre");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });

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
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarVariedad)
                    .addComponent(btnCancelarVariedad))
                .addContainerGap())
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
        ConexionBBDD c = null;
        String nombre = jtfNombre.getText().toString();
        String tipo = lblTipo.getText().toString();
        if (nombre.equals("") || tipo.equals(""))
        {
            JOptionPane.showMessageDialog(this.getParent(), "Tiene que introducir nombre y seleccionar tipo");
        } else
        {
            if (modificar)
            {
                try
                {
                    c = new ConexionBBDD();
                    String SQL = "UPDATE TVariedad SET IdTipo = \"" + tipo + "\" WHERE Nombre = \"" + id + "\";";
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    utils.UtilisSql.actualizarJtable(jTable, "TVariedad");
                    dispose();
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
                    utils.UtilisSql.actualizarJtable(jTable, "TVariedad");
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnAceptarVariedadActionPerformed

    private void btnCancelarVariedadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarVariedadActionPerformed
    {//GEN-HEADEREND:event_btnCancelarVariedadActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarVariedadActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        try
        {
            InternalTTipo internal = new InternalTTipo(lblTipo);
            this.getParent().add(internal);
            internal.moveToFront();
            utils.UtilsFrame.centrar(internal, 700, 400);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevaVariedad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfNombreKeyTyped
    {//GEN-HEADEREND:event_jtfNombreKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtfNombre, 20);
    }//GEN-LAST:event_jtfNombreKeyTyped
    private void rellenar()
    {
        try
        {
            conexion.ConexionBBDD c = new ConexionBBDD();
            String SQLConsulta = "SELECT IdTipo FROM TVariedad WHERE Nombre = \"" + id + "\";";
            System.out.println(SQLConsulta);
            ResultSet rs = c.hacerConsulta(SQLConsulta);
            rs.next();
            lblTipo.setText(rs.getString(1));
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarVariedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
