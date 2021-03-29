package edu.jbre.advcomp.facturation.service;

import java.util.Date;

import javax.ejb.Local;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.facturation.entity.Facture;

/**
 * Service dédié à la gestion de la facturation AdvComp
 */
@Local
public interface FacturationService {

	/**
	 * Enregistre l'opération réalisée par le client
	 * @param utilisateur
	 * @param descriptionOperation
	 */
	public void historiserOperation(Utilisateur client, String descriptionOperation) throws AdvcompException;
	
	/**
	 * Génère les factures pour tous les clients ayant 
	 * des opérations historisées non facturées sur la période
	 * 
	 * @param dateDebut
	 * @param datefin
	 */
	public void facturer(Date dateDebut, Date datefin) throws AdvcompException;
	
	/**
	 * Enregistrement du règlement d'une facture
	 * 
	 * @param numeroFacture
	 * @param rib
	 */
	public void reglerFacture(String numeroFacture, String rib) throws AdvcompException;
	
	/**
	 * Retourne une facture d'après son numéro
	 * @param numeroFacture
	 * @return
	 */
	public Facture obtenirFacture(String numeroFacture);
	
}
