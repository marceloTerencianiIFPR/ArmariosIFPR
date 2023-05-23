package br.edu.ifpr.paranavai.armarios.visao.estudante;

import br.edu.ifpr.paranavai.armarios.controle.EstudanteControle;
import br.edu.ifpr.paranavai.armarios.excecoes.EstudanteException;
import br.edu.ifpr.paranavai.armarios.modelo.Curso;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;
import br.edu.ifpr.paranavai.armarios.utils.OperacaoUtil;
import java.awt.Dialog;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author professor Marcelo F. Terenciani
 */
public class CriacaoEdicaoEstudanteUIModal extends javax.swing.JDialog {

    private Estudante estudante;
    private boolean estaAtualizando;
    private IndexEstudanteUI indexEstudanteUI;
    private CursoComboBoxModel cursoComboBoxModel;
    private MaskFormatter maskFormatter;

    public CriacaoEdicaoEstudanteUIModal(IndexEstudantePanelUI indexEstudantePanelUI){
    
    }
    
    public CriacaoEdicaoEstudanteUIModal(IndexEstudanteUI indexEstudanteUI) {
        super(indexEstudanteUI, true);

        try {
            this.maskFormatter = new MaskFormatter("(##) # ####-####");
            this.maskFormatter.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }

        initComponents();
        this.indexEstudanteUI = indexEstudanteUI;
        this.estudante = new Estudante();
        this.estaAtualizando = false;

        this.cursoComboBoxModel = EstudanteControle.inicializaComboBoxCurso();
        cbxCursoEstudante.setModel(cursoComboBoxModel);

        this.setTitle("Novo Estudante");
        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
    }

    public CriacaoEdicaoEstudanteUIModal(IndexEstudanteUI indexEstudanteUI, Estudante estudante) {
        this(indexEstudanteUI);
        this.estudante = estudante;
        this.estaAtualizando = true;

        initTextFields(estudante);
    }

