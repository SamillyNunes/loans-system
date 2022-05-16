package br.ufal.aracomp.fs.banco.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufak.aracomp.fs.banco.controller.ILoanController;
import br.ufak.aracomp.fs.banco.controller.LoanController;
import br.ufal.aracomp.fs.banco.exceptions.ErroGeral;
import br.ufal.aracomp.fs.banco.exceptions.ErroPrazoInvalido;

class VerificarPrazoTest {
	
	private static ILoanController controller;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		VerificarPrazoTest.controller = new LoanController();
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
	 * Verificar se prazo retornado esta certo
	 */
	@Test
	void verificarPrazoValido() {
		try {
			Date resultado = controller.definirPrazo(5);
			
			Calendar calendar = Calendar.getInstance();
			Date dataAtual = new Date();
			calendar.setTime(dataAtual);
			calendar.add(Calendar.DATE, 5);
			Date dataFim = calendar.getTime();
			
			assertEquals(resultado, dataFim);
		} catch(ErroPrazoInvalido e) {
			fail("Erro inesperado: " + e.getMessage());
		}
	}
	
	/**
	 * Verificar quando a quantidade de dias passada eh inválida
	 */
	@Test
	void verificarPrazoInvalido() {			
		assertThrows(ErroPrazoInvalido.class, () -> {controller.definirPrazo(-1);});		
	}

}
