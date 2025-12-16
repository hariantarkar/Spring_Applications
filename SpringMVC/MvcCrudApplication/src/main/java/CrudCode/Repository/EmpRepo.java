package CrudCode.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import CurdCode.Model.Employee;

@Repository("empRepo")
public class EmpRepo {

	@Autowired
	
	JdbcTemplate template;
	public boolean issave(Employee emp) {
		
		int value=template.update("insert into employee (name, email, contact) values(?,?,?)",new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps)throws SQLException{
				
				ps.setString(1,emp.getName());
				ps.setString(2,emp.getEmail());
				ps.setInt(3,emp.getContact());
				
			}
			
		});
		return value>0 ? true : false;	
	}
	
	public List <Employee> getAllEmployee(){
		
		List<Employee> list=template.query("select *from employee",new RowMapper<Employee>() {
			

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setContact(rs.getInt(4));
				
				return e;
			}
		
		}
	);
		return list;
		
	
	
}
	
public boolean EmpDeleteById(int Id) {
	int value=template.update("delete from employee where Id=?",new Object[] {Id});
	
	return value>0 ?true : false;
	
	
}

public List<Employee> Search(String name) {
	
	List<Employee>list=template.query("select *from employee where name like '%"+name+"%'",  new  RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

			Employee emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setContact(rs.getInt(4));
			return emp;
			
			
		}
		
	});
	return list;
	
}










}


