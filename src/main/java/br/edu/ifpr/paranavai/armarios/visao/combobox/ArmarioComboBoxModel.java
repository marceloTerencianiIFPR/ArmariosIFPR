package br.edu.ifpr.paranavai.armarios.visao.combobox;

import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author professor Marcelo Figueiredo Terenciani
 */
public class ArmarioComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<Armario> listaDeArmarios;
    private Armario armarioSelecionado;

    public ArmarioComboBoxModel() {
        listaDeArmarios = new ArrayList<Armario>();
    }
    

    @Override
    public int getSize() {
        return listaDeArmarios.size();
    }

    @Override
    public Object getElementAt(int index) {
        return listaDeArmarios.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (anItem instanceof Armario) {
            this.armarioSelecionado = (Armario) anItem;
            fireContentsChanged(this.armarioSelecionado, 0, this.getSize());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.armarioSelecionado;
    }

    public void addArmario(Armario curso) {
        this.listaDeArmarios.add(curso);
    }

    public void reset() {
        this.listaDeArmarios.clear();
    }
}
