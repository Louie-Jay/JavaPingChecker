/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingchecker.View;

import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.text.DefaultCaret;
import pingchecker.Controller.MainController;


public class MainWindow extends javax.swing.JFrame{

   private MainController controller;
   private HashMap<String, JLabel> lblInfos;
   
    public MainWindow() {
        controller = new MainController();
        lblInfos = new HashMap<String, JLabel>();
        
        initComponents();
        initProperties();
        loadInfo();
    }
    
    private void initProperties(){
        txtAddress.setEnabled(false);
        sbarResult.getVerticalScrollBar().setUI(new CustomScrollBarProperties());
        sbarResult.getHorizontalScrollBar().setUI(new CustomScrollBarProperties());
        DefaultCaret caret = (DefaultCaret)txtResult.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }
    
    private void loadInfo(){
        lblInfos.put("CName", lblCName);
        lblInfos.put("IPAdr", lblIP);
        lblInfos.put("MACAdr", lblMAC);
        lblInfos.put("NStat", lblNStat);
        lblInfos.put("DT", lblDT);
        
        controller.loadInfo(lblInfos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        sbarResult = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCName = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblMAC = new javax.swing.JLabel();
        lblNStat = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDT = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30), new java.awt.Dimension(30, 30));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jPanel4 = new javax.swing.JPanel();
        chkMAddress = new javax.swing.JCheckBox();
        txtAddress = new javax.swing.JTextField();
        chkEndless = new javax.swing.JCheckBox();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PingChecker");

        jPanel1.setLayout(new java.awt.BorderLayout());

        sbarResult.setBackground(new java.awt.Color(0, 0, 0));
        sbarResult.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)), "Result", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Unicode", 0, 11), new java.awt.Color(0, 255, 0))); // NOI18N
        sbarResult.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sbarResult.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtResult.setBackground(new java.awt.Color(0, 0, 0));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
        txtResult.setForeground(new java.awt.Color(0, 255, 0));
        txtResult.setRows(5);
        sbarResult.setViewportView(txtResult);

        jPanel1.add(sbarResult, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true), "Network/Client Info:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Console", 0, 13), new java.awt.Color(0, 255, 0))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(590, 300));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setLabelFor(lblCName);
        jLabel1.setText("Computer Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setLabelFor(lblIP);
        jLabel2.setText("IP Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setLabelFor(lblMAC);
        jLabel3.setText("MAC Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setLabelFor(lblNStat);
        jLabel4.setText("Internet Status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel4, gridBagConstraints);

        lblCName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        lblCName.setForeground(new java.awt.Color(0, 255, 0));
        lblCName.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel5.add(lblCName, gridBagConstraints);

        lblIP.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        lblIP.setForeground(new java.awt.Color(0, 255, 0));
        lblIP.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel5.add(lblIP, gridBagConstraints);

        lblMAC.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        lblMAC.setForeground(new java.awt.Color(0, 255, 0));
        lblMAC.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel5.add(lblMAC, gridBagConstraints);

        lblNStat.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        lblNStat.setForeground(new java.awt.Color(0, 255, 0));
        lblNStat.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel5.add(lblNStat, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 0));
        jLabel9.setLabelFor(lblDT);
        jLabel9.setText("Current Date & Time:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(jLabel9, gridBagConstraints);

        lblDT.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        lblDT.setForeground(new java.awt.Color(0, 255, 0));
        lblDT.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel5.add(lblDT, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel5.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel5.add(filler8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        jPanel5.add(filler9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        jPanel5.add(filler10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        jPanel5.add(filler11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        jPanel5.add(filler12, gridBagConstraints);

        jPanel3.add(jPanel5);

        jPanel4.setOpaque(false);

        chkMAddress.setBackground(new java.awt.Color(0, 0, 0));
        chkMAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        chkMAddress.setForeground(new java.awt.Color(0, 255, 51));
        chkMAddress.setText("Manual Address:");
        chkMAddress.setContentAreaFilled(false);
        chkMAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/chkUntickedGreen.png"))); // NOI18N
        chkMAddress.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/chkTickedGreen.png"))); // NOI18N
        chkMAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMAddressActionPerformed(evt);
            }
        });
        jPanel4.add(chkMAddress);

        txtAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 255, 51));
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        txtAddress.setOpaque(false);
        txtAddress.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel4.add(txtAddress);

        chkEndless.setBackground(new java.awt.Color(0, 0, 0));
        chkEndless.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 11)); // NOI18N
        chkEndless.setForeground(new java.awt.Color(0, 255, 51));
        chkEndless.setText("Endless");
        chkEndless.setContentAreaFilled(false);
        chkEndless.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/chkUntickedGreen.png"))); // NOI18N
        chkEndless.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/chkTickedGreen.png"))); // NOI18N
        jPanel4.add(chkEndless);

        btnStart.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 255, 51));
        btnStart.setText("Start");
        btnStart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 1, true));
        btnStart.setContentAreaFilled(false);
        btnStart.setPreferredSize(new java.awt.Dimension(50, 25));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel4.add(btnStart);

        btnStop.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        btnStop.setForeground(new java.awt.Color(0, 255, 51));
        btnStop.setText("Stop");
        btnStop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 1, true));
        btnStop.setContentAreaFilled(false);
        btnStop.setPreferredSize(new java.awt.Dimension(50, 25));
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel4.add(btnStop);

        btnExit.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 255, 51));
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 1, true));
        btnExit.setContentAreaFilled(false);
        btnExit.setPreferredSize(new java.awt.Dimension(50, 25));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit);

        btnAbout.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(0, 255, 51));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/info_green.png"))); // NOI18N
        btnAbout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 1, true));
        btnAbout.setContentAreaFilled(false);
        btnAbout.setPreferredSize(new java.awt.Dimension(30, 25));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jPanel4.add(btnAbout);

        jPanel3.add(jPanel4);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        controller.exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        controller.start(txtResult, txtAddress.getText(), chkEndless.isSelected());
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        controller.stop(txtResult);
    }//GEN-LAST:event_btnStopActionPerformed

    private void chkMAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMAddressActionPerformed
        controller.setManual(chkMAddress,txtAddress);
    }//GEN-LAST:event_chkMAddressActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        controller.about(txtResult);
    }//GEN-LAST:event_btnAboutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JCheckBox chkEndless;
    private javax.swing.JCheckBox chkMAddress;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblMAC;
    private javax.swing.JLabel lblNStat;
    private javax.swing.JScrollPane sbarResult;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
