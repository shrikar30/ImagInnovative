package serviceImpl;

import java.util.Iterator;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.EmpTaxDeductionDTO;
import dto.EmployeeDTO;
import dto.ResponseDTO;
import model.Employee;
import repo.EmployeeRepository;
import service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ResponseDTO<Employee> addDetails(EmployeeDTO employeeDTO) {
		try {
			Employee employee = employeeRepository.findByEmpId(employeeDTO.getEmpId());
			if (Objects.isNull(employee)) {
				employee = new Employee();
				employee.setEmpId(employeeDTO.getEmpId());
				employee.setDoj(employeeDTO.getDoj());
				employee.setEmail(employeeDTO.getEmail());
				employee.setFirstName(employeeDTO.getFirstName());
				employee.setLastName(employeeDTO.getLastName());
				employee.setPhoneNumber(employeeDTO.getPhoneNumber());
				employee.setYearlySalary(
						employeeDTO.getSalary() * 12 - (employeeDTO.getLeaves() * employeeDTO.getSalary() / 30));
				return new ResponseDTO<>(true, "Employee Joined Succesfully", employee);
			} else {
				return new ResponseDTO<>(false, "Employee Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDTO<>(false, "Exception - " + e.getMessage());
		}
	}

	@Override
	public ResponseDTO<EmpTaxDeductionDTO> fetchTaxDeductionDetails(EmployeeDTO employeeDTO) {
		try {
			long salary = employeeDTO.getSalary();
			long tax = 0;
			long salary1;
			if (salary > 250000) {
				salary1 = 250000;
				if (salary < 500000)
					salary1 = salary - 250000;
				tax = (long) (tax + (5.0f / 100.0f * salary1));
			}
			if (salary > 500000) {
				salary1 = 500000;
				if (salary < 1000000)
					salary1 = salary - 500000;
				tax = (long) (tax + (10.0f / 100.0f * salary1));
			}
			if (salary > 1000000) {
				tax = (long) (tax + (20.0f / 100.0f * (salary - 1000000)));
			}
			EmpTaxDeductionDTO deductionDTO = new EmpTaxDeductionDTO();
			deductionDTO.setEmpId(employeeDTO.getEmpId());
			deductionDTO.setFirstName(employeeDTO.getFirstName());
			deductionDTO.setLastName(employeeDTO.getLastName());
			deductionDTO.setTaxAmount(tax);
			deductionDTO.setYearlySalary(salary);
			deductionDTO.setCessAmount(salary > 2500000 ? 2 / 100 * (salary - 2500000) : 0);
			return new ResponseDTO<>(true, "Details Fetched", deductionDTO);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDTO<>(false, "Exception -" + e.getMessage());
		}
	}
}
