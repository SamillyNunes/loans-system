package br.ufal.aracomp.fs.banco.model;

import java.util.Date;

public class Emprestimo {
	private String codigo;
	private Date dataInicio;
	private Date dataFim;
	private Date dataDevolucao;
	private Objeto objeto;
	private Contato contato;

	public Emprestimo(String codigo, Date dataInicio, Date dataFim, Date dataDevolucao, Objeto objeto, Contato contato) {
		super();
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.dataDevolucao = dataDevolucao;
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

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
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
