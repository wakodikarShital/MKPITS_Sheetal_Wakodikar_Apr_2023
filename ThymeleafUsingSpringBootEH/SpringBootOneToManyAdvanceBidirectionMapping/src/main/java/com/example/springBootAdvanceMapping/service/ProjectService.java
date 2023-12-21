package com.example.springBootAdvanceMapping.service;

import com.example.springBootAdvanceMapping.entity.Employee;

import java.util.List;

public interface ProjectService {
    Employee findByCourseId(Integer course_Id);
}
