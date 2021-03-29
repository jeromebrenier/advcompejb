package edu.jbre.advcomp.core.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.authentification.service.AuthentificationService;
import edu.jbre.advcomp.authentification.service.UtilisateurService;
import edu.jbre.advcomp.core.service.AdvCompServer;
import edu.jbre.advcomp.core.service.AdvCompService;
import edu.jbre.advcomp.entity.Utilisateur;

/**
 * Server AdvCop utilisant le Provider de Guice à la place de la factory
 */
@Stateless
public class AdvCompServerImpl  implements AdvCompServer  {

	@Inject
	private AuthentificationService authentificationService;

	@Inject
	private UtilisateurService utilisateurService;
	
	// @Override
	public AdvCompService connexion(String login, String password) throws AdvcompException, NamingException {
		if(!authentificationService.authentifier(login, password)) {
			throw new AdvcompException("Echec authentification");
		} else {
			Utilisateur client = utilisateurService.obtenirUtilisateur(login);
			AdvCompService advCompService = 
			        (AdvCompService) InitialContext.doLookup("java:global/AdvCompEjb/AdvCompServiceImpl");
			advCompService.setClient(client);
		    return advCompService;
		}
	}

}
