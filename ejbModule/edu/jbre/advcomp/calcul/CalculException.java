/**
 * 
 */
package edu.jbre.advcomp.calcul;

/**
 * @author errei
 *
 */
@SuppressWarnings("serial")
public class CalculException extends Exception {
	
	private String codeErreur = "999";
	
	public CalculException() {
		super();
	}

	public CalculException(String message) {
		super(message);
	}

	public CalculException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalculException(String message, Throwable cause, String codeErreur) {
		this(message, cause);
		this.codeErreur = codeErreur;
	}

	public String getCodeErreur() {
		return codeErreur;
	}

	public void setCodeErreur(String codeErreur) {
		this.codeErreur = codeErreur;
	}

}
