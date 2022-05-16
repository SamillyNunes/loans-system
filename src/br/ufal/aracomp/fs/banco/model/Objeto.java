package br.ufal.aracomp.fs.banco.model;

public class Objeto {
	private String codigo;
	private String nome;
	private String descricao;
	private String status;	
	
	public Objeto(String codigo, String nome, String descricao, String status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
