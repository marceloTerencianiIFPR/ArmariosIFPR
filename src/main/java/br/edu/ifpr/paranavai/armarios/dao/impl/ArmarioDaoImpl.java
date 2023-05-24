package br.edu.ifpr.paranavai.armarios.dao.impl;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.query.Query;
import br.edu.ifpr.paranavai.armarios.dao.ArmarioDao;
import br.edu.ifpr.paranavai.armarios.excecoes.ArmarioException;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;

public class ArmarioDaoImpl implements ArmarioDao {

    private Session sessao;

    public ArmarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Armario> buscarTodos() {
        Query<Armario> query = this.sessao.createQuery("from Armario", Armario.class);
        List<Armario> armarios = query.getResultList();
        return armarios;
    }

    @Override
    public Armario buscarPorId(Integer idArmario) {
        return this.sessao.find(Armario.class, idArmario);
    }

    @Override
    public Armario atualizar(Armario armario) throws ArmarioException {
        try {
            sessao.beginTransaction();
            sessao.merge(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new ArmarioException(MensagemUtil.ARMARIO_ATUALIZACAO_ERRO_PADRAO);
        }
        return armario;
    }

    @Override
    public void excluir(Armario armario) throws ArmarioException {
        try {
            sessao.beginTransaction();
            sessao.remove(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new ArmarioException(MensagemUtil.ARMARIO_EXCLUSAO_ERRO_PADRAO);
        }
    }

    @Override
    public Armario inserir(Armario armario) throws ArmarioException {
        try {
            sessao.beginTransaction();
            sessao.persist(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new ArmarioException(MensagemUtil.ARMARIO_INSERCAO_ERRO_PADRAO);
        }
        return armario;
    }

    @Override
    public List<Armario> buscarTodosAtivos() {
        Query<Armario> query = this.sessao.createQuery("from Armario e where ativo = :ativo", Armario.class);
        query.setParameter("ativo", true);
        List<Armario> resultado = query.getResultList();
        return resultado;
    }

    @Override
    public List<Armario> buscarTodosPorIdLocalizacao(Integer idLocalizacao) {
        Query<Armario> query = this.sessao.createQuery("from Armario a where a.localizacao.id = :id", Armario.class);
        query.setParameter("id", idLocalizacao);
        List<Armario> resultado = query.getResultList();
        return resultado;
        
    }
    @Override
    public List<Armario> buscarAtivoPorIdLocalizacao(Integer idLocalizacao) {
        Query<Armario> query = this.sessao.createQuery("from Armario a where a.localizacao.id = :id and a.ativo = :ativo", Armario.class);
        query.setParameter("id", idLocalizacao);
        query.setParameter("ativo", true);
        List<Armario> resultado = query.getResultList();
        return resultado;
    }

    

}