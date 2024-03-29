package br.edu.ifpr.paranavai.armarios.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDao;
import br.edu.ifpr.paranavai.armarios.excecoes.LocalizacaoException;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;

public class LocalizacaoDaoImpl implements LocalizacaoDao {

    private Session sessao;

    public LocalizacaoDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Localizacao> buscarTodos() {
        Query<Localizacao> query = this.sessao.createQuery("from Localizacao", Localizacao.class);
        List<Localizacao> localizacoes = query.getResultList();
        return localizacoes;
    }

    @Override
    public Localizacao buscarUnicoPorId(Integer idLocalizacao) {
        return this.sessao.find(Localizacao.class, idLocalizacao);
    }

    @Override
    public Localizacao atualizar(Localizacao localizacao) throws LocalizacaoException {
        try {
            sessao.beginTransaction();
            sessao.merge(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new LocalizacaoException(MensagemUtil.LOCALIZACAO_ATUALIZACAO_ERRO_PADRAO);
        }
        return localizacao;
    }

    @Override
    public void excluir(Localizacao localizacao) throws LocalizacaoException {
        try {
            sessao.beginTransaction();
            sessao.remove(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new LocalizacaoException(MensagemUtil.LOCALIZACAO_EXCLUSAO_ERRO_PADRAO);
        }
    }

    @Override
    public Localizacao inserir(Localizacao localizacao) throws LocalizacaoException {
        try {
            sessao.beginTransaction();
            sessao.persist(localizacao);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            throw new LocalizacaoException(MensagemUtil.LOCALIZACAO_INSERCAO_ERRO_PADRAO);
        }
        return localizacao;
    }

    @Override
    public List<Localizacao> buscarAtivos() {
        Query<Localizacao> query = this.sessao.createQuery("from Localizacao e where ativo = :ativo",
                Localizacao.class);
        query.setParameter("ativo", true);
        List<Localizacao> resultado = query.getResultList();
        return resultado;
    }

    @Override
    public Localizacao buscarUnicoPorDescricaoExata(String descricao) {
        Query<Localizacao> query = this.sessao.createQuery("from Localizacao where descricao = :descricao",
                Localizacao.class);
        query.setParameter("descricao", descricao);
        Localizacao resultado = (Localizacao) query.uniqueResult();
        return resultado;
    }

    @Override
    public Localizacao buscarUnicoPorDescricaoExataComIdDiferente(String descricao, Integer idLocalizacao) {
        Query<Localizacao> query = this.sessao
                .createQuery("from Localizacao where descricao = :descricao and id != :id", Localizacao.class);
        query.setParameter("descricao", descricao);
        query.setParameter("id", idLocalizacao);
        Localizacao resultado = (Localizacao) query.uniqueResult();
        return resultado;
    }
}
