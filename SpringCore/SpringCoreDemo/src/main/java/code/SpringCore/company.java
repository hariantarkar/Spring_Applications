package code.SpringCore;

public class company {

	private Employee employee;

	
	public company(Employee employee) {
		
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void show()
	{
	
		System.out.println(employee.getId()+"\t" +employee.getName() +"\t"+employee.getAddress());
		
		
	}
}
