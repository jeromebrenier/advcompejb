package edu.jbre.advcomp.facturation.dao;

import javax.ejb.Local;

import edu.jbre.advcomp.facturation.entity.Facture;
import edu.jbre.fmk.persistence.EntityDao;

@Local
public interface FactureDao extends EntityDao<Facture, String> {

}
