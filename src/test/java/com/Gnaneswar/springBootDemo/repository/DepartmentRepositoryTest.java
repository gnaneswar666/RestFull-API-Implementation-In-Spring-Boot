//package com.Gnaneswar.springBootDemo.repository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.Gnaneswar.springBootDemo.Model.Department;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//
//@DataJpaTest
//class DepartmentRepositoryTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    @Test
//    void testSaveAndFindDepartment() {
//        Department dept = new Department();
//        dept.setDepartmentName("Engineering");
//        entityManager.persist(dept);
//        entityManager.flush();
//
//        Department found = departmentRepository.findById(dept.getId()).orElse(null);
//        assert found != null;
//        assert found.getDepartmentName().equals("Engineering");
//    }
//}
