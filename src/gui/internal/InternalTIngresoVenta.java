package gui.internal;

import conexion.ConexionBBDD;
import gui.internal.nuevo.InternalNuevoIngresoVenta;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author David López González
 */
public class InternalTIngresoVenta extends javax.swing.JInternalFrame
{

    JButton btnIngresoVenta;

    public InternalTIngresoVenta(JButton btnIngresoVenta) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.btnIngresoVenta = btnIngresoVenta;
        this.jtbIngresoVenta = utils.UtilisSql.rellenarJTable("SELECT * FROM TIngresoVenta;", jtbIngresoVenta);

        //Botones
        //Imagenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbIngresoVenta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateAntes = new com.toedter.calendar.JDateChooser();
        dateDespues = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfClienteBuscar = new javax.swing.JTextField();
        btnCobrado = new javax.swing.JButton();
        btnNoCobrado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingreso venta");
        setMaximumSize(new java.awt.Dimension(1080, 900));
        setPreferredSize(new java.awt.Dimension(700, 403));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });

        jtbIngresoVenta.setAutoCreateRowSorter(true);
        jtbIngresoVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbIngresoVenta);

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Baja");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Antes");

        dateAntes.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                dateAntesPropertyChange(evt);
            }
        });

        dateDespues.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                dateDespuesPropertyChange(evt);
            }
        });

        jLabel2.setText("Después");

        jLabel3.setText("Cliente");

        jtfClienteBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfClienteBuscarKeyReleased(evt);
            }
        });

        btnCobrado.setText("Cobrado");
        btnCobrado.setToolTipText("Seleccione fila para marcar como cobrado");
        btnCobrado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCobradoActionPerformed(evt);
            }
        });

        btnNoCobrado.setText("No cobrado");
        btnNoCobrado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNoCobradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateAntes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(dateDespues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfClienteBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNoCobrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateAntes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDespues, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNoCobrado)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCobrado))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevoIngresoVenta internal = new InternalNuevoIngresoVenta(jtbIngresoVenta);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TIngresoVenta", jtbIngresoVenta, 1);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            int id = (int) jtbIngresoVenta.getValueAt(jtbIngresoVenta.getSelectedRow(), 0);
            InternalNuevoIngresoVenta internal = new InternalNuevoIngresoVenta(jtbIngresoVenta, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Seleccione fila a modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        btnIngresoVenta.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfClienteBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfClienteBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfClienteBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfClienteBuscarKeyReleased

    private void dateAntesPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_dateAntesPropertyChange
    {//GEN-HEADEREND:event_dateAntesPropertyChange
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateAntesPropertyChange

    private void dateDespuesPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_dateDespuesPropertyChange
    {//GEN-HEADEREND:event_dateDespuesPropertyChange
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateDespuesPropertyChange

    private void btnCobradoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCobradoActionPerformed
    {//GEN-HEADEREND:event_btnCobradoActionPerformed
        int[] filas = jtbIngresoVenta.getSelectedRows();
        if (filas.length == 0)
        {
            JOptionPane.showInternalMessageDialog(jtbIngresoVenta.getRootPane(), "Tiene que selecionar las filas a marcar como cobrado");
        } else
        {
            for (int f : filas)
            {
                if (!((String) jtbIngresoVenta.getValueAt(f, 7).toString()).equals("Cobrado"))
                {
                    int id = Integer.parseInt((String) jtbIngresoVenta.getValueAt(f, 0).toString());
                    String SQL = "UPDATE TIngresoVenta SET Cobrado = \"Cobrado\" WHERE Id = \"" + id + "\";";
                    try
                    {
                        ConexionBBDD c = new ConexionBBDD();
                        c.hacerInsercion(SQL);
                        c.cerrarConexion();
                        utils.UtilisSql.actualizarJtable(jtbIngresoVenta, "TIngresoVenta");
                    } catch (Exception ex)
                    {
                        Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(f + " : " + jtbIngresoVenta.getValueAt(f, 7) + " :" + jtbIngresoVenta.getValueAt(f, 0));
                }
            }
        }
    }//GEN-LAST:event_btnCobradoActionPerformed

    private void btnNoCobradoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNoCobradoActionPerformed
    {//GEN-HEADEREND:event_btnNoCobradoActionPerformed
        int[] filas = jtbIngresoVenta.getSelectedRows();
        if (filas.length == 0)
        {
            JOptionPane.showInternalMessageDialog(jtbIngresoVenta.getRootPane(), "Tiene que selecionar las filas a marcar como no cobrado");
        } else
        {
            for (int f : filas)
            {
                if (!((String) jtbIngresoVenta.getValueAt(f, 7).toString()).equals("No cobrado"))
                {
                    int id = Integer.parseInt((String) jtbIngresoVenta.getValueAt(f, 0).toString());
                    String SQL = "UPDATE TIngresoVenta SET Cobrado = \"No cobrado\" WHERE Id = \"" + id + "\";";
                    try
                    {
                        ConexionBBDD c = new ConexionBBDD();
                        c.hacerInsercion(SQL);
                        c.cerrarConexion();
                        utils.UtilisSql.actualizarJtable(jtbIngresoVenta, "TIngresoVenta");
                    } catch (Exception ex)
                    {
                        Logger.getLogger(InternalNuevoIngresoVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnNoCobradoActionPerformed
    private void buscarFiltro() throws SQLException, Exception
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String nombre = jtfClienteBuscar.getText().toString();
        String strInicio, strFin;
        try
        {
            strInicio = formatoFecha.format(dateAntes.getDate());

        } catch (Exception e)
        {
            strInicio = "2100-12-31";
        }
        try
        {
            strFin = formatoFecha.format(dateDespues.getDate());
        } catch (Exception e)
        {
            strFin = "1900-01-01";
        }
        this.jtbIngresoVenta = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TIngresoVenta WHERE NombreCliente LIKE \'%" + nombre + "%\' "
                + " AND Fecha <= \'" + strInicio + "\' "
                + " AND Fecha >= \'" + strFin + "\';", jtbIngresoVenta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnCobrado;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNoCobrado;
    private com.toedter.calendar.JDateChooser dateAntes;
    private com.toedter.calendar.JDateChooser dateDespues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbIngresoVenta;
    private javax.swing.JTextField jtfClienteBuscar;
    // End of variables declaration//GEN-END:variables
}
