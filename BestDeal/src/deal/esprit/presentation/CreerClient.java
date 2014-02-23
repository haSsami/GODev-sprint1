/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.presentation;


import deal.esprit.dao.ClientDAO;
import deal.esprit.entities.Client;
import java.util.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Ssawssen
 */
public class CreerClient extends javax.swing.JFrame {

    /**
     * Creates new form CreerClient
     */
    public CreerClient() {
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

        txt_mdp = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_emailconf = new javax.swing.JTextField();
        btn_sinscrire = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_pseudo = new javax.swing.JTextField();
        txt_mdpcon = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.DATE|Calendar.MONTH|Calendar.YEAR);
        spn_date = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_sexe = new javax.swing.JComboBox();
        txt_tel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_sinscrire.setText("S'inscrire");
        btn_sinscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinscrireActionPerformed(evt);
            }
        });

        jLabel11.setText("Sexe :*");

        jLabel12.setText("Telephone :*");

        jLabel9.setText("Date de naissance :*");

        jLabel10.setText("Adresse :*");

        spn_date.setModel(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(spn_date, "dd/mm/yy");
        spn_date.setEditor(de);

        jLabel8.setText("Nom :*");

        jLabel5.setText("Confirmer mot de passe :*");

        jLabel4.setText("Mot de passe :*");

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Confirmer e-mail :*");

        jLabel2.setText("E-mail :*");

        jLabel7.setText("Prénom :*");

        jLabel6.setText("Pseudo :*");

        cmb_sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "H" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_sinscrire)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_adresse, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_pseudo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txt_tel))
                            .addGap(108, 108, 108)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(txt_prenom)
                                .addComponent(txt_mdpcon)
                                .addComponent(txt_emailconf)
                                .addComponent(spn_date)
                                .addComponent(jLabel11)
                                .addComponent(cmb_sexe, 0, 144, Short.MAX_VALUE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_emailconf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mdpcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_sinscrire))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sinscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinscrireActionPerformed

        String nom_client=txt_nom.getText();
        String prenom_client=txt_prenom.getText();
        String email_client =txt_email.getText();
        String tel_client=txt_tel.getText();
        int tel =tel_client.equals("")?0:Integer.parseInt(tel_client);
        String date_client=spn_date.getValue().toString();
        String sexe_client =cmb_sexe.getSelectedItem().toString();
        String adresse_client =txt_adresse.getText();
        String pseudo_client =txt_pseudo.getText();
        String mdp_client =txt_mdp.getText();
        String mdp_conf_client =txt_mdpcon.getText();
        String email_conf_email=txt_emailconf.getText();
        
        if(nom_client.equals("") || prenom_client.equals("")||email_client.equals("")|| tel_client.equals("") || date_client.equals("") || adresse_client.equals("")|| pseudo_client.equals("") || mdp_client.equals("")||mdp_conf_client.equals("")||email_conf_email.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir vos données", "Champs non valide", JOptionPane.ERROR_MESSAGE);
        }
        if(email_client.equals(email_conf_email) && mdp_client.equals(mdp_conf_client)){
        ClientDAO clientDAO = new ClientDAO();
        Client c = new Client();
        c.setNomClient(nom_client);
        c.setPrenomClient(prenom_client);
        c.setEmailClient(email_client);
        c.setTelClient(tel);
        c.setDateClient(date_client);
        c.setSexeClient(sexe_client);
        c.setAdresseClient(adresse_client);
        c.setPseudoClient(pseudo_client);
        c.setMdpClient(mdp_client);
        
        clientDAO.insertClient(c);
        } else{
            
            JOptionPane.showMessageDialog(this, "Veuillez confirmer votre mot de passe ou votre email ", "Pas de confirmation", JOptionPane.WARNING_MESSAGE);
            
        }
       
              
    }//GEN-LAST:event_btn_sinscrireActionPerformed

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
            java.util.logging.Logger.getLogger(CreerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sinscrire;
    private javax.swing.JComboBox cmb_sexe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spn_date;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emailconf;
    private javax.swing.JTextField txt_mdp;
    private javax.swing.JTextField txt_mdpcon;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_pseudo;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
