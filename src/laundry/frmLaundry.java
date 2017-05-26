/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asus
 */
public class frmLaundry extends javax.swing.JFrame {

    int jam;
    int menit;
    int detik;
    /**
     * Creates new form frmLaundry
     */
    public frmLaundry() {
        initComponents();
        
        setTanggal() ;
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTable();
        Total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        No = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Tgl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kg");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 170, 50, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Pelanggan ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 118, 110, 32);

        Harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Harga);
        Harga.setBounds(440, 70, 150, 30);

        Nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Nama);
        Nama.setBounds(150, 120, 150, 30);

        Berat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Berat);
        Berat.setBounds(150, 170, 60, 30);

        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(40, 220, 90, 30);

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(240, 220, 90, 30);

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(340, 220, 90, 30);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(540, 220, 90, 30);

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(440, 220, 90, 30);

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(140, 220, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Berat Laundry");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 110, 32);

        Hasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Tanggal", "Berat", "Harga/Kg", "Harga_Total"
            }
        ));
        jScrollPane2.setViewportView(Hasil);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 272, 590, 180);

        Total.setEditable(false);
        Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Total);
        Total.setBounds(440, 120, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Harga Total");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 120, 110, 32);

        No.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(No);
        No.setBounds(150, 70, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("No Pelanggan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 70, 110, 32);

        total.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        total.setText("TOTAL");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total);
        total.setBounds(440, 170, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Harga");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 70, 110, 32);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 650, 410);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        Tgl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("LAUNDRY BOBO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(166, 166, 166)
                .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(427, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 470);

        setSize(new java.awt.Dimension(685, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        String SQL = "INSERT INTO t_laundry VALUES('"+No.getText()+"','"+Nama.getText()+"','"+Tgl.getText()+"','"+Berat.getText()
                +"','"+Harga.getText()+"','"+Total.getText()+"')";
        int status = database.execute(SQL);
        if (status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambah", "Sukses", JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int baris = Hasil.getSelectedRow();
        if(baris != -1){
            String No_pemesan = Hasil.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_laundry WHERE NOP ='"+No+"'";
            int status = database.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih baris data terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        selectData();
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Nama.setText("");
        Berat.setText("");
        Harga.setText("");
        Total.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Pesanan KEDAI BAMBU");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)   ");

        try {
            Hasil.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        if("".equals(No.getText()) || "".equals(Nama.getText()) || "".equals(Berat.getText()) || "".equals(Harga.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {

            int harga = Integer.parseInt(String.valueOf(Harga.getText()));
            int berat = Integer.parseInt(String.valueOf(Berat.getText()));
            Total.setText(String.valueOf(total));

            
            int ttl = harga*berat;
            int ttld = ttl;
            if(ttl > 50000){
                ttld = ttl * 95/100;
                JOptionPane.showMessageDialog(this,"Anda mendapatkan diskon sebesar 5% ( Rp "+ttl*5/100+" )\n"
                    + "dari "+ttl+" menjadi Rp "+ttl * 95/100);
            }

            Total.setText(String.valueOf(ttld));}
    }//GEN-LAST:event_totalActionPerformed

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
            java.util.logging.Logger.getLogger(frmLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLaundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Harga;
    private javax.swing.JTable Hasil;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField No;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Tgl;
    private javax.swing.JTextField Total;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton total;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"No","Nama","Tanggal","Berat","Harga","total"};
        DefaultTableModel dtm  = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_laundry";
        ResultSet rs = database.executeQuery(SQL);
        
        try {
            while (rs.next()) {
                String No = rs.getString(1);
                String Nama = rs.getString(2);
                String Tanggal = rs.getString(3);
                String Berat = rs.getString(4);
                String Harga = rs.getString(5);
                String Total = rs.getString(6);
                String data[] = {No,Nama,Tanggal,Berat,Harga,Total};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmLaundry.class.getName()).log(Level.SEVERE, null, ex);
        }
        Hasil.setModel(dtm);
    }

    private void setTanggal() {
        java.util.Date skrg = new java.util.Date() ;
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy") ;
        Tgl.setText(kal.format(skrg));
    }

}
