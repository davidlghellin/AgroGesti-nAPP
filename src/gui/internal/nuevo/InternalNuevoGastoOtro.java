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
public class InternalNuevoGastoOtro extends javax.swing.JInternalFrame
{

    int id;
    JTable jtbTGastoOtro;
    boolean modificar = false;

    public InternalNuevoGastoOtro(JTable jtbTGastoOtro)
    {
        initComponents();
        this.jtbTGastoOtro = jtbTGastoOtro;
    }

    public InternalNuevoGastoOtro(JTable jtbTGastoOtro, int id)
    {
        initComponents();
        this.jtbTGastoOtro = jtbTGastoOtro;
        this.id = id;
        modificar = true;
        rellenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblCultivar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Fecha factura");

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

        jLabel2.setText("Descripción");

        jLabel3.setText("Total");

        jLabel4.setText("Cultivar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(lblCultivar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = null;
        String descripcion = null;
        float total = 0;
        int idCultivar = 0;
        ConexionBBDD c = null;
        boolean error = false;
        if (modificar)
        {
            try
            {
                fecha = formatoFecha.format(dateFecha.getDate());
                descripcion = jtaDescripcion.getText().toString();
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
            } catch (Exception e)
            {
                error = true;
                JOptionPane.showMessageDialog(this.getParent(), "Introduzca todos los datos");
            }
            if (!error)
            {
                String SQL = "UPDATE TGastoOtro SET FechaFatura =\'" + fecha + "\', Descripcion = \""
                        + descripcion + "\", Total = \"" + total + "\", IdCultivar = \""
                        + idCultivar + "\" WHERE Id = \"" + id + "\";";
                System.out.println(SQL);
                try
                {
                    c = new ConexionBBDD();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
                c.hacerInsercion(SQL);
                dispose();
                try
                {
                    utils.UtilisSql.actualizarJtable(jtbTGastoOtro, "TGastoOtro");
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else
        {
            try
            {
                fecha = formatoFecha.format(dateFecha.getDate());
                descripcion = jtaDescripcion.getText().toString();
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
            } catch (Exception e)
            {
                error = true;
                JOptionPane.showMessageDialog(this.getParent(), "Introduzca todos los datos");
            }
            if (!error)
            {
                String SQL = "INSERT INTO TGastoOtro (FechaFatura,Descripcion,Total,IdCultivar) VALUES (\'"
                        + fecha + "\',\"" + descripcion + "\",\""
                        + total + "\",\"" + idCultivar + "\");";
                try
                {
                    c = new ConexionBBDD();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
                c.hacerInsercion(SQL);
                dispose();
                try
                {
                    utils.UtilisSql.actualizarJtable(jtbTGastoOtro, "TGastoOtro");
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            InternalTCultivar internal = new InternalTCultivar(lblCultivar);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal, 800, 400);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionKeyTyped
        utils.UtilsTamanyo.maxTamanyo(jtaDescripcion, 100);
    }//GEN-LAST:event_jtaDescripcionKeyTyped
    private void rellenar()
    {
        try
        {
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TGastoOtro WHERE Id = \"" + id + "\";";
            System.out.println(SQL);
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();
            dateFecha.setDate(rs.getDate("FechaFatura"));
            jtaDescripcion.setText(rs.getString("Descripcion"));
            jtfTotal.setText(rs.getFloat("Total") + "");
            lblCultivar.setText(rs.getInt("IdCultivar") + "");

            c.cerrarConexion();
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoGastoOtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JLabel lblCultivar;
    // End of variables declaration//GEN-END:variables
}
