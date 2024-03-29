package br.edu.ifpr.paranavai.armarios.visao.emprestimo;

import br.edu.ifpr.paranavai.armarios.excecoes.ConcessaoException;
import br.edu.ifpr.paranavai.armarios.excecoes.EmprestimoException;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import br.edu.ifpr.paranavai.armarios.modelo.Concessao;
import br.edu.ifpr.paranavai.armarios.modelo.Emprestimo;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.modelo.Servidor;
import br.edu.ifpr.paranavai.armarios.modelo.StatusArmario;
import br.edu.ifpr.paranavai.armarios.servico.ArmarioServico;
import br.edu.ifpr.paranavai.armarios.servico.ComboBoxServico;
import br.edu.ifpr.paranavai.armarios.servico.ConcessaoServico;
import br.edu.ifpr.paranavai.armarios.servico.EmprestimoServico;
import br.edu.ifpr.paranavai.armarios.servico.ServidorServico;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;
import br.edu.ifpr.paranavai.armarios.visao.combobox.ArmarioComboBoxModel;
import br.edu.ifpr.paranavai.armarios.visao.combobox.EstudanteComboBoxModel;
import br.edu.ifpr.paranavai.armarios.visao.combobox.LocalizacaoComboBoxModel;
import java.awt.Dialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author professor Marcelo F. Terenciani
 */
public class EmprestimoConcessaoUIModal extends javax.swing.JDialog {

    private Emprestimo emprestimo;
    private Concessao concessao;
    private IndexEmprestimoPanelUI indexEmprestimoPanelUI;
    EstudanteComboBoxModel estudanteComboBox = ComboBoxServico.inicializaComboBoxEstudante();

    Servidor servidor = ServidorServico.buscarUnicoPorEmailOuSiape(System.getProperty("email"));

    public EmprestimoConcessaoUIModal(IndexEmprestimoPanelUI indexEmprestimoPanelUI) {
        super((JFrame) SwingUtilities.getWindowAncestor(indexEmprestimoPanelUI), true);

        initComponents();
        this.indexEmprestimoPanelUI = indexEmprestimoPanelUI;
        this.emprestimo = new Emprestimo();
        this.concessao = new Concessao();

      
        LocalizacaoComboBoxModel localizacaoComboBoxModel = ComboBoxServico.inicializaComboBoxLocalizacao();

        cbxLocalizacaoArmario.setModel(localizacaoComboBoxModel);
        cbxLocalizacaoArmarioConcessao.setModel(localizacaoComboBoxModel);
        

        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        cbxPessoa.setModel(estudanteComboBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelGeral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelConcessao = new javax.swing.JPanel();
        cbxLocalizacaoArmarioConcessao = new javax.swing.JComboBox<>();
        cbxArmarioConcessao = new javax.swing.JComboBox<>();
        lblLocalizacaoArmario1 = new javax.swing.JLabel();
        lblArmario1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacoes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        externoRadio = new javax.swing.JRadioButton();
        salvarConcessao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelEmprestimo = new javax.swing.JPanel();
        lblLocalizacaoArmario = new javax.swing.JLabel();
        cbxLocalizacaoArmario = new javax.swing.JComboBox<>();
        lblArmario = new javax.swing.JLabel();
        cbxArmario = new javax.swing.JComboBox<>();
        lblEstudante = new javax.swing.JLabel();
        cbxPessoa = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        raAluno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servidor");
        setMinimumSize(new java.awt.Dimension(394, 290));
        setModal(true);
        setName("dialogo"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(394, 290));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelGeral.setBackground(new java.awt.Color(0, 153, 0));
        panelGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 6));
        panelGeral.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        panelGeral.setMinimumSize(new java.awt.Dimension(299, 237));
        panelGeral.setPreferredSize(new java.awt.Dimension(300, 430));
        panelGeral.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/IfLogo_dark.png"))); // NOI18N

