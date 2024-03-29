package br.edu.ifpr.paranavai.armarios.visao.emprestimo;

import br.edu.ifpr.paranavai.armarios.modelo.Emprestimo;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;
import br.edu.ifpr.paranavai.armarios.utils.OperacaoUtil;
import br.edu.ifpr.paranavai.armarios.visao.estudante.VisualizarEstudanteModalUI;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

public class VisualizarEmprestimoModalUI extends javax.swing.JDialog {

    Estudante estudante;
    JPanel frame;
    public VisualizarEmprestimoModalUI(JPanel parent, Emprestimo emprestimo) {
        super((JFrame) SwingUtilities.getWindowAncestor(parent), true);
        initComponents();
        preencheDados(emprestimo);
        estudante = emprestimo.getEstudante();
        frame = parent;
    }

    private void preencheDados(Emprestimo emprestimo) {
        campoIdentificador.setText(emprestimo.getId().toString());
        campoDataEmprestimo.setText(OperacaoUtil.formatarDataHora(emprestimo.getDataEmprestimo()));
        campoDataDevolucao.setText(OperacaoUtil.formatarDataHora(emprestimo.getDataDevolucao()));
        campoEstudante.setText(emprestimo.getEstudante().getNomeCompleto() + " " + emprestimo.getEstudante().getCurso().getNome());
        campoArmario.setText(emprestimo.getArmario().getNumero());
        campoLocalizacao.setText(emprestimo.getArmario().getLocalizacao().getDescricao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        lblIdentificador = new javax.swing.JLabel();
        campoIdentificador = new javax.swing.JLabel();
        lblDataEmprestimo = new javax.swing.JLabel();
        campoDataEmprestimo = new javax.swing.JLabel();
        lblDataDevolucao = new javax.swing.JLabel();
        campoDataDevolucao = new javax.swing.JLabel();
        lblEstudante = new javax.swing.JLabel();
        campoEstudante = new javax.swing.JLabel();
        lblArmario = new javax.swing.JLabel();
        campoArmario = new javax.swing.JLabel();
        lblLocalizacao = new javax.swing.JLabel();
        campoLocalizacao = new javax.swing.JLabel();
        visualizaAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Acadêmico");
        setBackground(new java.awt.Color(0, 153, 0));
        setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new java.awt.BorderLayout(5, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Empréstimo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelSuperior.setMinimumSize(new java.awt.Dimension(100, 100));

        lblIdentificador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdentificador.setText("Identificador:");

        campoIdentificador.setText("...");

        lblDataEmprestimo.setText("Data Empréstimo:");

        campoDataEmprestimo.setText("...");

        lblDataDevolucao.setText("Data Devolução:");

        campoDataDevolucao.setText("...");

        lblEstudante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstudante.setText("Estudante:");

        campoEstudante.setText("...");

        lblArmario.setText("Armário:");

        campoArmario.setText("...");

        lblLocalizacao.setText("Localização:");

        campoLocalizacao.setText("...");

        visualizaAluno.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        visualizaAluno.setText("INFO");
        visualizaAluno.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/visualizar-16.png"))); // NOI18N
        visualizaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizaAlunoMouseClicked(evt);
            }
        });
        visualizaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLocalizacao)
                            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDataEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelSuperiorLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(lblDataDevolucao))
                                .addGroup(panelSuperiorLayout.createSequentialGroup()
                                    .addComponent(visualizaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblArmario))))
                        .addGap(17, 17, 17)))
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDataDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoArmario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDataEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                        .addComponent(campoLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificador)
                    .addComponent(campoIdentificador))
                .addGap(4, 4, 4)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEmprestimo)
                    .addComponent(campoDataEmprestimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDevolucao)
                    .addComponent(campoDataDevolucao))
                .addGap(5, 5, 5)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstudante)
                            .addComponent(campoEstudante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArmario)
                            .addComponent(campoArmario)))
                    .addComponent(visualizaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalizacao)
                    .addComponent(campoLocalizacao))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/IfLogo_dark.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizaAlunoActionPerformed

        VisualizarEstudanteModalUI form = new VisualizarEstudanteModalUI(frame, estudante);
        form.setLocationRelativeTo(null);
        form.setVisible(true); 
    }//GEN-LAST:event_visualizaAlunoActionPerformed

    private void visualizaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizaAlunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizaAlunoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campoArmario;
    private javax.swing.JLabel campoDataDevolucao;
    private javax.swing.JLabel campoDataEmprestimo;
    private javax.swing.JLabel campoEstudante;
    private javax.swing.JLabel campoIdentificador;
    private javax.swing.JLabel campoLocalizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArmario;
    private javax.swing.JLabel lblDataDevolucao;
    private javax.swing.JLabel lblDataEmprestimo;
    private javax.swing.JLabel lblEstudante;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblLocalizacao;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JButton visualizaAluno;
    // End of variables declaration//GEN-END:variables
}
