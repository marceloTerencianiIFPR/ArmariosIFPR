/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao.ocupados;

import br.edu.ifpr.paranavai.armarios.modelo.Reserva;

import br.edu.ifpr.paranavai.armarios.servico.EmprestimoServico;
import br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesEventoTabela;
import java.util.List;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allan Fernando O de Andrade
 */
public class ListaOcupadosUI extends javax.swing.JFrame {

    //int localId =  Integer.parseInt(System.getProperty("localIdHistorico"));
    private int localId;

    /**
     * Creates new form ListaArmarioUI
     */
    public ListaOcupadosUI(IndexOcupadosUI indexOcupadosUI) {

        initComponents();
        
        setLocationRelativeTo(indexOcupadosUI);

        populaTabela();
    }
    // </editor-fold>

    ListaOcupadosUI(IndexOcupadosUI indexOcupadosUI, int identificador) {
        this(indexOcupadosUI);
        this.localId = identificador;
    }

    @SuppressWarnings("unchecked")
    private void populaTabela() {
        System.out.print(localId);

        AcoesEventoTabela evento = new AcoesEventoTabelaLista();

        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) ocupados.getModel();
        ocupados.getColumnModel().getColumn(4).setCellRenderer(new RenderizadorDasAcoesDaCelulaLista());
        ocupados.getColumnModel().getColumn(4).setCellEditor(new EditorDasAcoesDaCelulaListaUI(evento, this));
        // Primeiro limpa a tabela while
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        List<Reserva> reservas = EmprestimoServico.buscarAtivoPorLocalizacao(localId, false);

        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);

            Object[] dadosLinha = new Object[4];
            dadosLinha[0] = reserva.getDataHoraEmprestimo();

            dadosLinha[1] = reserva.getLocalizacao().getDescricao();
            dadosLinha[2] = reserva.getNumero();
            dadosLinha[3] = reserva.getEstudante().getRa();

            modeloDeColunasDaTabela.addRow(dadosLinha);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        cor = new javax.swing.JPanel();
        geral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ocupados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cor.setBackground(new java.awt.Color(0, 153, 0));
        cor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Armários Ocupados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        ocupados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hora Empréstimo", "Localização", "Armário Número", "Aluno RA", "Dados do Aluno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ocupados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout geralLayout = new javax.swing.GroupLayout(geral);
        geral.setLayout(geralLayout);
        geralLayout.setHorizontalGroup(
            geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        geralLayout.setVerticalGroup(
            geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout corLayout = new javax.swing.GroupLayout(cor);
        cor.setLayout(corLayout);
        corLayout.setHorizontalGroup(
            corLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        corLayout.setVerticalGroup(
            corLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void historicoUI(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaOcupadosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaOcupadosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaOcupadosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaOcupadosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cor;
    private javax.swing.JPanel geral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable ocupados;
    // End of variables declaration//GEN-END:variables
}
