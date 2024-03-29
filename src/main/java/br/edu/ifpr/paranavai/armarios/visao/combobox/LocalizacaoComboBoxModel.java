package br.edu.ifpr.paranavai.armarios.visao.combobox;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author professor Marcelo Figueiredo Terenciani
 */
public class LocalizacaoComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<Localizacao> listaDeLocalizacoes;
    private Localizacao localizacaoSelecionada;

    public LocalizacaoComboBoxModel() {
        listaDeLocalizacoes = new ArrayList<Localizacao>();
    }

    @Override
    public int getSize() {
        return listaDeLocalizacoes.size();
    }

    @Override
    public Object getElementAt(int index) {
        return listaDeLocalizacoes.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (anItem instanceof Localizacao) {
            this.localizacaoSelecionada = (Localizacao) anItem;
            fireContentsChanged(this.localizacaoSelecionada, 0, this.getSize());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.localizacaoSelecionada;
    }

    public void addLocalizacao(Localizacao curso) {
        this.listaDeLocalizacoes.add(curso);
    }

    public void reset() {
        this.listaDeLocalizacoes.clear();
    }
}
