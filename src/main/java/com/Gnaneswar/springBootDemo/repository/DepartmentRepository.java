package com.Gnaneswar.springBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Gnaneswar.springBootDemo.Model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	public Department findByDepartmentName(String name);
	public Department findByDepartmentNameIgnoreCase(String name);
}
