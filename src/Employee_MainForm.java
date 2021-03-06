
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Employee_MainForm extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    
    public Employee_MainForm() {
        initComponents();
        GetText();
    }

    public void GetText(){
        EUser.setText(Login.UserNameTxt.getText());
        ECategory.setText(Login.CombSelect.getSelectedItem().toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EUser = new javax.swing.JLabel();
        ECategory = new javax.swing.JLabel();
        MoveBar = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 100, 80, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User     :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(880, 70, 60, 30);

        EUser.setBackground(new java.awt.Color(0, 0, 0));
        EUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EUser.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(EUser);
        EUser.setBounds(950, 70, 150, 30);

        ECategory.setBackground(new java.awt.Color(0, 0, 0));
        ECategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ECategory.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(ECategory);
        ECategory.setBounds(950, 100, 150, 30);

        MoveBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MoveBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveBarMouseDragged(evt);
            }
        });
        MoveBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveBarMousePressed(evt);
            }
        });
        getContentPane().add(MoveBar);
        MoveBar.setBounds(0, 0, 990, 40);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(1000, 0, 50, 40);

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(1050, 0, 60, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("This Module Under Development.  Will be Available On Next Update.....");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 360, 820, 160);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employee.png"))); // NOI18N
        jLabel1.setText("Employee Main Form");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 740);

        setSize(new java.awt.Dimension(1109, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     /*   try {
            setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MoveBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MoveBarMouseDragged

    private void MoveBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveBarMousePressed

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(Admin_MainForm.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_CloseMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Employee_MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel ECategory;
    private javax.swing.JLabel EUser;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel MoveBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
