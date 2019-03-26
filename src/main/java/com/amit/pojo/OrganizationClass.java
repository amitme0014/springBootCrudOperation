package com.amit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name= "organization")
public class OrganizationClass {
	
	@Id
	private Integer orgId;
	private String industry;
	private String orgName;
	
	public OrganizationClass() {
		
	}

	public OrganizationClass(Integer orgId, String industry, String orgName) {
		super();
		this.orgId = orgId;
		this.industry = industry;
		this.orgName = orgName;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	
	
	

}
