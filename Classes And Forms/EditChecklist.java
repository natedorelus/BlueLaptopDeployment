/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopdeployment;

import javax.swing.JOptionPane;

/**
 *
 * @author ndorelus
 */
public class EditChecklist extends javax.swing.JFrame {

    /**
     * Creates new form EditCheckList
     */
    public EditChecklist() {
        initComponents();
    }
    
    Checklist temp = Toolkit.getCurrentUser().getCurrentChecklist();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox82 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 87, 142));

        jTabbedPane7.setBackground(new java.awt.Color(89, 192, 213));

        jPanel8.setBackground(new java.awt.Color(0, 87, 142));

        jCheckBox56.setBackground(new java.awt.Color(0, 87, 142));
        jCheckBox56.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox56.setText("Login as .\\blue and enter user's full name in description");
        if (temp.getBitLocker()) jCheckBox56.setSelected(true);

        jCheckBox57.setBackground(new java.awt.Color(0, 87, 142));
        jCheckBox57.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox57.setText("Verify machine is on domain, rename using Model-Serial naming convention and restart");
        if (temp.getNameComputer()) jCheckBox57.setSelected(true);

        jCheckBox58.setBackground(new java.awt.Color(0, 87, 142));
        jCheckBox58.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox58.setText("Log in with admin, turn on Bitlocker, backup key to \\\\root\\tech\\Blue Documentation\\BitlockerRecoveryKey\\");
            if (temp.getBitLocker()) jCheckBox58.setSelected(true);

            jCheckBox59.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox59.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox59.setText("Verify Proofpoint is installed");
            if (temp.getProofpoint()) jCheckBox59.setSelected(true);

            jCheckBox60.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox60.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox60.setText("Run Lenovo System Update/HP Support Assistant (whichever is applicable)");
            if (temp.getSystemUpdate()) jCheckBox60.setSelected(true);
            jCheckBox60.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox60ActionPerformed(evt);
                }
            });

            jCheckBox61.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox61.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox61.setText("Move machine to proper OU, verify Checkpoint is installed and up to date");
            if (temp.getMoveOU()) jCheckBox61.setSelected(true);

            jCheckBox62.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox62.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox62.setText("Run Windows Updates");
            if (temp.getWindowsUpdate()) jCheckBox62.setSelected(true);

            jCheckBox63.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox63.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox63.setText("Add machine to user in Track-It!");
            if (temp.getTrackIT()) jCheckBox63.setSelected(true);

            jCheckBox64.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox64.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox64.setText("Update docking station firmware");
            if (temp.getDockingStation()) jCheckBox64.setSelected(true);

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox64)
                        .addComponent(jCheckBox63)
                        .addComponent(jCheckBox62)
                        .addComponent(jCheckBox61)
                        .addComponent(jCheckBox60)
                        .addComponent(jCheckBox59)
                        .addComponent(jCheckBox58)
                        .addComponent(jCheckBox57)
                        .addComponent(jCheckBox56))
                    .addGap(35, 35, 35))
            );
            jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jCheckBox56)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox57)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox58)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox59)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox60)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox61)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox62)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox63)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox64)
                    .addContainerGap(80, Short.MAX_VALUE))
            );

            jTabbedPane7.addTab("Hardware Setup", jPanel8);

            jPanel9.setBackground(new java.awt.Color(0, 87, 142));

            jCheckBox65.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox65.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox65.setText("Login as user");
            if (temp.getUserLogin()) jCheckBox65.setSelected(true);

            jCheckBox66.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox66.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox66.setText("Launch Outlook and let emails fully sync");
            if (temp.getOutlook()) jCheckBox66.setSelected(true);

            jCheckBox67.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox67.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox67.setText("Log the machine into Blue-N Wi-Fi");
            if (temp.getWifi()) jCheckBox67.setSelected(true);

            jCheckBox68.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox68.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox68.setText("Log into Cisco AnyConnect VPN and then disconnect");
            if (temp.getVPN()) jCheckBox68.setSelected(true);

            jCheckBox69.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox69.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox69.setText("Move Outlook Signature files to proper location");
            if (temp.getSignatures()) jCheckBox69.setSelected(true);

            jCheckBox70.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox70.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox70.setText("Transfer Chrome bookmarks");
            if (temp.getChromeBookmarks()) jCheckBox70.setSelected(true);

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox70)
                        .addComponent(jCheckBox69)
                        .addComponent(jCheckBox68)
                        .addComponent(jCheckBox67)
                        .addComponent(jCheckBox66)
                        .addComponent(jCheckBox65))
                    .addContainerGap(385, Short.MAX_VALUE))
            );
            jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jCheckBox65)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox66)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox67)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox68)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox69)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox70)
                    .addContainerGap(135, Short.MAX_VALUE))
            );

            jTabbedPane7.addTab("User Login Items", jPanel9);

            jPanel10.setBackground(new java.awt.Color(0, 87, 142));

            jCheckBox71.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox71.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox71.setText("Install local printers - WILTON ONLY");
            if (temp.getPrinters()) jCheckBox71.setSelected(true);

            jCheckBox72.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox72.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox72.setText("Unpin Edge, Store,and Mail from taskbar");
            if (temp.getUnpin()) jCheckBox72.setSelected(true);
            jCheckBox72.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox72ActionPerformed(evt);
                }
            });

            jCheckBox73.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox73.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox73.setText("Pin IE, Chrome, and Outlook to taskbar");
            if (temp.getPin()) jCheckBox73.setSelected(true);

            jCheckBox74.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox74.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox74.setText("Set Default Apps: Chrome, Outook, Nuance PDF");
            if (temp.getDefaultApps()) jCheckBox74.setSelected(true);

            jCheckBox75.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox75.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox75.setText("Restore default settings in Power Options and set Windows to do nothing when lid is closed");
            if (temp.getDefaultPower()) jCheckBox75.setSelected(true);

            jCheckBox76.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox76.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox76.setText("In File Explorer options, change \"Open File Explorer\" to \"This PC\" and uncheck \"Show recently used files\"");
            if (temp.getFileExplorer()) jCheckBox76.setSelected(true);

            jCheckBox77.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox77.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox77.setText("Right-click desktop > personalize > themes > desktop icon settings and select all boxes");
            if (temp.getDesktopIcons()) jCheckBox77.setSelected(true);

            jCheckBox78.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox78.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox78.setText("Verify that the time is correct and that Windows is set to the correct time zone");
            if (temp.getTimeZone()) jCheckBox78.setSelected(true);

            jCheckBox79.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox79.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox79.setText("In touchpad settings, set three-finger and four-finger gestures to do nothing");
            if (temp.getTouchpad()) jCheckBox79.setSelected(true);

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox79)
                        .addComponent(jCheckBox78)
                        .addComponent(jCheckBox77)
                        .addComponent(jCheckBox76)
                        .addComponent(jCheckBox75)
                        .addComponent(jCheckBox74)
                        .addComponent(jCheckBox73)
                        .addComponent(jCheckBox72)
                        .addComponent(jCheckBox71))
                    .addContainerGap(135, Short.MAX_VALUE))
            );
            jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jCheckBox71)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox72)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox73)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox74)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox75)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox76)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox77)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox78)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox79)
                    .addContainerGap(80, Short.MAX_VALUE))
            );

            jTabbedPane7.addTab("Windows Settings", jPanel10);

            jPanel11.setBackground(new java.awt.Color(0, 87, 142));

            jCheckBox80.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox80.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox80.setText("Provide Welcome Sheet with computer");
            if (temp.getWelcomeSheet()) jCheckBox80.setSelected(true);

            jCheckBox81.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox81.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox81.setText("Schedule an IT Onboarding meeting");
            if (temp.getMeeting()) jCheckBox81.setSelected(true);

            jCheckBox82.setBackground(new java.awt.Color(0, 87, 142));
            jCheckBox82.setForeground(new java.awt.Color(255, 255, 255));
            jCheckBox82.setText("Set user account to force password change on next login");
            if (temp.getPasswordChange()) jCheckBox82.setSelected(true);

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox82)
                        .addComponent(jCheckBox81)
                        .addComponent(jCheckBox80))
                    .addContainerGap(361, Short.MAX_VALUE))
            );
            jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jCheckBox80)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox81)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox82)
                    .addContainerGap(183, Short.MAX_VALUE))
            );

            jTabbedPane7.addTab("Onboarding", jPanel11);
            if (!Toolkit.getCurrentUser().getIsNewHire()) jTabbedPane1.setEnabledAt(3, false);

            jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Checklist for " + Toolkit.getCurrentUser().getFull() + "'s Current Computer");

            jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton1.setText("Edit Checklist");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton2.setText("Cancel");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane7)
                    .addContainerGap())
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(296, 296, 296))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton2)
                    .addContainerGap(28, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox60ActionPerformed

    private void jCheckBox72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox72ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Checklist check = new Checklist();

        // HARDWARE SETUP TAB //
        if (jCheckBox56.isSelected()) check.setBlueLogin(true);
        if (jCheckBox57.isSelected()) check.setNameComputer(true);
        if (jCheckBox58.isSelected()) check.setBitLocker(true);
        if (jCheckBox59.isSelected()) check.setProofpoint(true);
        if (jCheckBox60.isSelected()) check.setSystemUpdate(true);
        if (jCheckBox61.isSelected()) check.setMoveOU(true);
        if (jCheckBox62.isSelected()) check.setWindowsUpdate(true);
        if (jCheckBox63.isSelected()) check.setTrackIT(true);
        if (jCheckBox64.isSelected()) check.setDockingStation(true);

        // USER LOGIN ITEMS TAB //
        if (jCheckBox65.isSelected()) check.setUserLogin(true);
        if (jCheckBox66.isSelected()) check.setOutlook(true);
        if (jCheckBox67.isSelected()) check.setWifi(true);
        if (jCheckBox68.isSelected()) check.setVPN(true);
        if (jCheckBox69.isSelected()) check.setSignatures(true);
        if (jCheckBox70.isSelected()) check.setChromeBookmarks(true);

        // WINDOWS SETTINGS TAB //
        if (jCheckBox71.isSelected()) check.setPrinters(true);
        if (jCheckBox72.isSelected()) check.setUnpin(true);
        if (jCheckBox73.isSelected()) check.setPin(true);
        if (jCheckBox74.isSelected()) check.setDefaultApps(true);
        if (jCheckBox75.isSelected()) check.setDefaultPower(true);
        if (jCheckBox76.isSelected()) check.setFileExplorer(true);
        if (jCheckBox77.isSelected()) check.setDesktopIcons(true);
        if (jCheckBox78.isSelected()) check.setTimeZone(true);
        if (jCheckBox79.isSelected()) check.setTouchpad(true);

        // ONBOARDING TAB //
        if (jCheckBox80.isSelected()) check.setWelcomeSheet(true);
        if (jCheckBox81.isSelected()) check.setMeeting(true);
        if (jCheckBox82.isSelected()) check.setPasswordChange(true);

        Toolkit.getCurrentUser().getCurrentComputer().assignChecklist(check);

        JOptionPane.showMessageDialog(rootPane, "The checklist for " + Toolkit.getCurrentUser().getFull() + "'s computer '" + Toolkit.getCurrentUser().getCurrentComputer().getName() + "' has been successfully edited.", "Checklist Successfully Edited", JOptionPane.PLAIN_MESSAGE);
        super.dispose();
        ViewUsers view = new ViewUsers();
        view.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        ViewUsers view = new ViewUsers();
        view.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditChecklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditChecklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditChecklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditChecklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditChecklist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    // End of variables declaration//GEN-END:variables
}
