package edu.jbre.advcomp.entity;

import edu.jbre.advcomp.Role;
import edu.jbre.fmk.persistence.Entity;

public interface Utilisateur extends Entity {

	String getLogin();

	void setLogin(String login);

	String getPassword();

	void setPassword(String password);

	String getNom();

	void setNom(String nom);

	String getAdresse();

	void setAdresse(String adresse);

	Role getRole();

	void setRole(Role role);

}