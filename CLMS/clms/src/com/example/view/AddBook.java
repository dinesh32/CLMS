/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.view;

import com.example.controller.BookDAO;
import com.example.model.Book;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();
    }
    private  boolean validData(){
        if(b_name.getText().equals("")||b_auther.getText().equals("")||
                b_publication.getText().equals("")){
            JOptionPane.showMessageDialog(parent,"Please input in all fields");
            return false;
        }
        else{
            return true;
        }
    }
    private void clearFields(){
        b_name.setText("");
        b_isbn.setText("");
        b_price.setText("");
        b_auther.setText("");
        b_publication.setText("");
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent = new javax.swing.JPanel();
        addbook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_name = new javax.swing.JTextField();
        b_price = new javax.swing.JTextField();
        b_category = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        b_auther = new javax.swing.JTextField();
        b_publication = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        b_isbn = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sidepane1 = new javax.swing.JPanel();
        sidepane2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        sidepane3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sidepane4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        sidepane5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        sidepane6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        sidepane7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        sidepane8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        sidepane9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        sidepane10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        sidepane11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        sidepane12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        sidepane13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        sidepane14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbook.setBackground(new java.awt.Color(96, 212, 196));
        addbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("CATEGORY :");
        addbook.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("NAME :");
        addbook.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("PRICE : ");
        addbook.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("AUTHER :");
        addbook.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("PUBLICATION :");
        addbook.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        b_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nameActionPerformed(evt);
            }
        });
        addbook.add(b_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 350, 30));

        b_price.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_priceActionPerformed(evt);
            }
        });
        b_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_priceKeyTyped(evt);
            }
        });
        addbook.add(b_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 180, 30));

        b_category.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic", "Religious", "Literature", "Science and Technology" }));
        b_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_categoryActionPerformed(evt);
            }
        });
        addbook.add(b_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

        btn_save.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        addbook.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        b_auther.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_auther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_autherActionPerformed(evt);
            }
        });
        addbook.add(b_auther, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 360, 30));

        b_publication.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_publication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_publicationActionPerformed(evt);
            }
        });
        addbook.add(b_publication, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 210, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("ISBN :");
        addbook.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        b_isbn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        b_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_isbnActionPerformed(evt);
            }
        });
        b_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b_isbnKeyTyped(evt);
            }
        });
        addbook.add(b_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, 30));

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\clms\\src\\Resources\\back.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        addbook.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        labelSearch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelSearch.setText("Add Book");
        addbook.add(labelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        parent.add(addbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 750, 500));

        sidepane.setBackground(new java.awt.Color(36, 47, 65));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dinesh\\Documents\\NetBeansProjects\\clms\\build\\classes\\Resources\\Admin.png")); // NOI18N
        sidepane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 80));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("WELCOME TO CLMS");
        sidepane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("USER");
        sidepane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        sidepane1.setBackground(new java.awt.Color(102, 102, 0));
        sidepane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane2.setBackground(new java.awt.Color(36, 47, 65));
        sidepane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("USER");
        sidepane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane1.add(sidepane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("SEARCH BOOK");
        sidepane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane.add(sidepane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 40));

        sidepane3.setBackground(new java.awt.Color(0, 51, 51));
        sidepane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("SEARCH MEMBER");
        sidepane3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane4.setBackground(new java.awt.Color(36, 47, 65));
        sidepane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("USER");
        sidepane4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane3.add(sidepane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        sidepane5.setBackground(new java.awt.Color(102, 102, 0));
        sidepane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ISSUE BOOK");
        sidepane5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane6.setBackground(new java.awt.Color(36, 47, 65));
        sidepane6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("USER");
        sidepane6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane5.add(sidepane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

        sidepane7.setBackground(new java.awt.Color(0, 51, 51));
        sidepane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("RETURN BOOK");
        sidepane7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane8.setBackground(new java.awt.Color(36, 47, 65));
        sidepane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("USER");
        sidepane8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane7.add(sidepane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 40));

        sidepane9.setBackground(new java.awt.Color(102, 102, 0));
        sidepane9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("RENEW BOOK");
        sidepane9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane10.setBackground(new java.awt.Color(36, 47, 65));
        sidepane10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("USER");
        sidepane10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane9.add(sidepane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 40));

        sidepane11.setBackground(new java.awt.Color(96, 212, 196));
        sidepane11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setText("ADD BOOK");
        sidepane11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane12.setBackground(new java.awt.Color(36, 47, 65));
        sidepane12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("USER");
        sidepane12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane11.add(sidepane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        sidepane13.setBackground(new java.awt.Color(102, 102, 0));
        sidepane13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("ADD MEMBER");
        sidepane13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane14.setBackground(new java.awt.Color(36, 47, 65));
        sidepane14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("USER");
        sidepane14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 40));

        sidepane13.add(sidepane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 250, 40));

        sidepane.add(sidepane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 40));

        parent.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_nameActionPerformed

    private void b_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_priceActionPerformed

    private void b_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_categoryActionPerformed

    private void b_autherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_autherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_autherActionPerformed

    private void b_publicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_publicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_publicationActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String book_name=b_name.getText();
        long book_isbn=Long.parseLong(b_isbn.getText());
        String book_auther=b_auther.getText();
        String book_publication=b_publication.getText();
        float book_price=Float.parseFloat(b_price.getText());
       
        
       String book_category= b_category.getSelectedItem().toString();
        //check the fields
       if(validData()){
        //create object of model class book and set these value
        Book ob= new Book();
        ob.setName(book_name);
        ob.setIsbn(book_isbn);
        ob.setAuther(book_auther);
        ob.setPublication(book_publication);
        ob.setPrice(book_price);
        ob.setCategory(book_category);
        
        BookDAO bDAO= new BookDAO();
        bDAO.insertData(ob);
         JOptionPane.showMessageDialog(parent, "Book Recorded Sucessfully");
        clearFields();}
        
       
    }//GEN-LAST:event_btn_saveActionPerformed

    private void b_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_priceKeyTyped
        // TODO add your handling code here:
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_b_priceKeyTyped

    private void b_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_isbnActionPerformed

    private void b_isbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_isbnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_b_isbnKeyTyped

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new SearchBook().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addbook;
    private javax.swing.JTextField b_auther;
    private javax.swing.JComboBox<String> b_category;
    private javax.swing.JTextField b_isbn;
    private javax.swing.JTextField b_name;
    private javax.swing.JTextField b_price;
    private javax.swing.JTextField b_publication;
    private javax.swing.JLabel back;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JPanel parent;
    private javax.swing.JPanel sidepane;
    private javax.swing.JPanel sidepane1;
    private javax.swing.JPanel sidepane10;
    private javax.swing.JPanel sidepane11;
    private javax.swing.JPanel sidepane12;
    private javax.swing.JPanel sidepane13;
    private javax.swing.JPanel sidepane14;
    private javax.swing.JPanel sidepane2;
    private javax.swing.JPanel sidepane3;
    private javax.swing.JPanel sidepane4;
    private javax.swing.JPanel sidepane5;
    private javax.swing.JPanel sidepane6;
    private javax.swing.JPanel sidepane7;
    private javax.swing.JPanel sidepane8;
    private javax.swing.JPanel sidepane9;
    // End of variables declaration//GEN-END:variables
}
