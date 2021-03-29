package edu.jbre.advcomp.core.service.impl;

import javax.ejb.Stateful;
import javax.inject.Inject;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.calcul.CalculException;
import edu.jbre.advcomp.calcul.service.CalculateurService;
import edu.jbre.advcomp.core.service.AdvCompService;
import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.facturation.service.FacturationService;

/**
 * Service Stateful : 1 instance par utilisateur
 * @author pp
 *
 */
@Stateful
public class AdvCompServiceImpl implements AdvCompService {

	private Utilisateur client;
	
	@Inject
	private FacturationService facturationService;
	
	@Inject
	private CalculateurService calculateurService;	
	
	public void setClient(Utilisateur client) {
		this.client = client;
	}

	public void setCalculateurService(CalculateurService calculateurService) {
		this.calculateurService = calculateurService;
	}

	public void setFacturationService(FacturationService facturationService) {
		this.facturationService = facturationService;
	}
	
	@Override
	public Double faireOperationBasique(Double facteur1, Double facteur2, String operateur) throws AdvcompException {
		
		try {
			Double resultat;
			
			String descriptionOperation = facteur1 + " " + operateur + " " + facteur2;
			
			// Calcul
			switch (operateur) {
			case "+":
				resultat = calculateurService.additionner(facteur1, facteur2);
				break;
			case "-":
				resultat = calculateurService.soustraire(facteur1, facteur2);
				break;
			case "*":
				resultat = calculateurService.multiplier(facteur1, facteur2);
				break;
			case "/":
				resultat = calculateurService.diviser(facteur1, facteur2);
				break;
			default:
				throw new AdvcompException("Opérateur " + operateur + " Non géré.");
			}
			
			// Historisation
			facturationService.historiserOperation(client, descriptionOperation);
			
			return resultat;
		
		} catch (CalculException e) {
			e.printStackTrace();
			throw new AdvcompException("Echec Calcul", e);
			
		} catch (AdvcompException e) {
			throw e;
		}
	}
}
