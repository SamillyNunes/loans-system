package br.ufal.aracomp.fs.banco.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufak.aracomp.fs.banco.controller.ILoanController;
import br.ufak.aracomp.fs.banco.controller.LoanController;
import br.ufal.aracomp.fs.banco.exceptions.ErroGeral;
import br.ufal.aracomp.fs.banco.model.Objeto;

class ConsultarDisponibilidadeObjetoTest {
	
	private static ILoanController controller;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ConsultarDisponibilidadeObjetoTest.controller = new LoanController();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Executando caso de teste...");
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	
	/**
	 * Verifica resultado quando o objeto está disponivel
	 */
	@Test
	void consultarDisponibilidadeOk() {
		try {
			Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
			String resultado = controller.consultarDisponibilidadeObjeto(objeto);
			assertEquals(resultado, "disponivel");
		}  catch (ErroGeral e) {
			fail("EXCEÃ‡ÃƒO INESPERADA: "+e.getStackTrace());
		}
	}
	
	
	/**
	 * Verifica resultado quando o objeto NÃO está disponivel
	 */
	@Test
	void consultarNaoDisponibilidade() {
		try {
			Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "indisponivel");
			String resultado = controller.consultarDisponibilidadeObjeto(objeto);
			assertEquals(resultado, "indisponivel");
		}  catch (ErroGeral e) {
			fail("EXCEÃ‡ÃƒO INESPERADA: "+e.getStackTrace());
		}
	}
	
	/**
	 * Objeto nulo
	 */
	@Test
	void consultarObjetoNulo() {
		Objeto objeto = null;
		assertThrows(ErroGeral.class, () -> { controller.consultarDisponibilidadeObjeto(objeto);});
	}
	

	/**
	 * Status nulo 
	 */
	@Test
	void consultarStatusNulo() {
		Objeto objeto =  new Objeto("00001", "Livro", "Livro de arq de dados", null);
		assertThrows(ErroGeral.class, () -> { controller.consultarDisponibilidadeObjeto(objeto);});
	}
	
	/**
	 * Status invalido
	 */
	@Test
	void consultarStatusInvalido() {
		Objeto objeto =  new Objeto("00001", "Livro", "Livro de arq de dados", "string-qualquer");
		assertThrows(ErroGeral.class, () -> { controller.consultarDisponibilidadeObjeto(objeto);});
	}

}
