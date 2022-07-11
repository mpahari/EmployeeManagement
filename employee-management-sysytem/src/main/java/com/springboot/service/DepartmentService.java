package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.DepartmentDto;
import com.springboot.entities.Department;

@Service
public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	List<Department> findAll();
	DepartmentDto findByid(Integer Id);
	void deleteDepartmentById(Integer Id);
}
