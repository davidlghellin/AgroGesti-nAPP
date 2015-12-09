package gui.internal;

import gui.internal.nuevo.InternalNuevoIngresoOtro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class InternalTIngresoOtro extends javax.swing.JInternalFrame
{

    public InternalTIngresoOtro() throws SQLException, Exception
    {
        initComponents();
        this.jtbIngresoOtro = utils.Utilidades.rellenarJTable("SELECT * FROM TIngresoOtro;", jtbIngresoOtro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbIngresoOtro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbtAlta = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jtbIngresoOtro.setAutoCreateRowSorter(true);
        jtbIngresoOtro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbIngresoOtro);

        jbtAlta.setText("Alta");
        jbtAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbtAltaActionPerformed(evt);
            }
        });

        jbtModificar.setText("Modifcación");
        jbtModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbtModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtModificar)
                .addGap(59, 59, 59)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAlta)
                    .addComponent(jbtModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtAltaActionPerformed
    {//GEN-HEADEREND:event_jbtAltaActionPerformed
        InternalNuevoIngresoOtro internal = new InternalNuevoIngresoOtro(jtbIngresoOtro);
        this.getParent().add(internal);
        utils.UtilsFrame.centrar(internal);
        internal.toFront();
    }//GEN-LAST:event_jbtAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.Utilidades.borrar("TIngresoOtro", jtbIngresoOtro, 1);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTIngresoOtro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtModificarActionPerformed
    {//GEN-HEADEREND:event_jbtModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAlta;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JTable jtbIngresoOtro;
    // End of variables declaration//GEN-END:variables
}
