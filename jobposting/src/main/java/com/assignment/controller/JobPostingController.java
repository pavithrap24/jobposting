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
	
	@GetMapping("/getJobPosts")
	public List<JobPostingEntity> getJobPosts() {
		List<JobPostingEntity> list = (List<JobPostingEntity>) jobPostingDao.findAll();
		return list;
	}
	
	@PostMapping(value="/jobPost", produces = "application/json")
	public JobPostingEntity jobPost(@Valid @RequestBody JobPostingEntity jobPostingEntity) {
		jobPostingDao.save(jobPostingEntity);
		return jobPostingEntity;
	}

}
