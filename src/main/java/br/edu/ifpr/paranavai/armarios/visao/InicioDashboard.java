package br.edu.ifpr.paranavai.armarios.visao;

/**
 *
 * @author teren
 */
public class InicioDashboard extends javax.swing.JPanel {

    /**
     * Creates new form InicioDashboard
     */
    public InicioDashboard() {
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

        painelAbrirSistema = new javax.swing.JPanel();
        btnAbrirSistemaEmprestimo = new javax.swing.JPanel();
        imgAbrirSistemaEmprestimo = new javax.swing.JLabel();
        lblAbrirSistemaEmprestimo = new javax.swing.JLabel();
        painelIndicadores = new javax.swing.JPanel();
        cardEstudantes = new javax.swing.JPanel();
        detalheVisualEstudantes = new javax.swing.JPanel();
        grupoInformacaoEstudantes = new javax.swing.JPanel();
        painelIndicadorEstudantes = new javax.swing.JPanel();
        lblDescricaoEstudantes = new javax.swing.JLabel();
        lblValorEstudantes = new javax.swing.JLabel();
        painelIconeEstudantes = new javax.swing.JPanel();
        imgIcon = new javax.swing.JLabel();
        cardArmarios = new javax.swing.JPanel();
        detalheVisualArmarios = new javax.swing.JPanel();
        grupoInformacaoArmarios = new javax.swing.JPanel();
        painelIndicadorArmarios = new javax.swing.JPanel();
        lblDescricaoArmarios = new javax.swing.JLabel();
        lblValorArmarios = new javax.swing.JLabel();
        painelIconeArmarios = new javax.swing.JPanel();
        imgIconArmarios = new javax.swing.JLabel();
        cardEmprestimos = new javax.swing.JPanel();
        detalheVisualEmprestimos = new javax.swing.JPanel();
        grupoInformacaoEmprestimos = new javax.swing.JPanel();
        painelIndicadorEmprestimos = new javax.swing.JPanel();
        lblDescricaoEmprestimos = new javax.swing.JLabel();
        lblValorEmprestimos = new javax.swing.JLabel();
        painelIconeEmprestimos = new javax.swing.JPanel();
        imgIconEmprestimos = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        painelAbrirSistema.setBackground(new java.awt.Color(247, 248, 252));
        painelAbrirSistema.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        painelAbrirSistema.setLayout(new java.awt.GridLayout(1, 0));

        btnAbrirSistemaEmprestimo.setBackground(new java.awt.Color(8, 166, 97));
        btnAbrirSistemaEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAbrirSistemaEmprestimoMousePressed(evt);
            }
        });

        imgAbrirSistemaEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/painelcontrole/abrir-branco-64px.png"))); // NOI18N

        lblAbrirSistemaEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAbrirSistemaEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        lblAbrirSistemaEmprestimo.setText("Abrir Sistema de Empréstimos");

        javax.swing.GroupLayout btnAbrirSistemaEmprestimoLayout = new javax.swing.GroupLayout(btnAbrirSistemaEmprestimo);
        btnAbrirSistemaEmprestimo.setLayout(btnAbrirSistemaEmprestimoLayout);
        btnAbrirSistemaEmprestimoLayout.setHorizontalGroup(
            btnAbrirSistemaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAbrirSistemaEmprestimoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgAbrirSistemaEmprestimo)
                .addGap(20, 20, 20)
                .addComponent(lblAbrirSistemaEmprestimo)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        btnAbrirSistemaEmprestimoLayout.setVerticalGroup(
            btnAbrirSistemaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAbrirSistemaEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addComponent(lblAbrirSistemaEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelAbrirSistema.add(btnAbrirSistemaEmprestimo);

        add(painelAbrirSistema, java.awt.BorderLayout.PAGE_START);

        painelIndicadores.setBackground(new java.awt.Color(247, 248, 252));
        painelIndicadores.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        painelIndicadores.setMinimumSize(new java.awt.Dimension(100, 100));
        painelIndicadores.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        cardEstudantes.setMinimumSize(new java.awt.Dimension(326, 150));
        cardEstudantes.setPreferredSize(new java.awt.Dimension(280, 150));
        cardEstudantes.setLayout(new java.awt.BorderLayout());

        detalheVisualEstudantes.setBackground(new java.awt.Color(8, 166, 97));
        detalheVisualEstudantes.setMinimumSize(new java.awt.Dimension(5, 100));
        detalheVisualEstudantes.setPreferredSize(new java.awt.Dimension(5, 347));

        javax.swing.GroupLayout detalheVisualEstudantesLayout = new javax.swing.GroupLayout(detalheVisualEstudantes);
        detalheVisualEstudantes.setLayout(detalheVisualEstudantesLayout);
        detalheVisualEstudantesLayout.setHorizontalGroup(
            detalheVisualEstudantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        detalheVisualEstudantesLayout.setVerticalGroup(
            detalheVisualEstudantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        cardEstudantes.add(detalheVisualEstudantes, java.awt.BorderLayout.LINE_START);

        grupoInformacaoEstudantes.setLayout(new java.awt.BorderLayout());

        painelIndicadorEstudantes.setBackground(new java.awt.Color(255, 255, 255));
        painelIndicadorEstudantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 20, 30, 10));
        painelIndicadorEstudantes.setLayout(new java.awt.GridLayout(2, 1));

        lblDescricaoEstudantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescricaoEstudantes.setForeground(new java.awt.Color(8, 166, 97));
        lblDescricaoEstudantes.setText("ESTUDANTES ATIVOS");
        painelIndicadorEstudantes.add(lblDescricaoEstudantes);

        lblValorEstudantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorEstudantes.setText("VALOR");
        painelIndicadorEstudantes.add(lblValorEstudantes);

        grupoInformacaoEstudantes.add(painelIndicadorEstudantes, java.awt.BorderLayout.CENTER);

        painelIconeEstudantes.setBackground(new java.awt.Color(255, 255, 255));
        painelIconeEstudantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));
        painelIconeEstudantes.setMinimumSize(new java.awt.Dimension(50, 100));
        painelIconeEstudantes.setLayout(new java.awt.GridLayout(1, 0));

        imgIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/dashboard/estudante-cinza-64px.png"))); // NOI18N
        imgIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelIconeEstudantes.add(imgIcon);

        grupoInformacaoEstudantes.add(painelIconeEstudantes, java.awt.BorderLayout.LINE_END);

        cardEstudantes.add(grupoInformacaoEstudantes, java.awt.BorderLayout.CENTER);

        painelIndicadores.add(cardEstudantes);

        cardArmarios.setMinimumSize(new java.awt.Dimension(326, 150));
        cardArmarios.setPreferredSize(new java.awt.Dimension(280, 150));
        cardArmarios.setLayout(new java.awt.BorderLayout());

        detalheVisualArmarios.setBackground(new java.awt.Color(84, 199, 222));
        detalheVisualArmarios.setMinimumSize(new java.awt.Dimension(5, 100));
        detalheVisualArmarios.setPreferredSize(new java.awt.Dimension(5, 347));

        javax.swing.GroupLayout detalheVisualArmariosLayout = new javax.swing.GroupLayout(detalheVisualArmarios);
        detalheVisualArmarios.setLayout(detalheVisualArmariosLayout);
        detalheVisualArmariosLayout.setHorizontalGroup(
            detalheVisualArmariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        detalheVisualArmariosLayout.setVerticalGroup(
            detalheVisualArmariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        cardArmarios.add(detalheVisualArmarios, java.awt.BorderLayout.LINE_START);

        grupoInformacaoArmarios.setLayout(new java.awt.BorderLayout());

        painelIndicadorArmarios.setBackground(new java.awt.Color(255, 255, 255));
        painelIndicadorArmarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 20, 30, 10));
        painelIndicadorArmarios.setLayout(new java.awt.GridLayout(2, 1));

        lblDescricaoArmarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescricaoArmarios.setForeground(new java.awt.Color(84, 199, 222));
        lblDescricaoArmarios.setText("ARMÁRIOS");
        painelIndicadorArmarios.add(lblDescricaoArmarios);

        lblValorArmarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorArmarios.setText("VALOR");
        painelIndicadorArmarios.add(lblValorArmarios);

        grupoInformacaoArmarios.add(painelIndicadorArmarios, java.awt.BorderLayout.CENTER);

        painelIconeArmarios.setBackground(new java.awt.Color(255, 255, 255));
        painelIconeArmarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));
        painelIconeArmarios.setMinimumSize(new java.awt.Dimension(50, 100));
        painelIconeArmarios.setLayout(new java.awt.GridLayout());

        imgIconArmarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIconArmarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/dashboard/armario-cinza-64px.png"))); // NOI18N
        imgIconArmarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelIconeArmarios.add(imgIconArmarios);

        grupoInformacaoArmarios.add(painelIconeArmarios, java.awt.BorderLayout.LINE_END);

        cardArmarios.add(grupoInformacaoArmarios, java.awt.BorderLayout.CENTER);

        painelIndicadores.add(cardArmarios);

        cardEmprestimos.setMinimumSize(new java.awt.Dimension(326, 150));
        cardEmprestimos.setPreferredSize(new java.awt.Dimension(280, 150));
        cardEmprestimos.setLayout(new java.awt.BorderLayout());

        detalheVisualEmprestimos.setBackground(new java.awt.Color(246, 194, 62));
        detalheVisualEmprestimos.setMinimumSize(new java.awt.Dimension(5, 100));
        detalheVisualEmprestimos.setPreferredSize(new java.awt.Dimension(5, 347));

        javax.swing.GroupLayout detalheVisualEmprestimosLayout = new javax.swing.GroupLayout(detalheVisualEmprestimos);
        detalheVisualEmprestimos.setLayout(detalheVisualEmprestimosLayout);
        detalheVisualEmprestimosLayout.setHorizontalGroup(
            detalheVisualEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        detalheVisualEmprestimosLayout.setVerticalGroup(
            detalheVisualEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        cardEmprestimos.add(detalheVisualEmprestimos, java.awt.BorderLayout.LINE_START);

        grupoInformacaoEmprestimos.setLayout(new java.awt.BorderLayout());

        painelIndicadorEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        painelIndicadorEmprestimos.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 20, 30, 10));
        painelIndicadorEmprestimos.setLayout(new java.awt.GridLayout(2, 1));

        lblDescricaoEmprestimos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescricaoEmprestimos.setForeground(new java.awt.Color(246, 194, 62));
        lblDescricaoEmprestimos.setText("EMPRÉSTIMOS");
        painelIndicadorEmprestimos.add(lblDescricaoEmprestimos);

        lblValorEmprestimos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorEmprestimos.setText("VALOR");
        painelIndicadorEmprestimos.add(lblValorEmprestimos);

        grupoInformacaoEmprestimos.add(painelIndicadorEmprestimos, java.awt.BorderLayout.CENTER);

        painelIconeEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        painelIconeEmprestimos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));
        painelIconeEmprestimos.setMinimumSize(new java.awt.Dimension(50, 100));
        painelIconeEmprestimos.setLayout(new java.awt.GridLayout());

        imgIconEmprestimos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgIconEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/dashboard/chaves-cinza-64px.png"))); // NOI18N
        imgIconEmprestimos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelIconeEmprestimos.add(imgIconEmprestimos);

        grupoInformacaoEmprestimos.add(painelIconeEmprestimos, java.awt.BorderLayout.LINE_END);

        cardEmprestimos.add(grupoInformacaoEmprestimos, java.awt.BorderLayout.CENTER);

        painelIndicadores.add(cardEmprestimos);

        add(painelIndicadores, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirSistemaEmprestimoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirSistemaEmprestimoMousePressed
        EmprestimoEstudanteUI loginEstudanteUI = new EmprestimoEstudanteUI();
        loginEstudanteUI.setVisible(true);
    }//GEN-LAST:event_btnAbrirSistemaEmprestimoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAbrirSistemaEmprestimo;
    private javax.swing.JPanel cardArmarios;
    private javax.swing.JPanel cardEmprestimos;
    private javax.swing.JPanel cardEstudantes;
    private javax.swing.JPanel detalheVisualArmarios;
    private javax.swing.JPanel detalheVisualEmprestimos;
    private javax.swing.JPanel detalheVisualEstudantes;
    private javax.swing.JPanel grupoInformacaoArmarios;
    private javax.swing.JPanel grupoInformacaoEmprestimos;
    private javax.swing.JPanel grupoInformacaoEstudantes;
    private javax.swing.JLabel imgAbrirSistemaEmprestimo;
    private javax.swing.JLabel imgIcon;
    private javax.swing.JLabel imgIconArmarios;
    private javax.swing.JLabel imgIconEmprestimos;
    private javax.swing.JLabel lblAbrirSistemaEmprestimo;
    private javax.swing.JLabel lblDescricaoArmarios;
    private javax.swing.JLabel lblDescricaoEmprestimos;
    private javax.swing.JLabel lblDescricaoEstudantes;
    private javax.swing.JLabel lblValorArmarios;
    private javax.swing.JLabel lblValorEmprestimos;
    private javax.swing.JLabel lblValorEstudantes;
    private javax.swing.JPanel painelAbrirSistema;
    private javax.swing.JPanel painelIconeArmarios;
    private javax.swing.JPanel painelIconeEmprestimos;
    private javax.swing.JPanel painelIconeEstudantes;
    private javax.swing.JPanel painelIndicadorArmarios;
    private javax.swing.JPanel painelIndicadorEmprestimos;
    private javax.swing.JPanel painelIndicadorEstudantes;
    private javax.swing.JPanel painelIndicadores;
    // End of variables declaration//GEN-END:variables
}
