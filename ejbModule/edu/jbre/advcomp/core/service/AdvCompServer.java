package edu.jbre.advcomp.core.service;

import javax.ejb.Remote;
import javax.naming.NamingException;

import edu.jbre.advcomp.authentification.AdvcompException;

/**
 * Serveur fournisseur de service {@link AdvCompService} aux client autherntifiés
 * @author pp
 *
 */
@Remote
public interface AdvCompServer {

	/**
	 * Traite la demande de connexion d'un client et lui retourne un {@link AdvCompService} si l'authentification a abouti
	 * dans les autres cas une {@link AdvcompException} est lev�e.
	 * 
	 * @param login le login de connexion
	 * @param password le mot de passe de connexion
	 * @return le service de calcul (AdvCompService)
	 * @throws AdvcompException
	 * @throws NamingException 
	 */
	public AdvCompService connexion(String login, String password) throws AdvcompException, NamingException;

}
