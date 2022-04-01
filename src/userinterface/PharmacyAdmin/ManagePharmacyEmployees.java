/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdmin;

import userinterface.HospAdmin.*;
import userinterface.PatientView.*;
import userinterface.SystemAdminWorkArea.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Patient.Employee;
import Business.Role.DoctorRole;
import Business.Role.NurseRole;
import Business.Role.PharmacistRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityamulik
 */
public class ManagePharmacyEmployees extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private EcoSystem system;
    private UserAccount user;
    private Enterprise enterprise;
    
    public ManagePharmacyEmployees(JPanel container, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.system = system;   
        this.enterprise = enterprise;
        
        txtWelcomeMessage.setText("Welcome to " + this.enterprise);
        
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospitalEmployees.getModel();

        model.setRowCount(0);
        
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
            if (userAccount.getAssociatedEnterprise() == enterprise) {
              //  System.out.println(userAccount);
                Object[] row = new Object[2];
                row[0] = userAccount.getEmployee().getName();
                row[1] = userAccount.getRole().toString();
                model.addRow(row);
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

        txtWelcomeMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalEmployees = new rojeru_san.complementos.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cmbBoxRoles = new javax.swing.JComboBox<>();
        btnAddEmployee = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtWelcomeMessage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtWelcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtWelcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        tblHospitalEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHospitalEmployees.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setColorBordeHead(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblHospitalEmployees.setColorFilasForeground1(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setColorFilasForeground2(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setColorSelBackgound(new java.awt.Color(204, 0, 51));
        tblHospitalEmployees.setFuenteFilas(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblHospitalEmployees.setFuenteFilasSelect(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblHospitalEmployees.setFuenteHead(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tblHospitalEmployees.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblHospitalEmployees.setRowHeight(32);
        jScrollPane1.setViewportView(tblHospitalEmployees);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 920, 230));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Hospital Employees");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 920, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        txtEmployeeName.setBorder(null);
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 370, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("User Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        txtUsername.setBorder(null);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 370, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        txtPassword.setBorder(null);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 370, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Role:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        cmbBoxRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Pharmacist" }));
        add(cmbBoxRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 320, 40));

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.setkBackGroundColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkEndColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkHoverEndColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkHoverForeGround(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        btnAddEmployee.setkPressedColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkSelectedColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.setkStartColor(new java.awt.Color(204, 0, 51));
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 370, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 370, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 370, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 370, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        //        system.getEmployeeDirectory().createEmployee();
        String role = cmbBoxRoles.getSelectedItem().toString();
        String employeeName = txtEmployeeName.getText().toString();

        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        if(cmbBoxRoles.getSelectedItem().toString().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please select a role!");
            return;
        }
        
        if(txtEmployeeName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter your name!");
            return;
        }     
        
        if(txtUsername.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter a username!");
            return;
        } 
        
        if(txtPassword.getPassword().toString().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter a password!");
            return;
        }    

        Employee employee = system.getEmployeeDirectory().createEmployee(employeeName);

        if (role == "Pharmacist") {
            system.getUserAccountDirectory().createUserAccountEnterpriseAdmin(username, password, employee, new PharmacistRole(), enterprise);
            JOptionPane.showMessageDialog(this, employee.getName() + " successfully registered as Pharmacist!");
        } 
        populateTable();
        txtEmployeeName.setText("");
    }//GEN-LAST:event_btnAddEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAddEmployee;
    private javax.swing.JComboBox<String> cmbBoxRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private rojeru_san.complementos.RSTableMetro tblHospitalEmployees;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtWelcomeMessage;
    // End of variables declaration//GEN-END:variables
}
