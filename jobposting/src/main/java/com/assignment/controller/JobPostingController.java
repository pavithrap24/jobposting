package com.assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.dao.JobPostingDao;
import com.assignment.model.JobPostingEntity;

@RestController
public class JobPostingController {
	
	@Autowired
	JobPostingDao jobPostingDao;
	
	/**
	 * getJobPosts method is used to get all jobs that are posted.
	 * @return List<JobPostingEntity>
	 */
	@GetMapping("/jobPosts")
	public List<JobPostingEntity> getJobPosts() {
		List<JobPostingEntity> list = (List<JobPostingEntity>) jobPostingDao.findAll();
		return list;
	}
	
	/**
	 * jobPost method is used to post job.
	 * @param JobPostingEntity
	 * @return JobPostingEntity
	 */
	@PostMapping(value="/jobPost", produces = "application/json")
	public JobPostingEntity jobPost(@Valid @RequestBody JobPostingEntity jobPostingEntity) {
		jobPostingDao.save(jobPostingEntity);
		return jobPostingEntity;
	}

}
