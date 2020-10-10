package com.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping("/jobPost")
	public JobPostingEntity jobPost(JobPostingEntity jobPostingEntity) {
		jobPostingDao.save(jobPostingEntity);
		return jobPostingEntity;
	}

}
