package br.edu.ifpr.paranavai.servico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import br.edu.ifpr.paranavai.armarios.excecoes.ArmarioException;
import br.edu.ifpr.paranavai.armarios.excecoes.CursoException;
import br.edu.ifpr.paranavai.armarios.excecoes.EmprestimoException;
import br.edu.ifpr.paranavai.armarios.excecoes.EstudanteException;
import br.edu.ifpr.paranavai.armarios.excecoes.LocalizacaoException;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import br.edu.ifpr.paranavai.armarios.modelo.Curso;
import br.edu.ifpr.paranavai.armarios.modelo.Emprestimo;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.modelo.StatusArmario;
import br.edu.ifpr.paranavai.armarios.servico.ArmarioServico;
import br.edu.ifpr.paranavai.armarios.servico.CursoServico;
import br.edu.ifpr.paranavai.armarios.servico.EmprestimoServico;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;
import br.edu.ifpr.paranavai.armarios.utils.MensagemUtil;

/**
 *
 * @author Professor Marcelo F. Terenciani
 */
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EmprestimoServicoTest {

    private static final String NOME_CURSO = "CURSO-TESTE-EMPRESTIMO";
    private static final String NUMERO_ARMARIO = "TESTE-01-EMPRESTIMO";
    private static final String NOME_LOCALIZACAO = "LOCAL-TESTE-EMPRESTIMO";
    private static final String RA_ESTUDANTE = "2023232323";

    private Armario armario;
    private Estudante estudante;
    private Localizacao localizacao;
    private Emprestimo emprestimo;

    @BeforeAll
    public void antesDeTodosOsTestes()
            throws CursoException, LocalizacaoException, EstudanteException, ArmarioException {
        Curso curso = CursoServico.buscarUnicoPorNomeExato(NOME_CURSO);
        if (curso == null) {
            curso = new Curso();
            curso.setNome(NOME_CURSO);
            CursoServico.inserir(curso);
        }

        Estudante estudante = EstudanteServico.buscarUnicoPorRa(RA_ESTUDANTE);
        if (estudante == null) {
            estudante = new Estudante();
            estudante.setNome("Estudante");
            estudante.setSobrenome("Teste");
            estudante.setEmail("teste@teste.com");
            estudante.setTelefone("(44) 9 9999-9999");
            estudante.setRa(RA_ESTUDANTE);
            estudante.setSenha("123456");
            estudante.setCurso(curso);
            EstudanteServico.inserir(estudante);
        }

        Localizacao localizacao = LocalizacaoServico.buscarUnicoPorDescricaoExata(NOME_LOCALIZACAO);
        if (localizacao == null) {
            localizacao = new Localizacao();
            localizacao.setDescricao(NOME_LOCALIZACAO);
            LocalizacaoServico.inserir(localizacao);
        }

        Armario armario = ArmarioServico.buscarUnicoPorNumeroELocalizacao(localizacao.getId(), NUMERO_ARMARIO);
        if (armario == null) {
            armario = new Armario();
            armario.setNumero(NUMERO_ARMARIO);
            armario.setLocalizacao(localizacao);
            armario.setStatus(StatusArmario.ATIVO);
            ArmarioServico.inserir(armario);
        }
    }

    @BeforeEach
    public void antesDeCadaTeste() {
        if (this.estudante == null) {
            this.estudante = EstudanteServico.buscarUnicoPorRa(RA_ESTUDANTE);
        }
        if (this.localizacao == null) {
            this.localizacao = LocalizacaoServico.buscarUnicoPorDescricaoExata(NOME_LOCALIZACAO);
        }
        if (this.armario == null) {
            this.armario = ArmarioServico.buscarUnicoPorNumeroELocalizacao(localizacao.getId(), NUMERO_ARMARIO);
        }

        this.emprestimo = new Emprestimo();
        this.emprestimo.setArmario(this.armario);
        this.emprestimo.setEstudante(this.estudante);
    }

    @AfterEach
    public void aposCadaTeste() throws EmprestimoException {
        if (this.emprestimo != null) {
            if (this.emprestimo.getId() != null) {
                Emprestimo c = EmprestimoServico.buscarUnicoPorId(this.emprestimo.getId());
                if (c != null)
                    EmprestimoServico.excluir(c);
            }
        }
        this.estudante = null;
    }

    @AfterAll
    public void aposTodosOsTestes() throws CursoException, EstudanteException, LocalizacaoException, ArmarioException {
        Estudante estudante = EstudanteServico.buscarUnicoPorRa(RA_ESTUDANTE);

        if (estudante != null) {
            EstudanteServico.excluir(estudante);
        }

        Curso curso = CursoServico.buscarUnicoPorNomeExato(NOME_CURSO);
        if (curso != null) {
            CursoServico.excluir(curso);
        }
        Localizacao localizacao = LocalizacaoServico.buscarUnicoPorDescricaoExata(NOME_LOCALIZACAO);

        Armario armario = ArmarioServico.buscarUnicoPorNumeroELocalizacao(localizacao.getId(), NUMERO_ARMARIO);
        if (armario != null) {
            ArmarioServico.excluir(armario);
        }
        if (localizacao != null) {
            LocalizacaoServico.excluir(localizacao);
        }
    }

    @Test
    public void naoDeveInserirEstudanteNuloOuIdInvalido() {
        System.out.println("Executando teste naoDeveInserirEstudanteNuloOuIdInvalido");

        EmprestimoException emprestimoExceptionNulo = assertThrows(EmprestimoException.class,
                () -> {
                    this.emprestimo.setEstudante(null);
                    this.emprestimo = EmprestimoServico.inserir(this.emprestimo);
                });

        EmprestimoException emprestimoExceptionIdInvalido = assertThrows(EmprestimoException.class,
                () -> {
                    Estudante estudante = new Estudante();
                    estudante.setId(0);
                    this.emprestimo.setEstudante(estudante);
                    this.emprestimo = EmprestimoServico.inserir(this.emprestimo);
                });

        assertEquals(MensagemUtil.EMPRESTIMO_CAMPO_ESTUDANTE_OBRIGATORIO,
                emprestimoExceptionNulo.getMessage());
        assertEquals(MensagemUtil.EMPRESTIMO_CAMPO_ESTUDANTE_OBRIGATORIO,
                emprestimoExceptionIdInvalido.getMessage());
    }

    @Test
    public void naoDeveInserirArmarioNuloOuIdInvalido() {
        System.out.println("Executando teste naoDeveInserirArmarioNuloOuIdInvalido");

        EmprestimoException emprestimoExceptionNulo = assertThrows(EmprestimoException.class,
                () -> {
                    this.emprestimo.setArmario(null);
                    this.emprestimo = EmprestimoServico.inserir(this.emprestimo);
                });

        EmprestimoException emprestimoExceptionIdInvalido = assertThrows(EmprestimoException.class,
                () -> {
                    Armario armario = new Armario();
                    armario.setId(0);
                    this.emprestimo.setArmario(armario);
                    this.emprestimo = EmprestimoServico.inserir(this.emprestimo);
                });

        assertEquals(MensagemUtil.EMPRESTIMO_CAMPO_ARMARIO_OBRIGATORIO,
                emprestimoExceptionNulo.getMessage());
        assertEquals(MensagemUtil.EMPRESTIMO_CAMPO_ARMARIO_OBRIGATORIO,
                emprestimoExceptionIdInvalido.getMessage());
    }

    @Test
    public void deveInserirUmNovoEmprestimo() throws EmprestimoException {
        System.out.println("Executando teste deveInserirUmNovoEmprestimo");
        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        assertTrue(this.emprestimo.getId() > 0);
        assertTrue(this.emprestimo.getEstudante().getId() > 0);
        assertTrue(this.emprestimo.getArmario().getId() > 0);
        assertNull(this.emprestimo.getDataDevolucao());
        assertNotNull(this.emprestimo.getDataEmprestimo());
    }

    @Test
    public void deveListarAoMenosUm() throws EmprestimoException {
        System.out.println("Executando teste deveListarAoMenosUm");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        List<Emprestimo> listaDeEmprestimos = EmprestimoServico.buscarTodos();
        assertTrue(!listaDeEmprestimos.isEmpty());
    }

    @Test
    public void deveListarSomenteAtivosPorLocalizacao() throws EmprestimoException {
        System.out.println("Executando teste deveListarSomenteAtivosPorLocalizacao");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        List<Emprestimo> listaDeEmprestimos = EmprestimoServico.buscarAtivosPorLocalizacao(this.localizacao.getId());
        assertTrue(!listaDeEmprestimos.isEmpty());
    }

    @Test
    public void deveEncontrarOEmprestimoComIdInserido() throws EmprestimoException {
        System.out.println("Executando teste deveEncontrarOEmprestimoComIdInserido");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        Emprestimo emprestimoEncontrado = EmprestimoServico.buscarUnicoPorId(this.emprestimo.getId());
        assertEquals(this.emprestimo.getId(), emprestimoEncontrado.getId());
    }

    @Test
    public void naoDeveEncontrarOId() throws EmprestimoException {
        System.out.println("Executando teste naoDeveEncontrarOId");

        Emprestimo emprestimoEncontrado = EmprestimoServico.buscarUnicoPorId(-1);
        assertNull(emprestimoEncontrado);
    }

    @Test
    public void deveExcluirOEmprestimoComIdInserido() throws EmprestimoException {
        System.out.println("Executando teste deveExcluirOEmprestimoComIdInserido");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        EmprestimoServico.excluir(this.emprestimo);

        Emprestimo cursoEncontrado = EmprestimoServico.buscarUnicoPorId(this.emprestimo.getId());
        assertNull(cursoEncontrado);
    }

    @Test
    public void naoDeveExcluirEmprestimoJaRemovido() throws EmprestimoException {
        System.out.println("Executando teste naoDeveExcluirEmprestimoJaRemovido");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        EmprestimoServico.excluir(this.emprestimo);

        EmprestimoException emprestimoException = assertThrows(EmprestimoException.class, () -> {
            EmprestimoServico.excluir(this.emprestimo);
        });

        assertTrue(MensagemUtil.EMPRESTIMO_REMOVIDO.equals(emprestimoException.getMessage()));
    }

    @Test
    public void deveFinalizarUmEmprestimoAtivo() throws EmprestimoException {
        System.out.println("Executando teste deveFinalizarUmEmprestimoAtivo");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        Emprestimo emprestimoFinalizado = EmprestimoServico.finalizarEmprestimo(this.emprestimo);

        assertTrue(this.emprestimo.getId().equals(emprestimoFinalizado.getId()));
        assertNotNull(this.emprestimo.getDataDevolucao());
    }

    @Test
    public void naoDeveFinalizarUmEmprestimoJaFinalizado() throws EmprestimoException {
        System.out.println("Executando teste deveFinalizarUmEmprestimoAtivo");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        EmprestimoServico.finalizarEmprestimo(this.emprestimo);

        EmprestimoException emprestimoException = assertThrows(EmprestimoException.class, () -> {
            EmprestimoServico.finalizarEmprestimo(this.emprestimo);
        });

        assertTrue(MensagemUtil.EMPRESTIMO_JA_FINALIZADO.equals(emprestimoException.getMessage()));
    }

    @Test
    public void estudanteNaoDevePossuirDoisEmprestimosAtivos() throws EmprestimoException, ArmarioException {
        System.out.println("Executando teste estudanteNaoDevePossuirDoisEmprestimosAtivos");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        Armario outroArmario = new Armario();
        outroArmario.setNumero(NUMERO_ARMARIO + " OUTRO");
        outroArmario.setLocalizacao(this.localizacao);
        outroArmario.setStatus(StatusArmario.ATIVO);

        ArmarioServico.inserir(outroArmario);

        this.emprestimo.setArmario(outroArmario);

        EmprestimoException emprestimoException = assertThrows(EmprestimoException.class, () -> {
            EmprestimoServico.inserir(this.emprestimo);
        });

        ArmarioServico.excluir(outroArmario);

        assertTrue(MensagemUtil.EMPRESTIMO_ESTUDANTE_POSSUI_EMPRESTIMO_ATIVO.equals(emprestimoException.getMessage()));
    }

    @Test
    public void armarioNaoDevePossuirDoisEmprestimosAtivos() throws EmprestimoException, EstudanteException {
        System.out.println("Executando teste armarioNaoDevePossuirDoisEmprestimosAtivos");

        this.emprestimo = EmprestimoServico.inserir(this.emprestimo);

        Curso curso = CursoServico.buscarUnicoPorNomeExato(NOME_CURSO);
        Estudante outroEstudante = new Estudante();
        outroEstudante.setRa(RA_ESTUDANTE + " OUTRO");
        outroEstudante.setNome("Estudante");
        outroEstudante.setSobrenome("Teste");
        outroEstudante.setEmail("teste@teste.com");
        outroEstudante.setTelefone("(44) 9 9999-9999");
        outroEstudante.setSenha("123456");
        outroEstudante.setCurso(curso);

        EstudanteServico.inserir(outroEstudante);

        this.emprestimo.setEstudante(outroEstudante);

        EmprestimoException emprestimoException = assertThrows(EmprestimoException.class, () -> {
            EmprestimoServico.inserir(this.emprestimo);
        });

        EstudanteServico.excluir(outroEstudante);

        assertTrue(MensagemUtil.EMPRESTIMO_ARMARIO_POSSUI_EMPRESTIMO_ATIVO.equals(emprestimoException.getMessage()));
    }
}
