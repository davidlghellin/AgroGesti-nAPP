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
 * @author David López González
 */
public class InternalNuevoIngresoVenta extends javax.swing.JInternalFrame
{

    JTable jtable;
    int id;
    boolean modificar;

    public InternalNuevoIngresoVenta(JTable jtb)
    {
        try
        {
            initComponents();
            this.jtable = jtb;
            modificar = false;
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public InternalNuevoIngresoVenta(JTable jtb, int id)
    {
        try
        {
            initComponents();
            this.jtable = jtb;
            modificar = true;
            this.id = id;
            rellenarCampos();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        dateIngreso = new com.toedter.calendar.JDateChooser();
        jtfCliente = new javax.swing.JTextField();
        jtfPrecioUnidad = new javax.swing.JTextField();
        jtfCantidad = new javax.swing.JTextField();
        jtfTotal = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCultivar = new javax.swing.JLabel();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Identificador");

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

        jLabel2.setText("Fecha");

        jLabel3.setText("Cliente");

        jLabel4.setText("Precio unidad");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Total");

        jLabel7.setText("Cultivar");

        jtfId.setEditable(false);
        jtfId.setBackground(new java.awt.Color(200, 200, 200));

        jtfCliente.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfClienteKeyTyped(evt);
            }
        });

        jtfPrecioUnidad.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfPrecioUnidadFocusLost(evt);
            }
        });

        jtfCantidad.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfCantidadFocusLost(evt);
            }
        });

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jtfId)
                            .addComponent(jtfCliente)
                            .addComponent(jtfPrecioUnidad)
                            .addComponent(jtfCantidad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(103, 103, 103))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addGap(98, 98, 98)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTotal)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        ConexionBBDD c = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = null;
        String nombre = null;
        float precioUnidad = 0;
        float cantidad = 0;
        float total = 0;
        int idCultivar = 0;
        boolean error = false;
        try
        {
            fecha = formatoFecha.format(dateIngreso.getDate());
            nombre = jtfCliente.getText().toString();
            precioUnidad = Float.parseFloat(jtfPrecioUnidad.getText().toString());
            cantidad = Float.parseFloat(jtfCantidad.getText().toString());
            // total = 0;
            idCultivar = Integer.parseInt(lblCultivar.getText().toString());
        } catch (Exception e)
        {
            error = true;
            JOptionPane.showMessageDialog(this.getParent(), "Tiene que rellenar todos los campos, recuerde que total es calculado");
        }
        if (!error)
        {
            if (modificar) //se modifican datos
            {

                try
                {
                    c = new ConexionBBDD();

                    //fecha = formatoFecha.format(dateIngreso.getDate());
                    //  precioUnidad = Float.parseFloat(jtfPrecioUnidad.getText().toString());
                    // cantidad = Float.parseFloat(jtfCantidad.getText().toString());
                    if (!jtfPrecioUnidad.getText().toString().equals("") && !jtfCantidad.getText().toString().equals(""))
                    {
                        total = precioUnidad * cantidad;
                    } else
                    {
                        total = Float.parseFloat(jtfTotal.getText().toString());
                    }
                    // idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                    String SQL = "UPDATE TIngresoVenta SET Fecha = \'" + fecha
                            + "\', NombreCliente = \"" + nombre + "\", PrecioUnidad = \""
                            + precioUnidad + "\", Cantidad = \"" + cantidad + "\", Total = \""
                            + total + "\", IdCultivar = \"" + idCultivar + "\" WHERE Id = \"" + id + "\";";
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtable, "TIngresoVenta");
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe introducir todos los datos, use \'.\' para los decimales");
                    Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else// nueva alta
            {

                try
                {
                    // fecha = formatoFecha.format(dateIngreso.getDate());
                    //nombre = jtfCliente.getText().toString();
                    // precioUnidad = Float.parseFloat(jtfPrecioUnidad.getText().toString());
                    // cantidad = Float.parseFloat(jtfCantidad.getText().toString());
                    if (!jtfPrecioUnidad.getText().toString().equals("") && !jtfCantidad.getText().toString().equals(""))
                    {
                        total = precioUnidad * cantidad;
                    } else
                    {
                        total = Float.parseFloat(jtfTotal.getText().toString());
                    }
                    //idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe introducir todos los datos, use \'.\' para los decimales");
                }
                String SQL = "INSERT INTO TIngresoVenta (Fecha,NombreCliente,PrecioUnidad,Cantidad,Total,IdCultivar) \n"
                        + "    VALUES (\'" + fecha + "\',\"" + nombre + "\",\""
                        + precioUnidad + "\",\"" + cantidad + "\",\"" + total + "\",\""
                        + idCultivar + "\");";
                System.out.println(SQL);
                try
                {
                    c = new ConexionBBDD();
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    dispose();
                    utils.UtilisSql.actualizarJtable(jtable, "TIngresoVenta");
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtfCantidadFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfCantidadFocusLost
    {//GEN-HEADEREND:event_jtfCantidadFocusLost
        if (!jtfPrecioUnidad.getText().toString().equals("") && !jtfCantidad.getText().toString().equals(""))
        {
            jtfTotal.setText(Float.parseFloat(jtfPrecioUnidad.getText().toString()) * Float.parseFloat(jtfCantidad.getText().toString()) + "");
        }
    }//GEN-LAST:event_jtfCantidadFocusLost

    private void jtfPrecioUnidadFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfPrecioUnidadFocusLost
    {//GEN-HEADEREND:event_jtfPrecioUnidadFocusLost
        if (!jtfPrecioUnidad.getText().toString().equals("") && !jtfCantidad.getText().toString().equals(""))
        {
            jtfTotal.setText(Float.parseFloat(jtfPrecioUnidad.getText().toString()) * Float.parseFloat(jtfCantidad.getText().toString()) + "");
        }
    }//GEN-LAST:event_jtfPrecioUnidadFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        try
        {
            InternalTCultivar internal = new InternalTCultivar(lblCultivar);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 800, 400);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtfClienteKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfClienteKeyTyped
    {//GEN-HEADEREND:event_jtfClienteKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtfCliente, 20);
    }//GEN-LAST:event_jtfClienteKeyTyped
    private void rellenarCampos()
    {
        try
        {
            // rellenarCombo();
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TIngresoVenta WHERE Id = \"" + id + "\";";
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();

            jtfId.setText(rs.getInt("Id") + "");
            dateIngreso.setDate(rs.getDate("Fecha"));
            jtfCliente.setText(rs.getString("NombreCliente"));
            jtfPrecioUnidad.setText(rs.getFloat("PrecioUnidad") + "");
            jtfCantidad.setText(rs.getFloat("Cantidad") + "");
            jtfTotal.setText(rs.getFloat("Total") + "");
            lblCultivar.setText(rs.getString("IdCultivar"));
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfPrecioUnidad;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JLabel lblCultivar;
    // End of variables declaration//GEN-END:variables
}
