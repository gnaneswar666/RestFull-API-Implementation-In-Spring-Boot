package com.Gnaneswar.springBootDemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long depatment;
	@NotBlank(message = "Please Enter The Departmant name in  The request")
	//@Length(max =10)
	//@Size(max=20,min=5 ,message="hello enter the department Name between 5 to 10 length size")
	//@Email(regexp = "^[a-zA-Z]{5,10}@gmail\\.(com|in)$" , message = "hello enter the Email corrrectly")
	
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
//	public long getDepatment() {
//		return depatment;
//	}
//	public void setDepatment(long depatment) {
//		this.depatment = depatment;
//	}
//	public String getDepartmentName() {
//		return departmentName;
//	}
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//	public String getDepartmentAddress() {
//		return departmentAddress;
//	}
//	public void setDepartmentAddress(String departmentAddress) {
//		this.departmentAddress = departmentAddress;
//	}
//	public String getDepartmentCode() {
//		return departmentCode;
//	}
//	public void setDepartmentCode(String departmentCode) {
//		this.departmentCode = departmentCode;
//	}
	
	
	
}
