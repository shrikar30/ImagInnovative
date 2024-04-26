package service;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import dto.EmpTaxDeductionDTO;
import dto.EmployeeDTO;
import dto.ResponseDTO;
import model.Employee;
import repo.EmployeeRepository;

public interface EmployeeService {

	ResponseDTO<Employee> addDetails(EmployeeDTO employeeDTO);

//	ResponseDTO<EmpTaxDeductionDTO> fetchTaxDeductionDetails();

	ResponseDTO<EmpTaxDeductionDTO> fetchTaxDeductionDetails(EmployeeDTO dto);

}
