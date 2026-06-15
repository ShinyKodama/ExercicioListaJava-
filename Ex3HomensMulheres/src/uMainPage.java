import java.awt.Color;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class uMainPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(uMainPage.class.getName());
    private final Map<String, Integer> Usuarios = new HashMap<>();
    private static final int LIMITE_USUARIOS = 8;
    /**
     * Creates new form uMainPage
     */
    public uMainPage() {
        initComponents();
        tfNomeUsuario.setForeground(Color.GRAY);
        tfIdadeUsuario.setForeground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tfNomeUsuario = new javax.swing.JTextField();
        tfIdadeUsuario = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfNomeUsuario.setText("Nome do(a) usuário(a)");
        tfNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeUsuarioFocusLost(evt);
            }
        });
        tfNomeUsuario.addActionListener(this::tfNomeUsuarioActionPerformed);

        tfIdadeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfIdadeUsuario.setText("Idade do(a) usuário(a)");
        tfIdadeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfIdadeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdadeUsuarioFocusLost(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(this::btnConfirmarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                        .addComponent(tfIdadeUsuario)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIdadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeUsuarioActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            String nomeUsuario = tfNomeUsuario.getText().trim();
            int idadeUsuario   = Integer.parseInt(tfIdadeUsuario.getText().trim());
            
            if (Usuarios.size() > LIMITE_USUARIOS) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Limite de usuários alcançado!(Max. 8)",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                Usuarios.put(nomeUsuario, idadeUsuario);
                JOptionPane.showMessageDialog(
                        this, 
                        "Cadastro realizado com sucesso!",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
                
                uRelatorioUsuarios formRelatorioUsuarios = new uRelatorioUsuarios(Usuarios);
                formRelatorioUsuarios.setVisible(true);
                
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Preencha todos os campos corretamente!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void tfNomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeUsuarioFocusGained
        if (tfNomeUsuario.getText().equals("Nome do(a) usuário(a)")) {
            tfNomeUsuario.setText("");
            tfNomeUsuario.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tfNomeUsuarioFocusGained
    private void tfNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeUsuarioFocusLost
        if (tfNomeUsuario.getText().trim().isEmpty()) {
            tfNomeUsuario.setText("Nome do(a) usuário(a)");
            tfNomeUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfNomeUsuarioFocusLost

    private void tfIdadeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdadeUsuarioFocusGained
        if (tfIdadeUsuario.getText().equals("Idade do(a) usuário(a)")) {
            tfIdadeUsuario.setText("");
            tfIdadeUsuario.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tfIdadeUsuarioFocusGained
    private void tfIdadeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdadeUsuarioFocusLost
        if (tfIdadeUsuario.getText().trim().isEmpty()) {
            tfIdadeUsuario.setText("Idade do(a) usuário(a)");
            tfIdadeUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfIdadeUsuarioFocusLost

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new uMainPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfIdadeUsuario;
    private javax.swing.JTextField tfNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
