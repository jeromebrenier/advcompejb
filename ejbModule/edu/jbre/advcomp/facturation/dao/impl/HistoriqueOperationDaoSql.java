package edu.jbre.advcomp.facturation.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import edu.jbre.advcomp.authentification.AdvcompException;
import edu.jbre.advcomp.facturation.dao.HistoriqueOperationDao;
import edu.jbre.advcomp.facturation.entity.HistoriqueOperation;
import edu.jbre.advcomp.facturation.entity.impl.HistoriqueOperationImpl;

@Stateless
public class HistoriqueOperationDaoSql implements HistoriqueOperationDao {

	@Override
	public HistoriqueOperation create(HistoriqueOperation entity) throws AdvcompException {
		return entity;
	}

	@Override
	public HistoriqueOperation retrieve(Long id) throws AdvcompException {
		return null;
	}

	@Override
	public HistoriqueOperation update(HistoriqueOperation entity) throws AdvcompException {
		return entity;
	}

	@Override
	public void delete(HistoriqueOperation entity) throws AdvcompException {
	}

	@Override
	public List<HistoriqueOperation> retrieveAll() throws AdvcompException {
		return new ArrayList<HistoriqueOperation>();
	}

	@Override
	public HistoriqueOperation getNew() throws AdvcompException {
		return new HistoriqueOperationImpl();
	}

	@Override
	public List<HistoriqueOperation> getOperationAFacturer(Date dateDebut, Date datefin) {
		return new ArrayList<>();
	}

}
