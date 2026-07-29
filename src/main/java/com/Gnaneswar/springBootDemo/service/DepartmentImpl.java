package com.Gnaneswar.springBootDemo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gnaneswar.springBootDemo.Model.Department;
import com.Gnaneswar.springBootDemo.error.DepartmentNameNotFound;
import com.Gnaneswar.springBootDemo.error.DepartmentNotFoundException;
import com.Gnaneswar.springBootDemo.repository.DepartmentRepository;

@Service
public class DepartmentImpl implements departmentService{

	@Autowired
	private DepartmentRepository repo;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		 
		return repo.save(department);
	}
	@Override
	public List<Department> getAllDepartments(){
		return repo.findAll();
	}
	@Override
	public Department getDepartmentById(Long DepartmentId) throws DepartmentNotFoundException{
		 Optional<Department> dept=repo.findById(DepartmentId); 
		 if(!dept.isPresent()) {
			 throw new DepartmentNotFoundException("Department Not Found");
		 }
		 return dept.get();
		 
	}
	@Override
	public void deleteDepartmentId(Long departmentId) {
		repo.deleteById(departmentId);
	}
	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		
		Department deptFromDb=repo.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentCode())&&
			!"".equalsIgnoreCase(department.getDepartmentCode())) {
			deptFromDb.setDepartmentCode(department.getDepartmentCode());
		}
		if(Objects.nonNull(department.getDepartmentName())&&
				!"".equalsIgnoreCase(department.getDepartmentName())) {
				deptFromDb.setDepartmentName(department.getDepartmentName());
			}
		if(Objects.nonNull(department.getDepartmentAddress())&&
				!"".equalsIgnoreCase(department.getDepartmentAddress())) {
				deptFromDb.setDepartmentAddress(department.getDepartmentAddress());
			}
		 
		return repo.save(deptFromDb);
	}
	@Override
	public Department getDepartmentByName(String name)  {
		// TODO Auto-generated method stub
		return  repo.findByDepartmentNameIgnoreCase(name);
		
	}
	
}
