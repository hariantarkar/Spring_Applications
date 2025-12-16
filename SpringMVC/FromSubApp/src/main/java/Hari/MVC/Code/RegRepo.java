package Hari.MVC.Code;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository("regrepo")
public class RegRepo {

	@Autowired 
	
	JdbcTemplate template;
	
	public boolean isSave(final Register model) {
		
		 int value=template.update("insert into  employee values(?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				 ps.setString(1,model.getName());
				 ps.setString(2,model.getEmail());
				 ps.setInt(3,model.getContact());
				
			}
			 
			 
		 });return value>0?true:false;
		 
		 
					
	}
	

}
