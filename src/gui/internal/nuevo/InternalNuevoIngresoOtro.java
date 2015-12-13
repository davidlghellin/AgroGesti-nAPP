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
public class InternalNuevoIngresoOtro extends javax.swing.JInternalFrame
{
    /*
     Id              INT             PRIMARY KEY AUTO_INCREMENT,
     Fecha           DATE            NOT NULL,
     Procedencia     VARCHAR(20)     NOT NULL,
     Descripcion     VARCHAR(100)    NOT NULL,
     Total           FLOAT           NOT NULL,
     IdCultivar      INT             NOT NULL,
     */

    JTable jtable;
    int id;
    boolean modificar;

    public InternalNuevoIngresoOtro(JTable jtb)
    {
        initComponents();
        this.jtable = jtb;
        modificar = false;
        // rellenarCombo();
    }

    public InternalNuevoIngresoOtro(JTable jtb, int id) throws ClassNotFoundException, SQLException
    {
        initComponents();
        this.jtable = jtb;
        modificar = true;
        this.id = id;
        rellenar();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jtfProcedencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jtfTotal = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCultivar = new javax.swing.JLabel();

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

        jLabel2.setText("Fecha");

        jLabel3.setText("Procedencia");

        jLabel4.setText("Descripción");

        jLabel5.setText("Total");

        jLabel6.setText("Cultivar");

        jtfId.setEditable(false);
        jtfId.setBackground(new java.awt.Color(200, 200, 200));

        jtfProcedencia.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfProcedenciaKeyTyped(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(dateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfId)
                    .addComponent(jtfProcedencia)
                    .addComponent(jScrollPane1)
                    .addComponent(jtfTotal)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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
        String fecha = null;
        String procedencia = null, descripcion = null;
        float total = 0.f;
        int idCultivar = 0;
        boolean error = false;

        if (modificar)
        {
            try
            {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                fecha = formatoFecha.format(dateFecha.getDate());
                procedencia = jtfProcedencia.getText().toString();
                descripcion = jtaDescripcion.getText().toString();
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                error = false;
            } catch (Exception e)
            {
                error = true;
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe introducir todos los datos execto el id, use \'.\' para los decimales");
            }
            String SQL = "UPDATE  TIngresoOtro SET Fecha = \"" + fecha + "\", Procedencia = \""
                    + procedencia + "\" ,Descripcion = \"" + descripcion + "\", Total = \""
                    + total + "\", IdCultivar = \"" + idCultivar + "\" WHERE Id = \"" + id + "\";";
            if (!error)
            {
                try
                {
                    c = new ConexionBBDD();
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    utils.UtilisSql.actualizarJtable(jtable, "TIngresoOtro");
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else      // Alta ingreso
        {
            try
            {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                fecha = formatoFecha.format(dateFecha.getDate());
                procedencia = jtfProcedencia.getText().toString();
                descripcion = jtaDescripcion.getText().toString();
                total = Float.parseFloat(jtfTotal.getText().toString());
                idCultivar = Integer.parseInt(lblCultivar.getText().toString());
                error = false;
            } catch (Exception e)
            {
                error = true;
                JOptionPane.showInternalMessageDialog(jtable.getRootPane(), "Debe introducir todos los datos execto el id, use \'.\' para los decimales");
            }
            String SQL = "INSERT INTO TIngresoOtro (Fecha,Procedencia,Descripcion,Total,IdCultivar)  VALUES (\'"
                    + fecha + "\',\"" + procedencia + "\",\""
                    + descripcion + "\",\"" + total + "\",\""
                    + idCultivar + "\");";
            if (!error)
            {
                try
                {
                    c = new ConexionBBDD();
                    c.hacerInsercion(SQL);
                    c.cerrarConexion();
                    utils.UtilisSql.actualizarJtable(jtable, "TIngresoOtro");
                    dispose();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalNuevoIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtfProcedenciaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfProcedenciaKeyTyped
    {//GEN-HEADEREND:event_jtfProcedenciaKeyTyped
        utils.UtilsTamanyo.maxTamanyo( jtfProcedencia ,20);
    }//GEN-LAST:event_jtfProcedenciaKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtaDescripcionKeyTyped
    {//GEN-HEADEREND:event_jtaDescripcionKeyTyped
        utils.UtilsTamanyo.maxTamanyo( jtaDescripcion, 100);
    }//GEN-LAST:event_jtaDescripcionKeyTyped
    public void rellenar() throws ClassNotFoundException, SQLException
    {
        String SQL = "SELECT * FROM TIngresoOtro WHERE Id= \"" + id + "\";";
        ConexionBBDD c = new ConexionBBDD();
        ResultSet rs = c.hacerConsulta(SQL);
        rs.next();
        jtfId.setText(rs.getInt("Id")+"");
        dateFecha.setDate(rs.getDate("Fecha"));
        jtfProcedencia.setText(rs.getString("Procedencia"));
        jtaDescripcion.setText(rs.getString("Procedencia"));
        jtfTotal.setText(rs.getFloat("Total")+"");
        lblCultivar.setText(rs.getInt("IdCultivar")+"");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfProcedencia;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JLabel lblCultivar;
    // End of variables declaration//GEN-END:variables
}
