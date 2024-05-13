package poo;

import java.awt.Toolkit;

/**
 *
 * @author marip
 */
public class VtnSubmenu extends javax.swing.JFrame
{

    /**
     * Creates new form VtnSubmenu
     */
    public VtnSubmenu()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagen1ORGlogo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton_reportes = new javax.swing.JButton();
        jButton_registro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_modifica = new javax.swing.JButton();
        jButton_consulta = new javax.swing.JButton();
        jButton_hc = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tsubmenu = new javax.swing.JLabel();
        escudo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbutton_consultas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbutton_bajas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_reportes.setBackground(new java.awt.Color(153, 153, 0));
        jButton_reportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_reportes.setForeground(new java.awt.Color(255, 255, 255));
        jButton_reportes.setText("Reportes de Información");
        jButton_reportes.setToolTipText("Consulta de Informes");
        jButton_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_reportes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_reportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, 30));

        jButton_registro.setBackground(new java.awt.Color(0, 102, 0));
        jButton_registro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_registro.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registro.setText("Registro Médico");
        jButton_registro.setToolTipText("Registro de Datos");
        jButton_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_registro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_registroActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modi.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jButton_modifica.setBackground(new java.awt.Color(153, 153, 0));
        jButton_modifica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_modifica.setForeground(new java.awt.Color(255, 255, 255));
        jButton_modifica.setText("Modificación de Datos");
        jButton_modifica.setToolTipText("Modificación de Datos");
        jButton_modifica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_modifica.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_modificaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 30));

        jButton_consulta.setBackground(new java.awt.Color(0, 102, 0));
        jButton_consulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_consulta.setText("Consulta de Datos");
        jButton_consulta.setToolTipText("Consulta de Datos Personales y Clinicos");
        jButton_consulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_consulta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 30));

        jButton_hc.setBackground(new java.awt.Color(153, 153, 0));
        jButton_hc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_hc.setForeground(new java.awt.Color(255, 255, 255));
        jButton_hc.setText("Historial Clínico");
        jButton_hc.setToolTipText("Registro de Consultas");
        jButton_hc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_hc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_hcActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_hc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, 30));

        jButton_Regresar.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Regresar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("<");
        jButton_Regresar.setToolTipText("Regresar a Menú Pricipal");
        jButton_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rep.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regg2.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conhis.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 50));

        tsubmenu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tsubmenu.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(tsubmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 20));

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N
        getContentPane().add(escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Submenú de Opciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 102, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel5.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, -1, 90));

        jbutton_consultas.setBackground(new java.awt.Color(0, 102, 0));
        jbutton_consultas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbutton_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_consultas.setText("Consultas de Historial Clinico");
        jbutton_consultas.setToolTipText("Consultas y  datos del historial de los pacientes");
        jbutton_consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbutton_consultas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbutton_consultasActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hospiii.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 50));

        jbutton_bajas.setBackground(new java.awt.Color(0, 102, 0));
        jbutton_bajas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbutton_bajas.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_bajas.setText("Bajas");
        jbutton_bajas.setToolTipText("Consultas y  datos del historial de los pacientes");
        jbutton_bajas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbutton_bajas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbutton_bajasActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton_bajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baj (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_consultaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_consultaActionPerformed
    {//GEN-HEADEREND:event_jButton_consultaActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnCA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnCP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton_consultaActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_RegresarActionPerformed
    {//GEN-HEADEREND:event_jButton_RegresarActionPerformed
        new VtnPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_registroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_registroActionPerformed
    {//GEN-HEADEREND:event_jButton_registroActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnAA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnAP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton_registroActionPerformed

    private void jButton_modificaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_modificaActionPerformed
    {//GEN-HEADEREND:event_jButton_modificaActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnMA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnMP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton_modificaActionPerformed

    private void jButton_hcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_hcActionPerformed
    {//GEN-HEADEREND:event_jButton_hcActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnHCA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnHCP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton_hcActionPerformed

    private void jButton_reportesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_reportesActionPerformed
    {//GEN-HEADEREND:event_jButton_reportesActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnRA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnRP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton_reportesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jbutton_consultasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbutton_consultasActionPerformed
    {//GEN-HEADEREND:event_jbutton_consultasActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnCAHC().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnCAHP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbutton_consultasActionPerformed

    private void jbutton_bajasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbutton_bajasActionPerformed
    {//GEN-HEADEREND:event_jbutton_bajasActionPerformed
        if (VtnPrincipal.opc == 1)
        {
            new VtnBA().setVisible(true);
            dispose();
        } else if (VtnPrincipal.opc == 2)
        {
            new VtnBP().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbutton_bajasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnSubmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnSubmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnSubmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnSubmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnSubmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escudo;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_consulta;
    private javax.swing.JButton jButton_hc;
    private javax.swing.JButton jButton_modifica;
    private javax.swing.JButton jButton_registro;
    private javax.swing.JButton jButton_reportes;
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
    private javax.swing.JButton jbutton_bajas;
    private javax.swing.JButton jbutton_consultas;
    public static javax.swing.JLabel tsubmenu;
    // End of variables declaration//GEN-END:variables
}
