/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Appointment.PatientAppointment;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author adityamulik
 */
public class ManageAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private int currentSelectedRow;
    private List<PatientAppointment> appointments;
    
    public ManageAppointmentsJPanel(JPanel container, EcoSystem system, UserAccount user) {
        initComponents();
        this.container = container;
        this.system = system;
        this.user = user;
        this.enterprise = user.getAssociatedEnterprise();
        
        populateWorkQueueTable();
        populateDoctorComboList();
    }       
    
    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkQueue.getModel();

        model.setRowCount(0);
        
        appointments = new ArrayList<>();
        
        for (PatientAppointment w: system.getAppointmentDirectory().getAppointmentAccountList()) {
            if (w.getStatus().equalsIgnoreCase("Pending") && w.getReceiver() == null) {
                // System.out.println(w);
                appointments.add(w);
                Object[] row = new Object[5];
                row[0] = w.getSender();
                row[1] = w.getIssue();
                row[2] = w.getRequestDate().toString();
//                row[3] = null;
                row[3] = w.getReceiver();
                row[4] = w.getMessage();
                model.addRow(row);
            }
        }
    }
    
    public void populateDoctorComboList() {
        
        for (UserAccount u: system.getUserAccountDirectory().getUserAccountList()) {  
            //System.out.println(u.getRole());
            if (u.getRole() instanceof DoctorRole && enterprise.equals(u.getAssociatedEnterprise())) {
//                    System.out.println(u);
                bmcDoctorList.addItem(u);
            }
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkQueue = new rojeru_san.complementos.RSTableMetro();
        bmcDoctorList = new javax.swing.JComboBox();
        lblSender = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIssue = new javax.swing.JLabel();
        btnAddEmployee1 = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Patient Work Requests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, -1));

        tblWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Issue", "Request Date", "Reciever", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblWorkQueue.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorBordeHead(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblWorkQueue.setColorFilasForeground1(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorFilasForeground2(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setColorSelBackgound(new java.awt.Color(204, 0, 51));
        tblWorkQueue.setFuenteFilas(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblWorkQueue.setFuenteFilasSelect(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblWorkQueue.setFuenteHead(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tblWorkQueue.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblWorkQueue.setRowHeight(32);
        tblWorkQueue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkQueueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorkQueue);
        if (tblWorkQueue.getColumnModel().getColumnCount() > 0) {
            tblWorkQueue.getColumnModel().getColumn(2).setMinWidth(200);
            tblWorkQueue.getColumnModel().getColumn(4).setMinWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 920, 180));

        bmcDoctorList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Doctor" }));
        bmcDoctorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmcDoctorListActionPerformed(evt);
            }
        });
        add(bmcDoctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 350, -1));
        add(lblSender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 340, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Select Patient from Work Queue");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Select Doctor:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 90, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Issue:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Sender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 20));
        add(lblIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 340, 20));

        btnAddEmployee1.setText("Assign");
        btnAddEmployee1.setkBackGroundColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.setkEndColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.setkHoverEndColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.setkHoverForeGround(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        btnAddEmployee1.setkSelectedColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.setkStartColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployee1ActionPerformed(evt);
            }
        });
        add(btnAddEmployee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 340, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 340, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblWorkQueueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkQueueMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblWorkQueue.getModel();
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        if(currentSelectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from Table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }        
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        
        String sender = model.getValueAt(tblWorkQueue.getSelectedRow(), 0).toString();
        String issue = model.getValueAt(tblWorkQueue.getSelectedRow(), 1).toString();
        
        lblSender.setText(sender);
        lblIssue.setText(issue);
        
        
    }//GEN-LAST:event_tblWorkQueueMouseClicked

    private void bmcDoctorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmcDoctorListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmcDoctorListActionPerformed

    private void btnAddEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployee1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblWorkQueue.getModel();
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        
        currentSelectedRow = tblWorkQueue.getSelectedRow();
        if(currentSelectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from Table", "Warning", JOptionPane.WARNING_MESSAGE);  
            return;
        }
        
        String selectedUser = bmcDoctorList.getSelectedItem().toString();
        UserAccount doctor = system.getUserAccountDirectory().getUserAccountList()
                .stream().filter(x -> x.getUsername().equals(selectedUser)).findFirst().orElse(null);
        
        PatientAppointment appointment = appointments.get(currentSelectedRow);
        if (doctor != null && appointment != null) {
            appointment.setReceiver(doctor);
            JOptionPane.showMessageDialog(null, "Doctor assigned successfully");
        }
        
        populateWorkQueueTable();
    }//GEN-LAST:event_btnAddEmployee1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bmcDoctorList;
    private com.k33ptoo.components.KButton btnAddEmployee1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIssue;
    private javax.swing.JLabel lblSender;
    private rojeru_san.complementos.RSTableMetro tblWorkQueue;
    // End of variables declaration//GEN-END:variables
}