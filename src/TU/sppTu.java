/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TU;

import Siswa.*;
import Form.*;
import Config.connectionConfig;
import Config.userDB;
import Report.detailGuru;
import Report.detailSiswa;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;




/**
 *
 * @author faramadhan
 */

public final class sppTu extends javax.swing.JFrame {

    /**
     * Creates new form masterForm
     */
     
    
    public sppTu() {
        initComponents();
        getClock();
        showDataSpp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblClock = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSubTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPagetitle = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        lblBukti = new javax.swing.JLabel();
        btnBukti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSpp = new javax.swing.JTable();
        txtBulan = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" SIAKAD | SMP PGRI BOJONG");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1750, 900));
        setMinimumSize(new java.awt.Dimension(1750, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1750, 900));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 5, new java.awt.Color(255, 255, 255)));
        jPanel1.setMaximumSize(new java.awt.Dimension(250, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 900));

        jPanel5.setBackground(new java.awt.Color(164, 235, 243));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo-pgri.png"))); // NOI18N

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(164, 235, 243));

        btnAdmin.setBackground(new java.awt.Color(164, 235, 243));
        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(102, 102, 102));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/admin.png"))); // NOI18N
        btnAdmin.setText("Profile");
        btnAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnAdmin.setIconTextGap(7);
        btnAdmin.setMaximumSize(new java.awt.Dimension(139, 33));
        btnAdmin.setMinimumSize(new java.awt.Dimension(139, 33));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSetting.setBackground(new java.awt.Color(164, 235, 243));
        btnSetting.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(102, 102, 102));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/spp.png"))); // NOI18N
        btnSetting.setText("SPP");
        btnSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSetting.setIconTextGap(7);
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(164, 235, 243));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/logout.png"))); // NOI18N
        btnLogout.setText("Logout        ");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnLogout.setIconTextGap(7);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClock)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(170, 170, 170));

        lblSubTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblSubTitle.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle.setText("SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK");

        lblSubtitle.setBackground(new java.awt.Color(170, 170, 170));
        lblSubtitle.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitle.setText("SMP PGRI BOJONG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(204, 242, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));

        lblPagetitle.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPagetitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPagetitle.setText("Data Tata Usaha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblPagetitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPagetitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 242, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("NISN");

        txtNISN.setEditable(false);
        txtNISN.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNISN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNISNKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nominal");

        txtNominal.setEditable(false);
        txtNominal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tanggal Pembayaran");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Pembayaran Bulan");

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/save.png"))); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        lblBukti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnBukti.setText("Lihat Bukti");
        btnBukti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBukti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuktiActionPerformed(evt);
            }
        });

        tblSpp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSpp);

        txtBulan.setEditable(false);
        txtBulan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtTanggal.setEditable(false);
        txtTanggal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih ---", "Proses", "Berhasil", "Gagal" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Status");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBukti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBukti, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(lblBukti, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBukti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1768, 954));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int yakinHapus = JOptionPane.showConfirmDialog(null, "Anda yakin?", "Logout", JOptionPane.YES_NO_OPTION);
        if(yakinHapus == JOptionPane.YES_OPTION){
            this.dispose();
            loginFrame lF = new loginFrame();
            lF.setVisible(rootPaneCheckingEnabled);
        }      
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        dataTu dTu = new dataTu();
        dTu.setVisible(true);
        dTu.viewUser(sessName);
        dTu.setProfile(sessNip);
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnBuktiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuktiActionPerformed
        if(idSpp == null){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahuli!", "Pesan", JOptionPane.WARNING_MESSAGE);
        } else {
            lihatBukti lBukti = new lihatBukti();
            lBukti.setVisible(true);
            lBukti.showDetailTU(idSpp);
        }
    }//GEN-LAST:event_btnBuktiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String sql_update = "UPDATE tbl_spp SET status=? WHERE id_spp = '"+Integer.parseInt(idSpp)+"'";
            Connection conn = connectionConfig.configDB();
            PreparedStatement pst = conn.prepareStatement(sql_update);

            pst.setString(1, cmbStatus.getSelectedItem().toString());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil mengubah bukti bayar", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            showDataSpp();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah, error: \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNISNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNISNKeyPressed
       
    }//GEN-LAST:event_txtNISNKeyPressed

    private void tblSppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSppMouseClicked
        int row = tblSpp.rowAtPoint(evt.getPoint());
        String id_spp = tblSpp.getValueAt(row, 1).toString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
                String sql_select_id = "SELECT * FROM tbl_spp WHERE id_spp = '"+id_spp+"'";
                Connection conn = (Connection) connectionConfig.configDB();
                Statement stm = conn.createStatement();
                ResultSet rst = stm.executeQuery(sql_select_id);
            
            while(rst.next()){
                String tgl_bayar1 = rst.getString("tanggal_bayar");
                Date tanggal_bayar = sdf.parse(tgl_bayar1);
                
                idSpp = rst.getString("id_spp");
                txtNISN.setText(rst.getString("nisn_siswa"));
                txtNominal.setText(rst.getString("nominal"));
                txtBulan.setText(rst.getString("bulan"));
                txtTanggal.setText(rst.getString("tanggal_bayar"));
                cmbStatus.setSelectedItem(rst.getString("status"));
                lblBukti.setIcon(ViewResizeImage(null, rst.getBytes("gambar")));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data: \n" + e.getMessage());
        }
    }//GEN-LAST:event_tblSppMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sppTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBukti;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBukti;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPagetitle;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblSpp;
    private javax.swing.JTextField txtBulan;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNominal;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
    
    // Variabel
    public Date akunTglLahir;
    public String sessName;
    public String sessNip;
    public String nisn;
    private String imagePathStr;
    private String idSpp;
    
    // Resize Image Function
    private ImageIcon ResizeImage(String imgPath){
        int imageX = 113;
        int imageY = 170;
        lblBukti.setSize(imageX, imageY);
        
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblBukti.getWidth(), lblBukti.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
    }
    
    // View Resize Image Function
    private ImageIcon ViewResizeImage(String imgPath, byte[] imgBytes){
        int imageX = 113;
        int imageY = 170;
        lblBukti.setSize(imageX, imageY);
        
        ImageIcon myImage = null;
        
        if(imgPath != null){
            myImage = new ImageIcon(imgPath);
        } else {
            myImage = new ImageIcon(imgBytes);
        }
        
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblBukti.getWidth(), lblBukti.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
    }
    
    // Get Session Name
    public void viewUser(String name, String nip){
        lblUserName.setText(name);
        sessName = name;
        sessNip = nip;
    }
    
    // Get Realtime Daate & Clock
    public void getClock(){
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                SimpleDateFormat tgl = new SimpleDateFormat("EEEE, dd-MMM-YYYY");
                String no1_jam = "";
                String no1_menit = "";
                String no1_detik = "";
                
                
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if(nilai_jam <= 9){
                    no1_jam = "0";
                }
                if(nilai_menit <= 9){
                    no1_menit = "0";
                }
                if(nilai_detik <= 9){
                    no1_detik = "0";
                }
                
                String jam = no1_jam + Integer.toString(nilai_jam);
                String menit = no1_menit + Integer.toString(nilai_menit);
                String detik = no1_detik + Integer.toString(nilai_detik);
                
                lblClock.setText(tgl.format(dt) + "   |   " + jam + " : " + menit + " : " + detik + " ");
            }
        };
        new javax.swing.Timer(1000, taskPerformer).start();
    }
        
    public void showDataSpp() {       
        DefaultTableModel modelSpp = new DefaultTableModel();
        modelSpp.addColumn("No");
        modelSpp.addColumn("ID SPP");
        modelSpp.addColumn("NISN");
        modelSpp.addColumn("Nama Siswa");
        modelSpp.addColumn("Nominal");
        modelSpp.addColumn("Bulan Bayar");
        modelSpp.addColumn("Tanggal Bayar");
        modelSpp.addColumn("Status");
        
        try {
            int no = 1;
            String sql_select_all = "SELECT * FROM tbl_spp JOIN tbl_siswa ON tbl_siswa.nisn = tbl_spp.nisn_siswa ORDER BY status ASC";
            Connection conn = (Connection) connectionConfig.configDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql_select_all);
            while (rs.next()){
                modelSpp.addRow(new Object[] {
                    no++,
                    rs.getString("id_spp"),
                    rs.getString("nisn_siswa"),
                    rs.getString("nama"),
                    rs.getString("nominal"),
                    rs.getString("bulan"),
                    rs.getString("tanggal_bayar"),
                    rs.getString("status")
                });
                ;
            }            
            tblSpp.setModel(modelSpp);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data: \n" + e.getMessage());
        }
    }
}
