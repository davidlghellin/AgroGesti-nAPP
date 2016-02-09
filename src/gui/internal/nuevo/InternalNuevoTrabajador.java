package gui.internal.nuevo;

import conexion.ConexionBBDD;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author David López González
 */
public class InternalNuevoTrabajador extends javax.swing.JInternalFrame
{

    JTable jTable;
    String id;
    boolean modificar;

    public InternalNuevoTrabajador(JTable jt)
    {
        initComponents();
        modificar = false;
        jTable = jt;
        jtfDNI.setEditable(true);
    }

    public InternalNuevoTrabajador(JTable jt, String id)
    {

        initComponents();
        modificar = true;
        jTable = jt;
        this.id = id;
        jtfDNI.setEditable(false);
        jtfDNI.setBackground(new Color(200, 200, 200));
        jtfDNI.setText(id);
        try
        {
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT Nombre FROM TTrabajador WHERE DNI = \"" + id + "\";";
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();
            jtfNombre.setText(rs.getString("Nombre"));
            c.cerrarConexion();
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCCancelar = new javax.swing.JButton();
        jtfDNI = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jpasContrasenya = new javax.swing.JPasswordField();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCCancelar.setText("Cancelar");
        btnCCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCCancelarActionPerformed(evt);
            }
        });

        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfDNIKeyTyped(evt);
            }
        });

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Tipo");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "normal", "root" }));

        jLabel4.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpasContrasenya)
                            .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpasContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCCancelar))
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

    private void btnCCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        String dni = null;
        String nombre, tipo, contrasenya;
        ConexionBBDD c = null;
        if (modificar)
        {
            try
            {
                nombre = jtfNombre.getText().toString();                
                tipo = jcbTipo.getSelectedItem().toString();
                contrasenya = jpasContrasenya.getText().toString();
                c = new ConexionBBDD();
                String SQL = "UPDATE TTrabajador SET Nombre = \"" + nombre
                        + "\",Tipo = \""+ tipo + "\", Contrasenya = \""  + contrasenya + "\""
                        +" WHERE DNI = \"" + id + "\";";
                System.out.println(SQL);
                c.hacerInsercion(SQL);
                c.cerrarConexion();
                utils.UtilisSql.actualizarJtable(jTable, "TTrabajador");
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else
        {
            try
            {
                dni = jtfDNI.getText().toString();
                nombre = jtfNombre.getText().toString();
                tipo = jcbTipo.getSelectedItem().toString();
                contrasenya = jpasContrasenya.getText().toString();
                System.out.println(contrasenya);
                c = new ConexionBBDD();
                //INSERT INTO TTrabajador (DNI,Nombre,Tipo,Contrasenya) VALUES ("dni","name","root","pass");
                String SQL = "INSERT INTO TTrabajador (DNI,Nombre,Tipo,Contrasenya) VALUES (\""
                        + dni + "\",\""
                        + nombre + "\",\""
                        + tipo + "\",\""
                        + contrasenya + "\""
                        + ");";
                c.hacerInsercion(SQL);
                c.cerrarConexion();
                utils.UtilisSql.actualizarJtable(jTable, "TTrabajador");
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtfDNIKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDNIKeyTyped
    {//GEN-HEADEREND:event_jtfDNIKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtfDNI, 10);
    }//GEN-LAST:event_jtfDNIKeyTyped

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfNombreKeyTyped
    {//GEN-HEADEREND:event_jtfNombreKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtfNombre, 10);
    }//GEN-LAST:event_jtfNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JPasswordField jpasContrasenya;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
