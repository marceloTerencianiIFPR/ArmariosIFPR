package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.visao.armarios.IndexArmariosUI;

import br.edu.ifpr.paranavai.armarios.visao.curso.IndexCursoUI;
import br.edu.ifpr.paranavai.armarios.visao.estudante.IndexEstudanteUI;
import br.edu.ifpr.paranavai.armarios.visao.historico.IndexHistoricoUI;
import br.edu.ifpr.paranavai.armarios.visao.localizacao.IndexLocalizacaoUI;
import br.edu.ifpr.paranavai.armarios.visao.ocupados.IndexOcupadosUI;
import java.awt.Color;

/**
 *
 * @author suporte
 */
public class PainelDeControleUI extends javax.swing.JFrame {

    /**
     * Creates new form ServidorControle
     */
    public PainelDeControleUI() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCadastraArmarios = new javax.swing.JToggleButton();
        btnArmariosOcupados = new javax.swing.JButton();
        btnHistoricoEmprestimo = new javax.swing.JButton();
        btnGestaoDeCursos = new javax.swing.JButton();
        btnGestaoDeLocalizacoes = new javax.swing.JButton();
        btnGestaoEstudantes = new javax.swing.JToggleButton();
        btnAbrirAreaEmprestimo = new javax.swing.JButton();
        alunos = new javax.swing.JPanel();
        lblIconeIFPR = new javax.swing.JLabel();
        lblRespostaCadastro = new javax.swing.JLabel();

        jLabel6.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel de Controle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Source Sans Pro Black", 0, 12))); // NOI18N

