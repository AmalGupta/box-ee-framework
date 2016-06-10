/**
 * 
 */
package com.poc.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.poc.dao.AuditBodMapDao;
import com.poc.domain.AudtbBodmap;

/**
 * @author amagupta
 *
 */
public class SampleService {
	
	private Logger logger = Logger.getLogger(SampleService.class);
	
	private String serviceId;
	
	private AuditBodMapDao auditBodMapDao;
	
	/**
	 * Service Method
	 */
	public void service(){
		logger.info("Within Service Method. Initiating DB Call");
		List<AudtbBodmap> list = auditBodMapDao.getAllEntities();
		
		for(AudtbBodmap item: list){
			/*Output added to logger for POC purposes*/
			logger.info(item.getId().getAubodname() + " | " + item.getId().getAutablename());
		}
	}
	
	
	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public AuditBodMapDao getAuditBodMapDao() {
		return auditBodMapDao;
	}

	public void setAuditBodMapDao(AuditBodMapDao auditBodMapDao) {
		this.auditBodMapDao = auditBodMapDao;
	}
}
