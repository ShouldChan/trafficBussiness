package org.cxj.service;

import java.util.List;

import org.cxj.bean.Trafficoffense;

/**
 * 
 * @author cxj
 * @date 2016-05-07
 * @date 2016-05-15
 */
public interface TrafficoffenseService {
	//新增违章记录
	public void addTrafficoffense(Trafficoffense trafficoffense);
	//删除违章记录
	public void deleteTrafficoffense(String plateNo);
	//修改违章记录
	public void updateTrafficoffense(Trafficoffense trafficoffense);
	//查询违章记录
	public Trafficoffense selectTrafficoffense(String plateNo);
	//分页显示违章记录
	public List<Trafficoffense> list(int start,int offset);

}
