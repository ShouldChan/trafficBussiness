package org.cxj.dao;

import java.util.List;

import org.cxj.bean.Accident;
/**
 * 
 * @author cxj
 * @date 2016-05-06
 * @date 2016-05-15
 */
public interface AccidentDao{
	
	//增加事故记录
	public void addAccident(Accident accident);
	//删除事故记录
	public void deleteAccident(String accidentId);
	//修改事故记录
	public void updateAccident(Accident accident);
	//查询事故记录
	public Accident selectAccident(String accidentId);
	//分页显示事故记录
	public List<Accident> list(int start,int offset);
	
}
