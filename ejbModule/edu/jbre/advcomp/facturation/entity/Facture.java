package edu.jbre.advcomp.facturation.entity;

import java.util.Date;

import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.fmk.persistence.Entity;

/**
 * Entité Facture
 */
public interface Facture extends Entity {
	
	public Utilisateur getUtilisateur();
	
	public void setUtilisateur(Utilisateur utilisateur);	
	
	public String getNumero();
	
	public void setNumero(String numero);
	
	public Date getDate();
	
	public void setDate(Date date);
	
	public double getMontant();
	
	public void setMontant(double montant);
	
	public boolean isSoldee();
	
	public void setSoldee(boolean soldee);
	
}
