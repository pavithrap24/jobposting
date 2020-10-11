package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tbl_job_posting")
public class JobPostingEntity {
	
	@Id
	@GeneratedValue
	private long jobId;
	
	@NotBlank(message="jobRole cannot be empty")
	private String jobRole;
	
	@NotBlank(message="company cannot be empty")
	private String company;
	
	private String experience;
	
	private String jobDescription;

	private String postingLocation;

	private String noticePeriod;
	
	@NotBlank(message="user cannot be empty")
	private String user;

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
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
