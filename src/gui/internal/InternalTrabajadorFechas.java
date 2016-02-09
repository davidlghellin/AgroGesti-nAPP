package gui.internal;

import com.mysql.jdbc.Connection;
import conexion.ConexionBBDD;
import jasper.AbstractaJasperReports;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalTrabajadorFechas extends javax.swing.JInternalFrame
{

    /**
     * Vble con la que tenmos el dni del trabajador para hacer la consulta
     */
    private String dni = null;

    /**
     * Constructor que usaremos cuando solamente queramos trabajar con las
     * fechas
     */
    public InternalTrabajadorFechas()
    {
        initComponents();
    }

    /**
     * Constructor que usaremos cuando queramos trabajar con una persona
     *
     * @param dni
     */
    public InternalTrabajadorFechas(String dni)
    {
        this.dni = dni;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        dateInicio = new com.toedter.calendar.JDateChooser();
        dateFin = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setVisible(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(378, 150));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("entre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        try
        {
            String strInicio = null;
            String strFin = null;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fInicio = dateInicio.getDate();
            Date fFin = dateFin.getDate();
            try
            {
                strInicio = formatoFecha.format(fInicio);
                strFin = formatoFecha.format(fFin);
            } catch (Exception ex)
            {
                JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe selecionar las fechas");
                Logger.getLogger(InternalTrabajadorFechas.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (dni != null)//usado para cuando tenemos dni--> viene de persona
            {

                if (fInicio.after(fFin))    //las fechas no están bien introdcidas
                {
                    JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe selecionar las fechas correctas");
                } else
                {
                    ConexionBBDD conn = new ConexionBBDD();
                    HashMap<String, Object> parametros = new HashMap<String, Object>();
                    parametros.put("dni", dni);
                    parametros.put("fechaAntes", strInicio);
                    parametros.put("fechaFin", strFin);

                    String sql = "SELECT SUM(Total)\n"
                            + "FROM TGastosManoObra \n"
                            + "WHERE DNI='" + dni + "' \n"
                            + "AND FechaFin BETWEEN \"" + strInicio + "\"  AND \"" + strFin + "\";";

                    ResultSet rs;
                    rs = conn.hacerConsulta(sql);
                    rs.next();

                    parametros.put("total", rs.getFloat(1));

                    AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c09_Landscape.jasper", parametros);
                    AbstractaJasperReports.verVisor();
                    conn.cerrarConexion();
                    this.dispose();
                }
            } else
            {
                if (fInicio.after(fFin))    //las fechas no están bien introdcidas
                {
                    JOptionPane.showInternalMessageDialog(this.getRootPane(), "Debe selecionar las fechas correctas");
                } else
                {
                    ConexionBBDD conn = new ConexionBBDD();
                    HashMap<String, Object> parametros = new HashMap<String, Object>();
                    parametros.put("fechaAntes", strInicio);
                    parametros.put("fechaDespues", strFin);
                    System.out.println(strInicio);
                    System.out.println(strFin);
                    AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c11_A4.jasper", parametros);
                    AbstractaJasperReports.verVisor();
                    conn.cerrarConexion();
                    this.dispose();
                }
            }
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalTrabajadorFechas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTrabajadorFechas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
