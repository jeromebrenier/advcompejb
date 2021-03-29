package edu.jbre.advcomp.facturation.entity;

import java.util.Date;

import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.fmk.persistence.Entity;

public interface HistoriqueOperation extends Entity {
		
	Long getId();
	void setId(Long id);
	
	Date getDate();
	void setDate(Date date);
	
	String getDescription();
	void setDescription(String description);
	
	Utilisateur getUtilisateur();
	void setUtilisateur(Utilisateur utilisateur);

	public Facture getFacture();
	public void setFacture(Facture facture);
	
}
