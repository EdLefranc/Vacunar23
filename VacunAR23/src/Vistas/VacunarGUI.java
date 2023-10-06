/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;


public class VacunarGUI extends javax.swing.JFrame {

    /**
     * Creates new form VacunarGUI
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VacunarGUI() {
        initComponents();
        setLocationRelativeTo(null);
        ocultarIFrames();
    }
    
    public void ocultarIFrames(){
        IF_Paciente.setVisible(false);
        IF_Laboratorio.setVisible(false);
        IF_Vacuna.setVisible(false);
        IF_Admin.setVisible(false);
        IF_Consultas.setVisible(false);
        IF_Ayuda.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IF_Paciente = new javax.swing.JInternalFrame();
        IF_Laboratorio = new javax.swing.JInternalFrame();
        IF_Vacuna = new javax.swing.JInternalFrame();
        IF_Admin = new javax.swing.JInternalFrame();
        IF_Consultas = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        IF_Ayuda = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        JM_Paciente = new javax.swing.JMenu();
        MI_Paciente = new javax.swing.JMenuItem();
        JM_Laboratorio = new javax.swing.JMenu();
        MI_lab = new javax.swing.JMenuItem();
        JM_Vacuna = new javax.swing.JMenu();
        MI_Vac = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        MI_Turno = new javax.swing.JMenuItem();
        MI_ModTurno = new javax.swing.JMenuItem();
        JM_Consultas = new javax.swing.JMenu();
        MI_Turnos = new javax.swing.JMenuItem();
        MI_Labs = new javax.swing.JMenuItem();
        MI_StockVac = new javax.swing.JMenuItem();
        JM_Temas = new javax.swing.JMenu();
        MI_Noche = new javax.swing.JMenuItem();
        MI_Dia = new javax.swing.JMenuItem();
        JM_Ayuda = new javax.swing.JMenu();
        MI_Ayuda = new javax.swing.JMenuItem();
        JM_Salir = new javax.swing.JMenu();
        MI_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 690));
        getContentPane().setLayout(new java.awt.FlowLayout());

        IF_Paciente.setClosable(true);
        IF_Paciente.setTitle("Paciente");
        IF_Paciente.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Paciente.setVisible(true);
        IF_Paciente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IF_Paciente);

        IF_Laboratorio.setClosable(true);
        IF_Laboratorio.setTitle("Laboratorio");
        IF_Laboratorio.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Laboratorio.setVisible(true);
        IF_Laboratorio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IF_Laboratorio);

        IF_Vacuna.setClosable(true);
        IF_Vacuna.setTitle("Vacuna");
        IF_Vacuna.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Vacuna.setVisible(true);
        IF_Vacuna.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IF_Vacuna);

        IF_Admin.setClosable(true);
        IF_Admin.setTitle("Administración");
        IF_Admin.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Admin.setVisible(true);
        IF_Admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IF_Admin);

        IF_Consultas.setClosable(true);
        IF_Consultas.setTitle("Consultas");
        IF_Consultas.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Consultas.setPreferredSize(new java.awt.Dimension(870, 690));
        IF_Consultas.setVisible(true);
        IF_Consultas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        IF_Consultas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 240, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        IF_Consultas.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 760, 320));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("STOCK VACUNAS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IF_Consultas.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 160, 60));

        getContentPane().add(IF_Consultas);

        IF_Ayuda.setClosable(true);
        IF_Ayuda.setTitle("Ayuda");
        IF_Ayuda.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Ayuda.setVisible(true);
        IF_Ayuda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IF_Ayuda);

        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(682, 35));

        JM_Paciente.setText("Paciente");
        JM_Paciente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Paciente.setText("Paciente");
        MI_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_PacienteActionPerformed(evt);
            }
        });
        JM_Paciente.add(MI_Paciente);

        jMenuBar1.add(JM_Paciente);

        JM_Laboratorio.setText("Laboratorio");
        JM_Laboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_lab.setText("Laboratorio");
        MI_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_labActionPerformed(evt);
            }
        });
        JM_Laboratorio.add(MI_lab);

        jMenuBar1.add(JM_Laboratorio);

        JM_Vacuna.setText("Vacuna");
        JM_Vacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Vac.setText("Vacuna");
        MI_Vac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_VacActionPerformed(evt);
            }
        });
        JM_Vacuna.add(MI_Vac);

        jMenuBar1.add(JM_Vacuna);

        JM_Admin.setText("Administración");
        JM_Admin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turno.setText("Adjudicar Turnos");
        MI_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnoActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Turno);

        MI_ModTurno.setText("Modificación de Turnos");
        MI_ModTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ModTurnoActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_ModTurno);

        jMenuBar1.add(JM_Admin);

        JM_Consultas.setText("Consultas");
        JM_Consultas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turnos.setText("Turnos por Paciente");
        MI_Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnosActionPerformed(evt);
            }
        });
        JM_Consultas.add(MI_Turnos);

        MI_Labs.setText("Listado de Laboratorios");
        MI_Labs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_LabsActionPerformed(evt);
            }
        });
        JM_Consultas.add(MI_Labs);

        MI_StockVac.setText("Stock de Vacunas");
        MI_StockVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_StockVacActionPerformed(evt);
            }
        });
        JM_Consultas.add(MI_StockVac);

        jMenuBar1.add(JM_Consultas);

        JM_Temas.setText("Temas");
        JM_Temas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Noche.setText("Noche");
        JM_Temas.add(MI_Noche);

        MI_Dia.setText("Día");
        JM_Temas.add(MI_Dia);

        jMenuBar1.add(JM_Temas);

        JM_Ayuda.setText("Ayuda");
        JM_Ayuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Ayuda.setText("Información");
        MI_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AyudaActionPerformed(evt);
            }
        });
        JM_Ayuda.add(MI_Ayuda);

        jMenuBar1.add(JM_Ayuda);

        JM_Salir.setText("Salir");
        JM_Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Salir.setText("Salir del programa");
        JM_Salir.add(MI_Salir);

        jMenuBar1.add(JM_Salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PacienteActionPerformed
        ocultarIFrames();
        IF_Paciente.setVisible(true);
    }//GEN-LAST:event_MI_PacienteActionPerformed

    private void MI_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_labActionPerformed
        ocultarIFrames();
        IF_Laboratorio.setVisible(true);
    }//GEN-LAST:event_MI_labActionPerformed

    private void MI_VacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VacActionPerformed
        ocultarIFrames();
        IF_Vacuna.setVisible(true);
    }//GEN-LAST:event_MI_VacActionPerformed

    private void MI_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnoActionPerformed
        ocultarIFrames();
        IF_Admin.setVisible(true);
    }//GEN-LAST:event_MI_TurnoActionPerformed

    private void MI_ModTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ModTurnoActionPerformed
        ocultarIFrames();
        IF_Admin.setVisible(true);
    }//GEN-LAST:event_MI_ModTurnoActionPerformed

    private void MI_TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnosActionPerformed
        ocultarIFrames();
        IF_Consultas.setVisible(true);
    }//GEN-LAST:event_MI_TurnosActionPerformed

    private void MI_LabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_LabsActionPerformed
        ocultarIFrames();
        IF_Consultas.setVisible(true);
    }//GEN-LAST:event_MI_LabsActionPerformed

    private void MI_StockVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_StockVacActionPerformed
        ocultarIFrames();
        IF_Consultas.setVisible(true);
    }//GEN-LAST:event_MI_StockVacActionPerformed

    private void MI_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AyudaActionPerformed
        ocultarIFrames();
        IF_Ayuda.setVisible(true);
    }//GEN-LAST:event_MI_AyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatCarbonIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacunarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame IF_Admin;
    private javax.swing.JInternalFrame IF_Ayuda;
    private javax.swing.JInternalFrame IF_Consultas;
    private javax.swing.JInternalFrame IF_Laboratorio;
    private javax.swing.JInternalFrame IF_Paciente;
    private javax.swing.JInternalFrame IF_Vacuna;
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JMenu JM_Ayuda;
    private javax.swing.JMenu JM_Consultas;
    private javax.swing.JMenu JM_Laboratorio;
    private javax.swing.JMenu JM_Paciente;
    private javax.swing.JMenu JM_Salir;
    private javax.swing.JMenu JM_Temas;
    private javax.swing.JMenu JM_Vacuna;
    private javax.swing.JMenuItem MI_Ayuda;
    private javax.swing.JMenuItem MI_Dia;
    private javax.swing.JMenuItem MI_Labs;
    private javax.swing.JMenuItem MI_ModTurno;
    private javax.swing.JMenuItem MI_Noche;
    private javax.swing.JMenuItem MI_Paciente;
    private javax.swing.JMenuItem MI_Salir;
    private javax.swing.JMenuItem MI_StockVac;
    private javax.swing.JMenuItem MI_Turno;
    private javax.swing.JMenuItem MI_Turnos;
    private javax.swing.JMenuItem MI_Vac;
    private javax.swing.JMenuItem MI_lab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
