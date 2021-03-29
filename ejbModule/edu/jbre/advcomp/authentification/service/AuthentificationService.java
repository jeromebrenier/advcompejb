package edu.jbre.advcomp.authentification.service;

import javax.ejb.Local;

/**
 * Service d'authentification 
 */
@Local
public interface AuthentificationService {

	/**
	 * Authentification d'un utilisateur. retourne true si l'authentification a réussi et false sinon
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	public Boolean authentifier(String login, String password);
	
}
