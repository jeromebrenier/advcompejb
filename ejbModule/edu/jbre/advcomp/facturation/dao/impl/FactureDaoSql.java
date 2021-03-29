package edu.jbre.advcomp.facturation.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.facturation.dao.FactureDao;
import edu.jbre.advcomp.facturation.entity.Facture;
import edu.jbre.advcomp.facturation.entity.impl.FactureImpl;

@Stateless
public class FactureDaoSql implements FactureDao {

	@Override
	public Facture create(Facture entity) throws AdvcompException {
		return entity;
	}

	@Override
	public Facture retrieve(String id) throws AdvcompException {
		return null;
	}

	@Override
	public Facture update(Facture entity) throws AdvcompException {
		return entity;
	}

	@Override
	public void delete(Facture entity) throws AdvcompException {
	}

	@Override
	public List<Facture> retrieveAll() throws AdvcompException {
		return new ArrayList<Facture>();
	}

	@Override
	public Facture getNew() throws AdvcompException {
		return new FactureImpl();
	}

}
