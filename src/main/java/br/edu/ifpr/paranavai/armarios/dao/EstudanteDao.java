package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;

import br.edu.ifpr.paranavai.armarios.excecoes.EstudanteException;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;

public interface EstudanteDao {

    public List<Estudante> buscarTodos();

    public Estudante buscarPorId(Integer inteiro);

    public List<Estudante> buscarPorNome(String nomee);

    public Estudante buscarPorRa(String ra);

    public Estudante buscarPorEmail(String email);

    public Estudante buscarPorRaComIdDiferente(String ra, Integer id);

    public List<Estudante> buscarPorIdCurso(Integer idCurso);

    public Estudante atualizar(Estudante estudante) throws EstudanteException;

    public void excluir(Estudante estudante) throws EstudanteException;

    public Estudante inserir(Estudante estudante) throws EstudanteException;
}
