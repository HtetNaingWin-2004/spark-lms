package com.spark.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spark.lms.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
	public List<Issue> findByReturned(Integer returned);
}
