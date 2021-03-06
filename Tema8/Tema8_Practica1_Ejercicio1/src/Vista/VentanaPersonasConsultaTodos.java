/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Excepciones.PersonaNoEncontrada;
import ModeloUML.Persona;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import tema8_practica1_ejercicio1.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class VentanaPersonasConsultaTodos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPersonas
     */
    public VentanaPersonasConsultaTodos(int version) {
        initComponents();
        tfNombre.setForeground(new java.awt.Color(0,0, 0));
        tfDni.setForeground(new java.awt.Color(0,0, 0));
        tfEdad.setForeground(new java.awt.Color(0,0, 0));
        tfProfesion.setForeground(new java.awt.Color(0,0, 0));
        tfTelefono.setForeground(new java.awt.Color(0,0, 0));
        panelConsulta.setVisible(true);
    }

    public VentanaPersonasConsultaTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void mostrarPersona()
    {
        try
        {
            Persona p = Controlador.hacerSelectPersonaUnica(JOptionPane.showInputDialog(this, "Introduce el dni de la persona a consultar"));
            tfDni.setText(p.getDni());
            tfNombre.setText(p.getNombre());
            tfEdad.setText(p.getEdad());
            tfProfesion.setText(p.getProfesion());
            tfTelefono.setText(p.getTelefono());
        }
        catch(PersonaNoEncontrada e)
        {
            JOptionPane.showMessageDialog(this, "No se ha encontrado ninguna persona con ese DNI");
            bSalir.doClick();
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfProfesion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDni = new javax.swing.JFormattedTextField();
        panelConsulta = new javax.swing.JPanel();
        bAtras = new javax.swing.JButton();
        bAvanzar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Personas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel2, gridBagConstraints);

        tfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfNombre, gridBagConstraints);

        jLabel3.setText("Edad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel3, gridBagConstraints);

        tfEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfEdad, gridBagConstraints);

        jLabel4.setText("Profesión:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel4, gridBagConstraints);

        tfProfesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfProfesion, gridBagConstraints);

        jLabel5.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel5, gridBagConstraints);

        tfTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            tfTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(tfTelefono, gridBagConstraints);

        jLabel6.setText("Dni:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel6, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(tfDni, gridBagConstraints);

        bAtras.setText("←");
        panelConsulta.add(bAtras);

        bAvanzar.setText("→");
        panelConsulta.add(bAvanzar);

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        panelConsulta.add(bSalir);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(panelConsulta, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusGained
        tfDni.setForeground(new java.awt.Color(0,0, 0));
        tfDni.setText("");
    }//GEN-LAST:event_tfDniFocusGained

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Controlador.irVentanaPrincipal(this);
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
            java.util.logging.Logger.getLogger(VentanaPersonasConsultaTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonasConsultaTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonasConsultaTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonasConsultaTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPersonasConsultaTodos(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bAvanzar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JFormattedTextField tfDni;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProfesion;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
