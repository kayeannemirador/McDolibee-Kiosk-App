/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.kiosk;

import java.awt.print.PrinterException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import my.kiosk.fonts.Fonts;
/**
 *
 * @author User
 */
public class Kiosk extends javax.swing.JFrame {

    ComboMeals[][] meals = new ComboMeals[3][3];
    double total, price;
    String meal; 
   
    public void initMeals(){
        meals[0][0] = new ComboMeals("TCHBURGER", 200.00);  
        meals[0][1] = new ComboMeals("SNTBURGER",190.00);
        meals[1][0] = new ComboMeals("DQPBURGER",195.00);
        meals[1][1] = new ComboMeals("DMCBURGER",170.00);
        meals[2][0] = new ComboMeals("MONBURGER",205.00);
        meals[2][1] = new ComboMeals("SMCBURGER",150.00);
    }
    /**
     * Creates new form Kiosk
     */
    public Kiosk() {
        initComponents();
        initMeals();
        setLocationRelativeTo(null);
        headerPrint();
    }
    
    void clicked(int x, int y, JButton button){
        
        SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, 30, 1);
        JSpinner spinner = new JSpinner(sModel);
        int qty = 0; 
        
        var ans = JOptionPane.showConfirmDialog(null, spinner, "Add " +
                meals[x][y].getName() +", ₱" + meals[x][y].getPrice() +" at your order?", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,button.getIcon());
       
        if (ans == JOptionPane.YES_OPTION){
             qty = (Integer)spinner.getValue();
            txtReceipt.append("\n" +qty+ "    " + meals[x][y].getName()+ "      " + String.valueOf(meals[x][y].getPrice()) + "     "
            +meals[x][y].getPrice()*qty);
            price = meals[x][y].getPrice()*qty;
            total += price; 
            
        }
    }
    
   
    void headerPrint(){
        Random randomNum = new Random();
        int receipt_num = randomNum.nextInt(100000);
        txtReceipt.append("- - - - - - - - - - - - - - - - - - -");
        txtReceipt.append("\n         MCOLIBEE SECRET MENU");
        txtReceipt.append("\n             AUF BRANCH");
        txtReceipt.append("\n         for online delivery,");
        txtReceipt.append("\n        visit mcolibee.com.ph");
        txtReceipt.append("\n\n Official Receipt #: " + receipt_num);
        txtReceipt.append("\nQTY    ITEM        PRICE      TOTAL");
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBurger = new javax.swing.JButton();
        btnFries = new javax.swing.JButton();
        btnNuggets = new javax.swing.JButton();
        btnChicken = new javax.swing.JButton();
        btnSundae = new javax.swing.JButton();
        btnCoffee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        btnDone = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mcdonald's Kiosk");

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        btnBurger.setBackground(new java.awt.Color(255, 102, 102));
        btnBurger.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/1.png"))); // NOI18N
        btnBurger.setText("Triple Cheeseburger");
        btnBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBurger.setContentAreaFilled(false);
        btnBurger.setDefaultCapable(false);
        btnBurger.setFocusPainted(false);
        btnBurger.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBurger.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurgerActionPerformed(evt);
            }
        });
        jPanel1.add(btnBurger);

        btnFries.setBackground(new java.awt.Color(255, 102, 102));
        btnFries.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/2.png"))); // NOI18N
        btnFries.setText("Surf n Turf");
        btnFries.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFries.setContentAreaFilled(false);
        btnFries.setFocusPainted(false);
        btnFries.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFries.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFriesActionPerformed(evt);
            }
        });
        jPanel1.add(btnFries);

        btnNuggets.setBackground(new java.awt.Color(255, 102, 102));
        btnNuggets.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/3.png"))); // NOI18N
        btnNuggets.setText("Double Quarter Pounder");
        btnNuggets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuggets.setContentAreaFilled(false);
        btnNuggets.setFocusPainted(false);
        btnNuggets.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuggets.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuggetsActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuggets);

        btnChicken.setBackground(new java.awt.Color(255, 102, 102));
        btnChicken.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/4.png"))); // NOI18N
        btnChicken.setText("Double McChicken");
        btnChicken.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnChicken.setContentAreaFilled(false);
        btnChicken.setFocusPainted(false);
        btnChicken.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChicken.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChickenActionPerformed(evt);
            }
        });
        jPanel1.add(btnChicken);

        btnSundae.setBackground(new java.awt.Color(255, 102, 102));
        btnSundae.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSundae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/5.png"))); // NOI18N
        btnSundae.setText("Monster Mac");
        btnSundae.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSundae.setContentAreaFilled(false);
        btnSundae.setFocusPainted(false);
        btnSundae.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSundae.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSundaeActionPerformed(evt);
            }
        });
        jPanel1.add(btnSundae);

        btnCoffee.setBackground(new java.awt.Color(255, 102, 102));
        btnCoffee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/6.png"))); // NOI18N
        btnCoffee.setText("Spicy McChicken");
        btnCoffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCoffee.setContentAreaFilled(false);
        btnCoffee.setFocusPainted(false);
        btnCoffee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCoffee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnCoffee);

        txtReceipt.setEditable(false);
        txtReceipt.setColumns(10);
        txtReceipt.setFont(Fonts.getReceiptFont(10));
        txtReceipt.setLineWrap(true);
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        btnDone.setBackground(new java.awt.Color(0, 204, 0));
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Done");
        btnDone.setBorderPainted(false);
        btnDone.setFocusPainted(false);
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jLabel3.setFont(Fonts.getFont(16));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HACK THE MENU");

        btnCancel.setBackground(new java.awt.Color(255, 51, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderPainted(false);
        btnCancel.setFocusPainted(false);
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/kiosk/src/imageedit_6_5326083427.png"))); // NOI18N
        jLabel1.setText("#SECRETMENU");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed

        txtReceipt.append("\nTotal Bill:                  " + total);
        txtReceipt.append("\n\n   Thank you, Please come again.");
        txtReceipt.append("\n     Please pay at the counter.");
        
        try {
            boolean complete = txtReceipt.print();
            if(complete){
                JOptionPane.showMessageDialog(null, "Done!",

                    "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Printing",
                    "Printer", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (PrinterException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtReceipt.setText(null);
        headerPrint();
        total = 0;
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffeeActionPerformed
        clicked(2,1, btnCoffee);
    }//GEN-LAST:event_btnCoffeeActionPerformed

    private void btnSundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSundaeActionPerformed
        clicked(2,0, btnSundae);
    }//GEN-LAST:event_btnSundaeActionPerformed

    private void btnChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChickenActionPerformed
        clicked(1,1, btnChicken);
    }//GEN-LAST:event_btnChickenActionPerformed

    private void btnNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuggetsActionPerformed
        clicked(1,0, btnNuggets);
    }//GEN-LAST:event_btnNuggetsActionPerformed

    private void btnFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFriesActionPerformed
        clicked(0,1, btnFries);
    }//GEN-LAST:event_btnFriesActionPerformed

    private void btnBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurgerActionPerformed
        clicked(0,0, btnBurger);
    }//GEN-LAST:event_btnBurgerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurger;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChicken;
    private javax.swing.JButton btnCoffee;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnFries;
    private javax.swing.JButton btnNuggets;
    private javax.swing.JButton btnSundae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
