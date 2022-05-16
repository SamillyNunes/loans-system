package br.ufal.aracomp.fs.banco.main;

import java.util.Calendar;
import java.util.Date;

import br.ufak.aracomp.fs.banco.controller.ILoanController;
import br.ufak.aracomp.fs.banco.controller.LoanController;
import br.ufal.aracomp.fs.banco.exceptions.ErroPrazoInvalido;

public class Principal {

	public static void main(String[] args) throws ErroPrazoInvalido {
		
		final ILoanController controller = new LoanController();
		
		Calendar calendar = Calendar.getInstance();
		Date dataAtual = new Date();
		calendar.setTime(dataAtual);
		calendar.add(Calendar.DATE, 5);
		Date dataFim = calendar.getTime();
		
		System.out.println("Data fim: " + dataFim);
		
		Date teste = controller.definirPrazo(-1);
		System.out.println("Data invalida: "+ teste);

	}

}
