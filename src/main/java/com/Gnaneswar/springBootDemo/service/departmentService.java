package com.Gnaneswar.springBootDemo.service;

import java.util.List;
import java.util.Optional;

import com.Gnaneswar.springBootDemo.Model.Department;
import com.Gnaneswar.springBootDemo.error.DepartmentNameNotFound;
import com.Gnaneswar.springBootDemo.error.DepartmentNotFoundException;

public interface departmentService {

	Department saveDepartment(Department department);

	List<Department> getAllDepartments();

	Department getDepartmentById(Long departmentID) throws DepartmentNotFoundException;

	void deleteDepartmentId(Long departmentID);

	Department updateDepartment(Long departmentId, Department department);

	Department getDepartmentByName(String name) ;

}
