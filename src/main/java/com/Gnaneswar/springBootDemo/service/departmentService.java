package com.Gnaneswar.springBootDemo.service;

import java.util.List;
import java.util.Optional;

import com.Gnaneswar.springBootDemo.Model.Department;

public interface departmentService {

	Department saveDepartment(Department department);

	List<Department> getAllDepartments();

	Optional<Department> getDepartmentById(Long departmentID);

	void deleteDepartmentId(Long departmentID);

	Department updateDepartment(Long departmentId, Department department);

	Department getDepartmentByName(String name);

}
