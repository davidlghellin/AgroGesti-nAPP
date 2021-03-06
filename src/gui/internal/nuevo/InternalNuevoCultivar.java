package gui.internal.nuevo;

import conexion.ConexionBBDD;
import gui.internal.InternalTParcela;
import gui.internal.InternalTVariedad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author David López González
 */
public class InternalNuevoCultivar extends javax.swing.JInternalFrame
{

    JTable jtable;
    int id;
    boolean modificar;

    /**
     * Creates new form InternalNuevoCultivar
     */
    public InternalNuevoCultivar(JTable jtb)
    {
        initComponents();
        this.jtable = jtb;
        modificar = false;

    }

    public InternalNuevoCultivar(JTable jtb, int id)
    {
        initComponents();
        this.jtable = jtb;
        modificar = true;
        this.id = id;
        rellenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        dateInicio = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateFin = new com.toedter.calendar.JDateChooser();
        jtfId = new javax.swing.JTextField();
        lblVariedad = new javax.swing.JLabel();
        lblParcela = new javax.swing.JLabel();
        btnBuscarVariedad = new javax.swing.JButton();
        btnBuscarParcela = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfUnidades = new javax.swing.JTextField();

        setClosable(true);
        setVisible(true);

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

        jLabel1.setText("Identificador");

        jLabel2.setText("Fecha inicio");

        jLabel3.setText("Fecha fin");

        jLabel4.setText("Variedad");

        jLabel5.setText("Parcela");

        jtfId.setEditable(false);
        jtfId.setBackground(new java.awt.Color(200, 200, 200));

        btnBuscarVariedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarVariedad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarVariedadActionPerformed(evt);
            }
        });

        btnBuscarParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarParcela.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarParcelaActionPerformed(evt);
            }
        });

        jLabel6.setText("Unidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(61, 61, 61))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfId)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscarVariedad)
                                        .addComponent(btnBuscarParcela, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(jtfUnidades))))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVariedad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnBuscarVariedad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnBuscarParcela))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
        Date fInicio, fFin;
        String strInicio = null;
        String strFin = null;
        String variedad, parcela;
        int unidades = -1;

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        if (modificar)
        {
            fInicio = dateInicio.getDate();
            fFin = dateFin.getDate();
            try
            {
                strInicio = formatoFecha.format(fInicio);
                strFin = formatoFecha.format(fFin);
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe selecionar las fechas");
                Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                unidades = Integer.parseInt(jtfUnidades.getText().toString());
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Introduzca números en el campo unidades");
                Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
            }

            try
            {
                strInicio = formatoFecha.format(dateInicio.getDate());
                strFin = formatoFecha.format(dateFin.getDate());
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe selecionar las fechas correctas");
                Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (fInicio.after(fFin))    //las fechas no están bien introdcidas
            {
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe selecionar las fechas correctas");
            } else if (unidades <= 0)
            {
                JOptionPane.showMessageDialog(this.getParent(), "Tiene que introducir números válidos (mayores que 0)");
            } else
            {
                String SQL = "UPDATE TCultivar SET FechaInicio = \'" + strInicio
                        + "\', FechaFin = \'" + strFin
                        + "\', IdVariedad = \"" + lblVariedad.getText().toString()
                        + "\", IdParcela = \"" + lblParcela.getText().toString()
                        + "\", Unidades = \"" + unidades
                        + "\" WHERE Id = \"" + id + "\";";
                try
                {
                    c = new ConexionBBDD();
                    System.out.println(SQL);
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else
        {
            fInicio = dateInicio.getDate();
            fFin = dateFin.getDate();

            {
                try
                {
                    strInicio = formatoFecha.format(fInicio);
                    strFin = formatoFecha.format(fFin);
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe selecionar las fechas");
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                }
                variedad = lblVariedad.getText().toString();
                parcela = lblParcela.getText().toString();
                try
                {
                    unidades = Integer.parseInt(jtfUnidades.getText().toString());
                } catch (Exception ex)
                {
                    JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Introduzca números en el campo unidades");
                    Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (fInicio.after(fFin))    //las fechas no están bien introdcidas
                {
                    JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe selecionar las fechas correctas");
                } else if (variedad.equals("") || parcela.equals(""))
                {
                    JOptionPane.showMessageDialog(this.getParent(), "Tiene que introducir la varieda  parcela");
                } else if (unidades <= 0)
                {
                    JOptionPane.showMessageDialog(this.getParent(), "Tiene que introducir números válidos (mayores que 0)");
                } else
                {
                    String SQL = "INSERT INTO TCultivar (FechaInicio,FechaFin,IdVariedad,IdParcela,Unidades) VALUES (\'"
                            + strInicio + "\',\'" + strFin + "\',\"" + variedad + "\",\"" + parcela + "\",\"" + unidades + "\");";
                    try
                    {
                        c = new ConexionBBDD();
                        c.hacerInsercion(SQL);
                        c.cerrarConexion();
                        dispose();
                    } catch (ClassNotFoundException ex)
                    {
                        Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex)
                    {
                        Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

        try // Actualizamos el Jtable
        {
            utils.UtilisSql.actualizarJtable(jtable, "TCultivar");
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarVariedadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarVariedadActionPerformed
    {//GEN-HEADEREND:event_btnBuscarVariedadActionPerformed
        try
        {
            InternalTVariedad internal = new InternalTVariedad(lblVariedad);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 700, 500);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarVariedadActionPerformed

    private void btnBuscarParcelaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarParcelaActionPerformed
    {//GEN-HEADEREND:event_btnBuscarParcelaActionPerformed
        try
        {
            InternalTParcela internal = new InternalTParcela(lblParcela);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 700, 500);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarParcelaActionPerformed
    private void rellenarCampos()
    {
        try
        {
            //rellenarCombo();
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TCultivar WHERE Id = \"" + id + "\";";
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();
            jtfId.setText(rs.getInt(1) + "");
            dateInicio.setDate(rs.getDate("FechaInicio"));
            dateFin.setDate(rs.getDate("FechaFin"));
            jtfUnidades.setText(rs.getInt("Unidades") + "");

            // Marcamos los seleccionados
            String SQLRellenar = "SELECT IdVariedad, IdParcela  FROM TCultivar WHERE Id =\"" + id + "\";";
            ResultSet rs3 = c.hacerConsulta(SQLRellenar);
            rs3.next();
            lblVariedad.setText(rs3.getString(1));
            lblParcela.setText(rs3.getString(2));

            c.cerrarConexion();
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarParcela;
    private javax.swing.JButton btnBuscarVariedad;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfUnidades;
    private javax.swing.JLabel lblParcela;
    private javax.swing.JLabel lblVariedad;
    // End of variables declaration//GEN-END:variables
}
