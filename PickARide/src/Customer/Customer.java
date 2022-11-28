/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mumu2015
 */
public class Customer extends javax.swing.JFrame {
public Connection connection;
public PreparedStatement pst;
    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
    }
    
    
    
    public void close(){
        
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextPresentAddress = new javax.swing.JTextField();
        jTextNIDNo = new javax.swing.JTextField();
        jTextPermanentAddress = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextPassportNo = new javax.swing.JTextField();
        jTextContactNo = new javax.swing.JTextField();
        jBtnDELETE = new javax.swing.JButton();
        jBtnUPDATE = new javax.swing.JButton();
        jBtnPRINT = new javax.swing.JButton();
        jBtnBACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomer = new javax.swing.JTable();
        jBtnSAVE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextCustomerID = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSearchOrder = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("CUSTOMER");

        jLabel2.setText("Customer ID*");

        jLabel3.setText("Permanent Address*");

        jLabel4.setText("Present Address*");

        jLabel5.setText("E mail*");

        jLabel6.setText("NID No*");

        jLabel7.setText("Contact No*");

        jLabel8.setText("Passport No");

        jTextPresentAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPresentAddressActionPerformed(evt);
            }
        });

        jTextPermanentAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPermanentAddressActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jTextPassportNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPassportNoActionPerformed(evt);
            }
        });

        jTextContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContactNoActionPerformed(evt);
            }
        });

        jBtnDELETE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnDELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnDELETE.setText("DELETE");
        jBtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDELETEActionPerformed(evt);
            }
        });

        jBtnUPDATE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnUPDATE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnUPDATE.setText("UPDATE");
        jBtnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUPDATEActionPerformed(evt);
            }
        });

        jBtnPRINT.setBackground(new java.awt.Color(255, 153, 153));
        jBtnPRINT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnPRINT.setText("SHOW");
        jBtnPRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPRINTActionPerformed(evt);
            }
        });

        jBtnBACK.setBackground(new java.awt.Color(255, 153, 153));
        jBtnBACK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnBACK.setText("BACK");
        jBtnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBACKActionPerformed(evt);
            }
        });

        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Present Address", "Permanent Address", "NID No", "E mail", "Passport No", "Contact No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCustomer);

        jBtnSAVE.setBackground(new java.awt.Color(255, 153, 153));
        jBtnSAVE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSAVE.setText("SAVE");
        jBtnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSAVEActionPerformed(evt);
            }
        });

        jLabel9.setText("Name*");

        jTextCustomerID.setToolTipText("");

        filler1.setToolTipText("Required");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Search Here");

        jTextFieldSearchOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchOrderKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("* Required Fields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPassportNo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPermanentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(jButton1)
                                            .addGap(24, 24, 24)
                                            .addComponent(jBtnBACK)))
                                    .addGap(95, 95, 95)))
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnSAVE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnUPDATE)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnDELETE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPRINT)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPermanentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPassportNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSAVE)
                    .addComponent(jBtnUPDATE)
                    .addComponent(jBtnDELETE)
                    .addComponent(jBtnPRINT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBtnBACK))
                .addGap(34, 34, 34))
        );

        setSize(new java.awt.Dimension(1135, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPermanentAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPermanentAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPermanentAddressActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextPassportNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPassportNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPassportNoActionPerformed

    private void jTextContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContactNoActionPerformed

    private void jBtnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUPDATEActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)jTableCustomer.getModel();
        
        if(jTableCustomer.getSelectedRowCount()==1){
            String CustomerID = jTextCustomerID.getText();
            String CustomerName = jTextName.getText();
            String PresentAddress = jTextPresentAddress.getText();
            String PermanentAddress = jTextPermanentAddress.getText();
            String C_NID_No = jTextNIDNo.getText();
            String C_Email = jTextEmail.getText();
            String C_PassportNo = jTextPassportNo.getText();
            String C_Phone = jTextContactNo.getText();
        
            try
          {
            
            String query = "update CUSTOMER set CustomerName=?,PresentAddress=?,PermanentAddress=?,C_NID_No=?,C_EmailAddress=?,C_PassportNo=?,C_Phone=? where CustomerId = ?";
           
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setString(1,jTextName.getText());
            pst.setString(2,jTextPresentAddress.getText());
            pst.setString(3,jTextPermanentAddress.getText());
            pst.setString(4,jTextNIDNo.getText());
            pst.setString(5,jTextEmail.getText());
            pst.setString(6,jTextPassportNo.getText());
            pst.setString(7,jTextContactNo.getText());
            pst.setString(8,jTextCustomerID.getText());
            
            pst.executeUpdate();
              //set updated value to table row 
            tblModel.setValueAt(CustomerID,jTableCustomer.getSelectedRow(),0);
            tblModel.setValueAt(CustomerName,jTableCustomer.getSelectedRow(),1);
            tblModel.setValueAt(PresentAddress,jTableCustomer.getSelectedRow(),2);
            tblModel.setValueAt(PermanentAddress,jTableCustomer.getSelectedRow(),3);
            tblModel.setValueAt(C_NID_No,jTableCustomer.getSelectedRow(),4);
            tblModel.setValueAt(C_Email,jTableCustomer.getSelectedRow(),5);
            tblModel.setValueAt(C_PassportNo,jTableCustomer.getSelectedRow(),6);
            tblModel.setValueAt(C_Phone,jTableCustomer.getSelectedRow(),7);
            
             
           JOptionPane.showMessageDialog (this,"Update is successful");
            
           jTextCustomerID.setText("");
           jTextName.setText("");
           jTextPresentAddress.setText("");
           jTextPermanentAddress.setText("");
           jTextNIDNo.setText("");
           jTextEmail.setText("");
           jTextPassportNo.setText("");
           jTextContactNo.setText("");

            
          } catch(Exception e){
              JOptionPane.showMessageDialog (this,"Syntax error");	
          }
            
            
            //update message
            //JOptionPane.showMessageDialog (this, "Update is successful");
        }
        else{
            if(jTableCustomer.getRowCount()==0)
                JOptionPane.showMessageDialog (this, "Table is empty");
            else
                JOptionPane.showMessageDialog (this, "Please select single row");
            
        }
            
    }//GEN-LAST:event_jBtnUPDATEActionPerformed

    private void jBtnPRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPRINTActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=PickARide;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM CUSTOMER");
            
            
            while (resultSet.next()) {
               String CustomerId = resultSet.getString("CustomerId");
               String CustomerName = resultSet.getString("CustomerName");
               String PresentAddress = resultSet.getString("PresentAddress");
               String PermanentAddress = resultSet.getString("PermanentAddress");
               String C_NID_No = resultSet.getString("C_NID_No");
               String C_Email = resultSet.getString("C_EmailAddress");
               String C_PassportNo = resultSet.getString("C_PassportNo");
               String C_Phone = resultSet.getString("C_Phone");
               
               String tbData[]={CustomerId,CustomerName,PresentAddress,PermanentAddress,
               C_NID_No,C_Email,C_PassportNo,C_Phone};
               
               DefaultTableModel tblModel = (DefaultTableModel)jTableCustomer.getModel();
               tblModel.addRow(tbData); 
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jBtnPRINTActionPerformed

    private void jBtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDELETEActionPerformed
        // TODO add your handling code here:
        
        
        
        DefaultTableModel tblModel = (DefaultTableModel)jTableCustomer.getModel();
        
        //delete row
        if(jTableCustomer.getSelectedRowCount()==1){
        try
          {
            String query = "delete from CUSTOMER where CustomerId=?";
            
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setString(1,jTextCustomerID.getText());
            
            pst.executeUpdate();
            tblModel.removeRow(jTableCustomer.getSelectedRow());
            JOptionPane.showMessageDialog (this,"Data has been deleted");
            
            
          } catch(Exception e){
              JOptionPane.showMessageDialog (this, e.getMessage());	
          }
        }
        else {
            
             if(jTableCustomer.getRowCount()==0)
             JOptionPane.showMessageDialog (this, "Table is empty");
             
             else
             JOptionPane.showMessageDialog (this, "Please select single row");  
        }
           jTextCustomerID.setText("");
           jTextName.setText("");
           jTextPresentAddress.setText("");
           jTextPermanentAddress.setText("");
           jTextNIDNo.setText("");
           jTextEmail.setText("");
           jTextPassportNo.setText("");
           jTextContactNo.setText("");

        
    }//GEN-LAST:event_jBtnDELETEActionPerformed

    private void jTextPresentAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPresentAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPresentAddressActionPerformed

    private void jBtnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSAVEActionPerformed
        // TODO add your handling code here:
       if(jTextCustomerID.getText().equals("")||jTextName.getText().equals("")||
        jTextPresentAddress.getText().equals("")||jTextPermanentAddress.getText().equals("")
        ||jTextNIDNo.getText().equals("")||jTextEmail.getText().equals("")||
              jTextContactNo.getText().equals("") ){
           
           JOptionPane.showMessageDialog (this, "Please enter required fields");
       } 
       else{
           try
          {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=PickARide;selectMethod=cursor", "sa", "123456");
            
            String query = "insert into CUSTOMER (CustomerId,CustomerName,PresentAddress,PermanentAddress,C_NID_No,C_EmailAddress,C_PassportNo,C_Phone)values (? ,?, ?, ?, ?, ? ,? ,?)";
            
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setString(1,jTextCustomerID.getText());
            pst.setString(2,jTextName.getText());
            pst.setString(3,jTextPresentAddress.getText());
            pst.setString(4,jTextPermanentAddress.getText());
            pst.setString(5,jTextNIDNo.getText());
            pst.setString(6,jTextEmail.getText());
            pst.setString(7,jTextPassportNo.getText());
            pst.setString(8,jTextContactNo.getText());
            
            pst.executeUpdate();
            
            String data[]= {jTextCustomerID.getText(),jTextName.getText(),
           jTextPresentAddress.getText(),jTextPermanentAddress.getText(),
           jTextNIDNo.getText(),jTextEmail.getText(),jTextPassportNo.getText(),
           jTextContactNo.getText()};
           
           DefaultTableModel tblModel = (DefaultTableModel)jTableCustomer.getModel();
           tblModel.addRow(data);// adds row
           
            JOptionPane.showMessageDialog (this,"Information added");
	    
           jTextCustomerID.setText("");
           jTextName.setText("");
           jTextPresentAddress.setText("");
           jTextPermanentAddress.setText("");
           jTextNIDNo.setText("");
           jTextEmail.setText("");
           jTextPassportNo.setText("");
           jTextContactNo.setText("");

            
          } catch(Exception e){
              JOptionPane.showMessageDialog (this, e.getMessage());	
          }
       }

            
    }//GEN-LAST:event_jBtnSAVEActionPerformed

    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)jTableCustomer.getModel();
        
        //when row is selected, set data to textfield
        String CustomerID = tblModel.getValueAt(jTableCustomer.getSelectedRow(),0).toString();
        String CustomerName = tblModel.getValueAt(jTableCustomer.getSelectedRow(),1).toString();
        String PresentAddress = tblModel.getValueAt(jTableCustomer.getSelectedRow(),2).toString();
        String PermanentAddress = tblModel.getValueAt(jTableCustomer.getSelectedRow(),3).toString();
        String C_NID_No = tblModel.getValueAt(jTableCustomer.getSelectedRow(),4).toString();
        String C_Email = tblModel.getValueAt(jTableCustomer.getSelectedRow(),5).toString();
        String PassportNo = tblModel.getValueAt(jTableCustomer.getSelectedRow(),6).toString();
        String C_Phone = tblModel.getValueAt(jTableCustomer.getSelectedRow(),7).toString();
        
        //set to textfield
        jTextCustomerID.setText(CustomerID);
        jTextName.setText(CustomerName);
        jTextPresentAddress.setText(PresentAddress);
        jTextPermanentAddress.setText(PermanentAddress);
        jTextNIDNo.setText(C_NID_No);
        jTextEmail.setText(C_Email);
        jTextPassportNo.setText(PassportNo);
        jTextContactNo.setText(C_Phone);
        
        
    }//GEN-LAST:event_jTableCustomerMouseClicked

    private void jBtnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBACKActionPerformed
        // TODO add your handling code here:
        
        close();
        HomePage hp = new HomePage() ;
        hp.setVisible(true);
        
    }//GEN-LAST:event_jBtnBACKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         
        close();
        OF of = new OF() ;
        of.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSearchOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchOrderKeyReleased
        // TODO add your handling code here:

        DefaultTableModel table = (DefaultTableModel)jTableCustomer.getModel();
        String search = jTextFieldSearchOrder.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableCustomer.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextFieldSearchOrderKeyReleased
    
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBtnBACK;
    private javax.swing.JButton jBtnDELETE;
    private javax.swing.JButton jBtnPRINT;
    private javax.swing.JButton jBtnSAVE;
    private javax.swing.JButton jBtnUPDATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextField jTextContactNo;
    private javax.swing.JTextField jTextCustomerID;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFieldSearchOrder;
    private javax.swing.JTextField jTextNIDNo;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassportNo;
    private javax.swing.JTextField jTextPermanentAddress;
    private javax.swing.JTextField jTextPresentAddress;
    // End of variables declaration//GEN-END:variables
}
