import java.sql.*;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame9.java
 *
 * Created on Jan 26, 2017, 10:35:59 AM
 */

/**
 *
 * @author IVPS
 */
public class NewJFrame9 extends javax.swing.JFrame {
    Connection con=null;
Statement stm=null;
ResultSet rs=null;

    /** Creates new form NewJFrame9 */
    public NewJFrame9() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 230, 170, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "audi", "honda ", "Nissan" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 40, 170, 30);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 130, 170, 30);

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 170, 170, 30);

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 82, 170, 30);

        jLabel1.setText("MANUFACTURER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 120, 14);

        jLabel2.setText("CAR MODEL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 140, 30);

        jLabel3.setText("SPECIFICATIONS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 150, 30);

        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 170, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("H:\\Images\\audi logo.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 590, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    gv.q= (String) jComboBox1.getSelectedItem();
gv.p= (String) jComboBox2.getSelectedItem();
try{
    Class.forName("java.sql.Driver");

   con=DriverManager.getConnection("jdbc:mysql://localhost/b","root","deepali");
       stm=con.createStatement();
       String q="Insert into gv.q values('"+gv.p+"', "+jTextField1.getText()+",'"+jTextField2.getText()+"','"+jTextField3.getText()+"');";
stm.executeUpdate(q);

   }

    catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
new NewJFrame().setVisible(true);
     this.dispose();








        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 try{
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/b","root","deepali");
    stm=con.createStatement();
    String q="Select CarName from "+jComboBox1.getSelectedItem()+";";
    rs=stm.executeQuery(q);
    while(rs.next())
    {jComboBox2.addItem(rs.getString(1));
    }
    }
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());

}
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    try{
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/b","root","deepali");
    stm=con.createStatement();
    String q="Select CarName from "+jComboBox1.getSelectedItem()+";";
    rs=stm.executeQuery(q);
    while(rs.next())
    {jComboBox2.addItem(rs.getString(1));
    }
    }
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());

    // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
