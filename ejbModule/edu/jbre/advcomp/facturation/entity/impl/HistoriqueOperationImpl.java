package edu.jbre.advcomp.facturation.entity.impl;

import java.util.Date;

import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.facturation.entity.Facture;
import edu.jbre.advcomp.facturation.entity.HistoriqueOperation;

public class HistoriqueOperationImpl implements HistoriqueOperation {

	/**
	 * Id de l'opération
	 */
	Long id;
	
	/**
	 * Date de l'opération
	 */
	Date date;
	
	/**
	 * Détail de l'opération
	 */
	String description;
	
	/**
	 * Utilisateur
	 */
	Utilisateur utilisateur;
	
	/**
	 * Facture si operation facturée
	 */
	Facture facture;
	

	public HistoriqueOperationImpl() {
	}

	public HistoriqueOperationImpl(Long id, Date date, String description) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	@Override
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	

}
