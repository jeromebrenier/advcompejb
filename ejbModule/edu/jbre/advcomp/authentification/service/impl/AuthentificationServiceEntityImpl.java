package edu.jbre.advcomp.authentification.service.impl;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.authentification.service.AuthentificationService;
import edu.jbre.advcomp.authentification.service.UtilisateurService;
import edu.jbre.advcomp.entity.Utilisateur;

@Default
@Stateless
public class AuthentificationServiceEntityImpl implements AuthentificationService {

	@Inject
	private UtilisateurService utilisateurService;
	
	public UtilisateurService getUtilisateurService() {
		return utilisateurService;
	}

	public void setUtilisateurService(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}

	@Override
	public Boolean authentifier(String login, String password) {
		try {
			Utilisateur utilisateur = getUtilisateurService().obtenirUtilisateur(login);
			return utilisateur != null && password != null && utilisateur.getPassword().equals(password);
		} catch (AdvcompException e) {
			e.printStackTrace();
			return false;
		}
	}

}
