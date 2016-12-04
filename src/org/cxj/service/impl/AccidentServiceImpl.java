package org.cxj.service.impl;

import java.util.List;

import org.cxj.bean.Accident;
import org.cxj.dao.AccidentDao;
import org.cxj.service.AccidentService;

/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-15
 */
public class AccidentServiceImpl implements AccidentService{
	private AccidentDao accidentDao;

	public AccidentDao getAccidentDao() {
		return accidentDao;
	}

	public void setAccidentDao(AccidentDao accidentDao) {
		this.accidentDao = accidentDao;
	}

	public void addAccident(Accident accident){
		accidentDao.addAccident(accident);
	}
	public void deleteAccident(String accidentId){
		accidentDao.deleteAccident(accidentId);
	}
	public void updateAccident(Accident accident){
		accidentDao.updateAccident(accident);
	}
	public Accident selectAccident(String accidentId){
		return accidentDao.selectAccident(accidentId);
	}
	public List<Accident> list(int start,int offset){
		return accidentDao.list(start, offset);
	}
}
