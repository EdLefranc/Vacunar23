/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CiudadanoData;
import Entidades.Ciudadano;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

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

    public void ocultarIFrames() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JT_Ocupacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JT_DNI = new javax.swing.JTextField();
        JT_Nombre = new javax.swing.JTextField();
        JT_Email = new javax.swing.JTextField();
        JT_Patologia = new javax.swing.JTextField();
        JT_Apellido = new javax.swing.JTextField();
        JT_Edad = new javax.swing.JTextField();
        JT_Celular = new javax.swing.JTextField();
        JT_ResponsableLegal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BTN_BuscarPaciente = new javax.swing.JButton();
        BTN_GuardarActualizarPaciente = new javax.swing.JButton();
        BTN_NuevoPaciente = new javax.swing.JButton();
        RB_EstadoPaciente = new javax.swing.JRadioButton();
        LB_EstadoPaciente = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PACIENTE");
        IF_Paciente.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 868, 94));

        jLabel4.setText("DNI");
        IF_Paciente.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 20, 40));

        JT_Ocupacion.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 180, 30));

        jLabel5.setText("NOMBRE");
        IF_Paciente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 50, 40));

        jLabel6.setText("EMAIL");
        IF_Paciente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 40, 40));

        jLabel7.setText("PATOLOGÍA");
        IF_Paciente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 40));

        jLabel8.setText("OCUPACIÓN");
        IF_Paciente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, 40));

        JT_DNI.setColumns(1);
        IF_Paciente.getContentPane().add(JT_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, 30));

        JT_Nombre.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, 30));

        JT_Email.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, 30));

        JT_Patologia.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Patologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 180, 30));

        JT_Apellido.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 180, 30));

        JT_Edad.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 180, 30));

        JT_Celular.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 180, 30));

        JT_ResponsableLegal.setColumns(1);
        IF_Paciente.getContentPane().add(JT_ResponsableLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 180, 30));

        jLabel10.setText("APELLIDO");
        IF_Paciente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 60, 40));

        jLabel11.setText("EDAD");
        IF_Paciente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 40, 40));

        jLabel12.setText("CELULAR");
        IF_Paciente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 60, 40));

        jLabel13.setText("RESPONSABLE LEGAL");
        IF_Paciente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 130, 40));

        BTN_BuscarPaciente.setText("BUSCAR PACIENTE");
        BTN_BuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_BuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 112, 340, 40));

        BTN_GuardarActualizarPaciente.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_GuardarActualizarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 280, 60));

        BTN_NuevoPaciente.setText("NUEVO PACIENTE");
        BTN_NuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_NuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 280, 60));

        RB_EstadoPaciente.setText("Activo");
        IF_Paciente.getContentPane().add(RB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 80, -1));
        IF_Paciente.getContentPane().add(LB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, 30));

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
        MI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SalirActionPerformed(evt);
            }
        });
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

    private void BTN_BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarPacienteActionPerformed
        CiudadanoData ciuData = new CiudadanoData();
        ArrayList<Ciudadano> ciudadanoBuscado = new ArrayList<>();
        String dniPaciente = JT_DNI.getText();
        boolean dniValido = esNumeroDNI(dniPaciente);

        if (dniValido) {
            try {

                int dniCiudadano = Integer.parseInt(dniPaciente);
                ciudadanoBuscado.add(ciuData.buscarCiudadanoPorDni(dniCiudadano));

                // Verifico si se encontró un alumno antes de mostrar los datos
                String apellido = ciudadanoBuscado.get(0).getApellido();
                String nombre = ciudadanoBuscado.get(0).getNombre();
                String email = ciudadanoBuscado.get(0).getEmail();
                String patologia = ciudadanoBuscado.get(0).getPatologia();
                String ocupacion = ciudadanoBuscado.get(0).getOcupacion();
                String celular = ciudadanoBuscado.get(0).getCelular();
                String responsableLegal = ciudadanoBuscado.get(0).getResponsableLegal();
                int edad = ciudadanoBuscado.get(0).getEdad();
                boolean estado = ciudadanoBuscado.get(0).isEstado();

                String edadString = String.valueOf(edad);

                // Muestra los datos en los campos de información
                JT_Apellido.setText(apellido);
                JT_Nombre.setText(nombre);
                JT_Celular.setText(celular);
                JT_Email.setText(email);
                JT_Patologia.setText(patologia);
                JT_Ocupacion.setText(ocupacion);
                JT_ResponsableLegal.setText(responsableLegal);
                JT_Edad.setText(edadString);

                RB_EstadoPaciente.setSelected(estado); // Establecemos el estado del RadioButton           
                if (RB_EstadoPaciente.isSelected()) {
                    Color verde = new Color(0, 204, 0);
                    LB_EstadoPaciente.setText("Paciente activo");
                    LB_EstadoPaciente.setForeground(verde);
                } else {
                    Color rojo = new Color(210, 32, 32);
                    LB_EstadoPaciente.setText("Paciente inactivo");
                    LB_EstadoPaciente.setForeground(rojo);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El paciente no existe en las listas\nIntenta con otro DNI");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un DNI válido");
        }
    }//GEN-LAST:event_BTN_BuscarPacienteActionPerformed

    private void MI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_MI_SalirActionPerformed

    private void BTN_NuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoPacienteActionPerformed

        Object[] options = {"Nuevo Paciente", "Búsqueda Nueva"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) {
            // Código para guardar
            JOptionPane.showMessageDialog(null, "Seleccionaste Nuevo Paciente");
            limpiarCampos(IF_Paciente, LB_EstadoPaciente);
        } else if (choice == JOptionPane.NO_OPTION) {
            // Código para iniciar otra búsqueda
            JOptionPane.showMessageDialog(null, "Seleccionaste Búsqueda Nueva");
            limpiarCampos(IF_Paciente, LB_EstadoPaciente);
        }
    }//GEN-LAST:event_BTN_NuevoPacienteActionPerformed
   
    
    private void BTN_GuardarActualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarPacienteActionPerformed

        CiudadanoData ciuData = new CiudadanoData();

        System.out.println("Botón Guardar/Actualizar presionado"); // Mensaje de depuración

        String dni = JT_DNI.getText();
        String apellido = JT_Apellido.getText();
        String nombre = JT_Nombre.getText();
        String email = JT_Email.getText();
        String patologia = JT_Patologia.getText();
        String ocupacion = JT_Ocupacion.getText();
        String celular = JT_Celular.getText();
        String responsableLegal = JT_ResponsableLegal.getText();
        String edad = JT_Edad.getText();

        System.out.println("DNI: " + dni); // Mensaje de depuración
        System.out.println("Edad: " + edad); // Mensaje de depuración

        boolean dniValido = esNumeroDNI(dni);
        boolean edadValida = esNumeroValido(edad);
        boolean camposValidos = validarCamposString(JT_Nombre, JT_Apellido);

        if (dniValido && edadValida && camposValidos) {
            try {
                System.out.println("Validaciones exitosas"); // Mensaje de depuración

                boolean estadoPaciente = RB_EstadoPaciente.isSelected();
                Ciudadano citizen = new Ciudadano(Integer.parseInt(dni), nombre, apellido, email, celular, patologia, ocupacion, Integer.parseInt(edad), responsableLegal, estadoPaciente);

                if (ciuData.existeCiudadano(Integer.parseInt(dni))) {
                    ciuData.modificarCiudadano(citizen);
                    System.out.println("Ciudadano existente, se modificó"); // Mensaje de depuración
                } else {
                    ciuData.guardarCiudadano(citizen);
                    JOptionPane.showMessageDialog(null, "Paciente añadido con éxito.");
                    System.out.println("Ciudadano nuevo, se guardó"); // Mensaje de depuración
                }

                limpiarCampos(IF_Paciente, LB_EstadoPaciente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Verifica que los campos de edad y DNI sean números válidos.");
                System.err.println("Excepción NumberFormatException: " + e.getMessage()); // Mensaje de depuración
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No corresponde guardar estos tipos de datos.");
                System.err.println("Excepción NullPointerException: " + e.getMessage()); // Mensaje de depuración
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al llenar el formulario.\nVerifica los campos y asegúrate de que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarActualizarPacienteActionPerformed
            
    private void limpiarCampos(JInternalFrame internalFrame, JLabel labelALimpiar) {
        if (internalFrame != null) {
            Component[] components = internalFrame.getContentPane().getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextField textField = (JTextField) component;
                    textField.setText("");
                } else if (component instanceof JRadioButton) {
                    JRadioButton radioButton = (JRadioButton) component;
                    radioButton.setSelected(false);
                } else if (component == labelALimpiar) {
                    if (labelALimpiar instanceof JLabel) {
                        JLabel label = (JLabel) labelALimpiar;
                        label.setText("");
                    }
                }
            }
        }
    }
    
    public static boolean esNumeroValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            return dni > 0 && dni < 150;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Edad debe contener un valor acorde.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroDNI(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo DNI vacío.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo DNI debe contener números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            return dni > 4000000 && dni < 999999999;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo DNI debe contener un valor acorde.");
            return false; // No se pudo convertir a entero.
        }
    }

    public boolean validarCamposString(JTextField... campos) {
        for (JTextField campo : campos) {
            String textoCampo = campo.getText().trim(); // Elimina espacios en blanco al principio y al final.

            if (textoCampo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no deben estar vacíos. Verificar.");
                return false;
            }
        }

        return true; // Todos los campos son válidos.
    }


    public boolean contieneLetras(String texto) {
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean contieneSoloNumeros(String texto) {
        return texto.matches("\\d+");
    }

    public boolean validarCamposString(JTextField campo1, JTextField campo2) {
        String textoCampo1 = campo1.getText();
        String textoCampo2 = campo2.getText();

        boolean contieneLetrasCampo1 = contieneLetras(textoCampo1);
        boolean contieneLetrasCampo2 = contieneLetras(textoCampo2);

        if (!contieneLetrasCampo1 || !contieneLetrasCampo2) {
            JOptionPane.showMessageDialog(null, "Nombre y Apellido deben contener al menos una letra.");
            return false;
        }
        return true;
    }

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
    private javax.swing.JButton BTN_BuscarPaciente;
    private javax.swing.JButton BTN_GuardarActualizarPaciente;
    private javax.swing.JButton BTN_NuevoPaciente;
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
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_Celular;
    private javax.swing.JTextField JT_DNI;
    private javax.swing.JTextField JT_Edad;
    private javax.swing.JTextField JT_Email;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTextField JT_Ocupacion;
    private javax.swing.JTextField JT_Patologia;
    private javax.swing.JTextField JT_ResponsableLegal;
    private javax.swing.JLabel LB_EstadoPaciente;
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
    private javax.swing.JRadioButton RB_EstadoPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
