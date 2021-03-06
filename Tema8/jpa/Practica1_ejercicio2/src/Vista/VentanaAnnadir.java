/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import practica1_ejercicio2.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class VentanaAnnadir extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAnnadir
     */
    public VentanaAnnadir() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelAnnadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfLugar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfNumeroPersonas = new javax.swing.JTextField();
        dpFecha = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraFin = new com.github.lgooddatepicker.components.TimePicker();
        jToolBar1 = new javax.swing.JToolBar();
        bAnnadir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bBorrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        miBorrar = new javax.swing.JMenu();
        miAnnadirEvento = new javax.swing.JMenuItem();
        miBorrarEvento = new javax.swing.JMenuItem();
        miEditar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miApuntarse = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        miBienvenida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.awt.GridBagLayout panelAnnadirLayout = new java.awt.GridBagLayout();
        panelAnnadirLayout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        panelAnnadirLayout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        panelAnnadir.setLayout(panelAnnadirLayout);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Añadir un evento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelAnnadir.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Nombre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        panelAnnadir.add(tfNombre, gridBagConstraints);

        jLabel7.setText("Lugar: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        panelAnnadir.add(tfLugar, gridBagConstraints);

        jLabel8.setText("Numero de personas: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel8, gridBagConstraints);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        jPanel4.add(bAceptar);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(bCancelar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jPanel4, gridBagConstraints);

        tfNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroPersonasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelAnnadir.add(tfNumeroPersonas, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelAnnadir.add(dpFecha, gridBagConstraints);

        jLabel1.setText("Fecha: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel1, gridBagConstraints);

        jLabel9.setText("Hora de Inicio: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel9, gridBagConstraints);

        jLabel13.setText("Hora de Finalización: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelAnnadir.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelAnnadir.add(tpHoraInicio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelAnnadir.add(tpHoraFin, gridBagConstraints);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bAnnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        bAnnadir.setBorder(null);
        bAnnadir.setFocusable(false);
        bAnnadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAnnadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnadirActionPerformed(evt);
            }
        });
        jToolBar1.add(bAnnadir);

        jLabel10.setText("   ");
        jToolBar1.add(jLabel10);

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        bBorrar.setBorder(null);
        bBorrar.setFocusable(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBorrar);

        jLabel11.setText("   ");
        jToolBar1.add(jLabel11);

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        bEditar.setBorder(null);
        bEditar.setFocusable(false);
        bEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEditar);

        jLabel12.setText("   ");
        jToolBar1.add(jLabel12);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-up.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        miBorrar.setText("Eventos");

        miAnnadirEvento.setText("Añadir evento");
        miAnnadirEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnnadirEventoActionPerformed(evt);
            }
        });
        miBorrar.add(miAnnadirEvento);

        miBorrarEvento.setText("Cancelar evento");
        miBorrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBorrarEventoActionPerformed(evt);
            }
        });
        miBorrar.add(miBorrarEvento);

        miEditar.setText("Modificar evento");
        miEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarActionPerformed(evt);
            }
        });
        miBorrar.add(miEditar);

        jMenuBar1.add(miBorrar);

        jMenu1.setText("Inscripciones");

        miApuntarse.setText("Apuntarse");
        miApuntarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miApuntarseActionPerformed(evt);
            }
        });
        jMenu1.add(miApuntarse);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu2.add(miSalir);

        miBienvenida.setText("Volver a la página de bienvenida");
        miBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBienvenidaActionPerformed(evt);
            }
        });
        jMenu2.add(miBienvenida);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addComponent(panelAnnadir, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAnnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        miBienvenida.doClick();
        tfNombre.setText("");
        dpFecha.setText("");
        tpHoraInicio.setText("");
        tpHoraFin.setText("");
        tfLugar.setText("");
        tfNumeroPersonas.setText("");
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tfNumeroPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroPersonasActionPerformed
        bAceptar.doClick();
    }//GEN-LAST:event_tfNumeroPersonasActionPerformed

    private void bAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnadirActionPerformed
        miAnnadirEvento.doClick();
    }//GEN-LAST:event_bAnnadirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        miBorrarEvento.doClick();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        miEditar.doClick();
    }//GEN-LAST:event_bEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        miApuntarse.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void miAnnadirEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnnadirEventoActionPerformed
        Controlador.irVentanaAnnadir(this);
    }//GEN-LAST:event_miAnnadirEventoActionPerformed

    private void miBorrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBorrarEventoActionPerformed
        Controlador.irVentanaBorrar(this);
    }//GEN-LAST:event_miBorrarEventoActionPerformed

    private void miEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarActionPerformed
        Controlador.irVentanaModificar(this);
    }//GEN-LAST:event_miEditarActionPerformed

    private void miApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miApuntarseActionPerformed
        Controlador.irVentanaApuntarse(this);
    }//GEN-LAST:event_miApuntarseActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        Controlador.salir();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBienvenidaActionPerformed
        Controlador.irVentanaBienvenida(this);
    }//GEN-LAST:event_miBienvenidaActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try
        {
            Controlador.hacerAltaEvento(tfNombre.getText()
                ,dpFecha.getDateStringOrEmptyString()
                ,tpHoraInicio.getTimeStringOrEmptyString()
                ,tpHoraFin.getTimeStringOrEmptyString()
                ,tfLugar.getText()
                ,tfNumeroPersonas.getText());
            tfNombre.setText("");
            tpHoraInicio.setText("");
            dpFecha.setText("");
            tpHoraFin.setText("");
            tfLugar.setText("");
            tfNumeroPersonas.setText("");
            JOptionPane.showMessageDialog(this, "Evento dado de alta correctamente");
            tfNombre.requestFocus();
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAnnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAnnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAnnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAnnadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnnadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnnadir;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private com.github.lgooddatepicker.components.DatePicker dpFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miAnnadirEvento;
    private javax.swing.JMenuItem miApuntarse;
    private javax.swing.JMenuItem miBienvenida;
    private javax.swing.JMenu miBorrar;
    private javax.swing.JMenuItem miBorrarEvento;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel panelAnnadir;
    private javax.swing.JTextField tfLugar;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroPersonas;
    private com.github.lgooddatepicker.components.TimePicker tpHoraFin;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    // End of variables declaration//GEN-END:variables
}
