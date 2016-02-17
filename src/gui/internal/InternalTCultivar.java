package gui.internal;

import com.mysql.jdbc.Connection;
import conexion.ConexionBBDD;
import jasper.AbstractaJasperReports;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import gui.internal.nuevo.InternalNuevoCultivar;
import java.net.URL;

/**
 *
 * @author David López González
 */
public class InternalTCultivar extends javax.swing.JInternalFrame
{

    private JButton btnCultivar;
    private JLabel lblCultivar;

    public InternalTCultivar(JButton btnCultivar) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.jtbCultivar = utils.UtilisSql.rellenarJTable("SELECT * FROM TCultivar;", jtbCultivar);
        this.btnCultivar = btnCultivar;
        //Botones
        //Imagenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));

        btnSeleccionar.setVisible(false);
    }

    public InternalTCultivar(JLabel lblCultivar) throws ClassNotFoundException, SQLException, Exception
    {
        initComponents();
        this.jtbCultivar = utils.UtilisSql.rellenarJTable("SELECT * FROM TCultivar;", jtbCultivar);
        this.lblCultivar = lblCultivar;
        //Botones
        //Imágenes
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_01.png")));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_02.png")));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001_03.png")));
        // Visibles
        btnAlta.setVisible(false);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCultivar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAlta = new javax.swing.JButton();
        jtfVariedadBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfParcelaBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateAntes = new com.toedter.calendar.JDateChooser();
        dateDespues = new com.toedter.calendar.JDateChooser();
        btnSeleccionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmGastosManoObra = new javax.swing.JMenu();
        jmGastosPrductos = new javax.swing.JMenuItem();
        jmGastosOtros = new javax.swing.JMenuItem();
        jmIngresosVenta = new javax.swing.JMenuItem();
        jmIngresosOtros = new javax.swing.JMenuItem();
        jmResumenResultados = new javax.swing.JMenuItem();
        jmGastosPendientesAbonar = new javax.swing.JMenuItem();
        jmIngresosPendientesCobrar = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel2.setText("Parcela");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cultivar");
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

        jtbCultivar.setAutoCreateRowSorter(true);
        jtbCultivar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbCultivar);

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
            }
        });

        jtfVariedadBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfVariedadBuscarKeyTyped(evt);
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

        jLabel1.setText("Variedad");

        jtfParcelaBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfParcelaBuscarKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jtfParcelaBuscarKeyReleased(evt);
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

        jLabel3.setText("Antes de fecha inicio");

        jLabel4.setText("Después de fecha fin");

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
        dateDespues.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                dateDespuesKeyTyped(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel5.setText("Parcela");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateDespues, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfVariedadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfParcelaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfVariedadBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfParcelaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateDespues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateAntes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnSeleccionar))
                .addGap(18, 18, 18))
        );

        jmGastosManoObra.setText("Informes");

        jmGastosPrductos.setText("Gastos de mano de obra");
        jmGastosPrductos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmGastosPrductosActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmGastosPrductos);

        jmGastosOtros.setText("Gastos de productos");
        jmGastosOtros.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmGastosOtrosActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmGastosOtros);

        jmIngresosVenta.setText("Gastos variados / otros");
        jmIngresosVenta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmIngresosVentaActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmIngresosVenta);

        jmIngresosOtros.setText("Ingresos por venta");
        jmIngresosOtros.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmIngresosOtrosActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmIngresosOtros);

        jmResumenResultados.setText("Otros ingresos");
        jmResumenResultados.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmResumenResultadosActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmResumenResultados);

        jmGastosPendientesAbonar.setText("Resumen de resultados");
        jmGastosPendientesAbonar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmGastosPendientesAbonarActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmGastosPendientesAbonar);

        jmIngresosPendientesCobrar.setText("Gastos pendientes por abonar");
        jmIngresosPendientesCobrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jmIngresosPendientesCobrarActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jmIngresosPendientesCobrar);

        jMenuItem8.setText("Ingresos pendientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jmGastosManoObra.add(jMenuItem8);

        jMenuBar1.add(jmGastosManoObra);

        jMenu1.setText("Gráficos");

        jMenuItem1.setText("Resultado todas las explotaciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ingresos de un cultivar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Gastos de un cultivar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        InternalNuevoCultivar internal = new InternalNuevoCultivar(jtbCultivar);
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            utils.UtilisSql.borrar("TCultivar", jtbCultivar, 1);
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);
            InternalNuevoCultivar internal = new InternalNuevoCultivar(jtbCultivar, id);
            this.getParent().add(internal);
            internal.toFront();
            utils.UtilsFrame.centrar(internal);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila a modificar");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameClosing
    {//GEN-HEADEREND:event_formInternalFrameClosing
        try
        {
            btnCultivar.setEnabled(true);
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtfVariedadBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfVariedadBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfVariedadBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfVariedadBuscarKeyTyped

    private void jtfParcelaBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfParcelaBuscarKeyTyped
    {//GEN-HEADEREND:event_jtfParcelaBuscarKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfParcelaBuscarKeyTyped

    private void dateDespuesKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_dateDespuesKeyTyped
    {//GEN-HEADEREND:event_dateDespuesKeyTyped
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateDespuesKeyTyped

    private void dateDespuesPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_dateDespuesPropertyChange
    {//GEN-HEADEREND:event_dateDespuesPropertyChange
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateDespuesPropertyChange

    private void dateAntesPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_dateAntesPropertyChange
    {//GEN-HEADEREND:event_dateAntesPropertyChange
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateAntesPropertyChange

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSeleccionarActionPerformed
    {//GEN-HEADEREND:event_btnSeleccionarActionPerformed
        try
        {
            lblCultivar.setText(jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0) + "");
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Tiene que selecionar una fila");
        }
        dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void jmGastosPrductosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmGastosPrductosActionPerformed
    {//GEN-HEADEREND:event_jmGastosPrductosActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);
            try
            {
                AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c01_Landscape.jasper", parametros);
                AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c01_Landscape.jasper", parametros);
                AbstractaJasperReports.verVisor();
            } catch (Exception e){}
            
            conn.cerrarConexion();
            // TODO solucionar cuando no hay ningún dato para ese informe
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmGastosPrductosActionPerformed

    private void jmGastosOtrosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmGastosOtrosActionPerformed
    {//GEN-HEADEREND:event_jmGastosOtrosActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c02_Landscape.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c02_Landscape.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmGastosOtrosActionPerformed

    private void jmIngresosVentaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmIngresosVentaActionPerformed
    {//GEN-HEADEREND:event_jmIngresosVentaActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c03_A4.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c03_A4.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmIngresosVentaActionPerformed

    private void jmIngresosOtrosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmIngresosOtrosActionPerformed
    {//GEN-HEADEREND:event_jmIngresosOtrosActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c04_Landscape.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c04_Landscape.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmIngresosOtrosActionPerformed

    private void jmResumenResultadosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmResumenResultadosActionPerformed
    {//GEN-HEADEREND:event_jmResumenResultadosActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c05_Landscape.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c05_Landscape.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmResumenResultadosActionPerformed

    private void jmGastosPendientesAbonarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmGastosPendientesAbonarActionPerformed
    {//GEN-HEADEREND:event_jmGastosPendientesAbonarActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            float ingresoVenta, ingresoOtro, gastoMObra, gastoProducto, gastoOtro;

            ResultSet rs;
            rs = conn.hacerConsulta("SELECT SUM(Total) FROM TIngresoVenta   WHERE IdCultivar=" + id + ";");
            rs.next();
            ingresoVenta = rs.getFloat(1);
            parametros.put("IngVenta", (float) ingresoVenta);

            rs = conn.hacerConsulta("SELECT SUM(Total) FROM TIngresoOtro WHERE IdCultivar=" + id + ";");
            rs.next();
            ingresoOtro = rs.getFloat(1);
            parametros.put("IngOtro", (float) ingresoOtro);

            rs = conn.hacerConsulta("SELECT SUM(Total) FROM TGastosManoObra WHERE IdCultivar=" + id + ";");
            rs.next();
            gastoMObra = rs.getFloat(1);
            parametros.put("GasMObra", (float) gastoMObra);

            rs = conn.hacerConsulta("SELECT SUM(Total) FROM TGastoProducto  WHERE IdCultivar=" + id + ";");
            rs.next();
            gastoProducto = rs.getFloat(1);
            parametros.put("GasProducto", (float) gastoProducto);

            rs = conn.hacerConsulta("SELECT SUM(Total) FROM TGastoOtro  WHERE IdCultivar=" + id + ";");
            rs.next();
            gastoOtro = rs.getFloat(1);
            parametros.put("GasOtro", (float) gastoOtro);

            parametros.put("idCultivar", id);

            rs = conn.hacerConsulta("SELECT Unidades FROM TCultivar  WHERE Id=" + id + ";");
            rs.next();
            float total = ingresoOtro + ingresoVenta - gastoMObra - gastoOtro - gastoProducto;
            int unidades = rs.getInt(1);
            System.out.println(total + " " + unidades);
            parametros.put("resultado", (float) total / unidades);

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c06_A4.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c06_A4.jasper", parametros);
            AbstractaJasperReports.verVisor();

            conn.cerrarConexion();
            rs.close();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmGastosPendientesAbonarActionPerformed

    private void jmIngresosPendientesCobrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jmIngresosPendientesCobrarActionPerformed
    {//GEN-HEADEREND:event_jmIngresosPendientesCobrarActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            ResultSet rs;
            rs = conn.hacerConsulta("SELECT IdParcela FROM TCultivar  WHERE Id=" + id + ";");
            rs.next();
            parametros.put("cultivar", rs.getString(1));
            rs.close();

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c07_A4.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c07_A4.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmIngresosPendientesCobrarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem8ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem8ActionPerformed
        try
        {
            int id = (int) jtbCultivar.getValueAt(jtbCultivar.getSelectedRow(), 0);

            ConexionBBDD conn = new ConexionBBDD();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("idCultivar", id);

            ResultSet rs;
            rs = conn.hacerConsulta("SELECT IdParcela FROM TCultivar  WHERE Id=" + id + ";");
            rs.next();
            parametros.put("cultivar", rs.getString(1));
            rs.close();

            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "./src/jasper/bin/c08_A4.jasper", parametros);
            AbstractaJasperReports.crearInforme((Connection) conn.getConexion(), "c08_A4.jasper", parametros);
            AbstractaJasperReports.verVisor();
            conn.cerrarConexion();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this.getParent(), "Selecione la fila para sacar el informe");
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jtfParcelaBuscarKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfParcelaBuscarKeyReleased
    {//GEN-HEADEREND:event_jtfParcelaBuscarKeyReleased
        try
        {
            buscarFiltro();
        } catch (Exception ex)
        {
            Logger.getLogger(InternalTCultivar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfParcelaBuscarKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        InternalTrabajadorFechas internal = new InternalTrabajadorFechas();
        this.getParent().add(internal);
        internal.toFront();
        utils.UtilsFrame.centrar(internal);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //Actualizar en las busquedas
    private void buscarFiltro() throws SQLException, Exception
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String variedad = jtfVariedadBuscar.getText().toString();
        String parcela = jtfParcelaBuscar.getText().toString();
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
        this.jtbCultivar = utils.UtilisSql.rellenarJTable(
                "SELECT * FROM TCultivar WHERE IdVariedad LIKE \'%" + variedad + "%\' "
                + " AND IdParcela LIKE \'%" + parcela + "%\' "
                + " AND FechaInicio <= \'" + strInicio + "\' "
                + "AND FechaFin >= \'" + strFin + "\';", jtbCultivar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionar;
    private com.toedter.calendar.JDateChooser dateAntes;
    private com.toedter.calendar.JDateChooser dateDespues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmGastosManoObra;
    private javax.swing.JMenuItem jmGastosOtros;
    private javax.swing.JMenuItem jmGastosPendientesAbonar;
    private javax.swing.JMenuItem jmGastosPrductos;
    private javax.swing.JMenuItem jmIngresosOtros;
    private javax.swing.JMenuItem jmIngresosPendientesCobrar;
    private javax.swing.JMenuItem jmIngresosVenta;
    private javax.swing.JMenuItem jmResumenResultados;
    private javax.swing.JTable jtbCultivar;
    private javax.swing.JTextField jtfParcelaBuscar;
    private javax.swing.JTextField jtfVariedadBuscar;
    // End of variables declaration//GEN-END:variables
}
