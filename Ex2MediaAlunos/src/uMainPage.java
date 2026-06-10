
import java.awt.Color;
import javax.swing.JOptionPane;

  

    public class uMainPage extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(uMainPage.class.getName());
        private final Turma TURMA = new Turma();

        public uMainPage() {
            initComponents();
            tfNomeAluno.setForeground(Color.GRAY);
            tfPrimeiraNota.setForeground(Color.GRAY);
            tfSegundaNota.setForeground(Color.GRAY);
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNomeAluno = new javax.swing.JTextField();
        tfPrimeiraNota = new javax.swing.JTextField();
        tfSegundaNota = new javax.swing.JTextField();
        btnCalcularMediaAluno = new javax.swing.JButton();
        btnVerRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(130, 130, 130));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Área de cadastro do(a) aluno(a)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tfNomeAluno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tfNomeAluno.setText("Nome do(a) aluno(a)");
        tfNomeAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeAlunoFocusLost(evt);
            }
        });

        tfPrimeiraNota.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tfPrimeiraNota.setText("1° Nota do(a) aluno(a)");
        tfPrimeiraNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrimeiraNotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrimeiraNotaFocusLost(evt);
            }
        });

        tfSegundaNota.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tfSegundaNota.setText("2° Nota do(a) aluno(a)");
        tfSegundaNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSegundaNotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSegundaNotaFocusLost(evt);
            }
        });

        btnCalcularMediaAluno.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCalcularMediaAluno.setText("Calcular");
        btnCalcularMediaAluno.addActionListener(this::btnCalcularMediaAlunoActionPerformed);

        btnVerRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerRelatorio.setText("Ver Relatório");
        btnVerRelatorio.addActionListener(this::btnVerRelatorioActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCalcularMediaAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSegundaNota, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfPrimeiraNota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(tfNomeAluno, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnVerRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPrimeiraNota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSegundaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularMediaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeAlunoFocusGained
        if (tfNomeAluno.getText().equals("Nome do(a) aluno(a)")) {
            tfNomeAluno.setText("");
            tfNomeAluno.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tfNomeAlunoFocusGained
    private void tfNomeAlunoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeAlunoFocusLost
        if (tfNomeAluno.getText().trim().isEmpty()) {
            tfNomeAluno.setText("Nome do(a) aluno(a)");
            tfNomeAluno.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfNomeAlunoFocusLost

    private void tfPrimeiraNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrimeiraNotaFocusGained
        if (tfPrimeiraNota.getText().equals("1° Nota do(a) aluno(a)")) {
            tfPrimeiraNota.setText("");
            tfPrimeiraNota.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tfPrimeiraNotaFocusGained
    private void tfPrimeiraNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrimeiraNotaFocusLost
        if (tfPrimeiraNota.getText().trim().isEmpty()) {
            tfPrimeiraNota.setText("1° Nota do(a) aluno(a)");
            tfPrimeiraNota.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfPrimeiraNotaFocusLost

    private void tfSegundaNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSegundaNotaFocusGained
        if (tfSegundaNota.getText().equals("2° Nota do(a) aluno(a)")) {
            tfSegundaNota.setText("");
            tfSegundaNota.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tfSegundaNotaFocusGained
    private void tfSegundaNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSegundaNotaFocusLost
        if (tfSegundaNota.getText().trim().isEmpty()) {
            tfSegundaNota.setText("2° Nota do(a) aluno(a)");
            tfSegundaNota.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfSegundaNotaFocusLost

    private void btnCalcularMediaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMediaAlunoActionPerformed
        try {
            String nomeAluno = tfNomeAluno.getText();

            double n1 = Double.parseDouble(tfPrimeiraNota.getText());
            double n2 = Double.parseDouble(tfSegundaNota.getText());
            double[] notas = {n1, n2};

            Aluno aluno = new Aluno(nomeAluno, notas);
            TURMA.alunos.add(aluno);

            JOptionPane.showMessageDialog(
                    this,
                    "Cadastro realizado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );

            tfNomeAluno.setText("Nome do(a) aluno(a)");
            tfPrimeiraNota.setText("1° Nota do(a) aluno(a)");
            tfSegundaNota.setText("2° Nota do(a) aluno(a)");

            tfNomeAluno.setForeground(Color.GRAY);
            tfPrimeiraNota.setForeground(Color.GRAY);
            tfSegundaNota.setForeground(Color.GRAY);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Preencha os campos corretamente!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnCalcularMediaAlunoActionPerformed

    private void btnVerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRelatorioActionPerformed
        if (TURMA != null && TURMA.alunos != null && !TURMA.alunos.isEmpty()) {
            uRelatorioAlunos RelatorioAlunos = new uRelatorioAlunos(TURMA);
            RelatorioAlunos.setVisible(true);
            
        } else if (TURMA == null || TURMA.alunos == null || TURMA.alunos.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Nenhum dado inserido ainda!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Preencha os campos corretamente!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnVerRelatorioActionPerformed

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
    private javax.swing.JButton btnCalcularMediaAluno;
    private javax.swing.JButton btnVerRelatorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JTextField tfPrimeiraNota;
    private javax.swing.JTextField tfSegundaNota;
    // End of variables declaration//GEN-END:variables
}
