/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Excepciones.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import practica1_ejercicio2.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class VentanaApuntarse extends javax.swing.JFrame {

    /**
     * Creates new form AnnadirPersona
     */
    public VentanaApuntarse() {
        initComponents();
        try{
            Controlador.rellenarComboBox(cbNombresEventos);
        }
        catch(Exception e)
        {
            System.out.println(e.getClass() +"\n" + e.getMessage());
        }
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

        jToolBar1 = new javax.swing.JToolBar();
        bAnnadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bBorrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        bEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bApuntarse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfDni = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfNumeroTelefono = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNombreEmpresa = new javax.swing.JTextField();
        tfNif = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cbNombresEventos = new javax.swing.JComboBox<>();
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

        jLabel1.setText("   ");
        jToolBar1.add(jLabel1);

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

        jLabel9.setText("   ");
        jToolBar1.add(jLabel9);

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

        jLabel2.setText("   ");
        jToolBar1.add(jLabel2);

        bApuntarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sign-up.png"))); // NOI18N
        bApuntarse.setBorder(null);
        bApuntarse.setFocusable(false);
        bApuntarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bApuntarse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bApuntarse);

        jScrollPane1.setBorder(null);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        jPanel1Layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0};
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la persona asistente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        jPanel2Layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel3.setText("Dni:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel3, gridBagConstraints);

        tfDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            tfDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDniFocusGained(evt);
            }
        });
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(tfDni, gridBagConstraints);

        jLabel4.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel4, gridBagConstraints);

        tfNombre.setEditable(false);
        tfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(tfNombre, gridBagConstraints);

        jLabel5.setText("Apellidos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel5, gridBagConstraints);

        tfApellidos.setEditable(false);
        tfApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(tfApellidos, gridBagConstraints);

        jLabel6.setText("Número de teléfono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel6, gridBagConstraints);

        tfNumeroTelefono.setEditable(false);
        tfNumeroTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            tfNumeroTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel2.add(tfNumeroTelefono, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        jPanel3Layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0};
        jPanel3.setLayout(jPanel3Layout);

        jLabel7.setText("NIF: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jLabel8, gridBagConstraints);

        tfNombreEmpresa.setEditable(false);
        tfNombreEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel3.add(tfNombreEmpresa, gridBagConstraints);

        tfNif.setEditable(false);
        tfNif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        jPanel3.add(tfNif, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(bAceptar, gridBagConstraints);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(bCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del evento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0};
        jPanel5Layout.rowHeights = new int[] {0};
        jPanel5.setLayout(jPanel5Layout);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel5.add(cbNombresEventos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel5, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

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
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnadirActionPerformed
        miAnnadirEvento.doClick();
    }//GEN-LAST:event_bAnnadirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        miBorrarEvento.doClick();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        miEditar.doClick();
    }//GEN-LAST:event_bEditarActionPerformed

    ArrayList<String> listaDatos;
    
    private void tfDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusGained
        if(!nuevaPersona)
        {
            tfDni.setText("");
        }
    }//GEN-LAST:event_tfDniFocusGained

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        miBienvenida.doClick();
    }//GEN-LAST:event_bCancelarActionPerformed

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

    private boolean nuevaPersona=false;
    
    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        try
        {
            ArrayList<String> datos = Controlador.buscarPersona(tfDni.getText());
            tfNombre.setText(datos.get(0));
            tfApellidos.setText(datos.get(1));
            tfNumeroTelefono.setText(datos.get(2));
            tfNif.setText(datos.get(3));
            tfNombreEmpresa.setText(datos.get(4));
            
        }
        catch(NullPointerException e)
        {
            tfDni.setEditable(false);
            tfNombre.setEditable(true);
            tfApellidos.setEditable(true);
            tfNumeroTelefono.setEditable(true);
            tfNif.setEditable(true);
            tfNombreEmpresa.setEditable(true);
            nuevaPersona=true;
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_tfDniActionPerformed

    private void limpiarCampos()
    {
        tfDni.setText("");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfNumeroTelefono.setText("");
        tfNif.setText("");
        tfNombreEmpresa.setText("");
        tfDni.setEditable(true);
        tfNombre.setEditable(false);
        tfApellidos.setEditable(false);
        tfNumeroTelefono.setEditable(false);
        tfNif.setEditable(false);
        tfNombreEmpresa.setEditable(false);
    }
    
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try
        {
            if(nuevaPersona)
            {
                String a = Controlador.buscarEmpresa(tfNif.getText());
                Controlador.hacerAltaPersona(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfNumeroTelefono.getText(),tfNif.getText(),tfNombreEmpresa.getText());
                Controlador.agregarPersonaEvento(tfDni.getText(),cbNombresEventos.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Se ha confirmado la asistencia de " + tfNombre.getText() + " al evento " + cbNombresEventos.getSelectedItem().toString());
                limpiarCampos();
            }
            else
            {
                Controlador.agregarPersonaEvento(tfDni.getText(),cbNombresEventos.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Se ha confirmado la asistencia de " + tfNombre.getText() + " al evento " + cbNombresEventos.getSelectedItem().toString());
                limpiarCampos();
            }
        }
        catch(NullPointerException e)
        {
            try
            {
                Controlador.hacerAltaEmpresa(tfNif.getText(),tfNombreEmpresa.getText());
                Controlador.hacerAltaPersona(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfNumeroTelefono.getText(),tfNif.getText(),tfNombreEmpresa.getText());
                Controlador.agregarPersonaEvento(tfDni.getText(),cbNombresEventos.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this, "Se ha confirmado la asistencia de " + tfNombre.getText() + " al evento " + cbNombresEventos.getSelectedItem().toString());
                limpiarCampos();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getClass());
            }
        }
        catch(PersonaRepetidaException ex)
        {
            JOptionPane.showMessageDialog(this, "Esta persona ya está dada de alta en el evento seleccionado");
            limpiarCampos();
        }
        catch(eventoCompletoException ex)
        {
            JOptionPane.showMessageDialog(this, "No se puede inscribir más gente en este evento porque ya está completo");
            limpiarCampos();
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
            java.util.logging.Logger.getLogger(VentanaApuntarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaApuntarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaApuntarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaApuntarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaApuntarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnnadir;
    private javax.swing.JButton bApuntarse;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JComboBox<String> cbNombresEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miAnnadirEvento;
    private javax.swing.JMenuItem miApuntarse;
    private javax.swing.JMenuItem miBienvenida;
    private javax.swing.JMenu miBorrar;
    private javax.swing.JMenuItem miBorrarEvento;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JFormattedTextField tfDni;
    private javax.swing.JTextField tfNif;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreEmpresa;
    private javax.swing.JFormattedTextField tfNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
