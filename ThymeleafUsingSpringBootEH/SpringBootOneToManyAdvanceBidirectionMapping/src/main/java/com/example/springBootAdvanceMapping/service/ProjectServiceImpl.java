package com.example.springBootAdvanceMapping.service;

import com.example.springBootAdvanceMapping.entity.Employee;
import com.example.springBootAdvanceMapping.entity.Project;
import com.example.springBootAdvanceMapping.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{
    private ProjectRepository projectRepository;
    @Autowired

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Employee findByCourseId(Integer course_Id) {
        Optional<Project> project = projectRepository.findById(course_Id);
        return project.get().getEmployee();
    }
}
