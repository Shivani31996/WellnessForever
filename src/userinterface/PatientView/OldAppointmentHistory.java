/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientView;

import Business.Appointment.AppointmentDirectory;
import Business.Appointment.PatientAppointment;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityamulik
 */
public class OldAppointmentHistory extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
    JPanel container;
    private EcoSystem system;
    private UserAccount user;
    private List<PatientAppointment> appointments;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public OldAppointmentHistory(JPanel container, EcoSystem system, UserAccount user) {
        initComponents();
        this.container = container;
        this.system = system;
        this.user = user;  
        populateTable();
    }

    public void populateTable() {
        AppointmentDirectory apptDir = system.getAppointmentDirectory();
        
//        System.out.println(apptDir.getAppointmentAccountList().size());
        
        DefaultTableModel model = (DefaultTableModel) tblOldAppts.getModel();

        model.setRowCount(0);
        
        appointments = apptDir.getAppointmentAccountList();
        
        for (PatientAppointment w: appointments) {
            if (w.getSender().equals(this.user)) {
                // System.out.println(w);
                Object[] row = new Object[6];
                row[0] = w.getSender();
                row[1] = w.getIssue();
                row[2] = w.getRequestDate().toString();
//                row[3] = null;
                row[3] = w.getReceiver();
                row[4] = w.getStatus();
                row[5] = w.getMessage();
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOldAppts = new rojeru_san.complementos.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 663));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Appointment History");

        tblOldAppts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Issue", "Request Date", "Doctor", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblOldAppts.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblOldAppts.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tblOldAppts.setColorBordeHead(new java.awt.Color(204, 0, 51));
        tblOldAppts.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblOldAppts.setColorFilasForeground1(new java.awt.Color(204, 0, 51));
        tblOldAppts.setColorFilasForeground2(new java.awt.Color(204, 0, 51));
        tblOldAppts.setColorSelBackgound(new java.awt.Color(204, 0, 51));
        tblOldAppts.setFuenteFilas(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblOldAppts.setFuenteFilasSelect(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblOldAppts.setFuenteHead(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tblOldAppts.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblOldAppts.setRowHeight(32);
        tblOldAppts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOldApptsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOldAppts);
        if (tblOldAppts.getColumnModel().getColumnCount() > 0) {
            tblOldAppts.getColumnModel().getColumn(0).setMinWidth(1);
            tblOldAppts.getColumnModel().getColumn(0).setMaxWidth(200);
            tblOldAppts.getColumnModel().getColumn(1).setMinWidth(100);
            tblOldAppts.getColumnModel().getColumn(2).setMinWidth(200);
            tblOldAppts.getColumnModel().getColumn(3).setMinWidth(0);
            tblOldAppts.getColumnModel().getColumn(5).setMinWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOldApptsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOldApptsMouseClicked

    }//GEN-LAST:event_tblOldApptsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.complementos.RSTableMetro tblOldAppts;
    // End of variables declaration//GEN-END:variables
}
