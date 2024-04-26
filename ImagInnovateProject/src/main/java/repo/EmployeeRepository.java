package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	Employee findByEmpId(String empId);
	
	
}
