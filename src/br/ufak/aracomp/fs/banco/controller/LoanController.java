package br.ufak.aracomp.fs.banco.controller;

import java.util.Date;

import br.ufal.aracomp.fs.banco.exceptions.ErroGeral;
import br.ufal.aracomp.fs.banco.model.Objeto;
import br.ufal.aracomp.fs.banco.model.Reserva;

public class LoanController implements ILoanController{

	@Override
	public String consultarDisponibilidadeObjeto(Objeto objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date definirPrazo(int dias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultarDisponibilidadeReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objeto buscarObjeto(String codigo) throws ErroGeral {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emprestar(Reserva reserva, int diasDeEmprestimo) throws ErroGeral {
		// TODO Auto-generated method stub
		
	}

}
