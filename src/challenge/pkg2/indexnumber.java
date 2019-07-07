/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.pkg2;

import static challenge.pkg2.JsonReader.readJsonFromUrl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Thushapan
 */
public class indexnumber extends javax.swing.JFrame {

    /**
     * Creates new form indexnumber
     */
    public indexnumber() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PLEASE ENTER INDEX NUMBER");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("View result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jButton1)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
       int a;
        a = Integer.parseInt(jTextField1.getText());
        JsonReader obj = new JsonReader();
        
        
        
        
        try {
            JSONObject json;
           json = readJsonFromUrl("https://doenets.lk/result/service/AlResult/"+a);
            
            System.out.println(json.toString());

            
//            System.out.println(json.get("islandRank"));
//    System.out.println(json.get("year"));
//    System.out.println(json.get("districtRank"));
//    System.out.println(json.get("stream"));
//    System.out.println(json.get("year"));
    
    String i = (String) json.get("islandRank");
     String d = (String) json.get("districtRank");
      String s = (String) json.get("stream");
    
      JSONArray recs = (JSONArray) json.get("studentInfo");
      
      JSONArray subs = (JSONArray) json.get("subjectResults");
      
      
      
      
      
      
      
    JSONObject rec1 = recs.getJSONObject(0);
   
    
    String v1 = rec1.getString("value");
    
    
                
                System.out.println("  "+v1+"\n");
                
                
   JSONObject rec2 = recs.getJSONObject(1);
   
    
    String v2 = rec2.getString("value");
    
    
                
                System.out.println("  "+v2+"\n");
    
   JSONObject rec3 = recs.getJSONObject(2);
   
    
    String v3 = rec3.getString("value");
    
    
                
                System.out.println("  "+v3+"\n");
                
                
    JSONObject rec4 = recs.getJSONObject(3);
   
    
    String v4 = rec4.getString("value");
    
    
                
                System.out.println("  "+v4+"\n");              
                
     JSONObject rec5 = recs.getJSONObject(4);
   
    
    String v5 = rec5.getString("value");
    
    
                
                System.out.println("  "+v5+"\n");              
                
                
     JSONObject rec6 = recs.getJSONObject(6);
   
    
    String v6 = rec6.getString("value");
    
    
                
                System.out.println("  "+v6+"\n");     
                
                
                
                
   
    JSONObject sub1 = subs.getJSONObject(0);
    String s1 = sub1.getString("subjectName");
    String r1 = sub1.getString("subjectResult");
    
    
     JSONObject sub2 = subs.getJSONObject(1);
    String s2 = sub2.getString("subjectName");
    String r2 = sub2.getString("subjectResult");
    
     JSONObject sub3 = subs.getJSONObject(2);
    String s3 = sub3.getString("subjectName");
    String r3 = sub3.getString("subjectResult");
    
     JSONObject sub4 = subs.getJSONObject(3);
    String s4 = sub1.getString("subjectName");
    String r4 = sub1.getString("subjectResult");
    
     JSONObject sub5 = subs.getJSONObject(4);
    String s5 = sub5.getString("subjectName");
    String r5 = sub5.getString("subjectResult");
    
    
                
      

    // ...

      
            
   
    
    
    
              

    // ...

    
     
      
    
    
    new Result(i,d,s,v1,v2,v3,v4,v6,s1,r1,s2,r2,s3,r3,s4,r4,s5,r5).setVisible(true);
     

        this.dispose();
        
    
   
            
            
            
            
            
            
            
            
            
            
        } catch (IOException | JSONException ex) {
            Logger.getLogger(indexnumber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     







// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(indexnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indexnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indexnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indexnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new indexnumber().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
