package br.ufak.aracomp.fs.banco.controller;

import java.util.Date;

import br.ufal.aracomp.fs.banco.exceptions.ErroGeral;
import br.ufal.aracomp.fs.banco.exceptions.ErroPrazoInvalido;
import br.ufal.aracomp.fs.banco.model.Objeto;
import br.ufal.aracomp.fs.banco.model.Reserva;

public interface ILoanController {
	String consultarDisponibilidadeObjeto(Objeto objeto) throws ErroGeral;
	Date definirPrazo(int dias) throws ErroPrazoInvalido;
	String consultarDisponibilidadeReserva(Reserva reserva) throws ErroGeral;
	Objeto buscarObjeto(String codigo) throws ErroGeral;
	void emprestar(Reserva reserva, int diasDeEmprestimo) throws ErroGeral;
}