        btnCadastraArmarios.setText("Cadastrar Armário");
        btnCadastraArmarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnCadastraArmarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastraArmariosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCadastraArmariosMouseReleased(evt);
            }
        });
        btnCadastraArmarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraArmariosActionPerformed(evt);
            }
        });

        btnArmariosOcupados.setText("Armários Ocupados");
        btnArmariosOcupados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnArmariosOcupados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnArmariosOcupadosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnArmariosOcupadosMouseReleased(evt);
            }
        });
        btnArmariosOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmariosOcupadosActionPerformed(evt);
            }
        });

        btnHistoricoEmprestimo.setText("Histórico de Empréstimos");
        btnHistoricoEmprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHistoricoEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHistoricoEmprestimoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHistoricoEmprestimoMouseReleased(evt);
            }
        });
        btnHistoricoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoEmprestimoActionPerformed(evt);
            }
        });

        btnGestaoDeCursos.setText("Gestão de Cursos");
        btnGestaoDeCursos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGestaoDeCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestaoDeCursosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestaoDeCursosMouseReleased(evt);
            }
        });
        btnGestaoDeCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestaoDeCursosActionPerformed(evt);
            }
        });

        btnGestaoDeLocalizacoes.setText("Gestão de Localizações");
        btnGestaoDeLocalizacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGestaoDeLocalizacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestaoDeLocalizacoesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestaoDeLocalizacoesMouseReleased(evt);
            }
        });
        btnGestaoDeLocalizacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestaoDeLocalizacoesActionPerformed(evt);
            }
        });

        btnGestaoEstudantes.setText("Gestão de Estudantes");
        btnGestaoEstudantes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnGestaoEstudantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGestaoEstudantesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestaoEstudantesMouseReleased(evt);
            }
        });
        btnGestaoEstudantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestaoEstudantesActionPerformed(evt);
            }
        });

        btnAbrirAreaEmprestimo.setText("Abrir Sistema de Empréstimo");
        btnAbrirAreaEmprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAbrirAreaEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAbrirAreaEmprestimoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAbrirAreaEmprestimoMouseReleased(evt);
            }
        });
        btnAbrirAreaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirAreaEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestaoEstudantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistoricoEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(btnArmariosOcupados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastraArmarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestaoDeCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestaoDeLocalizacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirAreaEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCadastraArmarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArmariosOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistoricoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestaoDeCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestaoDeLocalizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestaoEstudantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnAbrirAreaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        alunos.setBackground(new java.awt.Color(255, 255, 255));
        alunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblIconeIFPR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iflogomenor.png"))); // NOI18N

        lblRespostaCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout alunosLayout = new javax.swing.GroupLayout(alunos);
        alunos.setLayout(alunosLayout);
        alunosLayout.setHorizontalGroup(
            alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosLayout.createSequentialGroup()
                .addComponent(lblRespostaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIconeIFPR)
                .addGap(0, 0, 0))
        );
        alunosLayout.setVerticalGroup(
            alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(alunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRespostaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconeIFPR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestaoEstudantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestaoEstudantesActionPerformed
        IndexEstudanteUI indexEstudanteUI = new IndexEstudanteUI();
        indexEstudanteUI.setVisible(true);

    }//GEN-LAST:event_btnGestaoEstudantesActionPerformed

    private void btnCadastraArmariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraArmariosActionPerformed
        IndexArmariosUI indexArmariosUI = new IndexArmariosUI();
        indexArmariosUI.setVisible(true);
    }//GEN-LAST:event_btnCadastraArmariosActionPerformed

    private void btnArmariosOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmariosOcupadosActionPerformed
        IndexOcupadosUI indexOcupadosUI = new IndexOcupadosUI();
        indexOcupadosUI.setVisible(true);
    }//GEN-LAST:event_btnArmariosOcupadosActionPerformed

    private void btnCadastraArmariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastraArmariosMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnCadastraArmariosMousePressed

    private void btnCadastraArmariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastraArmariosMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnCadastraArmariosMouseReleased

    private void btnArmariosOcupadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArmariosOcupadosMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnArmariosOcupadosMousePressed

    private void btnArmariosOcupadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArmariosOcupadosMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnArmariosOcupadosMouseReleased

    private void btnGestaoEstudantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoEstudantesMousePressed
        btnGestaoEstudantes.setBackground(Color.green);
    }//GEN-LAST:event_btnGestaoEstudantesMousePressed

    private void btnGestaoEstudantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoEstudantesMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnGestaoEstudantesMouseReleased

    private void btnHistoricoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoEmprestimoActionPerformed
        IndexHistoricoUI indexHistoricoUI = new IndexHistoricoUI();
        indexHistoricoUI.setVisible(true);
    }//GEN-LAST:event_btnHistoricoEmprestimoActionPerformed

    private void btnGestaoDeCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestaoDeCursosActionPerformed
        IndexCursoUI indexCursoUI = new IndexCursoUI();
        indexCursoUI.setVisible(true);
    }//GEN-LAST:event_btnGestaoDeCursosActionPerformed

    private void btnGestaoDeLocalizacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestaoDeLocalizacoesActionPerformed
        IndexLocalizacaoUI indexLocalizacaoUI = new IndexLocalizacaoUI();
        indexLocalizacaoUI.setVisible(true);
    }//GEN-LAST:event_btnGestaoDeLocalizacoesActionPerformed

    private void btnAbrirAreaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAreaEmprestimoActionPerformed
        LoginEstudanteUI loginEstudanteUI = new LoginEstudanteUI();
        loginEstudanteUI.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAbrirAreaEmprestimoActionPerformed

    private void btnHistoricoEmprestimoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoEmprestimoMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnHistoricoEmprestimoMousePressed

    private void btnHistoricoEmprestimoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoEmprestimoMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnHistoricoEmprestimoMouseReleased

    private void btnGestaoDeCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoDeCursosMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnGestaoDeCursosMousePressed

    private void btnGestaoDeCursosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoDeCursosMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnGestaoDeCursosMouseReleased

    private void btnGestaoDeLocalizacoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoDeLocalizacoesMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnGestaoDeLocalizacoesMousePressed

    private void btnGestaoDeLocalizacoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestaoDeLocalizacoesMouseReleased
        btnCadastraArmarios.setBackground(Color.blue);
    }//GEN-LAST:event_btnGestaoDeLocalizacoesMouseReleased

    private void btnAbrirAreaEmprestimoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirAreaEmprestimoMousePressed
        btnCadastraArmarios.setBackground(Color.green);
    }//GEN-LAST:event_btnAbrirAreaEmprestimoMousePressed

    private void btnAbrirAreaEmprestimoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirAreaEmprestimoMouseReleased
        btnCadastraArmarios.setBackground(Color.white);
    }//GEN-LAST:event_btnAbrirAreaEmprestimoMouseReleased

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PainelDeControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PainelDeControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PainelDeControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PainelDeControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PainelDeControleUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunos;
    private javax.swing.JButton btnAbrirAreaEmprestimo;
    private javax.swing.JButton btnArmariosOcupados;
    private javax.swing.JToggleButton btnCadastraArmarios;
    private javax.swing.JButton btnGestaoDeCursos;
    private javax.swing.JButton btnGestaoDeLocalizacoes;
    private javax.swing.JToggleButton btnGestaoEstudantes;
    private javax.swing.JButton btnHistoricoEmprestimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblIconeIFPR;
    private javax.swing.JLabel lblRespostaCadastro;
    // End of variables declaration//GEN-END:variables
}
