package com.Gnaneswar.springBootDemo.error;

public class DepartmentNameNotFound extends Exception{

	public DepartmentNameNotFound(String msg){
		super(msg);
	}
}
