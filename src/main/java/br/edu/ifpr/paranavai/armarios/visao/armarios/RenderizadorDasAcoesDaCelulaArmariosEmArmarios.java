package br.edu.ifpr.paranavai.armarios.visao.armarios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Allan Fernando O de Andrade
 */
public class RenderizadorDasAcoesDaCelulaArmariosEmArmarios extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        PainelAcoesEmprestimoEmArmariosUI acoes = new PainelAcoesEmprestimoEmArmariosUI();

        if (isSelected == false && row % 2 == 0) {
            acoes.setBackground(Color.white);
        } else {
            acoes.setBackground(componente.getBackground());
        }

        return acoes;

    }

}