        panelConcessao.setBackground(new java.awt.Color(255, 255, 255));
        panelConcessao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Concessão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        cbxLocalizacaoArmarioConcessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocalizacaoArmarioConcessaoActionPerformed(evt);
            }
        });

        cbxArmarioConcessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxArmarioConcessaoActionPerformed(evt);
            }
        });

        lblLocalizacaoArmario1.setText("Localização do Armário*:");

        lblArmario1.setText("Armario*:");

        informacoes.setColumns(20);
        informacoes.setLineWrap(true);
        informacoes.setRows(5);
        informacoes.setText("Utilização do servidor.");
        informacoes.setMaximumSize(new java.awt.Dimension(232, 2147483647));
        jScrollPane1.setViewportView(informacoes);

        jLabel3.setText("Informações:");

        externoRadio.setText("Para pessoa externa");
        externoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externoRadioActionPerformed(evt);
            }
        });

        salvarConcessao.setText("Salvar");
        salvarConcessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarConcessaoActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConcessaoLayout = new javax.swing.GroupLayout(panelConcessao);
        panelConcessao.setLayout(panelConcessaoLayout);
        panelConcessaoLayout.setHorizontalGroup(
            panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConcessaoLayout.createSequentialGroup()
                .addGroup(panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(salvarConcessao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelConcessaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConcessaoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(externoRadio))
                            .addComponent(cbxArmarioConcessao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxLocalizacaoArmarioConcessao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelConcessaoLayout.createSequentialGroup()
                                .addGroup(panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLocalizacaoArmario1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArmario1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 104, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelConcessaoLayout.setVerticalGroup(
            panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConcessaoLayout.createSequentialGroup()
                .addComponent(lblLocalizacaoArmario1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cbxLocalizacaoArmarioConcessao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblArmario1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbxArmarioConcessao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConcessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(externoRadio))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarConcessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelConcessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConcessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Concessão Servidor", jPanel1);

        panelEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        panelEmprestimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empréstimo administrador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        panelEmprestimo.setInheritsPopupMenu(true);
        panelEmprestimo.setPreferredSize(new java.awt.Dimension(300, 290));

        lblLocalizacaoArmario.setText("Localização do Armário*:");

        cbxLocalizacaoArmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocalizacaoArmarioActionPerformed(evt);
            }
        });

        lblArmario.setText("Armario*:");

        cbxArmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxArmarioActionPerformed(evt);
            }
        });

        cbxPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPessoaActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        raAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raAlunoActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Busca por RA:");

        jLabel5.setText("Alunos:");

        javax.swing.GroupLayout panelEmprestimoLayout = new javax.swing.GroupLayout(panelEmprestimo);
        panelEmprestimo.setLayout(panelEmprestimoLayout);
        panelEmprestimoLayout.setHorizontalGroup(
            panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmprestimoLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(panelEmprestimoLayout.createSequentialGroup()
                        .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxArmario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxLocalizacaoArmario, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPessoa, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmprestimoLayout.createSequentialGroup()
                                .addComponent(raAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())
                    .addGroup(panelEmprestimoLayout.createSequentialGroup()
                        .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblArmario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLocalizacaoArmario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEmprestimoLayout.setVerticalGroup(
            panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmprestimoLayout.createSequentialGroup()
                .addComponent(lblLocalizacaoArmario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLocalizacaoArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArmario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Emprestimo Aluno", jPanel2);

        javax.swing.GroupLayout panelGeralLayout = new javax.swing.GroupLayout(panelGeral);
        panelGeral.setLayout(panelGeralLayout);
        panelGeralLayout.setHorizontalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        panelGeralLayout.setVerticalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fecharFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            emprestimo.setArmario((Armario) cbxArmario.getSelectedItem());
            emprestimo.setEstudante((Estudante) cbxPessoa.getSelectedItem());

            EmprestimoServico.inserir(emprestimo);
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_SUCESSO);
            Armario armario = ((Armario) cbxArmario.getSelectedItem());
            armario.setStatus(StatusArmario.OCUPADO);
            ArmarioServico.atualizar(armario);
            fecharFormulario();

        } catch (EmprestimoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_ERRO_PADRAO, MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxArmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArmarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxArmarioActionPerformed

    private void cbxLocalizacaoArmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocalizacaoArmarioActionPerformed
        Localizacao localEscolhido = (Localizacao) cbxLocalizacaoArmario.getSelectedItem();
        ArmarioComboBoxModel armarioComboBoxModel = ComboBoxServico.inicializaComboBoxArmarioAtivo(localEscolhido);
        cbxArmario.setModel(armarioComboBoxModel);
    }//GEN-LAST:event_cbxLocalizacaoArmarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void raAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raAlunoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ra = raAluno.getText();
        EstudanteComboBoxModel estudanteComboBoxBusca = ComboBoxServico.inicializaComboBoxEstudanteBuscaRa(ra);
        cbxPessoa.setModel(estudanteComboBoxBusca);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxLocalizacaoArmarioConcessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocalizacaoArmarioConcessaoActionPerformed
        Localizacao localEscolhidoConcessao = (Localizacao) cbxLocalizacaoArmarioConcessao.getSelectedItem();
        ArmarioComboBoxModel armarioComboBoxModel = ComboBoxServico.inicializaComboBoxArmarioAtivo(localEscolhidoConcessao);
        cbxArmarioConcessao.setModel(armarioComboBoxModel);
    }//GEN-LAST:event_cbxLocalizacaoArmarioConcessaoActionPerformed

    private void cbxArmarioConcessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArmarioConcessaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxArmarioConcessaoActionPerformed

    private void externoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externoRadioActionPerformed
        informacoes.setText("Nome:  \nTelefone:\n Motivo:");

    }//GEN-LAST:event_externoRadioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fecharFormulario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salvarConcessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarConcessaoActionPerformed
        try {
            concessao.setArmario((Armario) cbxArmarioConcessao.getSelectedItem());
            concessao.setServidor(servidor);
            concessao.setDescricao(informacoes.getText());

            ConcessaoServico.inserir(concessao);
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_SUCESSO);
            Armario armario = ((Armario) cbxArmarioConcessao.getSelectedItem());
            armario.setStatus(StatusArmario.OCUPADO);
            ArmarioServico.atualizar(armario);
            fecharFormulario();

        } catch (ConcessaoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_ERRO_PADRAO, MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarConcessaoActionPerformed

    private void cbxPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPessoaActionPerformed

    private void fecharFormulario() {
        this.indexEmprestimoPanelUI.init();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxArmario;
    private javax.swing.JComboBox<String> cbxArmarioConcessao;
    private javax.swing.JComboBox<String> cbxLocalizacaoArmario;
    private javax.swing.JComboBox<String> cbxLocalizacaoArmarioConcessao;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JRadioButton externoRadio;
    private javax.swing.JTextArea informacoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblArmario;
    private javax.swing.JLabel lblArmario1;
    private javax.swing.JLabel lblEstudante;
    private javax.swing.JLabel lblLocalizacaoArmario;
    private javax.swing.JLabel lblLocalizacaoArmario1;
    private javax.swing.JPanel panelConcessao;
    private javax.swing.JPanel panelEmprestimo;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JTextField raAluno;
    private javax.swing.JButton salvarConcessao;
    // End of variables declaration//GEN-END:variables
}
