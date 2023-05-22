/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao.armarios;

import br.edu.ifpr.paranavai.armarios.excecoes.ArmarioException;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import br.edu.ifpr.paranavai.armarios.servico.EmprestimoServico;
import java.awt.Dialog;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan Fernando O de Andrade
 */
public class CadastraArmarioEmArmariosUI extends javax.swing.JDialog {

    //int localId = Integer.parseInt(System.getProperty("localId"));
    private int localId;
    private Reserva reserva;
    Localizacao local = new Localizacao();
    private ListaArmariosUI listaArmariosUI;

    /**
     * Creates new form CriacaoEdicaoLocalizacaoUIModal
     */
    public CadastraArmarioEmArmariosUI(ListaArmariosUI listaArmariosUI, Integer localId) {
        super(listaArmariosUI, true);
        initComponents();
        this.listaArmariosUI = listaArmariosUI;
        

        this.setTitle("Novo armário");
        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        this.localId = localId;
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
        jSpinner1 = new javax.swing.JSpinner();
        panelGeral = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        selecionaNumero = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblrespostacad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        lblTitulo.setText("Novo armário");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        selecionaNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionaNumeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selecionaNumeroMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                selecionaNumeroMousePressed(evt);
            }
        });
        selecionaNumero.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selecionaNumeroPropertyChange(evt);
            }
        });

        jLabel1.setText("Defina o número do novo armário:");

        lblrespostacad.setText(" ");
        lblrespostacad.setAlignmentX(5.0F);
        lblrespostacad.setAlignmentY(0.0F);

        javax.swing.GroupLayout panelGeralLayout = new javax.swing.GroupLayout(panelGeral);
        panelGeral.setLayout(panelGeralLayout);
        panelGeralLayout.setHorizontalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGeralLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionaNumero))
                    .addGroup(panelGeralLayout.createSequentialGroup()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblrespostacad, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelGeralLayout.setVerticalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(lblrespostacad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCadastrar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(panelGeral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        fecharFormulario();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.reserva = new Reserva();
        String numero = selecionaNumero.getValue().toString();
        int convertido = Integer.parseInt(numero);

        if (convertido <= 0) {
            lblrespostacad.setText( "O número não pode ser zero ou negativo");
        } else {
            local.setId(localId);
            reserva.setLocalizacao(local);
            reserva.setNumero(convertido);
            reserva.setAtivo(true);
            try {
               String resposta = EmprestimoServico.inserir(reserva);
                if(resposta.equals("Número de armário já cadastrado") ){
                    lblrespostacad.setText(resposta);
                } else {
                    lblrespostacad.setText(resposta);
                    listaArmariosUI.init();
                }
            } catch (ArmarioException ex) {
                Logger.getLogger(CadastraArmarioEmArmariosUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
           
            

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void selecionaNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaNumeroMouseClicked
    
    }//GEN-LAST:event_selecionaNumeroMouseClicked

    private void selecionaNumeroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selecionaNumeroPropertyChange
       
    }//GEN-LAST:event_selecionaNumeroPropertyChange

    private void selecionaNumeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaNumeroMouseEntered
      
    }//GEN-LAST:event_selecionaNumeroMouseEntered

    private void selecionaNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaNumeroMousePressed
       
    }//GEN-LAST:event_selecionaNumeroMousePressed

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
       lblrespostacad.setText(" ");
    }//GEN-LAST:event_btnCadastrarMouseExited

    
    private void fecharFormulario() {
        this.dispose();
        this.listaArmariosUI.init();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblrespostacad;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JSpinner selecionaNumero;
    // End of variables declaration//GEN-END:variables
}
