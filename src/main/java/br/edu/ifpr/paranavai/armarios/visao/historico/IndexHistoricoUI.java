package br.edu.ifpr.paranavai.armarios.visao.historico;


import br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesEventoTabela;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;

/**
 *
 * @author Allan Fernando O de Andrade
 */
public class IndexHistoricoUI extends javax.swing.JFrame {
    List<Localizacao> listaDeLocalizacoes;
    /**
     * Creates new form EditorLocalizacaoUI
     */
    
    public IndexHistoricoUI() {
        
        initComponents();
        init();
        setLocationRelativeTo(this);
    }

    
    
    public void init(){
        listaDeLocalizacoes = LocalizacaoServico.buscarTodos();
        populaTabela(listaDeLocalizacoes);
        
    }

    private void populaTabela(List<Localizacao> listaDeLocalizacoes) {
        
        AcoesEventoTabela evento = new AcoesEventoTabelaHistorico();
        
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) tblLocalizacao.getModel();
        tblLocalizacao.getColumnModel().getColumn(3).setCellRenderer(new RenderizadorDasAcoesDaCelulaHistorico());
        tblLocalizacao.getColumnModel().getColumn(3).setCellEditor(new EditorDasAcoesDaCelulaHistoricoUI(evento, this));
        //  Primeiro limpa a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        
        for (int i = 0; i < listaDeLocalizacoes.size(); i++) {
            Localizacao mostraLocalizacao = listaDeLocalizacoes.get(i);
            Object[] dadosLinha = new Object[3];
            dadosLinha[0] = mostraLocalizacao.getId();
            dadosLinha[1] = mostraLocalizacao.getDescricao();
            dadosLinha[2] = mostraLocalizacao.isAtivo() ? "Ativo" : "Inativo";
            
            modeloDeColunasDaTabela.addRow(dadosLinha);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeral = new javax.swing.JPanel();
        painelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocalizacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Localizações");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        painelGeral.setLayout(new java.awt.BorderLayout(0, 5));

        painelInferior.setBackground(new java.awt.Color(0, 153, 0));
        painelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 6));
        painelInferior.setLayout(new java.awt.BorderLayout());

        tblLocalizacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nome", "Ativo", "Ações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLocalizacao.setRowHeight(30);
        tblLocalizacao.setSelectionBackground(new java.awt.Color(57, 137, 111));
        tblLocalizacao.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLocalizacao);
        if (tblLocalizacao.getColumnModel().getColumnCount() > 0) {
            tblLocalizacao.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblLocalizacao.getColumnModel().getColumn(0).setMaxWidth(200);
            tblLocalizacao.getColumnModel().getColumn(2).setMinWidth(100);
            tblLocalizacao.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblLocalizacao.getColumnModel().getColumn(2).setMaxWidth(100);
            tblLocalizacao.getColumnModel().getColumn(3).setMinWidth(100);
            tblLocalizacao.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblLocalizacao.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        painelInferior.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        painelGeral.add(painelInferior, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelGeral);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelGeral;
    private javax.swing.JPanel painelInferior;
    private javax.swing.JTable tblLocalizacao;
    // End of variables declaration//GEN-END:variables
}