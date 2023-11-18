
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class UserGUI extends javax.swing.JFrame {

    /**
     * Creates new form UserGUI
     */
    public UserGUI() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUserAge = new javax.swing.JTextField();
        txtUserHeight = new javax.swing.JTextField();
        txtUserWeight = new javax.swing.JTextField();
        txtUserAddress = new javax.swing.JTextField();
        cmbUserFitnessLevel = new javax.swing.JComboBox<>();
        btnSaveUserInfo = new javax.swing.JButton();
        btnFitSection = new javax.swing.JButton();
        btnHealthSection = new javax.swing.JButton();
        btnSupportSection = new javax.swing.JButton();
        btnNutritionSection = new javax.swing.JButton();
        btnMoodSection = new javax.swing.JButton();
        btnStressSection = new javax.swing.JButton();
        btnBuddyUpSection = new javax.swing.JButton();
        btnResourcesSection = new javax.swing.JButton();
        btnMoodImprovementPlan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Height");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Weight:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Fitness Level:");

        cmbUserFitnessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Expert" }));
        cmbUserFitnessLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserFitnessLevelActionPerformed(evt);
            }
        });

        btnSaveUserInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSaveUserInfo.setText("Save");

        btnFitSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFitSection.setText("Fit ");
        btnFitSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFitSectionActionPerformed(evt);
            }
        });

        btnHealthSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnHealthSection.setText("Health");
        btnHealthSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthSectionActionPerformed(evt);
            }
        });

        btnSupportSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSupportSection.setText("Support");

        btnNutritionSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNutritionSection.setText("Nutrition");
        btnNutritionSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNutritionSectionActionPerformed(evt);
            }
        });

        btnMoodSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMoodSection.setText("Mood");
        btnMoodSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoodSectionActionPerformed(evt);
            }
        });

        btnStressSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStressSection.setText("Stress");
        btnStressSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStressSectionActionPerformed(evt);
            }
        });

        btnBuddyUpSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBuddyUpSection.setText("BuddyUp");
        btnBuddyUpSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuddyUpSectionActionPerformed(evt);
            }
        });

        btnResourcesSection.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnResourcesSection.setText("Resources");

        btnMoodImprovementPlan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMoodImprovementPlan.setText("Mood Improovement");
        btnMoodImprovementPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoodImprovementPlanActionPerformed(evt);
            }
        });

        jLabel7.setText("kg");

        jLabel8.setText("cm");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N
        jLabel9.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightsGrey.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUserHeight, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtUserAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtUserWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbUserFitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUserAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSaveUserInfo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHealthSection, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNutritionSection, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSupportSection)
                                            .addComponent(btnStressSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnResourcesSection)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuddyUpSection))
                                            .addComponent(btnMoodImprovementPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFitSection, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMoodSection, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(42, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbUserFitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSaveUserInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHealthSection)
                    .addComponent(btnSupportSection)
                    .addComponent(btnResourcesSection)
                    .addComponent(btnBuddyUpSection)
                    .addComponent(btnMoodSection))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNutritionSection)
                    .addComponent(btnStressSection)
                    .addComponent(btnMoodImprovementPlan)
                    .addComponent(btnFitSection))
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuddyUpSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuddyUpSectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuddyUpSectionActionPerformed

    private void btnHealthSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthSectionActionPerformed
        // TODO add your handling code here:
        HealthGUI health = new HealthGUI(this);
        health.setVisible(true);
        health.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnHealthSectionActionPerformed

    private void btnNutritionSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNutritionSectionActionPerformed
        // TODO add your handling code here:
        NutritionGUI nutrition = new NutritionGUI(this);
        nutrition.setVisible(true);
        nutrition.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnNutritionSectionActionPerformed

    private void btnFitSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFitSectionActionPerformed
        // TODO add your handling code here:
        FitGUI fit = new FitGUI(this);
        fit.setVisible(true);
        fit.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnFitSectionActionPerformed

    private void cmbUserFitnessLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserFitnessLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserFitnessLevelActionPerformed

    private void btnMoodSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoodSectionActionPerformed
        // TODO add your handling code here:
        MoodGUI mood = new MoodGUI(this);
        mood.setVisible(true);
        mood.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnMoodSectionActionPerformed

    private void btnStressSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStressSectionActionPerformed
        // TODO add your handling code here:
        StressGUI stress = new StressGUI(this);
        stress.setVisible(true);
        stress.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnStressSectionActionPerformed

    private void btnMoodImprovementPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoodImprovementPlanActionPerformed
        // TODO add your handling code here:
        MoodImprovementPlanGUI moodImprove = new MoodImprovementPlanGUI(this);
        moodImprove.setVisible(true);
        moodImprove.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnMoodImprovementPlanActionPerformed

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
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuddyUpSection;
    private javax.swing.JButton btnFitSection;
    private javax.swing.JButton btnHealthSection;
    private javax.swing.JButton btnMoodImprovementPlan;
    private javax.swing.JButton btnMoodSection;
    private javax.swing.JButton btnNutritionSection;
    private javax.swing.JButton btnResourcesSection;
    private javax.swing.JButton btnSaveUserInfo;
    private javax.swing.JButton btnStressSection;
    private javax.swing.JButton btnSupportSection;
    private javax.swing.JComboBox<String> cmbUserFitnessLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtUserAddress;
    private javax.swing.JTextField txtUserAge;
    private javax.swing.JTextField txtUserHeight;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserWeight;
    // End of variables declaration//GEN-END:variables
}
