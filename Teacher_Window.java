/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarth
 */
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Teacher_Window extends javax.swing.JFrame {

    /**
     * Creates new form Teacher_Window
     */
    public Teacher_Window() throws SQLException {
        initComponents();
        populate_attendance_table();        //method definition is written below
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        class_attendance = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        update_attendance_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Card");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendance Card", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        class_attendance.setBackground(new java.awt.Color(204, 255, 255));
        class_attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll_No", "Name", "ICTT", "ICTT Total", "TOC", "TOC Total", "ADS", "ADS Total", "Attendance(%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(class_attendance);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "----------", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        update_attendance_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update_attendance_btn.setText("Update Attendance");
        update_attendance_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_attendance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_attendance_btnActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Get Defaulters");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Get Student Details");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(153, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(update_attendance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_attendance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populate_attendance_table() throws SQLException         //to diplay attendance table contents in jTable
        {
            Connection conn=null;
                    try {
                        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        DefaultTableModel dtm = (DefaultTableModel) class_attendance.getModel();
                        //setRowColour(1, Color.YELLOW);
                        conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sarth\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Study Material\\SEM 4\\PBL\\MIT Smart Attendance\\My_Database.db");
                        Statement stmt=conn.createStatement();
                       
                       int rowCount = dtm.getRowCount();
                        //clear the class_attendance table before filling it everytime
                        for (int i = rowCount - 1; i >= 0; i--) {
                            dtm.removeRow(i);
                        }
                        ResultSet rs=stmt.executeQuery("select a.Roll_no,sd.Name,a.Subject1,a.S1,a.Subject2,a.S2,a.Subject3,a.S3,a.Attendance from attendance a,student_details sd WHERE a.Roll_no=sd.Roll_no");
                        //testResultSet(rs);
                        ResultSetMetaData meta = rs.getMetaData();
                        int numberOfColumns;
                        numberOfColumns = meta.getColumnCount();
                        while(rs.next()){
                            Object [] rowData = new Object[numberOfColumns];
                            for (int i = 0; i < rowData.length; ++i)
                            {
                                rowData[i] = rs.getObject(i+1);
                                if(i==rowData.length-1)     //when last column i.e. attendaance column calculate attendance and update
                                {
                                    int total_attended=((int)rowData[2]+(int)rowData[4]+(int)rowData[6]);           //subject1+subject2+subject3
                                    int total_lectures=((int)rowData[3]+(int)rowData[5]+(int)rowData[7]);           //S1+S2+S3
                                    //JOptionPane.showMessageDialog(null,""+total_attended+" "+total_lectures,"", JOptionPane.ERROR_MESSAGE);
                                    float result=((float)total_attended/(float)total_lectures)*100;
                                    rowData[i]=(float)(result);             //Attendance=(Subject1+Subject2+Subject3)/(S1+S2+S3);
                                   // JOptionPane.showMessageDialog(null,total_attended+" "+total_lectures+" "+result,"", JOptionPane.ERROR_MESSAGE);
                                    
                                }
                                //JOptionPane.showMessageDialog(null,""+rowData[i],"", JOptionPane.ERROR_MESSAGE);
                            }
                            dtm.addRow(rowData);
                            //dtm.addRow(new Object[]{"Column 1", "Column 2", "Column 3","Column 1", "Column 2", "Column 3"});
                            dtm.fireTableDataChanged();
                            //dtm.fireTableStructureChanged();
                        }


                    } catch (SQLException ex) {
                        Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn.close();
        }
    
    
    
    
    private void update_attendance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_attendance_btnActionPerformed
        // TODO add your handling code here:
        
        String subject_name= JOptionPane.showInputDialog("Enter the subject name: ");
        String rollnos = JOptionPane.showInputDialog("Enter the roll numbers of the present students: ");
       String subject_present=null;
        if(subject_name.equals("ICTT"))
        {
            subject_present="ICTT_total";
        }
        else if(subject_name.equals("TOC"))
        {
            subject_present="TOC_total";
        }
        else if(subject_name.equals("ADS"))
        {
            subject_present="ADS_total";
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid subject name!","", JOptionPane.ERROR_MESSAGE);
            try {
                new Teacher_Window().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int cnt=0;
        String[] rno = rollnos.split(",");              // to split the roll no list

        Connection conn=null;
        Statement stmt=null;
       while(cnt<rno.length)
       {
           //System.out.println(rno[cnt++]);
       
        
                try {
                    //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    DefaultTableModel dtm = (DefaultTableModel) class_attendance.getModel();
                    conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sarth\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Study Material\\SEM 4\\PBL\\MIT Smart Attendance\\My_Database.db");
                    stmt=conn.createStatement();
                    //int sub_name=Integer.parseInt(subject_name);
                    //sub_name++;
                    //subject_name=""+sub_name;
                    //System.out.println("Updated Subject count:"+subject_name);
                               
                  
                
                    stmt.executeUpdate("update attendance set "+subject_name+"="+subject_name+"+1"+" where roll_no="+rno[cnt]); //increment total attended lecture count of that subject
                    
                    
                    
                    
                    
                    //calculate updated attendance percentage
                    ResultSet rs= stmt.executeQuery("select * from attendance"+" where roll_no="+rno[cnt]);
                    int subject1=(int)rs.getInt(2);
                    int subject1_total=(int)rs.getInt(3);
                    int subject2=(int)rs.getInt(4);
                    int subject2_total=(int)rs.getInt(5);
                    int subject3=(int)rs.getInt(6);
                    int subject3_total=(int)rs.getInt(7);
                    
                    int attended=subject1+subject2+subject3;
                    int total=subject1_total+subject2_total+subject3_total+1;               //add 1 because attended subject's total is not incremented here so we need to consider it as well
                    System.out.println(subject1+"\t"+subject1_total+"\n"+subject2+"\t"+subject2_total+"\n"+subject3+"\t"+subject3_total);
                    
                    float percentage=((float)attended/(float)total)*100;
                    System.out.println("Percentage:"+percentage);
                    stmt.executeUpdate("update attendance set Attendance="+percentage+" where roll_no="+rno[cnt]);   //update attendance %
                    
                    
                    
                    cnt++;
                    } 
                    catch (SQLException ex) {
                        Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }//end of while
        try {
            
                stmt.executeUpdate("update attendance set "+subject_present+"="+subject_present+"+1");     //increment total lecture count of that subject
                
               
                
            } catch (SQLException ex) {
                Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        try {
            //new Teacher_Window().setVisible(true);
            populate_attendance_table();
            JOptionPane.showMessageDialog(null,"Attendance updated successfully!","", JOptionPane.INFORMATION_MESSAGE);
                            
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_attendance_btnActionPerformed

    
    
    
     public static int roll_no;
     public static long phone;
     public static String name,department,year,division,email;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
        String rno=JOptionPane.showInputDialog("Enter the Roll Number of student: ");
        Connection conn=null;
        try {
            conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sarth\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Study Material\\SEM 4\\PBL\\MIT Smart Attendance\\My_Database.db");
       
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student_details where Roll_no="+rno);
        
        roll_no=rs.getInt(1);
        name=rs.getString(2);
        department=rs.getString(3);
        year=rs.getString(4);
        division=rs.getString(5);
        email=rs.getString(6);
        phone=rs.getLong(7);
        
                
         } catch (SQLException ex) {
            Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        new student_details().setVisible(true);             //goto student details tab
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            String btnText=jButton3.getText();
            if(btnText.equalsIgnoreCase("Get Defaulters"))
            {    
                Connection conn=null;
                Statement stmt;


                        DefaultTableModel dtm = (DefaultTableModel) class_attendance.getModel();

                        int rowCount = dtm.getRowCount();
                        //clear the class_attendance table before filling it everytime
                        for (int i = rowCount - 1; i >= 0; i--) {
                            dtm.removeRow(i);
                        }
            try {
                    conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sarth\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Study Material\\SEM 4\\PBL\\MIT Smart Attendance\\My_Database.db");

                    stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery("select a.Roll_no,sd.Name,a.Subject1,a.S1,a.Subject2,a.S2,a.Subject3,a.S3,a.Attendance from attendance a,student_details sd WHERE a.Roll_no=sd.Roll_no AND a.Attendance<75");
                    ResultSetMetaData meta = rs.getMetaData();
                    int numberOfColumns;
                    numberOfColumns = meta.getColumnCount();
                    while(rs.next())
                    {
                        Object [] rowData = new Object[numberOfColumns];
                        for (int i = 0; i < rowData.length; ++i)
                        {
                            rowData[i] = rs.getObject(i+1);
                        }
                        dtm.addRow(rowData);
                        dtm.fireTableDataChanged();
                    }
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
                jButton3.setText("Show All Records");
            }
            else if(btnText.equalsIgnoreCase("Show All Records"))
            {
                try {
                    populate_attendance_table();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
                jButton3.setText("Get Defaulters");
                
            }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Teacher_Window().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable class_attendance;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update_attendance_btn;
    // End of variables declaration//GEN-END:variables
}