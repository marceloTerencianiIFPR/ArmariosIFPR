package br.edu.ifpr.paranavai.armarios.visao.ocupados;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesEventoTabela;

/**
 *
 * @author Allan Fernando O de Andrade
 */
public class PainelAcoesOcupadosUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelAcoes
     */
    public PainelAcoesOcupadosUI() {
        initComponents();
    }

    public void iniciarEventos(IndexOcupadosUI indexHistoricoUI, AcoesEventoTabela evento, JTable tabela, int linha){
        
        btnVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento.aoVisualizar(tabela, linha);
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisualizar = new br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesDoBotao();

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/visualizar-16.png"))); // NOI18N
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesDoBotao btnVisualizar;
    // End of variables declaration//GEN-END:variables
}
