package com.newer.domain;

import java.io.Serializable;


public class XunJia implements Serializable{

	private Integer id;
	private  Integer zt;
	private  Integer deltag;
	private  Integer gysid;
	private  String gysmc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getZt() {
		return zt;
	}

	public void setZt(Integer zt) {
		this.zt = zt;
	}

	public Integer getDeltag() {
		return deltag;
	}

	public void setDeltag(Integer deltag) {
		this.deltag = deltag;
	}

	public Integer getGysid() {
		return gysid;
	}

	public void setGysid(Integer gysid) {
		this.gysid = gysid;
	}

	public String getGysmc() {
		return gysmc;
	}

	public void setGysmc(String gysmc) {
		this.gysmc = gysmc;
	}
}
