package com.jshop.entity;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FunctionM generated by hbm2java
 */
@Entity
@Table(name = "function_m", catalog = "jshoper3")
public class FunctionM implements java.io.Serializable {

	private String id;
	private String visiturl;
	private String visitmethodname;
	private String functionname;
	private Date createtime;
	private String moduleid;

	public FunctionM() {
	}

	public FunctionM(String id, String visiturl, String visitmethodname,
			String functionname, Date createtime, String moduleid) {
		this.id = id;
		this.visiturl = visiturl;
		this.visitmethodname = visitmethodname;
		this.functionname = functionname;
		this.createtime = createtime;
		this.moduleid = moduleid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "VISITURL", nullable = false, length = 225)
	public String getVisiturl() {
		return this.visiturl;
	}

	public void setVisiturl(String visiturl) {
		this.visiturl = visiturl;
	}

	@Column(name = "VISITMETHODNAME", nullable = false, length = 100)
	public String getVisitmethodname() {
		return this.visitmethodname;
	}

	public void setVisitmethodname(String visitmethodname) {
		this.visitmethodname = visitmethodname;
	}

	@Column(name = "FUNCTIONNAME", nullable = false, length = 100)
	public String getFunctionname() {
		return this.functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "MODULEID", nullable = false, length = 20)
	public String getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(String moduleid) {
		this.moduleid = moduleid;
	}

}
