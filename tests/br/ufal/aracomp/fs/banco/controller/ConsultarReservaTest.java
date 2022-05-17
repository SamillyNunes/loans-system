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

class ConsultarReservaTest {
	
	private static ILoanController controller;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ConsultarReservaTest.controller = new LoanController();
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
	 * Verifica resultado quando a reserva esta disponivel
	 */
	@Test
	void consultarDisponibilidadeReserva() {
		try {
			Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
			Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
			Reserva reserva = new Reserva("01", new Date(), "disponivel", objeto, contato);
			
			String resultado = controller.consultarDisponibilidadeReserva(reserva);
			assertEquals(resultado, "disponivel");
		}  catch (ErroGeral e) {
			fail("EXCEÃ‡ÃƒO INESPERADA: "+e.getStackTrace());
		}
	}
	

	
	/**
	 * Verifica resultado quando a reserva esta indisponivel
	 */
	@Test
	void consultarIndisponibilidadeReserva() {
		try {
			Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
			Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
			Reserva reserva = new Reserva("01", new Date(), "indisponivel", objeto, contato);
			
			String resultado = controller.consultarDisponibilidadeReserva(reserva);
			assertEquals(resultado, "indisponivel");
		}  catch (ErroGeral e) {
			fail("EXCEÃ‡ÃƒO INESPERADA: "+e.getStackTrace());
		}
	}
	
	/**
	 * Verifica resultado quando a reserva é nula
	 */
	@Test
	void consultarReservaNula() {
		Reserva reserva = null;
		
		assertThrows(ErroGeral.class, ()->{controller.consultarDisponibilidadeReserva(reserva);});
		
	}

	
	/**
	 * Verifica resultado quando o status da reserva é nulo
	 */
	@Test
	void consultarStatusReservaNulo() {
		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), null, objeto, contato);
		
		assertThrows(ErroGeral.class, ()->{controller.consultarDisponibilidadeReserva(reserva);});
	}

	/**
	 * Verifica resultado quando o status da reserva é inválido
	 */
	@Test
	void consultarStatusReservaInvalido() {
		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), "stringqualquer", objeto, contato);
		
		assertThrows(ErroGeral.class, ()->{controller.consultarDisponibilidadeReserva(reserva);});
	}
	
	/**
	 * Verifica resultado quando o objeto da reserva é nulo
	 */
	@Test
	void consultarObjetoReservaNulo() {
		Objeto objeto = null;
		Contato contato = new Contato("01", "jose@gmail.com", "Jose", "1111111111");
		Reserva reserva = new Reserva("01", new Date(), "disponivel", objeto, contato);
		
		assertThrows(ErroGeral.class, ()->{controller.consultarDisponibilidadeReserva(reserva);});
	}
	

	/**
	 * Verifica resultado quando o contato da reserva é nulo
	 */
	@Test
	void consultarContatoReservaNulo() {
		Objeto objeto = new Objeto("00001", "Livro", "Livro de arq de dados", "disponivel");
		Contato contato = null;
		Reserva reserva = new Reserva("01", new Date(), "disponivel", objeto, contato);
		
		assertThrows(ErroGeral.class, ()->{controller.consultarDisponibilidadeReserva(reserva);});
	}
	

}
