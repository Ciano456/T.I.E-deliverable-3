
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        cmbFitnessLevel = new javax.swing.JComboBox<>();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSaved = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Full Name:");

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

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        cmbFitnessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Expert" }));
        cmbFitnessLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFitnessLevelActionPerformed(evt);
            }
        });

        btnSaveUserInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSaveUserInfo.setText("Save");
        btnSaveUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserInfoActionPerformed(evt);
            }
        });

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
        btnSupportSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupportSectionActionPerformed(evt);
            }
        });

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
        btnResourcesSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesSectionActionPerformed(evt);
            }
        });

        btnMoodImprovementPlan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMoodImprovementPlan.setText("Mood Improovement");
        btnMoodImprovementPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoodImprovementPlanActionPerformed(evt);
            }
        });

        jLabel7.setText("kg");

        jLabel8.setText("cm");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightsGrey.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(cmbFitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserAddress)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                    .addComponent(txtUserHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHealthSection, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNutritionSection, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnStressSection, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMoodImprovementPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSupportSection)
                                        .addGap(7, 7, 7)
                                        .addComponent(btnResourcesSection)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuddyUpSection)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFitSection, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMoodSection, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblSaved, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveUserInfo)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
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
                    .addComponent(cmbFitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveUserInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblSaved, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuddyUpSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuddyUpSectionActionPerformed
        // TODO add your handling code here:
        BuddyUpGUI buddyUp = new BuddyUpGUI(this);
        buddyUp.setVisible(true);
        buddyUp.setLocationRelativeTo(null);
        
        this.setVisible(false);
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

    private void cmbFitnessLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFitnessLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFitnessLevelActionPerformed

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

    private void btnSupportSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupportSectionActionPerformed
        // TODO add your handling code here:
        SupportGUI support = new SupportGUI(this);
        support.setVisible(true);
        support.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnSupportSectionActionPerformed

    private void btnResourcesSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResourcesSectionActionPerformed
        // TODO add your handling code here:
        ResourcesGUI resource = new ResourcesGUI(this);
        resource.setVisible(true);
        resource.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnResourcesSectionActionPerformed

    private void btnSaveUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserInfoActionPerformed
        // TODO add your handling code here:
    try {
        String userName = validateStringInput(txtUserName.getText(), "User Name");
        int userAge = validateAndParseInt(txtUserAge.getText(), "User Age");
        int userHeight = validateAndParseInt(txtUserHeight.getText(), "User Height");
        double userWeight = validateAndParseDouble(txtUserWeight.getText(), "User Weight");
        String userAddress = validateStringInput(txtUserAddress.getText(), "User Address");

        // Retrieve fitness level from combo box
        String userFitnessLevel = (String) cmbFitnessLevel.getSelectedItem();
        int motivationLevel = promptMotivationLevel();

        // Create or update User instance with validated input
        User user = User.getInstance();
        user.setUserName(userName);
        user.setUserAge(userAge);
        user.setUserHeigth(userHeight);
        user.setUserWeight(userWeight);
        user.setUserAddress(userAddress);
        user.setUserFitnessLevel(userFitnessLevel);
        user.setMotivationLevel(motivationLevel);

        // Display personalized message based on user's fitness level and motivation
        displayPersonalizedMessage(userName, userFitnessLevel, motivationLevel);

        // Update label to indicate information has been saved
        lblSaved.setText("Information saved, please choose your next step.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Validate and prompt for motivation level
    private int promptMotivationLevel(){
    int motivationLevel = 0;
    boolean validInput = false;

    while (!validInput) {
        try {
            motivationLevel = Integer.parseInt(JOptionPane.showInputDialog("On a scale from 0 to 10, what is your motivation?"));
            if (motivationLevel >= 0 && motivationLevel <= 10) {
                validInput = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a value between 0 and 10.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10.");
        }
    }
    return motivationLevel;
    }

    // Display personalized message based on user's fitness level and motivation
    private void displayPersonalizedMessage(String userName, String fitnessLevel, int motivationLevel) {
        int userFirstName = userName.indexOf(" ");
        if (motivationLevel < 5) {
            JOptionPane.showMessageDialog(null, "Hey " + userName.substring(0, userFirstName) + " as " + fitnessLevel.toLowerCase() + " you're in the best place to get motivated!");
        } else if (motivationLevel > 5 && motivationLevel < 9) {
            JOptionPane.showMessageDialog(null, "Hey " + userName.substring(0, userFirstName) + " I'm sure you'll get enough motivation while using the app, especially being " + fitnessLevel.toLowerCase() + " level!");
        } else {
            JOptionPane.showMessageDialog(null, "Hey " + userName.substring(0, userFirstName) + " welcome to our app! We love motivated people!");
        }
    }

    // Method to validate string input from text fields
    private String validateStringInput(String input, String fieldName) throws IllegalArgumentException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " field is empty.");
        }
        return input;
    }

    // Method to validate and parse integer input from text fields
    private int validateAndParseInt(String input, String fieldName) throws NumberFormatException, IllegalArgumentException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " field is empty.");
        }

        try {
            int value = Integer.parseInt(input);
            if (value < 0) {
                throw new IllegalArgumentException(fieldName + " cannot be negative.");
            }
            return value;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Invalid input for " + fieldName + ". Please enter a valid integer value.");
        }
    }

    // Method to validate and parse double input from text fields
    private double validateAndParseDouble(String input, String fieldName) throws NumberFormatException, IllegalArgumentException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " field is empty.");
        }

        try {
            double value = Double.parseDouble(input);
            if (value < 0) {
                throw new IllegalArgumentException(fieldName + " cannot be negative.");
            }
            return value;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Invalid input for " + fieldName + ". Please enter a valid numeric value.");
        }
    }//GEN-LAST:event_btnSaveUserInfoActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
    private javax.swing.JComboBox<String> cmbFitnessLevel;
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
    private javax.swing.JLabel lblSaved;
    private javax.swing.JTextField txtUserAddress;
    private javax.swing.JTextField txtUserAge;
    private javax.swing.JTextField txtUserHeight;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserWeight;
    // End of variables declaration//GEN-END:variables
}
