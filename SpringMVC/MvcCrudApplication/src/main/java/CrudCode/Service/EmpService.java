package CrudCode.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CrudCode.Repository.EmpRepo;
import CurdCode.Model.Employee;

@Service("empservice")

public class EmpService {

	@Autowired
	EmpRepo empRepo;
	
	public boolean issave(Employee emp) {
		
		
		return empRepo.issave(emp);
		
		
	}
	public List<Employee> getAllEmployee(){
		
		return empRepo.getAllEmployee();
		
		
	}
	public boolean EmpDeleteById(int Id) {
		empRepo.EmpDeleteById(Id);
		return false;
		
	}
	public List<Employee> Search (String name){
		return empRepo.Search(name);
	}
	
	
	
	
	
}
