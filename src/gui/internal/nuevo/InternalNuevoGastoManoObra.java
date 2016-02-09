package gui.internal.nuevo;

import conexion.ConexionBBDD;
import gui.internal.InternalTCultivar;
import gui.internal.InternalTTrabajador;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author David López González
 */
public class InternalNuevoGastoManoObra extends javax.swing.JInternalFrame
{

    JTable jtbGastoManoObra;
    int id;
    boolean modificar = false;

    public InternalNuevoGastoManoObra(JTable jtbGastoManoObra)
    {
        initComponents();
        modificar = false;
        this.jtbGastoManoObra = jtbGastoManoObra;
    }

    public InternalNuevoGastoManoObra(JTable jtbGastoManoObra, int id) throws Exception
    {
        initComponents();
        this.id = id;
        this.jtbGastoManoObra = jtbGastoManoObra;
        modificar = true;
        rellenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        dateInicio = new com.toedter.calendar.JDateChooser();
        dateFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox();
        jtfCantidadTipo = new javax.swing.JTextField();
        jtfPrecioTipo = new javax.swing.JTextField();
        jtfTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        lblDNI = new javax.swing.JLabel();
        btnBuscarDNI = new javax.swing.JButton();
        btnBuscarCultivar = new javax.swing.JButton();
        lblCultivar = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Fecha inicio");

        jLabel2.setText("Fecha fin");

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

        jLabel3.setText("Categoria");

        jLabel4.setText("DNI");

        jLabel5.setText("Tipo");

        jLabel6.setText("Cantidad tipo");

        jLabel7.setText("Precio tipo");

        jLabel8.setText("Total");

        jLabel9.setText("Descripción");

        jLabel10.setText("Cultivar");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dias", "Horas" }));

        jtfCantidadTipo.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfCantidadTipoFocusLost(evt);
            }
        });

        jtfPrecioTipo.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jtfPrecioTipoFocusLost(evt);
            }
        });

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

        btnBuscarDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        btnBuscarCultivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarCultivar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarCultivarActionPerformed(evt);
            }
        });

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fumigar", "Labrar", "Podar", "Recolectar", "Regar", "Sembrar", "Otros" }));
        jcbCategoria.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfCantidadTipo)
                                    .addComponent(jtfPrecioTipo)
                                    .addComponent(jtfTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCultivar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarDNI)
                    .addComponent(lblDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCantidadTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfPrecioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
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
        String fechaInicio = null, fechaFin = null;
        Date fInicio, fFin;
        String categoria;
        String dni;
        String tipo = null;
        float cantidadTipo, precioTipo, total;
        String descripcion;
        int idCultivar;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        if (modificar)  // modificamos
        {
            try
            {
                fInicio = dateInicio.getDate();
                fFin = dateFin.getDate();
                //obtener variables, TODO agrupar en un método
                try
                {
                    fechaInicio = formatoFecha.format(dateInicio.getDate());
                    fechaFin = formatoFecha.format(dateFin.getDate());
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe selecionar las fechas");
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                }
                dni = lblDNI.getText().toString();
                categoria = jcbCategoria.getSelectedItem().toString();
                cantidadTipo = Float.parseFloat(jtfCantidadTipo.getText().toString());
                precioTipo = Float.parseFloat(jtfPrecioTipo.getText().toString());
                total = Float.parseFloat(jtfTotal.getText().toString());
                descripcion = jtaDescripcion.getText().toString();
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                tipo = jcbTipo.getSelectedItem().toString();

                if (fInicio.after(fFin))    //las fechas no están bien introdcidas
                {
                    JOptionPane.showInternalMessageDialog(jtbGastoManoObra.getRootPane(), "Debe selecionar las fechas correctas");
                } else
                {
                    String SQL = "UPDATE TGastosManoObra SET FechaInicio = \'" + fechaInicio
                            + "\', FechaFin =\'" + fechaFin + "\' ,Categoria = \"" + categoria + "\","
                            + " DNI = \"" + dni + "\", Tipo =\"" + tipo + "\", CantidadTipo = \"" + cantidadTipo
                            + "\",PrecioTipo =\"" + precioTipo + "\",Total =\"" + total + "\",Descripcion =\"" + descripcion
                            + "\", IdCultivar = \"" + idCultivar
                            + "\" WHERE Id = \"" + id + "\";";

                    System.out.println(SQL);
                    c = new ConexionBBDD();
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    this.dispose();
                }
                try
                {
                    jtbGastoManoObra = utils.UtilisSql.rellenarJTable("SELECT * FROM TGastosManoObra;", jtbGastoManoObra);
                } catch (SQLException ex)
                {
                    Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            try
            {   //obtener variables, TODO agrupar en un método
                fInicio = dateInicio.getDate();
                fFin = dateFin.getDate();
                try
                {
                    fechaInicio = formatoFecha.format(dateInicio.getDate());
                    fechaFin = formatoFecha.format(dateFin.getDate());
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe selecionar las fechas");
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                }
                dni = lblDNI.getText().toString();
                categoria = jcbCategoria.getSelectedItem().toString();
                cantidadTipo = Float.parseFloat(jtfCantidadTipo.getText().toString());
                precioTipo = Float.parseFloat(jtfPrecioTipo.getText().toString());
                total = Float.parseFloat(jtfTotal.getText().toString());
                descripcion = jtaDescripcion.getText().toString();
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                tipo = jcbTipo.getSelectedItem().toString();

                if (fInicio.after(fFin))    //las fechas no están bien introdcidas
                {
                    JOptionPane.showInternalMessageDialog(jtbGastoManoObra.getRootPane(), "Debe selecionar las fechas correctas");
                } else
                {
                    String SQL = "INSERT INTO TGastosManoObra (FechaInicio,FechaFin,Categoria,DNI,Tipo,CantidadTipo,PrecioTipo,Total,Descripcion,IdCultivar) \n"
                            + " VALUES (\'" + fechaInicio + "\',\'" + fechaFin
                            + "\',\"" + categoria + "\",\"" + dni + "\",\"" + tipo
                            + "\",\"" + cantidadTipo + "\",\"" + precioTipo + "\",\""
                            + total + "\",\"" + descripcion + "\",\"" + idCultivar + "\");";
                    //System.out.println(SQL);
                    c = new ConexionBBDD();
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    this.dispose();
                }
            } catch (Exception e)
            {
                JOptionPane.showInternalMessageDialog(this, "Debe introducir todos los datos execto el id, use \'.\' para los decimales");
            }
            try
            {
                jtbGastoManoObra = utils.UtilisSql.rellenarJTable("SELECT * FROM TGastosManoObra;", jtbGastoManoObra);
            } catch (SQLException ex)
            {
                Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevoGastoManoObra.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarDNIActionPerformed
    {//GEN-HEADEREND:event_btnBuscarDNIActionPerformed
        try
        {
            InternalTTrabajador internal = new InternalTTrabajador(lblDNI);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 800, 500);

        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoGastoManoObra.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void btnBuscarCultivarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarCultivarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarCultivarActionPerformed
        try
        {
            InternalTCultivar internal = new InternalTCultivar(lblCultivar);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 700, 400);

        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoGastoManoObra.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoGastoManoObra.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarCultivarActionPerformed

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtaDescripcion, 300);
    }//GEN-LAST:event_jtaDescripcionKeyTyped

    private void jtfCantidadTipoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfCantidadTipoFocusLost
    {//GEN-HEADEREND:event_jtfCantidadTipoFocusLost
        if (!jtfCantidadTipo.getText().toString().equals("") && !jtfPrecioTipo.getText().toString().equals(""))
        {
            jtfTotal.setText(Float.parseFloat(jtfCantidadTipo.getText().toString()) * Float.parseFloat(jtfPrecioTipo.getText().toString()) + "");
        }
    }//GEN-LAST:event_jtfCantidadTipoFocusLost

    private void jtfPrecioTipoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jtfPrecioTipoFocusLost
    {//GEN-HEADEREND:event_jtfPrecioTipoFocusLost
        if (!jtfCantidadTipo.getText().toString().equals("") && !jtfPrecioTipo.getText().toString().equals(""))
        {
            jtfTotal.setText(Float.parseFloat(jtfCantidadTipo.getText().toString()) * Float.parseFloat(jtfPrecioTipo.getText().toString()) + "");
        }
    }//GEN-LAST:event_jtfPrecioTipoFocusLost

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jcbCategoriaActionPerformed
    {//GEN-HEADEREND:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed
    public void rellenarCampos() throws SQLException, Exception
    {
        try
        {
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TGastosManoObra WHERE Id = \"" + id + "\";";
            System.out.println(SQL);
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();

            dateInicio.setDate(rs.getDate("FechaInicio"));
            dateFin.setDate(rs.getDate("FechaFin"));
            jcbCategoria.getModel().setSelectedItem(rs.getString("Categoria"));
            lblDNI.setText(rs.getString("DNI"));
            jcbTipo.getModel().setSelectedItem(rs.getString("Tipo"));
            jtfCantidadTipo.setText(rs.getFloat("CantidadTipo") + "");
            jtfPrecioTipo.setText(rs.getFloat("PrecioTipo") + "");
            jtfTotal.setText(rs.getFloat("Total") + "");
            jtaDescripcion.setText(rs.getString("Descripcion"));
            lblCultivar.setText(rs.getString("IdCultivar"));
            c.cerrarConexion();

        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevaFinca.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarCultivar;
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JComboBox jcbTipo;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfCantidadTipo;
    private javax.swing.JTextField jtfPrecioTipo;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JLabel lblCultivar;
    private javax.swing.JLabel lblDNI;
    // End of variables declaration//GEN-END:variables
}
