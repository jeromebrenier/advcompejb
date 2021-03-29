package edu.jbre.advcomp.authentification.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.authentification.dao.UtilisateurDao;
import edu.jbre.advcomp.authentification.service.UtilisateurService;
import edu.jbre.advcomp.entity.Utilisateur;

/**
 * Implémentation Utilisateur Service utilisant un Dao 
 */
@Stateless
public class UtilisateurServiceImpl implements UtilisateurService {

	@Inject
	private UtilisateurDao utilisateurDao;

	@Override
	public Utilisateur obtenirUtilisateur(String login) throws AdvcompException {
		return utilisateurDao.retrieve(login);
	}

	@Override
	public Utilisateur creerUtilisateur(Utilisateur utilisateur) throws AdvcompException {
		return utilisateurDao.create(utilisateur);
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws AdvcompException {
		return utilisateurDao.update(utilisateur);
	}

	@Override
	public void supprimerUtilisateur(Utilisateur utilisateur) throws AdvcompException{
		utilisateurDao.delete(utilisateur);
	}

	@Override
	public Utilisateur getNewUtilisateur() throws AdvcompException {
		return utilisateurDao.getNew();
	}

}
