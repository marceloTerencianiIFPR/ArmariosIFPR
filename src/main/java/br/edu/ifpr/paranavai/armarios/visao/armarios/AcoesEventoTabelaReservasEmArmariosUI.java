package br.edu.ifpr.paranavai.armarios.visao.armarios;


import br.edu.ifpr.paranavai.armarios.visao.localizacao.*;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;
import br.edu.ifpr.paranavai.armarios.servico.ReservaServico;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;
import br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.AcoesEventoTabela;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author Professor Marcelo Figueiredo Terenciani
 */
public class AcoesEventoTabelaReservasEmArmariosUI implements AcoesEventoTabela {

   

    @Override
    public void aoExcluir(JTable tabela, int linha) {
        int identificador = (int) tabela.getModel().getValueAt(linha, 0);

        ListaArmariosUI listaArmariosUI = (ListaArmariosUI) SwingUtilities.getWindowAncestor(tabela);

        

        String mensagem = MensagemUtil.ARMARIO_EXCLUSAO_CONFIRMACAO + identificador + "?";
        int opcao = JOptionPane.showConfirmDialog(listaArmariosUI, mensagem, MensagemUtil.TITULO_ATENCAO, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (opcao == 0) {
            try {
                ReservaServico.apagaPorNumero(identificador);
                JOptionPane.showMessageDialog(listaArmariosUI, MensagemUtil.ARMARIO_EXCLUSAO_SUCESSO, MensagemUtil.TITULO_INFORMACAO, JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                listaArmariosUI.init();
            }
        }
    }

    @Override
    public void aoEditar(JTable tabela, int linha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aoVisualizar(JTable tabela, int linha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
