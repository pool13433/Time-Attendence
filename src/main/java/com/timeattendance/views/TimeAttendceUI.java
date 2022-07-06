package com.timeattendance.views;

import com.timeattendance.logical.FileProcessingLogical;
import com.timeattendance.util.Environment;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author pool13433
 */
public final class TimeAttendceUI extends javax.swing.JFrame {

    private static Logger logger = Logger.getLogger(TimeAttendceUI.class.getName());

    /**
     * Creates new form TimeAttendceUI
     */
    public TimeAttendceUI() {
        initComponents();

        this.env = new Environment("resources/environment.properties").getProps();
        logger.info("attendance.app.version::==" + this.env.getProperty("attendance.app.version"));

        this.initialUIFont();
        this.initialUIMessage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogChooseFolder = new javax.swing.JDialog();
        fileChooseFolder = new javax.swing.JFileChooser();
        dialogLoading = new javax.swing.JDialog();
        imageLoading = new javax.swing.JLabel();
        labelLoading = new javax.swing.JLabel();
        labelChooseFolder = new javax.swing.JLabel();
        textChooseFolder = new javax.swing.JTextField();
        buttonChooseFolder = new javax.swing.JButton();
        scollPanelLogs = new javax.swing.JScrollPane();
        textAreaLogs = new javax.swing.JTextArea();
        labelLogger = new javax.swing.JLabel();
        buttonProcess = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelAppVersion = new javax.swing.JLabel();

        dialogChooseFolder.setAlwaysOnTop(true);
        dialogChooseFolder.setFont(new java.awt.Font("Sarabun", 0, 12)); // NOI18N

        fileChooseFolder.setCurrentDirectory(null);
        fileChooseFolder.setFileFilter(null);
        fileChooseFolder.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        fileChooseFolder.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        fileChooseFolder.setToolTipText("");
        fileChooseFolder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileChooseFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooseFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogChooseFolderLayout = new javax.swing.GroupLayout(dialogChooseFolder.getContentPane());
        dialogChooseFolder.getContentPane().setLayout(dialogChooseFolderLayout);
        dialogChooseFolderLayout.setHorizontalGroup(
            dialogChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogChooseFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogChooseFolderLayout.setVerticalGroup(
            dialogChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogChooseFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        dialogChooseFolder.getAccessibleContext().setAccessibleParent(null);

        dialogLoading.setModal(true);
        dialogLoading.setSize(new java.awt.Dimension(800, 200));
        dialogLoading.setType(java.awt.Window.Type.POPUP);

        imageLoading.setIcon(new javax.swing.ImageIcon("D:\\Freelance\\TimeIn-Out\\NetBeansProjects\\TimeAttendance\\resources\\icons\\loading.gif")); // NOI18N

        labelLoading.setFont(new java.awt.Font("Sarabun", 1, 24)); // NOI18N
        labelLoading.setText("ระบบกำลังประมวลผล กรุณารอสักครู่....");

        javax.swing.GroupLayout dialogLoadingLayout = new javax.swing.GroupLayout(dialogLoading.getContentPane());
        dialogLoading.getContentPane().setLayout(dialogLoadingLayout);
        dialogLoadingLayout.setHorizontalGroup(
            dialogLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLoadingLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(imageLoading)
                .addGap(33, 33, 33)
                .addComponent(labelLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        dialogLoadingLayout.setVerticalGroup(
            dialogLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLoadingLayout.createSequentialGroup()
                .addGroup(dialogLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogLoadingLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(imageLoading))
                    .addGroup(dialogLoadingLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelLoading)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelChooseFolder.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        labelChooseFolder.setText("...");

        textChooseFolder.setBackground(new java.awt.Color(204, 204, 204));
        textChooseFolder.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        textChooseFolder.setForeground(new java.awt.Color(153, 153, 153));

        buttonChooseFolder.setBackground(new java.awt.Color(51, 102, 255));
        buttonChooseFolder.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        buttonChooseFolder.setForeground(new java.awt.Color(255, 255, 255));
        buttonChooseFolder.setText("...");
        buttonChooseFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChooseFolderActionPerformed(evt);
            }
        });

        scollPanelLogs.setAutoscrolls(true);

        textAreaLogs.setColumns(20);
        textAreaLogs.setFont(new java.awt.Font("Sarabun", 0, 12)); // NOI18N
        textAreaLogs.setRows(5);
        scollPanelLogs.setViewportView(textAreaLogs);

        labelLogger.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        labelLogger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogger.setText("...");
        labelLogger.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonProcess.setBackground(new java.awt.Color(0, 190, 30));
        buttonProcess.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        buttonProcess.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcess.setText("...");
        buttonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessActionPerformed(evt);
            }
        });

        buttonCancel.setBackground(new java.awt.Color(255, 79, 44));
        buttonCancel.setFont(new java.awt.Font("Sarabun", 1, 14)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setText("...");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelAppVersion.setFont(new java.awt.Font("Sarabun", 1, 18)); // NOI18N
        labelAppVersion.setText("....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLogger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonChooseFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)))
                            .addComponent(scollPanelLogs))
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChooseFolder)
                    .addComponent(textChooseFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonChooseFolder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scollPanelLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(labelAppVersion)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChooseFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChooseFolderActionPerformed
        // TODO add your handling code here:
        setDialogChooseFolder(true);
    }//GEN-LAST:event_buttonChooseFolderActionPerformed

