/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FERDI YANSAH
 */
public class Demonstrasi extends javax.swing.JFrame {
    DefaultTableModel modelmahasiswa;
    InputDataMahasiswa datamahasiswa;
    /**
     * Creates new form Demonstrasi
     */
    public Demonstrasi() {
        initComponents();
        datamahasiswa = new InputDataMahasiswa();
        viewDataTabel();
    }
    
    public final void viewDataTabel(){
        String[] namakolom = {"NIM","Nama","Alamat","Mata Kuliah","Nilai Akhir"};
        Object[][]objekmahasiswa = new Object[datamahasiswa.getALL().size()][5];
        int i = 0;
        for(Mahasiswa mhs: datamahasiswa.getALL()){
        String arrayMahasiswa[] = {
            mhs.getNIM(),
            mhs.getNama(),
            mhs.getAlamat(),
            mhs.getMatkul(),           
            String.valueOf(mhs.getNilaiAkhir())   // untuk merubah dari double ke string
        };            
        objekmahasiswa[i] = arrayMahasiswa;
        i++;
        }
        modelmahasiswa = new DefaultTableModel(objekmahasiswa, namakolom);
        mahasiswaTB.setModel(modelmahasiswa);
    }
    public void ClearTextField(){
        isiNimTF.setText("");
        isiNamaTF.setText("");
        isiAlamatTF.setText("");
        isiMatkulTF.setText("");
        isiNilai1TF.setText("");
        isiNilai2TF.setText("");
        isiNilai3TF.setText("");
        isiNilai4TF.setText("");
        isiNilai5TF.setText("");
        isiNilaiAkhirTF.setText("");
        isiNimTF.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nimLB = new javax.swing.JLabel();
        namaLB = new javax.swing.JLabel();
        alamatLB = new javax.swing.JLabel();
        matkulLB = new javax.swing.JLabel();
        isiNimTF = new javax.swing.JTextField();
        isiNamaTF = new javax.swing.JTextField();
        isiAlamatTF = new javax.swing.JTextField();
        isiMatkulTF = new javax.swing.JTextField();
        nilai1LB = new javax.swing.JLabel();
        nilai2LB = new javax.swing.JLabel();
        nilai3LB = new javax.swing.JLabel();
        nilai4LB = new javax.swing.JLabel();
        nilai5LB = new javax.swing.JLabel();
        nilaiAkhirLB = new javax.swing.JLabel();
        isiNilai1TF = new javax.swing.JTextField();
        isiNilai2TF = new javax.swing.JTextField();
        isiNilai3TF = new javax.swing.JTextField();
        isiNilai4TF = new javax.swing.JTextField();
        isiNilai5TF = new javax.swing.JTextField();
        isiNilaiAkhirTF = new javax.swing.JTextField();
        simpanBT = new javax.swing.JButton();
        hapusBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTB = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Mahasiswa");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        nimLB.setText("NIM");

        namaLB.setText("Nama");

        alamatLB.setText("Alamat");

        matkulLB.setText("Mata Kuliah");

        nilai1LB.setText("Nilai 1 (10%)");

        nilai2LB.setText("Nilai 2 (15%)");

        nilai3LB.setText("Nilai 3 - UTS (25%)");

        nilai4LB.setText("Nilai 4 (15%)");

        nilai5LB.setText("Nilai 5 (35%)");

        nilaiAkhirLB.setText("Nilai Akhir");

        simpanBT.setText("SImpan");
        simpanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTActionPerformed(evt);
            }
        });

        hapusBT.setText("Hapus");
        hapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaLB)
                    .addComponent(nimLB)
                    .addComponent(alamatLB)
                    .addComponent(matkulLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isiAlamatTF)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(simpanBT)
                        .addGap(4, 4, 4)
                        .addComponent(hapusBT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(isiNimTF)
                    .addComponent(isiNamaTF)
                    .addComponent(isiMatkulTF))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilai1LB)
                    .addComponent(nilai2LB)
                    .addComponent(nilai3LB)
                    .addComponent(nilai4LB)
                    .addComponent(nilai5LB)
                    .addComponent(nilaiAkhirLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isiNilai1TF, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(isiNilai2TF)
                    .addComponent(isiNilai3TF)
                    .addComponent(isiNilai4TF)
                    .addComponent(isiNilai5TF)
                    .addComponent(isiNilaiAkhirTF))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilai1LB)
                            .addComponent(isiNilai1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilai2LB)
                            .addComponent(isiNilai2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilai3LB)
                            .addComponent(isiNilai3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilai4LB)
                            .addComponent(isiNilai4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilai5LB)
                            .addComponent(isiNilai5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilaiAkhirLB)
                            .addComponent(isiNilaiAkhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simpanBT)
                            .addComponent(hapusBT)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nimLB)
                            .addComponent(isiNimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLB)
                            .addComponent(isiNamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamatLB)
                            .addComponent(isiAlamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matkulLB)
                            .addComponent(isiMatkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mahasiswaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        jScrollPane2.setViewportView(mahasiswaTB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void simpanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTActionPerformed
        // TODO add your handling code here:   
        String nim = isiNimTF.getText();
        String nama = isiNamaTF.getText();
        String alamat = isiAlamatTF.getText();
        String matkul = isiMatkulTF.getText();
        
        // untuk merubah dari string ke double
        double nilai1 = Double.parseDouble(isiNilai1TF.getText());
        double nilai2 = Double.parseDouble(isiNilai2TF.getText());
        double nilai3 = Double.parseDouble(isiNilai3TF.getText());
        double nilai4 = Double.parseDouble(isiNilai4TF.getText());
        double nilai5 = Double.parseDouble(isiNilai5TF.getText());
        
        // rumus nilai akhir
        double nilaiAkhir = ((nilai1 * 10/100) + (nilai2 * 15/100) + (nilai3 * 25/100) + (nilai4 * 15/100) + (nilai5 * 35/100));

        // memanggil method insert data
        datamahasiswa.insertData(nim, nama, alamat, matkul, nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir);      
        viewDataTabel();
        ClearTextField();      
    }//GEN-LAST:event_simpanBTActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
        // TODO add your handling code here:
        datamahasiswa.deleteData(mahasiswaTB.getSelectedRow()+1);
        viewDataTabel();
    }//GEN-LAST:event_hapusBTActionPerformed

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
            java.util.logging.Logger.getLogger(Demonstrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demonstrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demonstrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demonstrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demonstrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLB;
    private javax.swing.JButton hapusBT;
    private javax.swing.JTextField isiAlamatTF;
    private javax.swing.JTextField isiMatkulTF;
    private javax.swing.JTextField isiNamaTF;
    private javax.swing.JTextField isiNilai1TF;
    private javax.swing.JTextField isiNilai2TF;
    private javax.swing.JTextField isiNilai3TF;
    private javax.swing.JTextField isiNilai4TF;
    private javax.swing.JTextField isiNilai5TF;
    private javax.swing.JTextField isiNilaiAkhirTF;
    private javax.swing.JTextField isiNimTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable mahasiswaTB;
    private javax.swing.JLabel matkulLB;
    private javax.swing.JLabel namaLB;
    private javax.swing.JLabel nilai1LB;
    private javax.swing.JLabel nilai2LB;
    private javax.swing.JLabel nilai3LB;
    private javax.swing.JLabel nilai4LB;
    private javax.swing.JLabel nilai5LB;
    private javax.swing.JLabel nilaiAkhirLB;
    private javax.swing.JLabel nimLB;
    private javax.swing.JButton simpanBT;
    // End of variables declaration//GEN-END:variables
}
