package net.ayushspring.ems.service;

import net.ayushspring.ems.dto.EmployeeDto;
import java.util.List ;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeID);


    List<EmployeeDto> getAllEmployees();


    EmployeeDto updateEmployee(Long employeeId , EmployeeDto updatedEmployee );

    void deleteEmployee(Long employeeId);
}
