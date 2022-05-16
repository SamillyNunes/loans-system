package br.ufal.aracomp.fs.banco.model;

import java.util.Date;

public class Reserva {
	private String codigo;
	private Date dataInicio;
	private String status;
	private Objeto objeto;
	private Contato contato;

	public Reserva(String codigo, Date dataInicio, String status, Objeto objeto, Contato contato) {
		super();
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.status = status;
		this.objeto = objeto;
		this.contato = contato;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
	
}