    private void fileChooseFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooseFolderActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION)) {
            File directory = fileChooseFolder.getSelectedFile();
            System.out.println("directory ::==" + directory);
            if (directory != null) {
                String path = directory.getAbsolutePath();
                logAppend("Choose Folder Path " + path);
                textChooseFolder.setText(path);
            }
        } else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION)) {
            logAppend("Selected Folder.");
        }
        dialogChooseFolder.setVisible(false);
    }//GEN-LAST:event_fileChooseFolderActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        textChooseFolder.setText("");
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessActionPerformed
        // TODO add your handling code here:
        String folderPath = textChooseFolder.getText();
        System.out.println("folderPath ::==" + folderPath);
        if (folderPath == null || folderPath.isEmpty()) {
            //  toastDialog("",JOptionPane.INFORMATION_MESSAGE)
            toastDialog(this.env.getProperty("message.folder-notfound.error"), JOptionPane.ERROR_MESSAGE);
        } else {
            toastDialog(this.env.getProperty("message.folder-notfound.info"), JOptionPane.INFORMATION_MESSAGE);
            setDialogLoading(true);

            File dirRoot = new File(textChooseFolder.getText());
            logger.info("dirRoot ::==" + dirRoot.getAbsolutePath());
            if (dirRoot.isDirectory()) {
                FileProcessingLogical handle = new FileProcessingLogical();
                File[] dirsDepartment = dirRoot.listFiles();
                for (File dirDepart : dirsDepartment) {
                    if (dirDepart.isDirectory()) {
                        logAppend("->Folder: " + dirDepart.getName());
                        File[] xls = dirDepart.listFiles((dir, name) -> {
                            return name != null && name.toLowerCase().endsWith(".xlsx");
                        });
                        for (File fileXls : xls) {
                            try {
                                handle.readFile(fileXls);
                                logAppend("  |-->File: " + fileXls.getName());
                            } catch (Exception e) {
                                logger.error("fileXls read file error", e);
                            }
                        }
                    } else {
                        try {
                            handle.readFile(dirDepart);
                            logAppend("  |-->File: " + dirDepart.getName());
                        } catch (Exception e) {
                            logger.error("dirDepart read file error", e);
                        }
                    }
                }

            }
//            setDialogLoading(false);
        }
    }//GEN-LAST:event_buttonProcessActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TimeAttendceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeAttendceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeAttendceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeAttendceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            BasicConfigurator.configure();
            new TimeAttendceUI().setVisible(true);
        });
    }

    public static void logAppend(String text) {
//        textAreaLogs.repaint();
//        textAreaLogs.revalidate();
//        textAreaLogs.requestFocus();
//        SwingUtilities.invokeLater(() -> {
//            textAreaLogs.append(String.format("   %s\n", text));
//            textAreaLogs.setCaretPosition(textAreaLogs.getDocument().getLength());
//        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textAreaLogs.append(String.format("   %s\n", text));
                textAreaLogs.setCaretPosition(textAreaLogs.getDocument().getLength());
                textAreaLogs.revalidate();
            }
        });
    }

    public static void toastDialog(String message, int with) {
        // JOptionPane.INFORMATION_MESSAGE
        JOptionPane.showMessageDialog(null, message, "System Infomation", with);
    }

    public void initialUIMessage() {
        dialogChooseFolder.setTitle(this.env.getProperty("message.dialog.choose-file.title"));
        fileChooseFolder.setCurrentDirectory(new java.io.File(this.env.getProperty("attendance.current-directory")));
        fileChooseFolder.setDialogTitle(this.env.getProperty("message.filechoose-dialog.title"));
        labelChooseFolder.setText(this.env.getProperty("label.folderchoose.text"));
        buttonChooseFolder.setText(this.env.getProperty("button.folderchoose.text"));
        buttonProcess.setText(this.env.getProperty("button.process.text"));
        buttonCancel.setText(this.env.getProperty("button.cancel.text"));
        labelAppVersion.setText("TimeAttendance version " + this.env.getProperty("attendance.app.version"));
        labelLogger.setText(this.env.getProperty("label.logger.text"));
    }

    public void initialUIFont() {
        Font font14 = new Font("Sarabun", Font.BOLD, 14);
        UIManager.put("OptionPane.messageFont", font14);
        UIManager.put("OptionPane.buttonFont", font14);
        UIManager.put("OptionPane.font", font14);
    }

    public void setDialogChooseFolder(boolean isVisibled) {
        if (isVisibled) {
            dialogChooseFolder.setSize(1000, 600);
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            final Dimension screenSize = toolkit.getScreenSize();
            final int x = (screenSize.width - dialogChooseFolder.getWidth()) / 2;
            final int y = (screenSize.height - dialogChooseFolder.getHeight()) / 2;
            dialogChooseFolder.setLocation(x, y);
        }
        dialogChooseFolder.setVisible(isVisibled);
    }

    public void setDialogLoading(boolean isVisibled) {
        if (isVisibled) {
//            dialogLoading.setSize(500, 200);
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            final Dimension screenSize = toolkit.getScreenSize();
            final int x = (screenSize.width - dialogLoading.getWidth()) / 2;
            final int y = (screenSize.height - dialogLoading.getHeight()) / 2;
            dialogLoading.setLocation(x, y);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                dialogLoading.setVisible(isVisibled);
                dialogLoading.revalidate();
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonChooseFolder;
    private javax.swing.JButton buttonProcess;
    private javax.swing.JDialog dialogChooseFolder;
    private javax.swing.JDialog dialogLoading;
    private javax.swing.JFileChooser fileChooseFolder;
    private javax.swing.JLabel imageLoading;
    private javax.swing.JLabel labelAppVersion;
    private javax.swing.JLabel labelChooseFolder;
    private javax.swing.JLabel labelLoading;
    private javax.swing.JLabel labelLogger;
    private javax.swing.JScrollPane scollPanelLogs;
    public static javax.swing.JTextArea textAreaLogs;
    private javax.swing.JTextField textChooseFolder;
    // End of variables declaration//GEN-END:variables

    private Properties env;
}