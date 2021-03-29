package edu.jbre.advcomp.calcul.service.impl;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import edu.jbre.advcomp.calcul.CalculException;
import edu.jbre.advcomp.calcul.service.CalculateurService;

@Alternative
@Stateless
public class CalculateurDebile implements CalculateurService {

	@Override
	public Double additionner(Double facteur1, Double facteur2) throws CalculException {
		return 12d;
	}

	@Override
	public Double soustraire(Double facteur1, Double facteur2) throws CalculException {
		return 44d;
	}

	@Override
	public Double multiplier(Double facteur1, Double facteur2) throws CalculException {
		return 66d;
	}

	@Override
	public Double diviser(Double facteur1, Double facteur2) throws CalculException {
		return 12d;
	}

}
