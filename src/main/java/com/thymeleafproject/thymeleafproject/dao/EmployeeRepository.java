package com.thymeleafproject.thymeleafproject.dao;


import com.thymeleafproject.thymeleafproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
