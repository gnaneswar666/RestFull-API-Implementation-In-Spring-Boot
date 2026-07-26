package com.Gnaneswar.springBootDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gnaneswar.springBootDemo.Model.Department;
import com.Gnaneswar.springBootDemo.service.departmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private departmentService service;
	@PostMapping()
	public Department saveDepartment(@Valid @RequestBody Department department){
	
	return service.saveDepartment(department);
	}
	
	
	@GetMapping
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
	@GetMapping("/{departmentID}")
	public Department getDepartmentByID(@PathVariable Long departmentID) {
		Optional<Department> dept= service.getDepartmentById(departmentID);
		return dept.orElse(new Department());
		}

	@DeleteMapping("/{departmentID}")
	public String deleteDepartmentByID(@PathVariable Long departmentID) {
		
		service.deleteDepartmentId(departmentID);
		return "Department Deleted Succesfully";
	}
	
	@PutMapping("/{departmentId}")
	public Department updateDepartment(@PathVariable Long departmentId,@RequestBody Department department) {
		return service.updateDepartment(departmentId,department);
	}
	@GetMapping("/name/{name}")
	public Department getDepartmentByName(@PathVariable String name) {
		return service.getDepartmentByName(name);
	}
}
