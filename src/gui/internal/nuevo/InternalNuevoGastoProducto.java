/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal.nuevo;

import conexion.ConexionBBDD;
import gui.internal.InternalTCultivar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author david
 */
public class InternalNuevoGastoProducto extends javax.swing.JInternalFrame
{

    int id;
    boolean modificar = false;
    JTable jtbGastoProducto;

    public InternalNuevoGastoProducto(JTable jtbGastoProducto)
    {
        initComponents();
        this.jtbGastoProducto = jtbGastoProducto;
    }

    public InternalNuevoGastoProducto(JTable jtbGastoProducto, int id)
    {
        initComponents();
        this.jtbGastoProducto = jtbGastoProducto;
        this.id = id;
        modificar = true;
        rellenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateFactura = new com.toedter.calendar.JDateChooser();
        jtfProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBucarCultivar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCultivar = new javax.swing.JLabel();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Fecha factura");

        jtfProveedor.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfProveedorKeyTyped(evt);
            }
        });

        jLabel2.setText("Proveedor");

        jLabel3.setText("Descripción");

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

        jLabel4.setText("Cantidad");

        jLabel5.setText("Total");

        jLabel6.setText("Cultivar");

        btnBucarCultivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBucarCultivar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBucarCultivarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnBucarCultivar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfProveedor)
                                .addComponent(jtfCantidad)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jtfTotal)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnBucarCultivar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBucarCultivarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBucarCultivarActionPerformed
    {//GEN-HEADEREND:event_btnBucarCultivarActionPerformed
        try
        {
            InternalTCultivar internal = new InternalTCultivar(lblCultivar);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 700, 400);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBucarCultivarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        String fecha = null, proveedor = null, descripcion = null;
        float cantidad = 0, total = 0;
        int idCultivar = 0;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        boolean error = false;
        if (modificar)
        {
            try
            {
                fecha = formatoFecha.format(dateFactura.getDate());
                proveedor = jtfProveedor.getText().toString();
                descripcion = jtaDescripcion.getText().toString();
                cantidad = Float.parseFloat(jtfCantidad.getText().toString());
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe introducir todo los datos, los decimales son \'.\'");
                Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                error = true;
            }
            if (!error) // Se ha producido un error y no debe cerrarse, ni lanzar la conexión a la BBDD
            {
                try
                {
                    String SQL = "UPDATE TGastoProducto  SET FechaFatura = \'"
                            + fecha + "\',Proveedor = \"" + proveedor + "\",Descripcion = \""
                            + descripcion + "\",Cantidad = \"" + cantidad + "\",Total = \""
                            + total + "\",IdCultivar = \"" + idCultivar + "\" WHERE Id = \"" + id + "\";";
                    ConexionBBDD c = new ConexionBBDD();
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtbGastoProducto, "TGastoProducto");
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else
        {
            try
            {
                fecha = formatoFecha.format(dateFactura.getDate());
                proveedor = jtfProveedor.getText().toString();
                descripcion = jtaDescripcion.getText().toString();
                cantidad = Float.parseFloat(jtfCantidad.getText().toString());
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe introducir todo los datos, los decimales son \'.\'");
                Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                error = true;
            }
            if (!error) // Se ha producido un error y no debe cerrarse, ni lanzar la conexión a la BBDD
            {
                try
                {
                    String SQL = "INSERT INTO TGastoProducto (FechaFatura,Proveedor,Descripcion,Cantidad,Total,IdCultivar)  VALUES (\'"
                            + fecha + "\',\"" + proveedor + "\",\"" + descripcion + "\",\""
                            + cantidad + "\",\"" + total + "\",\"" + idCultivar + "\");";
                    ConexionBBDD c = new ConexionBBDD();
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtbGastoProducto, "TGastoProducto");
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtfProveedorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfProveedorKeyTyped
    {//GEN-HEADEREND:event_jtfProveedorKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtfProveedor, 20);
    }//GEN-LAST:event_jtfProveedorKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtaDescripcion, 100);
    }//GEN-LAST:event_jtaDescripcionKeyTyped
    public void rellenar()
    {
        try
        {

            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TGastoProducto WHERE Id = \"" + id + "\";";
            System.out.println(SQL);
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();
            dateFactura.setDate(rs.getDate("FechaFatura"));
            jtfProveedor.setText(rs.getString("Proveedor"));
            jtaDescripcion.setText(rs.getString("Descripcion"));
            jtfCantidad.setText(rs.getFloat("Cantidad") + "");
            jtfTotal.setText(rs.getFloat("Total") + "");
            lblCultivar.setText(rs.getInt("IdCultivar") + "");
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoGastoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBucarCultivar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfProveedor;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JLabel lblCultivar;
    // End of variables declaration//GEN-END:variables
}
