package edu.jbre.advcomp.core.service;

import javax.ejb.Remote;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.calcul.service.CalculateurService;
import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.facturation.service.FacturationService;

/**
 * Service pour les client utilisateur d'AdvComp 
 *
 */
@Remote
public interface AdvCompService {

	public void setClient(Utilisateur client);
	
	public void setCalculateurService(CalculateurService calculateurService);
	
	public void setFacturationService(FacturationService facturationService);
	
	/**
	 * Réalise un calcul basique en utilisant AdvComp
	 * 
	 * @param facteur1
	 * @param facteur2
	 * @param operateur
	 * @return
	 * @throws AdvcompException
	 */
	public Double faireOperationBasique(Double facteur1, Double facteur2, String operateur) throws AdvcompException;
	
}
