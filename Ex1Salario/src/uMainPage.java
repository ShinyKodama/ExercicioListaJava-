import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class uMainPage extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(uMainPage.class.getName());
    
    private String nomeFuncionario = "", situacao = "";
    private double vendasTotais = 0.0, 
            salarioFuncionario = 0.0, 
            bonus = 0.0, 
            valorTotal = 0.0, 
            porcentagemComissao = 0,
            comissao = 0;
    
    private final double meta = 95000.0;
    private DecimalFormat df = new DecimalFormat("#.##");
    
    public uMainPage() {
        initComponents();
        tfNomeFuncionario.setForeground(java.awt.Color.LIGHT_GRAY);
        tfSalarioFixo.setForeground(java.awt.Color.LIGHT_GRAY);
        tfValorVenda.setForeground(java.awt.Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNomeFuncionario = new javax.swing.JTextField();
        tfSalarioFixo = new javax.swing.JTextField();
        tfValorVenda = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNomeFuncionario.setText("Nome do Funcionário");
        tfNomeFuncionario.setToolTipText("");
        tfNomeFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeFuncionarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFuncionarioFocusLost(evt);
            }
        });
        tfNomeFuncionario.addActionListener(this::tfNomeFuncionarioActionPerformed);

        tfSalarioFixo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSalarioFixo.setText("Salário Fixo (R$)");
        tfSalarioFixo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSalarioFixoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSalarioFixoFocusLost(evt);
            }
        });

        tfValorVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfValorVenda.setText("Valor da Venda Total (R$)");
        tfValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfValorVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfValorVendaFocusLost(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        btnRelatorio.setText("Ver Relatório do Funcionário");
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.addActionListener(this::btnRelatorioActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(tfSalarioFixo)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfValorVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnRelatorio)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSalarioFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorio)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeFuncionarioActionPerformed

    }//GEN-LAST:event_tfNomeFuncionarioActionPerformed
    private void tfNomeFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFuncionarioFocusGained
        if (tfNomeFuncionario.getText().equals("Nome do Funcionário")) {
            tfNomeFuncionario.setText("");
            tfNomeFuncionario.setForeground(java.awt.Color.darkGray);
        }
    }//GEN-LAST:event_tfNomeFuncionarioFocusGained
    private void tfNomeFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFuncionarioFocusLost
        if (tfNomeFuncionario.getText().isEmpty()) {
            tfNomeFuncionario.setText("Nome do Funcionário");
            tfNomeFuncionario.setForeground(java.awt.Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_tfNomeFuncionarioFocusLost
    private void tfSalarioFixoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSalarioFixoFocusGained
        if (tfSalarioFixo.getText().equals("Salário Fixo (R$)")) {
            tfSalarioFixo.setText("");
            tfSalarioFixo.setForeground(java.awt.Color.darkGray);
        }
    }//GEN-LAST:event_tfSalarioFixoFocusGained
    private void tfSalarioFixoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSalarioFixoFocusLost
        if (tfSalarioFixo.getText().isEmpty()) {
            tfSalarioFixo.setText("Salário Fixo (R$)");
            tfSalarioFixo.setForeground(java.awt.Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_tfSalarioFixoFocusLost
    private void tfValorVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfValorVendaFocusGained
        if (tfValorVenda.getText().equals("Valor da Venda Total (R$)")) {
            tfValorVenda.setText("");
            tfValorVenda.setForeground(java.awt.Color.darkGray);
        }
    }//GEN-LAST:event_tfValorVendaFocusGained
    private void tfValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfValorVendaFocusLost
        if (tfValorVenda.getText().isEmpty()) {
            tfValorVenda.setText("Valor da Venda Total (R$)");
            tfValorVenda.setForeground(java.awt.Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_tfValorVendaFocusLost

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            this.nomeFuncionario    = tfNomeFuncionario.getText().trim();
            this.salarioFuncionario = Double.parseDouble(tfSalarioFixo.getText());
            this.vendasTotais       = Double.parseDouble(tfValorVenda.getText());
            
            this.bonus      = 0.15;
            this.valorTotal = 0.0;
            
            if (vendasTotais < (meta * 0.95)) {
                this.bonus = 0;
                this.porcentagemComissao = 0.005;
                situacao = "Abaixo da Meta!";
                
            } else if (vendasTotais >= meta * 0.95 && vendasTotais < meta) {
                this.porcentagemComissao = 0.008;
                situacao = "Atingiu a Meta!";
                
            } else if (vendasTotais >= meta) {
                this.porcentagemComissao = 0.009;
                situacao = "Acima da Meta!";
            }
         
            this.comissao   = this.vendasTotais * this.porcentagemComissao;
            this.valorTotal = (this.vendasTotais >= this.meta) 
                    ? this.salarioFuncionario + this.bonus + this.comissao 
                    : this.salarioFuncionario + this.comissao;
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Cálculo realizado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            tfNomeFuncionario.setText("Nome do Funcionário");
            tfSalarioFixo.setText("Salário Fixo (R$)");
            tfValorVenda.setText("Valor da Venda Total (R$)");
        }
        
        /*
        • % de Meta < 95% = “Abaixo da meta”, comissão de 0,5% sobre venda;
        • % de Meta >= 95% e < que 100% = “Atingiu meta”, comissão e 0,8% sobre venda
        • % de Meta >= 100% = “Acima meta, comissão de 0,9% mais bônus sobre salário fixo de 1,5%.
        */
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        JOptionPane.showConfirmDialog(
                this, 
                "Nome do(a) funcionário(a): " + this.nomeFuncionario + "\n" +
                "Salário Fixo: " + df.format(this.salarioFuncionario) + "R$\n" +
                "Valor da Comissão: " + df.format(this.comissao) + "R$\n" +
                "Valor do bônus: " + df.format(this.bonus * 10) + "%\n" +
                "Salário Líquido: " + df.format(this.valorTotal) + "R$\n" +
                "Situação: " + this.situacao,
                "Resumo do(a) funcionário(a)",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btnRelatorioActionPerformed

    

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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfSalarioFixo;
    private javax.swing.JTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables
}
