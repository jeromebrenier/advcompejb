package edu.jbre.advcomp.authentification.service.impl;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import edu.jbre.advcomp.authentification.service.AuthentificationService;

@Alternative
@Stateless
public class AuthentificationServiceStrict implements AuthentificationService {


	@Override
	public Boolean authentifier(String login, String password) {
		return "tutu".equals(login);
	}

}
