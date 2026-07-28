package com.Gnaneswar.springBootDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;   // <-- Important
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.Gnaneswar.springBootDemo.Model.Department;
import com.Gnaneswar.springBootDemo.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private departmentService departmentService;

    @MockitoBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department dept = Department.builder()
                .departmentAddress("Hyderabad")
                .departmentCode("IT-098")
                .departmentName("IT")
                .depatment(3)   // <-- Fix field name
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(dept);
    }

    @Test   // <-- Add this
    @DisplayName("get Data based on valid Department Name")
    void whenValidDepartment_thenDepartmentShouldFound() {
        String departmentName = "IT";
        Department found = departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}
