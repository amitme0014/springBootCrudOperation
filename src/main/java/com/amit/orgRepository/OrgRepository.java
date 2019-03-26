package com.amit.orgRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amit.pojo.OrganizationClass;

@Repository
public interface OrgRepository extends CrudRepository<OrganizationClass, Integer> {
	
	//public void createOrganizationTable();
	
	
	/*
	 * @Query(
	 * value="select * from OrganizationClass where orgId =? and industry =? and  orgName =?"
	 * ) OrganizationClass getOrganisationValue()
	 */
	

}
