package SpringCore.code;

public class Company {

	Employee employee;

//	public Company(Employee employee) {
//		
//		this.employee = employee;
//	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void show()
	{
		System.out.println("---->Employee Info <------");
		System.out.println("ID \tNAME \tSalary");
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
	}
	
}
