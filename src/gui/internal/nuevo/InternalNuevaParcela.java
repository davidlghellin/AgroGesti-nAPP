package gui.internal.nuevo;

import conexion.ConexionBBDD;
import gui.internal.InternalTFinca;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class InternalNuevaParcela extends javax.swing.JInternalFrame
{
    /*
     IdParcela       VARCHAR(20)     PRIMARY KEY,
     IdFinca         VARCHAR(20)     NOT NULL,
     Descripcion     VARCHAR(100)    NOT NULL,
     */

    javax.swing.JTable jtbParcela;
    String id;
    boolean modificar = false;

    
    public InternalNuevaParcela(javax.swing.JTable jtbParcela)
    {
        initComponents();

        //  rellenarCombo();
        modificar = false;
        this.jtbParcela = jtbParcela;
        jtfINombredParcela.setEditable(true);
    }

    public InternalNuevaParcela(javax.swing.JTable jtbParcela, String id)
    {
        initComponents();
        modificar = true;
        this.jtbParcela = jtbParcela;
        this.id = id;
        jtfINombredParcela.setEditable(false);
        rellenarCampos();
        jtfINombredParcela.setBackground(new Color(200, 200, 200));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptarNueva = new javax.swing.JButton();
        jtfINombredParcela = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcionNuevo = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        lblFinca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setVisible(true);

        jLabel1.setText("Nombre");

        jLabel2.setText("Finca");

        jLabel3.setText("Descripción");

        btnAceptarNueva.setText("Aceptar");
        btnAceptarNueva.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarNuevaActionPerformed(evt);
            }
        });

        jtfINombredParcela.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfINombredParcelaKeyTyped(evt);
            }
        });

        jtaDescripcionNuevo.setColumns(20);
        jtaDescripcionNuevo.setLineWrap(true);
        jtaDescripcionNuevo.setRows(5);
        jtaDescripcionNuevo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtaDescripcionNuevoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcionNuevo);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
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
                        .addComponent(btnAceptarNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jtfINombredParcela)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfINombredParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar)
                    .addComponent(lblFinca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarNueva)
                    .addComponent(jButton2))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAceptarNuevaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarNuevaActionPerformed
    {//GEN-HEADEREND:event_btnAceptarNuevaActionPerformed
        String nombreParcela = (String) jtfINombredParcela.getText().toString();
        String descripcion = (String) jtaDescripcionNuevo.getText().toString();
        String finca = (String) lblFinca.getText().toString();
        ConexionBBDD c = null;
        if (nombreParcela.equals("") || descripcion.equals("") || finca.equals(""))
        {
            JOptionPane.showMessageDialog(this.getParent(), "Tiene que insertar nombre y descripción y selecionar finca asociada");
        } else
        {
            if (modificar)//modificar datos ==> distinto sql
            {
                try
                {
                    c = new ConexionBBDD();
                    String SQL = "UPDATE TParcela SET IdFinca = \"" + finca
                            + "\", Descripcion =\"" + descripcion
                            + "\" WHERE IdParcela = \"" + id + "\";";
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    jtbParcela = utils.UtilisSql.rellenarJTable("SELECT * FROM TParcela;", jtbParcela);
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else
            {
                try
                {
                    c = new ConexionBBDD();
                // String SQL = "INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES (\""
                    //         + NombreParcela + "\",\"" + Finca + "\",\"" + Descripcion + "\")";
                    // System.out.println(SQL);
                    c.hacerInsercion("INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES (\""
                            + nombreParcela + "\",\"" + finca + "\",\"" + descripcion + "\")");
                    c.cerrarConexion();
                    jtbParcela = utils.UtilisSql.rellenarJTable("SELECT * FROM TParcela;", jtbParcela);
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnAceptarNuevaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        try
        {
            InternalTFinca internal = new InternalTFinca(lblFinca);
            this.getParent().add(internal);
            internal.moveToFront();
            utils.UtilsFrame.centrar(internal, 700, 400);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtfINombredParcelaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfINombredParcelaKeyTyped
    {//GEN-HEADEREND:event_jtfINombredParcelaKeyTyped
       utils.UtilsTamanyo.maxTamanyo( jtfINombredParcela, 20);
    }//GEN-LAST:event_jtfINombredParcelaKeyTyped

    private void jtaDescripcionNuevoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionNuevoKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionNuevoKeyTyped
        utils.UtilsTamanyo.maxTamanyo( jtaDescripcionNuevo, 100);
    }//GEN-LAST:event_jtaDescripcionNuevoKeyTyped

   private void rellenarCampos()
    {
        try
        {
            //  rellenarCombo();
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TParcela WHERE IdParcela = \"" + id + "\";";
            ResultSet rs = c.hacerConsulta(SQL);
            rs.next();

            jtfINombredParcela.setText(id);
            jtaDescripcionNuevo.setText(rs.getString("Descripcion"));
            lblFinca.setText(rs.getString("IdFinca"));

            c.cerrarConexion();
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevaParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarNueva;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescripcionNuevo;
    private javax.swing.JTextField jtfINombredParcela;
    private javax.swing.JLabel lblFinca;
    // End of variables declaration//GEN-END:variables
}
