package com.example.springBootAdvanceMapping.repository;

import com.example.springBootAdvanceMapping.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
