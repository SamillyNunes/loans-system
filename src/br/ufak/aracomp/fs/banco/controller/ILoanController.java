package br.ufak.aracomp.fs.banco.controller;

import java.util.Date;

import br.ufal.aracomp.fs.banco.model.Contato;
import br.ufal.aracomp.fs.banco.model.Objeto;
import br.ufal.aracomp.fs.banco.model.Reserva;

public interface ILoanController {
	boolean consultarDisponibilidadeObjeto(Objeto objeto);
	Date definirPrazo(int dias);
	boolean consultarDisponibilidadeReserva(Reserva reserva);
	void emprestar(Objeto objeto, Contato contato);
}
