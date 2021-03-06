/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

/**
 *
 * @author M LU
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        cbNationality = new javax.swing.JCheckBox();
        cbAge = new javax.swing.JCheckBox();
        cbMatric = new javax.swing.JCheckBox();
        cbQualification = new javax.swing.JCheckBox();
        cbDrivers = new javax.swing.JCheckBox();
        cbJava = new javax.swing.JCheckBox();
        cbPhp = new javax.swing.JCheckBox();
        btnResults = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbNationality.setText("South African");

        cbAge.setText("Above 18");

        cbMatric.setText("Matriculated");

        cbQualification.setText("Diploma or Degree");

        cbDrivers.setText("Drivers License");

        cbJava.setText("3 Years JAVA Exprience");

        cbPhp.setText("3 Years PHP Exprience");

        btnResults.setText("RESULTS");
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOutput.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNationality)
                            .addComponent(cbAge)
                            .addComponent(cbMatric)
                            .addComponent(cbQualification)
                            .addComponent(cbDrivers)
                            .addComponent(cbJava)
                            .addComponent(cbPhp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbNationality)
                .addGap(18, 18, 18)
                .addComponent(cbAge)
                .addGap(18, 18, 18)
                .addComponent(cbMatric)
                .addGap(18, 18, 18)
                .addComponent(cbQualification)
                .addGap(18, 18, 18)
                .addComponent(cbDrivers)
                .addGap(18, 18, 18)
                .addComponent(cbJava)
                .addGap(18, 18, 18)
                .addComponent(cbPhp)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed

        try{    
            if (!(cbNationality.isSelected()) && ! (cbAge.isSelected()) && ! (cbMatric.isSelected()) &&
                !(cbQualification.isSelected()) && ! (cbDrivers.isSelected()) && ! (cbJava.isSelected()) &&  
                  !(cbPhp.isSelected())  ){
            lblOutput.setText("Minimum of 5 checkboxes must be selected to qualify for an interview");
            }
            if (cbNationality.isSelected() && cbAge.isSelected() && cbMatric.isSelected() &&
                cbQualification.isSelected() && cbDrivers.isSelected() && cbJava.isSelected() &&  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 7/7 boxes. Outstanding for an interview");
            }
            else if (cbNationality.isSelected() && cbAge.isSelected() && cbMatric.isSelected() &&
                cbQualification.isSelected() && cbDrivers.isSelected() && cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 6/7 boxes. Meritorious for an interview");
            }
            else if (cbNationality.isSelected() && cbAge.isSelected() && cbMatric.isSelected() &&
                cbQualification.isSelected() && cbDrivers.isSelected() ^ cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 5/7 boxes.Adequate for an interview");
            }
            else if (cbNationality.isSelected() && cbAge.isSelected() && cbMatric.isSelected() &&
                cbQualification.isSelected() ^ cbDrivers.isSelected() ^ cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 4/7 boxes. Not Achieved for an interview, Minimum is 5/7 boxes");
            }
            else if (cbNationality.isSelected() && cbAge.isSelected() & cbMatric.isSelected() ^
                cbQualification.isSelected() ^ cbDrivers.isSelected() ^ cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 3/7 boxes. Failed for an interview , Minimum is 5/7 boxes");
            }
            else if (cbNationality.isSelected() & cbAge.isSelected() ^ cbMatric.isSelected() ^
                cbQualification.isSelected() ^ cbDrivers.isSelected() ^ cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 2/7 boxes. Failed to quality to qualify for an interview, Minimum is 5/7 boxes ");
            }
            else if (cbNationality.isSelected() ^ cbAge.isSelected() ^ cbMatric.isSelected() ^
                cbQualification.isSelected() ^ cbDrivers.isSelected() ^ cbJava.isSelected() ^  
                  cbPhp.isSelected()){
            lblOutput.setText(" You Checked 1/7 boxes. Dismally failed to qualify for an interview , Minimum is 5/7 boxes");
            }
        } 
                    
        catch (NumberFormatException e) {
            lblOutput.setText("Must check atleast 5 boxes to qualify");
        }
    }//GEN-LAST:event_btnResultsActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResults;
    private javax.swing.JCheckBox cbAge;
    private javax.swing.JCheckBox cbDrivers;
    private javax.swing.JCheckBox cbJava;
    private javax.swing.JCheckBox cbMatric;
    private javax.swing.JCheckBox cbNationality;
    private javax.swing.JCheckBox cbPhp;
    private javax.swing.JCheckBox cbQualification;
    private javax.swing.JLabel lblOutput;
    // End of variables declaration//GEN-END:variables
}
