package br.ufal.aracomp.fs.banco.exceptions;

public class ErroPrazoInvalido extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ErroPrazoInvalido(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}	

	public ErroPrazoInvalido(String mensagem) {
		super(mensagem);
	}	

}
