package edu.jbre.advcomp.facturation.entity.impl;

import java.util.Date;

import edu.jbre.advcomp.entity.Utilisateur;
import edu.jbre.advcomp.facturation.entity.Facture;

/**
 * Entité Facture : une facture du client AdvComp
 */
public class FactureImpl implements Facture {

	private Utilisateur utilisateur;
	
	private String numero;
	private Date date;
	private double montant;
	private boolean soldee;
	
	public FactureImpl() {
		
	}
	
	public FactureImpl(Utilisateur utilisateur, String numero, Date date, double montant, boolean soldee) {
		super();
		this.setUtilisateur(utilisateur);
		this.numero = numero;
		this.date = date;
		this.montant = montant;
		this.soldee = soldee;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public boolean isSoldee() {
		return soldee;
	}
	public void setSoldee(boolean soldee) {
		this.soldee = soldee;
	}

	@Override
	public String toString() {
		return "FactureImpl [utilisateur=" + utilisateur + ", numero=" + numero + ", date=" + date + ", montant="
				+ montant + ", soldee=" + soldee + "]";
	}
	
}
