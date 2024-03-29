package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.excecoes.LoginException;
import br.edu.ifpr.paranavai.armarios.modelo.Emprestimo;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.EmprestimoServico;
import br.edu.ifpr.paranavai.armarios.servico.LoginServico;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;
import br.edu.ifpr.paranavai.armarios.visao.estudante.EstudantesDevolucaoUI;
import br.edu.ifpr.paranavai.armarios.visao.estudante.EstudantesEmprestimoUI;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marcelo Figueiredo Terenciani
 */
public class EmprestimoEstudanteUI extends javax.swing.JFrame {

    private Localizacao localizacao;

    /**
     * Creates new form EmprestimoEstudanteUI
     * @param localizacao
     */
    public EmprestimoEstudanteUI(Localizacao localizacao) {
        initComponents();
        this.localizacao = localizacao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudo = new JPanel() {
            public void paintComponent(Graphics g) {
                Image img = Toolkit.getDefaultToolkit().getImage(
                    br.edu.ifpr.paranavai.armarios.visao.EmprestimoEstudanteUI.class.getResource("/assets/imgindex.png"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };
        lblTituloSistema = new javax.swing.JLabel();
        lblIconeIFPR = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        painelBorda = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        lblRa = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        lblErroRa = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblErroSenha = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        btnEmprestarDevolver = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        painelConteudo.setBackground(new java.awt.Color(0, 153, 0));
        painelConteudo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        painelConteudo.setForeground(new java.awt.Color(255, 255, 255));
        painelConteudo.setLayout(new java.awt.BorderLayout());

        lblTituloSistema.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        lblTituloSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSistema.setText(MensagemUtil.TITULO_SISTEMA);
        lblTituloSistema.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 30, 1));
        painelConteudo.add(lblTituloSistema, java.awt.BorderLayout.PAGE_START);

        lblIconeIFPR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeIFPR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iflogomenor.png"))); // NOI18N
        painelConteudo.add(lblIconeIFPR, java.awt.BorderLayout.PAGE_END);

        painelCentral.setOpaque(false);
        painelCentral.setLayout(new java.awt.GridBagLayout());

        painelBorda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        painelBorda.setMinimumSize(new java.awt.Dimension(500, 500));
        painelBorda.setOpaque(false);
        painelBorda.setPreferredSize(new java.awt.Dimension(400, 450));
        painelBorda.setLayout(new java.awt.GridLayout(1, 1));

        painelLogin.setBackground(new java.awt.Color(0, 153, 0));
        painelLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        painelLogin.setPreferredSize(new java.awt.Dimension(340, 448));
        painelLogin.setLayout(new java.awt.GridLayout(8, 1, 0, 5));

        lblRa.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        lblRa.setForeground(new java.awt.Color(255, 255, 255));
        lblRa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRa.setText("Matrícula (RA)");
        lblRa.setMaximumSize(new java.awt.Dimension(300, 54));
        lblRa.setMinimumSize(new java.awt.Dimension(300, 54));
        lblRa.setPreferredSize(new java.awt.Dimension(300, 54));
        painelLogin.add(lblRa);

        txtRa.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtRa.setMinimumSize(new java.awt.Dimension(100, 54));
        txtRa.setPreferredSize(new java.awt.Dimension(100, 54));
        txtRa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRaFocusLost(evt);
            }
        });
        painelLogin.add(txtRa);

        lblErroRa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblErroRa.setForeground(new java.awt.Color(204, 0, 0));
        lblErroRa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        painelLogin.add(lblErroRa);

        lblSenha.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        painelLogin.add(lblSenha);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        painelLogin.add(txtSenha);

        lblErroSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblErroSenha.setForeground(new java.awt.Color(204, 0, 0));
        lblErroSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErroSenha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        painelLogin.add(lblErroSenha);

        lblResposta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResposta.setForeground(new java.awt.Color(204, 0, 51));
        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelLogin.add(lblResposta);

        btnEmprestarDevolver.setFont(new java.awt.Font("Source Code Pro Black", 0, 24)); // NOI18N
        btnEmprestarDevolver.setText("EMPRESTAR / DEVOLVER");
        btnEmprestarDevolver.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 0))); // NOI18N
        btnEmprestarDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestarDevolverActionPerformed(evt);
            }
        });
        painelLogin.add(btnEmprestarDevolver);

        painelBorda.add(painelLogin);

        painelCentral.add(painelBorda, new java.awt.GridBagConstraints());

        painelConteudo.add(painelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelConteudo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmprestarDevolverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEmprestarDevolverActionPerformed
        lblResposta.setText("");

        String ra = this.txtRa.getText();
        char[] caracteresSenha = this.txtSenha.getPassword();
        String senha = new String(caracteresSenha);

        if (ra == null || ra.isEmpty()) {
            lblErroRa.setText(MensagemUtil.LOGIN_RA_OBRIGATORIO);
            return;
        }

        if (senha.isEmpty()) {
            lblErroSenha.setText(MensagemUtil.LOGIN_SENHA_OBRIGATORIA);
            return;
        }

        try {
            Estudante estudante = LoginServico.verificaEstudante(ra, senha);
            txtSenha.setText("");
            txtRa.setText("");

            Emprestimo emprestimo = EmprestimoServico.buscarAtivoPorRaDoEstudante(estudante.getRa());

            if (emprestimo == null) {
                EstudantesEmprestimoUI estudanteEmprestimoUI = new EstudantesEmprestimoUI(this, estudante, localizacao);
                estudanteEmprestimoUI.setLocationRelativeTo(this);
                estudanteEmprestimoUI.setVisible(true);
            } else {
                EstudantesDevolucaoUI estudanteDevolucaoUUI = new EstudantesDevolucaoUI(this, emprestimo);
                estudanteDevolucaoUUI.setVisible(true);
            }
        } catch (LoginException e) {
            lblResposta.setText(e.getMessage());
        }
    }// GEN-LAST:event_btnEmprestarDevolverActionPerformed

    private void txtRaFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtRaFocusLost
        if (txtRa.getText() == null || txtRa.getText().isEmpty()) {
            lblErroRa.setText(MensagemUtil.LOGIN_RA_OBRIGATORIO);
        } else {
            lblErroRa.setText("");
        }
    }// GEN-LAST:event_txtRaFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtSenhaFocusLost
        char[] caracteresSenha = this.txtSenha.getPassword();
        String senha = new String(caracteresSenha);
        if (senha.isEmpty()) {
            lblErroSenha.setText(MensagemUtil.LOGIN_SENHA_OBRIGATORIA);
        } else {
            lblErroSenha.setText("");
        }
    }// GEN-LAST:event_txtSenhaFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEmprestarDevolver;
    private javax.swing.JLabel lblErroRa;
    private javax.swing.JLabel lblErroSenha;
    private javax.swing.JLabel lblIconeIFPR;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloSistema;
    private javax.swing.JPanel painelBorda;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField txtRa;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
