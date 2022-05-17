package br.ufal.aracomp.fs.banco.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufak.aracomp.fs.banco.controller.ILoanController;
import br.ufak.aracomp.fs.banco.controller.LoanController;
import br.ufal.aracomp.fs.banco.exceptions.ErroGeral;
import br.ufal.aracomp.fs.banco.model.Contato;
import br.ufal.aracomp.fs.banco.model.Objeto;
import br.ufal.aracomp.fs.banco.model.Reserva;

class EmprestarTest {

	private static ILoanController controller;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		EmprestarTest.controller = new LoanController();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	/**
	 * Reserva disponivel, emprestimo bem sucedido
	 * */
	@Test
	void sucessoEmprestimo() {

		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), "disponivel", objeto, contato);
		
		try {
			controller.emprestar(reserva, 5);
			assertEquals(reserva.getObjeto().getStatus(), "indisponivel");
			assertEquals(reserva.getStatus(), "indisponivel");
			
		} catch (ErroGeral e) {
			// TODO Auto-generated catch block
			fail("Erro inesperado: "+ e.getMessage());
		}

	}
	

	/**
	 * Reserva invalida, emprestimo nao sucedido
	 * */
	@Test
	void reservaInvalidaFalhaEmprestimo() {

		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), "indisponivel", objeto, contato);
		
		try {
			controller.emprestar(reserva, 5);
			assertEquals(reserva.getObjeto().getStatus() ,"disponivel");
			assertEquals(reserva.getStatus(), "indisponivel");
			
		} catch (ErroGeral e) {
			// TODO Auto-generated catch block
			fail("Erro inesperado: "+ e.getMessage());
		}

	}
	


	/**
	 * Reserva nula, emprestimo nao sucedido
	 * */
	@Test
	void reservaNula() {

		Reserva reserva = null;
		
		assertThrows(ErroGeral.class, ()->{controller.emprestar(reserva, 5);});
		

	}
	
	/**
	 * Prazo invalido, emprestimo nao sucedido
	 * */
	@Test
	void prazoInvalido() {

		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), "indisponivel", objeto, contato);
		

		assertThrows(ErroGeral.class, ()->{controller.emprestar(reserva, -1);});
		
	}

}
