package br.ufak.aracomp.fs.banco.controller;

import java.util.Date;

import br.ufal.aracomp.fs.banco.model.Contato;
import br.ufal.aracomp.fs.banco.model.Objeto;
import br.ufal.aracomp.fs.banco.model.Reserva;

public class LoanController implements ILoanController{

	@Override
	public boolean consultarDisponibilidadeObjeto(Objeto objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Date definirPrazo(int dias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean consultarDisponibilidadeReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void emprestar(Objeto objeto, Contato contato) {
		// TODO Auto-generated method stub
		
	}

}
