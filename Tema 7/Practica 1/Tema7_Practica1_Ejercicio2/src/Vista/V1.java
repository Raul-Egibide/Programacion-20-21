/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import tema7_practica1_ejercicio2.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class V1 extends javax.swing.JFrame {

    /**
     * Creates new form V1
     */
    public V1() {
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

        lTitulo = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lApellidos = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        lDni = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dar de alta una nueva persona");

        lTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("ALTA DE PERSONAS");

        lNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lNombre.setText("Nombre");

        tfNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        lApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lApellidos.setText("Apellidos");

        tfApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        lDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lDni.setText("DNI");

        tfDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        bAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lTitulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellidos)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDni)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bSalir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        tfNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY));
        tfApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY));
        tfDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY, java.awt.Color.DARK_GRAY));
        boolean nombreCorrecto=false;
        boolean apellidosCorrecto=false;
        boolean dniCorrecto=false;
        String nombre = tfNombre.getText();
        String apellidos = tfApellidos.getText();
        String dni = tfDni.getText();
        if(comprobarNombreCorrecto(nombre)==true) 
        {
            nombreCorrecto=true;
        }
        else
        {
            tfNombre.setText("");
            tfNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED));
        }
        if(comprobarApellidosCorrecto(apellidos))
        {
            apellidosCorrecto=true;
        }
        else
        {
            tfApellidos.setText("");
            tfApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED));
        }
        
        if(comprobarDniCorrecto(dni))
        {
            dniCorrecto=true;
        }
        else
        {
            tfDni.setText("");
            tfDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED, java.awt.Color.RED));
        }
        
        if(dniCorrecto && apellidosCorrecto && nombreCorrecto)
        {
            Controlador.getDatos(nombre,apellidos,dni);
            tfDni.setText("");
            tfApellidos.setText("");
            tfNombre.setText("");
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private boolean comprobarNombreCorrecto(String nombre)
    {
        boolean correcto=false;
        if(!nombre.isEmpty())
        {
            int x;
            for(x=0; x<nombre.length() && !Character.isDigit(nombre.charAt(x)); x++);
            if(x==nombre.length())
            {
                correcto=true;
            }
        }
        return correcto;
    }
    
    private boolean comprobarApellidosCorrecto(String apellido)
    {
        boolean correcto=false;
        if(!apellido.isEmpty())
        {
            int x;
            for(x=0; x<apellido.length() && !Character.isDigit(apellido.charAt(x)); x++);
            if(x==apellido.length())
            {
                correcto=true;
            }
        }
        return correcto;
    }
    
    private boolean comprobarDniCorrecto(String dni)
    {
        boolean correcto=false;
        if(!dni.isEmpty() && dni.length()==9)
        {
            int x;
            for(x=0; x<(dni.length()-1) && Character.isDigit(dni.charAt(x)); x++);
            if(x==8)
            {
                if(!Character.isDigit(dni.charAt((8))))
                {
                    correcto=true;
                }
            }
        }
        
        return correcto;
    }
    
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        if(!tfNombre.getText().equalsIgnoreCase("") && !tfApellidos.getText().equalsIgnoreCase("") && !tfDni.getText().equalsIgnoreCase(""))
        {
            String nombre = tfNombre.getText();
            String apellidos = tfApellidos.getText();
            String dni = tfDni.getText();
            tfNombre.setText("");
            tfApellidos.setText("");
            tfDni.setText("");
            Controlador.getDatos(nombre,apellidos,dni);
        }
        Controlador.devolverPersonas();
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lApellidos;
    private javax.swing.JLabel lDni;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
