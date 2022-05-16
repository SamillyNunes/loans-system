package br.ufal.aracomp.fs.banco.exceptions;

public class ErroGeral extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ErroGeral(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}	

	public ErroGeral(String mensagem) {
		super(mensagem);
	}	

}
