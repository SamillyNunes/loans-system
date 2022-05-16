package br.ufal.aracomp.fs.banco.model;

public class Contato {
	private String codigo;
	private String email;
	private String nome;
	private String telefone;
	
	public Contato(String codigo, String email, String nome, String telefone) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
