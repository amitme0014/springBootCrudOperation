package com.amit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amit.orgRepository.OrgRepository;
import com.amit.pojo.OrganizationClass;

@Service
public class OrganizationService {

@Autowired
private OrgRepository orgRepository;

	/*
	 * @Autowired private OrganizationClass organizationClass;
	 */

public void createOrgTableWithSomeData(OrganizationClass organizationClass) {
	
	//OrganizationClass organizationClass=new OrganizationClass(3, "IT", "GE");
	orgRepository.save(organizationClass);
	//orgRepository.saveAll(organizationClass);
	
	
}


public OrganizationClass getDataById(Integer orgId) {
	// TODO Auto-generated method stub
	return orgRepository.findById(orgId).orElseGet(OrganizationClass::new);
}
	

}
