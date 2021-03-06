package gui.internal.nuevo;

import conexion.ConexionBBDD;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalNuevoTipo extends javax.swing.JInternalFrame
{

    javax.swing.JTable jtbTipo;
    String id;
    boolean modificar;

    /**
     * Creates new form InternalNuevoTipo
     */
    public InternalNuevoTipo(javax.swing.JTable jTable)
    {
        initComponents();

        modificar = false;
        this.jtbTipo = jTable;
        jtfNombre.setEditable(true);
    }

    public InternalNuevoTipo(javax.swing.JTable jTable, String id)
    {
        initComponents();

        modificar = true;
        this.jtbTipo = jTable;
        this.id = id;
        jtfNombre.setEditable(false);
        jtfNombre.setBackground(new Color(200, 200, 200));
        rellenarCampo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        btnAceptarNueva = new javax.swing.JButton();
        btnCancelarNueva = new javax.swing.JButton();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Nombre");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Descripción");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        btnAceptarNueva.setText("Aceptar");
        btnAceptarNueva.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarNuevaActionPerformed(evt);
            }
        });

        btnCancelarNueva.setText("Cancelar");
        btnCancelarNueva.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarNuevaActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jtfNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptarNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnCancelarNueva)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarNueva)
                    .addComponent(btnAceptarNueva))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarNuevaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarNuevaActionPerformed
    {//GEN-HEADEREND:event_btnAceptarNuevaActionPerformed
        String nombre = jtfNombre.getText().toString();
        String descripcion = jtaDescripcion.getText().toString();
        if (nombre.equals("") || descripcion.equals(""))
        {
            JOptionPane.showMessageDialog(this.getParent(), "Tiene que introducir nombre y descripción");
        } else
        {
            if (modificar)//modificar datos ==> distinto sql
            {
                try
                {

                    ConexionBBDD c = null;
                    c = new ConexionBBDD();
                    String SQL = "UPDATE TTipo SET Descripcion = \"" + descripcion
                            + "\" WHERE Nombre = \"" + nombre + "\";";
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtbTipo, "TTipo");
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else
            {
                try
                {
                    ConexionBBDD c = null;
                    c = new ConexionBBDD();
                    String SQL = "INSERT INTO TTipo (Nombre,Descripcion) VALUES (\"" + nombre + "\",\"" + descripcion + "\")";
                    c.hacerInsercion(SQL);
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtbTipo, "TTipo");
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarNuevaActionPerformed

    private void btnCancelarNuevaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarNuevaActionPerformed
    {//GEN-HEADEREND:event_btnCancelarNuevaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNuevaActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfNombreKeyTyped
    {//GEN-HEADEREND:event_jtfNombreKeyTyped
        utils.UtilsTamanyo.maxTamanyo( jtfNombre, 20);
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionKeyTyped
       utils.UtilsTamanyo.maxTamanyo( jtaDescripcion, 300);
    }//GEN-LAST:event_jtaDescripcionKeyTyped

    private void rellenarCampo()
    {
        try
        {
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TTipo WHERE Nombre = \"" + id + "\";";
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();
            jtfNombre.setText(rs.getString("Nombre"));
            jtaDescripcion.setText(rs.getString("Descripcion"));
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarNueva;
    private javax.swing.JButton btnCancelarNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
