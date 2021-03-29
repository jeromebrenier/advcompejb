package edu.jbre.advcomp.facturation.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import edu.jbre.advcomp.facturation.entity.HistoriqueOperation;
import edu.jbre.fmk.persistence.EntityDao;

@Local
public interface HistoriqueOperationDao extends EntityDao<HistoriqueOperation, Long> {

	List<HistoriqueOperation> getOperationAFacturer(Date dateDebut, Date datefin);

}
