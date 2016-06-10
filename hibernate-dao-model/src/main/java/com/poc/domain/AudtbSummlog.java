package com.poc.domain;
// default package
// Generated Jun 7, 2016 5:01:25 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * AudtbSummlog generated by hbm2java
 */
public class AudtbSummlog implements java.io.Serializable {

	private String ausummlogidpk;
	private int aulogsequence;
	private String aubranchcode;
	private String auresourceid;
	private Date aucreationdttm;
	private String auuserid;
	private String auworkstation;
	private Integer auaction;
	private String auobjectid;
	private String auobjectdescription;
	private String auusertype;
	private String auchanneltype;
	private String ausessionid;
	private Date aubusinessdttm;

	public AudtbSummlog() {
	}

	public AudtbSummlog(String ausummlogidpk, int aulogsequence) {
		this.ausummlogidpk = ausummlogidpk;
		this.aulogsequence = aulogsequence;
	}

	public AudtbSummlog(String ausummlogidpk, int aulogsequence, String aubranchcode, String auresourceid,
			Date aucreationdttm, String auuserid, String auworkstation, Integer auaction, String auobjectid,
			String auobjectdescription, String auusertype, String auchanneltype, String ausessionid,
			Date aubusinessdttm) {
		this.ausummlogidpk = ausummlogidpk;
		this.aulogsequence = aulogsequence;
		this.aubranchcode = aubranchcode;
		this.auresourceid = auresourceid;
		this.aucreationdttm = aucreationdttm;
		this.auuserid = auuserid;
		this.auworkstation = auworkstation;
		this.auaction = auaction;
		this.auobjectid = auobjectid;
		this.auobjectdescription = auobjectdescription;
		this.auusertype = auusertype;
		this.auchanneltype = auchanneltype;
		this.ausessionid = ausessionid;
		this.aubusinessdttm = aubusinessdttm;
	}

	public String getAusummlogidpk() {
		return this.ausummlogidpk;
	}

	public void setAusummlogidpk(String ausummlogidpk) {
		this.ausummlogidpk = ausummlogidpk;
	}

	public int getAulogsequence() {
		return this.aulogsequence;
	}

	public void setAulogsequence(int aulogsequence) {
		this.aulogsequence = aulogsequence;
	}

	public String getAubranchcode() {
		return this.aubranchcode;
	}

	public void setAubranchcode(String aubranchcode) {
		this.aubranchcode = aubranchcode;
	}

	public String getAuresourceid() {
		return this.auresourceid;
	}

	public void setAuresourceid(String auresourceid) {
		this.auresourceid = auresourceid;
	}

	public Date getAucreationdttm() {
		return this.aucreationdttm;
	}

	public void setAucreationdttm(Date aucreationdttm) {
		this.aucreationdttm = aucreationdttm;
	}

	public String getAuuserid() {
		return this.auuserid;
	}

	public void setAuuserid(String auuserid) {
		this.auuserid = auuserid;
	}

	public String getAuworkstation() {
		return this.auworkstation;
	}

	public void setAuworkstation(String auworkstation) {
		this.auworkstation = auworkstation;
	}

	public Integer getAuaction() {
		return this.auaction;
	}

	public void setAuaction(Integer auaction) {
		this.auaction = auaction;
	}

	public String getAuobjectid() {
		return this.auobjectid;
	}

	public void setAuobjectid(String auobjectid) {
		this.auobjectid = auobjectid;
	}

	public String getAuobjectdescription() {
		return this.auobjectdescription;
	}

	public void setAuobjectdescription(String auobjectdescription) {
		this.auobjectdescription = auobjectdescription;
	}

	public String getAuusertype() {
		return this.auusertype;
	}

	public void setAuusertype(String auusertype) {
		this.auusertype = auusertype;
	}

	public String getAuchanneltype() {
		return this.auchanneltype;
	}

	public void setAuchanneltype(String auchanneltype) {
		this.auchanneltype = auchanneltype;
	}

	public String getAusessionid() {
		return this.ausessionid;
	}

	public void setAusessionid(String ausessionid) {
		this.ausessionid = ausessionid;
	}

	public Date getAubusinessdttm() {
		return this.aubusinessdttm;
	}

	public void setAubusinessdttm(Date aubusinessdttm) {
		this.aubusinessdttm = aubusinessdttm;
	}

}
