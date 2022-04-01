/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospAdmin;

import userinterface.PatientView.*;
import userinterface.SystemAdminWorkArea.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Patient.Employee;
import Business.Role.DoctorRole;
import Business.Role.NurseRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityamulik
 */
public class UpdateEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private Employee employee;
    private EcoSystem system;
    private UserAccount user;
    
    public UpdateEmployeeJPanel(JPanel container, Employee employee, EcoSystem system) {
        initComponents();
        this.container = container;
        this.employee = employee;
        this.system = system;  
        this.user = system.getUserAccountDirectory().findEmployee(employee);
        txtEmployeeName.setText(employee.getName());
        txtUsername.setText(user.getUsername());
        txtPassword.setText(user.getPassword());
        if(this.user.getRole().toString().equals("Business.Role.DoctorRole"))
        {
            jRadioButton1Doctor.setSelected(true);
        }
        else
        {
            jRadioButton2Nurse.setSelected(true);
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

        buttonGroupRole = new javax.swing.ButtonGroup();
        txtWelcomeMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnSave = new com.k33ptoo.components.KButton();
        jRadioButton1Doctor = new javax.swing.JRadioButton();
        jRadioButton2Nurse = new javax.swing.JRadioButton();
        txtConfirmPwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtWelcomeMessage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtWelcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtWelcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Update Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txtEmployeeName.setBorder(null);
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 370, 30));

        jLabel6.setText("User Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        txtUsername.setBorder(null);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 370, 30));

        jLabel4.setText("Confirm Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        txtPassword.setBorder(null);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 370, 40));

        jLabel1.setText("Role:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 370, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 370, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 370, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 370, -1));

        btnSave.setText("Save");
        btnSave.setkBackGroundColor(new java.awt.Color(204, 0, 51));
        btnSave.setkEndColor(new java.awt.Color(204, 0, 51));
        btnSave.setkHoverEndColor(new java.awt.Color(204, 0, 51));
        btnSave.setkHoverForeGround(new java.awt.Color(204, 0, 51));
        btnSave.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        btnSave.setkSelectedColor(new java.awt.Color(204, 0, 51));
        btnSave.setkStartColor(new java.awt.Color(204, 0, 51));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        buttonGroupRole.add(jRadioButton1Doctor);
        jRadioButton1Doctor.setText("Doctor");
        add(jRadioButton1Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        buttonGroupRole.add(jRadioButton2Nurse);
        jRadioButton2Nurse.setText("Nurse");
        add(jRadioButton2Nurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        txtConfirmPwd.setBorder(null);
        add(txtConfirmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 370, 40));

        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 370, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validateThis())
        {
            employee.setName(txtEmployeeName.getText());
            user.setUsername(txtUsername.getText());
            user.setPassword(txtPassword.getText());
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSave;
    private javax.swing.ButtonGroup buttonGroupRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1Doctor;
    private javax.swing.JRadioButton jRadioButton2Nurse;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txtConfirmPwd;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtWelcomeMessage;
    // End of variables declaration//GEN-END:variables

    private boolean validateThis() {
        if(("".equals(txtPassword.getPassword())) || ("".equals(txtConfirmPwd.getPassword())) 
                || ("".equals(txtEmployeeName.getText())) || ("".equals(txtUsername.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please fill all details!","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        else if(!(txtPassword.getPassword().equals(txtConfirmPwd.getPassword())))
        {
            JOptionPane.showMessageDialog(null, "Passwords do not match!","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
