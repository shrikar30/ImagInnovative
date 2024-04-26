package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.EmpTaxDeductionDTO;
import dto.EmployeeDTO;
import dto.ResponseDTO;
import model.Employee;
import service.EmployeeService;

@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseDTO<Employee> addDetails(EmployeeDTO employeeDTO) {
		return employeeService.addDetails(employeeDTO);
	}
	
	@PostMapping("/tax")
	public ResponseDTO<EmpTaxDeductionDTO> empTaxDeduction(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.fetchTaxDeductionDetails(employeeDTO);
	}
}