    private void initTextFields(Estudante estudante1) {
        lblTitulo.setText("Edição do Estudante " + estudante1.getId());
        this.setTitle("Edição do Estudante " + estudante1.getId());
        txtNomeEstudante.setText(estudante1.getNome());
        txtSobrenomeEstudante.setText(estudante1.getSobrenome());
        txtRaEstudante.setText(estudante1.getRa());
        txtTelefoneEstudante.setText(estudante1.getTelefone());
        txtEmailEstudante.setText(estudante1.getEmail());
        cbxCursoEstudante.setSelectedItem(estudante1.getCurso());
        txtSenhaEstudante.setText(estudante1.getSenha());
        txtConfirmaSenhaEstudante.setText(estudante1.getSenha());
        this.estudante.setAtivo(ckbAtivo.isSelected());
        ckbAtivo.setSelected(estudante1.isAtivo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeral = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeEstudante = new javax.swing.JLabel();
        txtNomeEstudante = new javax.swing.JTextField();
        lblSobrenomeEstudante = new javax.swing.JLabel();
        txtSobrenomeEstudante = new javax.swing.JTextField();
        lblRaEstudante = new javax.swing.JLabel();
        txtRaEstudante = new javax.swing.JTextField();
        lblTelefoneEstudante = new javax.swing.JLabel();
        txtTelefoneEstudante = new JFormattedTextField(this.maskFormatter);
        lblTelefoneInvalido = new javax.swing.JLabel();
        lblEmailEstudante = new javax.swing.JLabel();
        txtEmailEstudante = new javax.swing.JTextField();
        lblEmailInvalido = new javax.swing.JLabel();
        lblCursoEstudante = new javax.swing.JLabel();
        cbxCursoEstudante = new javax.swing.JComboBox<>();
        lblSenhaEstudante = new javax.swing.JLabel();
        txtSenhaEstudante = new javax.swing.JPasswordField();
        lblConfirmaSenhaEstudante = new javax.swing.JLabel();
        txtConfirmaSenhaEstudante = new javax.swing.JPasswordField();
        lblSenhaInvalida = new javax.swing.JLabel();
        lblAtivo = new javax.swing.JLabel();
        ckbAtivo = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estudante");
        setMinimumSize(new java.awt.Dimension(394, 290));
        setModal(true);
        setName("dialogo"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(394, 290));

        panelGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 6));
        panelGeral.setMinimumSize(new java.awt.Dimension(394, 237));
        panelGeral.setRequestFocusEnabled(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Novo Estudante");

        lblNomeEstudante.setText("Nome*:");

        lblSobrenomeEstudante.setText("Sobrenome*:");

        lblRaEstudante.setText("Matrícula (RA)*:");

        lblTelefoneEstudante.setText("Telefone*:");

        txtTelefoneEstudante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneEstudanteFocusLost(evt);
            }
        });

        lblTelefoneInvalido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTelefoneInvalido.setForeground(new java.awt.Color(255, 51, 51));
        lblTelefoneInvalido.setMaximumSize(new java.awt.Dimension(30, 20));
        lblTelefoneInvalido.setMinimumSize(new java.awt.Dimension(30, 20));
        lblTelefoneInvalido.setPreferredSize(new java.awt.Dimension(30, 20));
        lblTelefoneInvalido.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblEmailEstudante.setText("E-mail*:");

        txtEmailEstudante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailEstudanteFocusLost(evt);
            }
        });

        lblEmailInvalido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblEmailInvalido.setForeground(new java.awt.Color(255, 51, 51));
        lblEmailInvalido.setMaximumSize(new java.awt.Dimension(24, 20));
        lblEmailInvalido.setMinimumSize(new java.awt.Dimension(24, 20));
        lblEmailInvalido.setPreferredSize(new java.awt.Dimension(24, 20));
        lblEmailInvalido.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        lblCursoEstudante.setText("Curso*:");

        lblSenhaEstudante.setText("Senha*:");

        txtSenhaEstudante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaEstudanteKeyReleased(evt);
            }
        });

        lblConfirmaSenhaEstudante.setText("Confirmação de Senha*:");

        txtConfirmaSenhaEstudante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmaSenhaEstudanteKeyReleased(evt);
            }
        });

        lblSenhaInvalida.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblSenhaInvalida.setForeground(new java.awt.Color(255, 51, 51));
        lblSenhaInvalida.setMaximumSize(new java.awt.Dimension(30, 20));
        lblSenhaInvalida.setMinimumSize(new java.awt.Dimension(30, 20));
        lblSenhaInvalida.setPreferredSize(new java.awt.Dimension(30, 20));

        lblAtivo.setText("Ativo?");

        ckbAtivo.setSelected(true);
        ckbAtivo.setText("Sim!");
        ckbAtivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbAtivoItemStateChanged(evt);
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

        javax.swing.GroupLayout panelGeralLayout = new javax.swing.GroupLayout(panelGeral);
        panelGeral.setLayout(panelGeralLayout);
        panelGeralLayout.setHorizontalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelGeralLayout.createSequentialGroup()
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNomeEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSobrenomeEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSobrenomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelGeralLayout.createSequentialGroup()
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTelefoneEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(lblTelefoneInvalido, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtTelefoneEstudante))
                                .addGap(20, 20, 20)
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGeralLayout.createSequentialGroup()
                                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblEmailEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEmailEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblCursoEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbxCursoEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGeralLayout.createSequentialGroup()
                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGeralLayout.createSequentialGroup()
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenhaEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSenhaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenhaInvalida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblConfirmaSenhaEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtConfirmaSenhaEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ckbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGeralLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnSalvar)
                                .addGap(134, 134, 134)
                                .addComponent(btnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panelGeralLayout.setVerticalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addComponent(lblNomeEstudante)
                        .addGap(5, 5, 5)
                        .addComponent(txtNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeralLayout.createSequentialGroup()
                        .addComponent(lblSobrenomeEstudante)
                        .addGap(5, 5, 5)
                        .addComponent(txtSobrenomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeralLayout.createSequentialGroup()
                        .addComponent(lblRaEstudante)
                        .addGap(5, 5, 5)
                        .addComponent(txtRaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefoneEstudante)
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbxCursoEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCursoEstudante)
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addComponent(lblEmailEstudante)
                        .addGap(5, 5, 5)
                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addComponent(lblSenhaEstudante)
                        .addGap(5, 5, 5)
                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirmaSenhaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmaSenhaEstudante)
                            .addComponent(lblAtivo))
                        .addGap(6, 6, 6)
                        .addComponent(ckbAtivo)))
                .addGap(0, 0, 0)
                .addComponent(lblSenhaInvalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(20, 20, 20))
        );

        lblEmailInvalido.getAccessibleContext().setAccessibleName("lblEmailInvalido");

        getContentPane().add(panelGeral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fecharFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!Arrays.equals(txtConfirmaSenhaEstudante.getPassword(), txtSenhaEstudante.getPassword())) {
            JOptionPane.showMessageDialog(this, MensagemUtil.SENHAS_NAO_CONFEREM);
            return;
        }

        Curso curso = (Curso) cbxCursoEstudante.getSelectedItem();
        this.estudante.setNome(txtNomeEstudante.getText());
        this.estudante.setSobrenome(txtSobrenomeEstudante.getText());
        this.estudante.setRa(txtRaEstudante.getText());
        this.estudante.setTelefone(txtTelefoneEstudante.getText());
        this.estudante.setEmail(txtEmailEstudante.getText());
        this.estudante.setCurso(curso);
        this.estudante.setAtivo(ckbAtivo.isSelected());

        char[] caracteresSenha = this.txtSenhaEstudante.getPassword();
        String senha = new String(caracteresSenha);
        if (!senha.equals(this.estudante.getSenha())) {
            this.estudante.setSenha(senha);
        }

        if (estaAtualizando)
            atualizar();
        else
            salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void ckbAtivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbAtivoItemStateChanged
        ckbAtivo.setText((evt.getStateChange() == 1 ? "Sim!" : "Não!"));
    }//GEN-LAST:event_ckbAtivoItemStateChanged

    private void txtEmailEstudanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailEstudanteFocusLost
        if (OperacaoUtil.ehEmailValido(this.txtEmailEstudante.getText()))
            lblEmailInvalido.setText("");
        else
            lblEmailInvalido.setText(MensagemUtil.EMAIL_INVALIDO);
    }//GEN-LAST:event_txtEmailEstudanteFocusLost

    private void txtSenhaEstudanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaEstudanteKeyReleased
        if (Arrays.equals(txtConfirmaSenhaEstudante.getPassword(), txtSenhaEstudante.getPassword())) {
            lblSenhaInvalida.setText("");
        } else {
            lblSenhaInvalida.setText(MensagemUtil.SENHAS_NAO_CONFEREM);
        }
    }//GEN-LAST:event_txtSenhaEstudanteKeyReleased

    private void txtConfirmaSenhaEstudanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaEstudanteKeyReleased
        if (Arrays.equals(txtConfirmaSenhaEstudante.getPassword(), txtSenhaEstudante.getPassword())) {
            lblSenhaInvalida.setText("");
        } else {
            lblSenhaInvalida.setText(MensagemUtil.SENHAS_NAO_CONFEREM);
        }
    }//GEN-LAST:event_txtConfirmaSenhaEstudanteKeyReleased

    private void txtTelefoneEstudanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneEstudanteFocusLost
        if (OperacaoUtil.ehTelefoneValido(this.txtTelefoneEstudante.getText())) {
            lblTelefoneInvalido.setText("");
        } else {
            lblTelefoneInvalido.setText(MensagemUtil.TELEFONE_INVALIDO);
        }

    }//GEN-LAST:event_txtTelefoneEstudanteFocusLost

    private void salvar() throws HeadlessException {
        try {
            EstudanteControle.inserir(estudante);
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_SUCESSO);
            fecharFormulario();
        } catch (EstudanteException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_ERRO_PADRAO, MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizar() {
        try {
            EstudanteControle.atualizar(estudante);
            JOptionPane.showMessageDialog(this, MensagemUtil.ESTUDANTE_ATUALIZACAO_SUCESSO);
            fecharFormulario();
        } catch (EstudanteException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, MensagemUtil.ESTUDANTE_INSERCAO_ERRO_PADRAO, MensagemUtil.TITULO_ERRO_FATAL, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fecharFormulario() {
        this.dispose();
        this.indexEstudanteUI.init();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCursoEstudante;
    private javax.swing.JCheckBox ckbAtivo;
    private javax.swing.JLabel lblAtivo;
    private javax.swing.JLabel lblConfirmaSenhaEstudante;
    private javax.swing.JLabel lblCursoEstudante;
    private javax.swing.JLabel lblEmailEstudante;
    private javax.swing.JLabel lblEmailInvalido;
    private javax.swing.JLabel lblNomeEstudante;
    private javax.swing.JLabel lblRaEstudante;
    private javax.swing.JLabel lblSenhaEstudante;
    private javax.swing.JLabel lblSenhaInvalida;
    private javax.swing.JLabel lblSobrenomeEstudante;
    private javax.swing.JLabel lblTelefoneEstudante;
    private javax.swing.JLabel lblTelefoneInvalido;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JPasswordField txtConfirmaSenhaEstudante;
    private javax.swing.JTextField txtEmailEstudante;
    private javax.swing.JTextField txtNomeEstudante;
    private javax.swing.JTextField txtRaEstudante;
    private javax.swing.JPasswordField txtSenhaEstudante;
    private javax.swing.JTextField txtSobrenomeEstudante;
    private javax.swing.JFormattedTextField txtTelefoneEstudante;
    // End of variables declaration//GEN-END:variables
}
