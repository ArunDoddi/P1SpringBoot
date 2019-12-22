package com.onmobile.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TableDat {
	
	private String name;
	private String myTeam;
	private String myOperator;
	private String myLocation;
	private String rTime;
	private String eTime;
	@Id
	private int iId;
	private int pId;
	private String impact;
	private String rimpact;
	private String incident;
	private String at;
	private String nxtupdt;
	private String stat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(String myTeam) {
		this.myTeam = myTeam;
	}
	public String getMyOperator() {
		return myOperator;
	}
	public void setMyOperator(String myOperator) {
		this.myOperator = myOperator;
	}
	public String getMyLocation() {
		return myLocation;
	}
	public void setMyLocation(String myLocation) {
		this.myLocation = myLocation;
	}
	public String getrTime() {
		return rTime;
	}
	public void setrTime(String rTime) {
		this.rTime = rTime;
	}
	public String geteTime() {
		return eTime;
	}
	public void seteTime(String eTime) {
		this.eTime = eTime;
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getRimpact() {
		return rimpact;
	}
	public void setRimpact(String rimpact) {
		this.rimpact = rimpact;
	}
	public String getIncident() {
		return incident;
	}
	public void setIncident(String incident) {
		this.incident = incident;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public String getNxtupdt() {
		return nxtupdt;
	}
	public void setNxtupdt(String nxtupdt) {
		this.nxtupdt = nxtupdt;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	@Override
	public String toString() {
		return "TableDat [name=" + name + ", myTeam=" + myTeam + ", myOperator=" + myOperator + ", myLocation="
				+ myLocation + ", rTime=" + rTime + ", eTime=" + eTime + ", iId=" + iId + ", pId=" + pId + ", impact="
				+ impact + ", rimpact=" + rimpact + ", incident=" + incident + ", at=" + at + ", nxtupdt=" + nxtupdt
				+ ", stat=" + stat + "]";
	}
	
	
}
