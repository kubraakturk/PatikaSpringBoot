package com.patika.springboot.data.repository;

import com.patika.springboot.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository>CrudRepository
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
