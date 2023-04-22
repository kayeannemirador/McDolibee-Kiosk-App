/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package my.kiosk;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Kaye Anne
 */
public class MealsCombo extends javax.swing.JPanel {
    String namecombo, label;
    double pricecombo; 
    ImageIcon iconcombo;
   

    public MealsCombo(String name, String label, double price, ImageIcon icon) {
        this.namecombo = name;
        this.pricecombo = price;
        this.iconcombo = icon;
        this.label = label;
        
        initComponents();
        lblname.setText(name);
        lblprice.setText(String.valueOf(price));
        lblimg.setIcon(icon);
        
        
    }



    public void setComboData(String name, String label, double price, ImageIcon icon) {
        this.namecombo = name;
        this.pricecombo = price;
        this.iconcombo = icon;
        this.label = label;
    }

    public ImageIcon getIconcombo() {
        return iconcombo;
    }
 
    public String getComboName() {
        return namecombo;
    }
    
    public String getLabel() {
        return label;
    }

    public double getComboPrice() {
        return pricecombo;
    }
    
   
    
    
    /**
     * Creates new form MealsCombo
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblimg = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(180, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(180, 180));
        setPreferredSize(new java.awt.Dimension(180, 180));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        lblimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblimg);
        lblimg.setBounds(10, 20, 150, 110);

        lblprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprice.setText("price");
        add(lblprice);
        lblprice.setBounds(110, 10, 50, 16);

        lblname.setBackground(new java.awt.Color(51, 51, 51));
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("name");
        lblname.setOpaque(true);
        add(lblname);
        lblname.setBounds(0, 130, 180, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblprice;
    // End of variables declaration//GEN-END:variables
}