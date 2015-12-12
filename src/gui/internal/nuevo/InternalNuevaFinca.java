package gui.internal.nuevo;

import conexion.ConexionBBDD;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class InternalNuevaFinca extends javax.swing.JInternalFrame
{

    javax.swing.JTable jtbFinca;
    String id;
    boolean modificar = false;

    public InternalNuevaFinca(javax.swing.JTable jtbFinca)
    {
        initComponents();
        modificar = false;
        this.jtbFinca = jtbFinca;
        jtfNombreFinca.setEditable(true);
    }

    public InternalNuevaFinca(javax.swing.JTable jtbFinca, String id) throws Exception
    {
        initComponents();
        modificar = true;
        this.id = id;
        this.jtbFinca = jtbFinca;
        jtfNombreFinca.setEditable(false);
        rellenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnAceptarNuevaFinca = new javax.swing.JButton();
        btnCancelarNuevaFinca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNombreFinca = new javax.swing.JTextField();
        jtfLocalizacionFinca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfDescripcionFinca = new javax.swing.JTextArea();

        setClosable(true);
        try
        {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1)
        {
            e1.printStackTrace();
        }
        setVisible(true);
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                formMouseExited(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                formFocusLost(evt);
            }
        });

        btnAceptarNuevaFinca.setText("Aceptar");
        btnAceptarNuevaFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarNuevaFincaActionPerformed(evt);
            }
        });

        btnCancelarNuevaFinca.setText("Cancelar");
        btnCancelarNuevaFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarNuevaFincaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Localizacion");

        jLabel3.setText("Descripción");

        jtfNombreFinca.setColumns(20);
        jtfNombreFinca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfNombreFincaActionPerformed(evt);
            }
        });

        jtfLocalizacionFinca.setColumns(20);
        jtfLocalizacionFinca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfLocalizacionFincaKeyTyped(evt);
            }
        });

        jtfDescripcionFinca.setColumns(20);
        jtfDescripcionFinca.setLineWrap(true);
        jtfDescripcionFinca.setRows(5);
        jtfDescripcionFinca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jtfDescripcionFincaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtfDescripcionFinca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptarNuevaFinca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarNuevaFinca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfLocalizacionFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jtfNombreFinca))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombreFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfLocalizacionFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarNuevaFinca)
                    .addComponent(btnCancelarNuevaFinca))
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

    private void jtfNombreFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfNombreFincaActionPerformed
    {//GEN-HEADEREND:event_jtfNombreFincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreFincaActionPerformed

    private void btnAceptarNuevaFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarNuevaFincaActionPerformed
    {//GEN-HEADEREND:event_btnAceptarNuevaFincaActionPerformed
        /*Nombre         VARCHAR(20)     PRIMARY KEY,
         Localizacion    VARCHAR(20)     NOT NULL,
         Descripcion     VARCHAR(100)    NOT NULL
         */
        String Nombre = (String) jtfNombreFinca.getText().toString();
        String Localizacion = (String) jtfLocalizacionFinca.getText().toString();
        String Descripcion = (String) jtfDescripcionFinca.getText().toString();
        ConexionBBDD c = null;
        if (modificar)//modificar datos ==> distinto sql
        {
            try
            {
                c = new ConexionBBDD();
                String SQL = "UPDATE TFinca SET Localizacion = \"" + Localizacion
                        + "\", Descripcion =\"" + Descripcion
                        + "\" WHERE Nombre = \"" + Nombre + "\";";
                c.hacerInsercion(SQL);
                c.cerrarConexion();
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                jtbFinca = utils.UtilisSql.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);
            } catch (SQLException ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();

        } else
        {
            try
            {
                try
                {
                    c = new ConexionBBDD();
                    c.hacerInsercion("INSERT INTO TFinca (Nombre,Localizacion,Descripcion) VALUES (\""
                            + Nombre + "\",\"" + Localizacion + "\",\"" + Descripcion + "\")");
                    c.cerrarConexion();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex)
                {
                    Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
                }
                jtbFinca = utils.UtilisSql.rellenarJTable("SELECT * FROM TFinca;", jtbFinca);
                this.dispose();
            } catch (SQLException ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex)
            {
                Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAceptarNuevaFincaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_formFocusGained
    {//GEN-HEADEREND:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void btnCancelarNuevaFincaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarNuevaFincaActionPerformed
    {//GEN-HEADEREND:event_btnCancelarNuevaFincaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNuevaFincaActionPerformed

    private void jtfLocalizacionFincaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfLocalizacionFincaKeyTyped
    {//GEN-HEADEREND:event_jtfLocalizacionFincaKeyTyped
        if (jtfLocalizacionFinca.getText().length() > 9)
        {
            jtfLocalizacionFinca.setText(jtfLocalizacionFinca.getText().toString().substring(0, 9));
        }
    }//GEN-LAST:event_jtfLocalizacionFincaKeyTyped

    private void jtfDescripcionFincaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtfDescripcionFincaKeyTyped
    {//GEN-HEADEREND:event_jtfDescripcionFincaKeyTyped
        if (jtfDescripcionFinca.getText().length() > 99)
        {
            jtfDescripcionFinca.setText(jtfDescripcionFinca.getText().toString().substring(0, 99));
        }
    }//GEN-LAST:event_jtfDescripcionFincaKeyTyped

    private void formFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_formFocusLost
    {//GEN-HEADEREND:event_formFocusLost
        this.moveToFront();
    }//GEN-LAST:event_formFocusLost

    private void formMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseExited
    {//GEN-HEADEREND:event_formMouseExited
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = punto.x;
        int y = punto.y;
        System.out.println(punto);
        /*// No puedo usar los botones ni entrar a los campos de texto, 
         Robot robot = null;
         try
         {
         robot = new Robot();
         } catch (AWTException ex)
         {
         Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
         }
 
         //cambia la posición en pantalla del puntero a las coordenadas
         //X=300 e Y=600.
         robot.mouseMove(this.getParent().getWidth()/2,this.getParent().getHeight()/2 );*/
    }//GEN-LAST:event_formMouseExited
    public void rellenarCampos() throws SQLException, Exception
    {
        try
        {
            ConexionBBDD c = new ConexionBBDD();
            String SQL = "SELECT * FROM TFinca WHERE Nombre = \"" + id + "\";";
            System.out.println(SQL);
            ResultSet rs = c.hacerConsulta(SQL);
            System.out.println(rs + " =rs");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            System.out.println(cantidadColumnas);
            System.out.println(rsmd.getColumnName(1));
            System.out.println(rsmd.getColumnName(2));
            System.out.println(rsmd.getColumnName(3));
            rs.next();
            System.out.println(rs.getString(1).toString() + "");

            jtfNombreFinca.setText(rs.getString("Nombre") + "");
            jtfLocalizacionFinca.setText(rs.getString("Localizacion") + "");
            jtfDescripcionFinca.setText(rs.getString("Descripcion") + "");
            c.cerrarConexion();
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(InternalNuevaFinca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarNuevaFinca;
    private javax.swing.JButton btnCancelarNuevaFinca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtfDescripcionFinca;
    private javax.swing.JTextField jtfLocalizacionFinca;
    private javax.swing.JTextField jtfNombreFinca;
    // End of variables declaration//GEN-END:variables
}
