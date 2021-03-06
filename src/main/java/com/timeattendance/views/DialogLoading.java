/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.timeattendance.views;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.Timer;

/**
 *
 * @author pool13433
 */
public class DialogLoading extends javax.swing.JFrame {
    
   private ProgressDialog dialog;
   
   private class ProgressDialog extends JDialog {
 
        public ProgressDialog(Frame owner) {
            super(owner, true);
            JProgressBar progressBar = new JProgressBar(0, 100);
            progressBar.setIndeterminate(true);
            this.getContentPane().add(progressBar);
            this.setLocationRelativeTo(owner);
            this.pack();
        }
    }

    /**
     * Creates new form DialogDemo
     */
    public DialogLoading() {
        initComponents();
        JButton button = new JButton("Launch task!");        
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchLongTask();
                 
                // What comes here needs the task to be completed
            }
        };
         
        dialog = new ProgressDialog(this);        
        button.addActionListener(listener);        
        this.getContentPane().add(button);
        this.setLocationRelativeTo(null);
        pack();
    }
    
    public void launchLongTask() {
         
        // This is where the task is launched 
         
        SwingWorker worker = new SwingWorker() {            
            protected Object doInBackground() throws Exception {
                 
                // Time spending task
                Thread.sleep(50000);
                return null;
            }
 
            protected void done() {
                dialog.dispose();
            }
        };
         
        worker.execute();
         
        ActionListener dialogListener = new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {                
                dialog.setVisible(true);                
            }
        };
         
        Timer dialogTimer = new Timer(1000, dialogListener); 
        dialogTimer.setRepeats(false);
        dialogTimer.start();
 
        // The execution should stop here until the dialog is closed, 
        // what could be achieved by calling dialog.setVisible(true).
        // If I do nothing, the code that comes next will execute immediately
 
        System.out.println("Should not be executed until the dialog is closed.");
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLoading = new javax.swing.JLabel();
        labelLoadingTitle = new javax.swing.JLabel();
        labelLoadingSubTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        imageLoading.setIcon(new javax.swing.ImageIcon("D:\\Freelance\\TimeIn-Out\\NetBeansProjects\\TimeAttendance\\resources\\icons\\loading.gif")); // NOI18N
        imageLoading.setText("jLabel1");

        labelLoadingTitle.setFont(new java.awt.Font("Sarabun", 1, 24)); // NOI18N
        labelLoadingTitle.setText("??????????????????????????????????????????");
        labelLoadingTitle.setToolTipText("");

        labelLoadingSubTitle.setFont(new java.awt.Font("Sarabun", 1, 18)); // NOI18N
        labelLoadingSubTitle.setText("??????????????????????????????????????????????????? ?????????????????????....");
        labelLoadingSubTitle.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imageLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLoadingTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLoadingSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelLoadingTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLoadingSubTitle)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DialogLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogLoading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLoading;
    private javax.swing.JLabel labelLoadingSubTitle;
    private javax.swing.JLabel labelLoadingTitle;
    // End of variables declaration//GEN-END:variables
}
