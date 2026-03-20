package com.example.SpringSecond.repository;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.SpringSecond.model.EmployeeModel;



@Repository("empRepo")
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate template;
	
	
	public boolean isSave(EmployeeModel employee) {
		
		int value=template.update("insert into employee values ('0',?,?)",
				new Object[] {employee.getName(),employee.getSal()});
			return value>0?true:false;
		}
	public List<EmployeeModel> getAllEmployees(){
		List<EmployeeModel>list=template.query("select *from employee", new RowMapper<EmployeeModel>() {

			@Override
			public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				EmployeeModel emp=new EmployeeModel();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSal(rs.getInt(3));
				return emp;
			}
			
		});
		return list;
	}
	public EmployeeModel getEmployeeById(int empid) {
		@SuppressWarnings("deprecation")
		List list=template.query("select *from employee where id=?",new Object[] {empid},new RowMapper<EmployeeModel>(){

			@Override
			public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeModel emp=new EmployeeModel();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSal(rs.getInt(3));
				
				return emp;
			}
			
		});
		return list.size()>0? (EmployeeModel) list.get(0):null;
		
	}
	public EmployeeModel UpdateEmployee(int empid,EmployeeModel emp) {
		int value=template.update("update employee set name=?,sal=? where id=?",new Object[] {emp.getName(),emp.getSal(),empid});
		return value>0?emp:null;
	}
	public boolean isDelete(int empid) {
		int result=template.update("delete from employee where id="+empid);
		return result>0?true:false;
	}
	
	public Page<EmployeeModel>findAll(Pageable pageable){
		int total=template.queryForObject("select count(*) from employee",Integer.class);
		List<EmployeeModel>list=template.query("select *from employee order by id limit ? offset ?", new RowMapper<EmployeeModel>() {

			@Override
			public @Nullable EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeModel emp=new EmployeeModel();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSal(rs.getInt(3));
				return emp;
				
			}
		},pageable.getPageSize(),pageable.getOffset());
		
		return new PageImpl<>(list,pageable,total);
		
		
	}
}
















