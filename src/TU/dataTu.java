/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TU;

import Form.*;
import Config.connectionConfig;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;





/**
 *
 * @author faramadhan
 */

public final class dataTu extends javax.swing.JFrame {

    /**
     * Creates new form masterForm
     */
     
    
    public dataTu() {
        initComponents();
        getClock();
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
        btnProfile = new javax.swing.JButton();
        btnSpp = new javax.swing.JButton();
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
        txtTu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtLahir = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        cmbAgama = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        cmbJk = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTglMasuk = new com.toedter.calendar.JDateChooser();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();

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

        btnProfile.setBackground(new java.awt.Color(164, 235, 243));
        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(102, 102, 102));
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/admin.png"))); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnProfile.setIconTextGap(7);
        btnProfile.setMaximumSize(new java.awt.Dimension(139, 33));
        btnProfile.setMinimumSize(new java.awt.Dimension(139, 33));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnSpp.setBackground(new java.awt.Color(164, 235, 243));
        btnSpp.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnSpp.setForeground(new java.awt.Color(102, 102, 102));
        btnSpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/spp.png"))); // NOI18N
        btnSpp.setText("SPP");
        btnSpp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSpp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpp.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSpp.setIconTextGap(7);
        btnSpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSppActionPerformed(evt);
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
                    .addComponent(btnSpp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSpp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPagetitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 242, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("NIP");

        txtTu.setEditable(false);
        txtTu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTuKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nama TU");

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtLahir.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tanggal Lahir");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Status");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Alamat");

        txtAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtAlamat);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Agama");

        cmbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Islam", "Protestan", "Katolik", "Hindu", "Buddha", "Khonghucu" }));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon/save.png"))); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        cmbJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Pria", "Wanita" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tanggal Masuk");

        txtTglMasuk.setDateFormatString("yyyy-MM-dd");

        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnFoto.setText("Pilih Foto");
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "PNS", "Honorer" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbJk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(432, 432, 432))
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

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed

    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnSppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSppActionPerformed
        sppTu sTu = new sppTu();
        sTu.setVisible(true);
        sTu.viewUser(sessName, sessNip);
        dispose();
    }//GEN-LAST:event_btnSppActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedImage = fileChooser.getSelectedFile();
            String imagePath = selectedImage.getAbsolutePath();
            try {
                lblFoto.setIcon(ResizeImage(imagePath));
                imagePathStr = imagePath;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Image error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal_lahir = String.valueOf(sdf.format(txtLahir.getDate()));
        String tanggal_masuk = String.valueOf(sdf.format(txtTglMasuk.getDate()));
            try {
                String sql_update = "UPDATE tbl_tu SET nip=?, nama=?, tanggal_lahir=?, jenis_kelamin=?, status_tu=?, agama=?, alamat=?, tanggal_masuk=? WHERE id_tu = '"+Integer.parseInt(idTu)+"'";
                Connection conn = connectionConfig.configDB();
                PreparedStatement pst = conn.prepareStatement(sql_update);

                pst.setString(1, txtTu.getText());
                pst.setString(2, txtNama.getText());
                pst.setString(3, tanggal_lahir);
                pst.setString(4, cmbJk.getSelectedItem().toString());
                pst.setString(5, cmbStatus.getSelectedItem().toString());
                pst.setString(6, cmbAgama.getSelectedItem().toString());
                pst.setString(7, txtAlamat.getText());
                pst.setString(8, tanggal_masuk);

                if(imagePathStr != null){
                    try {
                        String sql_update_image = "UPDATE tbl_tu SET gambar = ? WHERE id_tu = '"+Integer.parseInt(idTu)+"'";
                        PreparedStatement pstImage = conn.prepareStatement(sql_update_image);

                        InputStream updateImg = new FileInputStream(imagePathStr);
                        pstImage.setBlob(1, updateImg);
                        pstImage.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal mengubah data foto tata usaha", "Pesan", JOptionPane.WARNING_MESSAGE);
                    }
                }
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil mengubah data tata usaha", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                showProfile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal diubah, error: \n" + e.getMessage());
            }            
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtTuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTuKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtTu.setEditable(false);
            JOptionPane.showMessageDialog(null, "Mohon masukan NIP hanya angka", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtTu.setText("");
        } else {
            txtTu.setEditable(true);
        }
    }//GEN-LAST:event_txtTuKeyPressed

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
            java.util.logging.Logger.getLogger(dataTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataTu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSpp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cmbAgama;
    private javax.swing.JComboBox<String> cmbJk;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPagetitle;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextPane txtAlamat;
    private com.toedter.calendar.JDateChooser txtLahir;
    private javax.swing.JTextField txtNama;
    private com.toedter.calendar.JDateChooser txtTglMasuk;
    private javax.swing.JTextField txtTu;
    // End of variables declaration//GEN-END:variables
    
    // Variabel
    public String sessName;
    public String sessNip;
    public String nip;
    private String imagePathStr;
    private String idTu;
    
    // Resize Image Function
    private ImageIcon ResizeImage(String imgPath){
        int imageX = 113;
        int imageY = 170;
        lblFoto.setSize(imageX, imageY);
        
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
    }
    
    // View Resize Image Function
    private ImageIcon ViewResizeImage(String imgPath, byte[] imgBytes){
        int imageX = 113;
        int imageY = 170;
        lblFoto.setSize(imageX, imageY);
        
        ImageIcon myImage = null;
        
        if(imgPath != null){
            myImage = new ImageIcon(imgPath);
        } else {
            myImage = new ImageIcon(imgBytes);
        }
        
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
    }
    
    // Get Session Name
    public void viewUser(String name){
        lblUserName.setText(name);
        sessName = name;
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
    
    // Empty Text Field
    private void emptyField(){
        idTu = null;
        txtTu.setText(null);
        txtNama.setText(null);
        txtLahir.setDate(null);
        txtTglMasuk.setDate(null);
        cmbJk.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        cmbAgama.setSelectedIndex(0);
        txtAlamat.setText(null);
        lblFoto.setIcon(null);
    }
    
    private void showProfile(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
                String sql_select_id = "SELECT * FROM tbl_tu WHERE nip = '"+nip+"'";

                Connection conn = (Connection) connectionConfig.configDB();
                Statement stm = conn.createStatement();
                ResultSet rst = stm.executeQuery(sql_select_id);
            
            while(rst.next()){
                String tgl_lahir1 = rst.getString(4);
                String tgl_masuk1 = rst.getString(9);
                Date tgl_lahir = sdf.parse(tgl_lahir1);
                Date tgl_masuk = sdf.parse(tgl_masuk1);
                
                idTu = rst.getString(1);
                txtTu.setText(rst.getString(2));
                txtNama.setText(rst.getString(3));
                txtLahir.setDate(tgl_lahir);
                cmbJk.setSelectedItem(rst.getString(5));
                cmbStatus.setSelectedItem(rst.getString(6));
                cmbAgama.setSelectedItem(rst.getString(7));
                txtAlamat.setText(rst.getString(8));
                txtTglMasuk.setDate(tgl_masuk);
                lblFoto.setIcon(ViewResizeImage(null, rst.getBytes("gambar")));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data: \n" + e.getMessage());
        }
    }
    
    public void setProfile(String username){
        sessNip = username;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
                String sql_select_id = "SELECT * FROM tbl_tu WHERE nip = '"+sessNip+"'";

                Connection conn = (Connection) connectionConfig.configDB();
                Statement stm = conn.createStatement();
                ResultSet rst = stm.executeQuery(sql_select_id);
            
            while(rst.next()){
                String tgl_lahir1 = rst.getString(4);
                String tgl_masuk1 = rst.getString(9);
                Date tgl_lahir = sdf.parse(tgl_lahir1);
                Date tgl_masuk = sdf.parse(tgl_masuk1);
                
                idTu = rst.getString(1);
                nip = rst.getString(2);
                txtTu.setText(rst.getString(2));
                txtNama.setText(rst.getString(3));
                txtLahir.setDate(tgl_lahir);
                cmbJk.setSelectedItem(rst.getString(5));
                cmbStatus.setSelectedItem(rst.getString(6));
                cmbAgama.setSelectedItem(rst.getString(7));
                txtAlamat.setText(rst.getString(8));
                txtTglMasuk.setDate(tgl_masuk);
                lblFoto.setIcon(ViewResizeImage(null, rst.getBytes("gambar")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data: \n" + e.getMessage());
        }
    }
      
}
