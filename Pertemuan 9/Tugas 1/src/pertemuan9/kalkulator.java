/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author FERDI YANSAH
 */
public class kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public kalkulator() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        isiTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tujuhBT = new javax.swing.JButton();
        delapanBT = new javax.swing.JButton();
        sembilanBT = new javax.swing.JButton();
        empatBT = new javax.swing.JButton();
        limaBT = new javax.swing.JButton();
        enamBT = new javax.swing.JButton();
        satuBT = new javax.swing.JButton();
        duaBT = new javax.swing.JButton();
        tigaBT = new javax.swing.JButton();
        titikBT = new javax.swing.JButton();
        clearBT = new javax.swing.JButton();
        kosongBT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tambahBT = new javax.swing.JButton();
        kurangBT = new javax.swing.JButton();
        kaliBT = new javax.swing.JButton();
        bagiBT = new javax.swing.JButton();
        persenBT = new javax.swing.JButton();
        samadenganBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        backspaceBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        isiTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(isiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(isiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tujuhBT.setBackground(new java.awt.Color(153, 204, 255));
        tujuhBT.setText("7");
        tujuhBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhBTActionPerformed(evt);
            }
        });

        delapanBT.setBackground(new java.awt.Color(153, 204, 255));
        delapanBT.setText("8");
        delapanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanBTActionPerformed(evt);
            }
        });

        sembilanBT.setBackground(new java.awt.Color(153, 204, 255));
        sembilanBT.setText("9");
        sembilanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanBTActionPerformed(evt);
            }
        });

        empatBT.setBackground(new java.awt.Color(153, 204, 255));
        empatBT.setText("4");
        empatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatBTActionPerformed(evt);
            }
        });

        limaBT.setBackground(new java.awt.Color(153, 204, 255));
        limaBT.setText("5");
        limaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaBTActionPerformed(evt);
            }
        });

        enamBT.setBackground(new java.awt.Color(153, 204, 255));
        enamBT.setText("6");
        enamBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamBTActionPerformed(evt);
            }
        });

        satuBT.setBackground(new java.awt.Color(153, 204, 255));
        satuBT.setText("1");
        satuBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuBTActionPerformed(evt);
            }
        });

        duaBT.setBackground(new java.awt.Color(153, 204, 255));
        duaBT.setText("2");
        duaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaBTActionPerformed(evt);
            }
        });

        tigaBT.setBackground(new java.awt.Color(153, 204, 255));
        tigaBT.setText("3");
        tigaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaBTActionPerformed(evt);
            }
        });

        titikBT.setBackground(new java.awt.Color(153, 204, 255));
        titikBT.setText(".");
        titikBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikBTActionPerformed(evt);
            }
        });

        clearBT.setBackground(new java.awt.Color(153, 204, 255));
        clearBT.setText("C");
        clearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTActionPerformed(evt);
            }
        });

        kosongBT.setBackground(new java.awt.Color(153, 204, 255));
        kosongBT.setText("0");
        kosongBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tujuhBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delapanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sembilanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(empatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enamBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(satuBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tigaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(titikBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kosongBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delapanBT)
                        .addComponent(sembilanBT))
                    .addComponent(tujuhBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limaBT)
                        .addComponent(enamBT))
                    .addComponent(empatBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(duaBT)
                        .addComponent(tigaBT))
                    .addComponent(satuBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kosongBT)
                        .addComponent(clearBT))
                    .addComponent(titikBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tambahBT.setBackground(new java.awt.Color(153, 204, 255));
        tambahBT.setText("+");
        tambahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBTActionPerformed(evt);
            }
        });

        kurangBT.setBackground(new java.awt.Color(153, 204, 255));
        kurangBT.setText("-");
        kurangBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangBTActionPerformed(evt);
            }
        });

        kaliBT.setBackground(new java.awt.Color(153, 204, 255));
        kaliBT.setText("*");
        kaliBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliBTActionPerformed(evt);
            }
        });

        bagiBT.setBackground(new java.awt.Color(153, 204, 255));
        bagiBT.setText("/");
        bagiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiBTActionPerformed(evt);
            }
        });

        persenBT.setBackground(new java.awt.Color(153, 204, 255));
        persenBT.setText("%");
        persenBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenBTActionPerformed(evt);
            }
        });

        samadenganBT.setBackground(new java.awt.Color(153, 204, 255));
        samadenganBT.setText("=");
        samadenganBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganBTActionPerformed(evt);
            }
        });

        exitBT.setBackground(new java.awt.Color(153, 204, 255));
        exitBT.setText("E");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });

        backspaceBT.setBackground(new java.awt.Color(153, 204, 255));
        backspaceBT.setText("B");
        backspaceBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tambahBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurangBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(kaliBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(samadenganBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persenBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(backspaceBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBT)
                    .addComponent(kurangBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaliBT)
                    .addComponent(bagiBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(samadenganBT)
                    .addComponent(persenBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backspaceBT)
                    .addComponent(exitBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kosongBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"0");
    }//GEN-LAST:event_kosongBTActionPerformed

    private void titikBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+".");
    }//GEN-LAST:event_titikBTActionPerformed

    private void clearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText("");
    }//GEN-LAST:event_clearBTActionPerformed

    private void satuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"1");
    }//GEN-LAST:event_satuBTActionPerformed

    private void duaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"2");
    }//GEN-LAST:event_duaBTActionPerformed

    private void tigaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"3");
    }//GEN-LAST:event_tigaBTActionPerformed

    private void empatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"4");
    }//GEN-LAST:event_empatBTActionPerformed

    private void limaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"5");
    }//GEN-LAST:event_limaBTActionPerformed

    private void enamBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"6");
    }//GEN-LAST:event_enamBTActionPerformed

    private void tujuhBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"7");
    }//GEN-LAST:event_tujuhBTActionPerformed

    private void delapanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"8");
    }//GEN-LAST:event_delapanBTActionPerformed

    private void sembilanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanBTActionPerformed
        // TODO add your handling code here:
        isiTF.setText(isiTF.getText()+"9");
    }//GEN-LAST:event_sembilanBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void samadenganBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganBTActionPerformed
        // TODO add your handling code here:
        tampilkanHasil();
    }//GEN-LAST:event_samadenganBTActionPerformed

    private void tambahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBTActionPerformed
        // TODO add your handling code here:        
        num1 = Double.parseDouble(isiTF.getText());        
        isiTF.setText("");
        kalkulator = 1;        
    }//GEN-LAST:event_tambahBTActionPerformed

    private void kurangBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangBTActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(isiTF.getText());        
        isiTF.setText("");
        kalkulator = 2;
    }//GEN-LAST:event_kurangBTActionPerformed

    private void kaliBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliBTActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(isiTF.getText());        
        isiTF.setText("");
        kalkulator = 3;
    }//GEN-LAST:event_kaliBTActionPerformed

    private void bagiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiBTActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(isiTF.getText());
        isiTF.setText("");
        kalkulator = 4;
    }//GEN-LAST:event_bagiBTActionPerformed

    private void persenBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenBTActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(isiTF.getText());
        isiTF.setText("");
        kalkulator = 5;
    }//GEN-LAST:event_persenBTActionPerformed

    private void backspaceBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceBTActionPerformed
        // TODO add your handling code here:
        int length = isiTF.getText().length();
        int number = isiTF.getText().length() - 1;
        String simpan;
        if (length > 0) {
            StringBuilder back = new StringBuilder(isiTF.getText());
            back.deleteCharAt(number);
            simpan = back.toString();
            isiTF.setText(simpan);
        }
    }//GEN-LAST:event_backspaceBTActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspaceBT;
    private javax.swing.JButton bagiBT;
    private javax.swing.JButton clearBT;
    private javax.swing.JButton delapanBT;
    private javax.swing.JButton duaBT;
    private javax.swing.JButton empatBT;
    private javax.swing.JButton enamBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JTextField isiTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton kaliBT;
    private javax.swing.JButton kosongBT;
    private javax.swing.JButton kurangBT;
    private javax.swing.JButton limaBT;
    private javax.swing.JButton persenBT;
    private javax.swing.JButton samadenganBT;
    private javax.swing.JButton satuBT;
    private javax.swing.JButton sembilanBT;
    private javax.swing.JButton tambahBT;
    private javax.swing.JButton tigaBT;
    private javax.swing.JButton titikBT;
    private javax.swing.JButton tujuhBT;
    // End of variables declaration//GEN-END:variables

    double num1;
    int kalkulator;
    
    private void tampilkanHasil(){
        double num2 = Double.parseDouble(isiTF.getText());
        double hasil = 0;
    
        switch(kalkulator){
            case 1:
                hasil = num1 +  num2;
                break;
            case 2:
                hasil = num1 -  num2;
                break;
            case 3:
                hasil = num1 *  num2;
                break;
            case 4:
                if(num2 != 0){
                    hasil = num1 /  num2;
                } else{
                    isiTF.setText("Tidak bisa dibagi 0");
                }             
                break;
            case 5:
                hasil = (num1 * num2) / 100;
                break;            
        }
        isiTF.setText(Double.toString(hasil));
    }   
}