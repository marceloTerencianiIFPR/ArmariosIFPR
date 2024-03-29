package br.edu.ifpr.paranavai.armarios.visao.emprestimo;

import br.edu.ifpr.paranavai.armarios.visao.tabela.acoes.PainelAcoesEmprestimosConcessoesUI;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Professor Marcelo Figueiredo Terenciani
 */
public class RenderizadorDasAcoesDaCelulaEmprestimo extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        PainelAcoesEmprestimosConcessoesUI acoes = new PainelAcoesEmprestimosConcessoesUI(true, true, true);

        if (isSelected == false && row % 2 == 0) {
            acoes.setBackground(Color.white);
        } else {
            acoes.setBackground(componente.getBackground());
        }

        return acoes;

    }

}
