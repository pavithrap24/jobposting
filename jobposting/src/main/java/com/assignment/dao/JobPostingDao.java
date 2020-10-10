package com.assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.assignment.model.JobPostingEntity;

public interface JobPostingDao extends CrudRepository<JobPostingEntity, Integer>{

}
