package com.patika.springboot.business.services;

import com.patika.springboot.business.dto.EmployeeDto;
import com.patika.springboot.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {

    //CRUD
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id);
    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto);
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);


    //model mapper
    public EmployeeDto EntityToDto(EmployeeEntity employeeEntity);
    public EmployeeEntity DtoToEntity(EmployeeDto employeeDto);
}