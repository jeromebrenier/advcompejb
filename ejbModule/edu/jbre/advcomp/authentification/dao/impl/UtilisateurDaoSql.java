package edu.jbre.advcomp.authentification.dao.impl;

import java.util.Arrays;
import java.util.List;

import edu.jbre.advcomp.Role;
import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.authentification.dao.UtilisateurDao;
import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.entity.impl.UtilisateurImpl;

public class UtilisateurDaoSql implements UtilisateurDao {

	private Utilisateur utilisateur_toto = new UtilisateurImpl("toto", "secret", "Bob", "1 rue tutu", Role.CLIENT);

	@Override
	public Utilisateur create(Utilisateur utilisateur) throws AdvcompException {
		return utilisateur;
	}

	@Override
	public Utilisateur retrieve(String login) throws AdvcompException {
		if("toto".equals(login)) {
			return utilisateur_toto;
		} else {
			return null;			
		}
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) throws AdvcompException {
		return utilisateur;
	}

	@Override
	public void delete(Utilisateur utilisateur) throws AdvcompException {
	}

	@Override
	public List<Utilisateur> retrieveAll() throws AdvcompException {
		return Arrays.asList(utilisateur_toto);
	}

	@Override
	public Utilisateur getNew() {
		return new UtilisateurImpl();
	}

}
