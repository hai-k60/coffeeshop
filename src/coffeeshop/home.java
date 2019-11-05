/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MyPC
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    
    
    public home() {
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

        header_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        container_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menubar_panel = new javax.swing.JPanel();
        btn_customers = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        btn_order = new javax.swing.JLabel();
        btn_menu = new javax.swing.JLabel();
        btn_employee = new javax.swing.JLabel();
        btn_materials = new javax.swing.JLabel();
        btn_reports = new javax.swing.JLabel();
        btn_storage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_panel.setBackground(new java.awt.Color(51, 51, 51));
        header_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/leaf.png"))); // NOI18N
        jLabel1.setText("KSTN");
        header_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, 70, 43));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(224, 224, 224));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log out");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        header_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 84, 44));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 177, 75));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COFFEE");
        jLabel4.setOpaque(true);
        header_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 0, 70, 43));

        getContentPane().add(header_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 794, 43));

        container_panel.setBackground(new java.awt.Color(255, 255, 255));
        container_panel.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Welcome to Coffee Shop");
        container_panel.add(jLabel3, new java.awt.GridBagConstraints());

        getContentPane().add(container_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 43, 585, 465));

        menubar_panel.setBackground(new java.awt.Color(200, 200, 200));
        menubar_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_customers.setBackground(new java.awt.Color(180, 180, 180));
        btn_customers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_customers.setForeground(new java.awt.Color(51, 51, 51));
        btn_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        btn_customers.setText(" Customers");
        btn_customers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_customers.setOpaque(true);
        btn_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customersMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 190, 200, 40));

        btn_home.setBackground(new java.awt.Color(180, 180, 180));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_home.setForeground(new java.awt.Color(51, 51, 51));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ihome.png"))); // NOI18N
        btn_home.setText(" Home");
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setOpaque(true);
        menubar_panel.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 200, 40));

        btn_order.setBackground(new java.awt.Color(180, 180, 180));
        btn_order.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_order.setForeground(new java.awt.Color(51, 51, 51));
        btn_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order.png"))); // NOI18N
        btn_order.setText(" Order");
        btn_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_order.setOpaque(true);
        btn_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_orderMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 55, 200, 40));

        btn_menu.setBackground(new java.awt.Color(180, 180, 180));
        btn_menu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(51, 51, 51));
        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        btn_menu.setText(" Menu");
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.setOpaque(true);
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 100, 200, 40));

        btn_employee.setBackground(new java.awt.Color(180, 180, 180));
        btn_employee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_employee.setForeground(new java.awt.Color(51, 51, 51));
        btn_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        btn_employee.setText(" Employees");
        btn_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_employee.setOpaque(true);
        btn_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_employeeMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 145, 200, 40));

        btn_materials.setBackground(new java.awt.Color(180, 180, 180));
        btn_materials.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_materials.setForeground(new java.awt.Color(51, 51, 51));
        btn_materials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/material.png"))); // NOI18N
        btn_materials.setText(" Materials");
        btn_materials.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_materials.setOpaque(true);
        btn_materials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_materialsMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_materials, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 235, 200, 40));

        btn_reports.setBackground(new java.awt.Color(180, 180, 180));
        btn_reports.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reports.setForeground(new java.awt.Color(51, 51, 51));
        btn_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        btn_reports.setText(" Reports");
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reports.setOpaque(true);
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportsMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 325, 200, 40));

        btn_storage.setBackground(new java.awt.Color(180, 180, 180));
        btn_storage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_storage.setForeground(new java.awt.Color(51, 51, 51));
        btn_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/storage.png"))); // NOI18N
        btn_storage.setText(" Storage");
        btn_storage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_storage.setOpaque(true);
        btn_storage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_storageMouseClicked(evt);
            }
        });
        menubar_panel.add(btn_storage, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 280, 200, 40));

        getContentPane().add(menubar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 210, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        login login_form = new login();
        login_form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderMouseClicked
        // TODO add your handling code here:
        order_panel subpanel = new order_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
//        main_panel.repaint();
    }//GEN-LAST:event_btn_orderMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        // TODO add your handling code here:
        menu_panel subpanel = new menu_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
//        main_panel.repaint();
    }//GEN-LAST:event_btn_menuMouseClicked

    private void btn_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employeeMouseClicked
        // TODO add your handling code here:
        employees_panel subpanel = new employees_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
    }//GEN-LAST:event_btn_employeeMouseClicked

    private void btn_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customersMouseClicked
        // TODO add your handling code here:
        customers_panel subpanel = new customers_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
    }//GEN-LAST:event_btn_customersMouseClicked

    private void btn_materialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialsMouseClicked
        // TODO add your handling code here:
        materials_panel subpanel = new materials_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
    }//GEN-LAST:event_btn_materialsMouseClicked

    private void btn_storageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_storageMouseClicked
        // TODO add your handling code here:
        storage_panel subpanel = new storage_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
    }//GEN-LAST:event_btn_storageMouseClicked

    private void btn_reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseClicked
        // TODO add your handling code here:
        reports_panel subpanel = new reports_panel();
        container_panel.removeAll();
        container_panel.add(subpanel);
        container_panel.validate();
    }//GEN-LAST:event_btn_reportsMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.out.println("run home");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_customers;
    private javax.swing.JLabel btn_employee;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel btn_materials;
    private javax.swing.JLabel btn_menu;
    private javax.swing.JLabel btn_order;
    private javax.swing.JLabel btn_reports;
    private javax.swing.JLabel btn_storage;
    private javax.swing.JPanel container_panel;
    private javax.swing.JPanel header_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel menubar_panel;
    // End of variables declaration//GEN-END:variables
}
