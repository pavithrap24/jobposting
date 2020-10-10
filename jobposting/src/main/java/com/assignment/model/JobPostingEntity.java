package com.assignment.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_job_posting")
public class JobPostingEntity {
	
	@Id
	private int jobId;
	
	private String jobRole;
	
	private String company;
	
	private String experience;
	
	private String jobDescription;
	
	private String postingLocation;
	
//	@ElementCollection
//	private List<String> requiredSkillsList;

	private String noticePeriod;
	
	private String user;
	
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getPostingLocation() {
		return postingLocation;
	}

	public void setPostingLocation(String postingLocation) {
		this.postingLocation = postingLocation;
	}

//	public List<String> getRequiredSkillsList() {
//		return requiredSkillsList;
//	}
//
//	public void setRequiredSkillsList(List<String> requiredSkillsList) {
//		this.requiredSkillsList = requiredSkillsList;
//	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
