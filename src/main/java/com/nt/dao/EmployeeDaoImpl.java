package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	
	
	@Autowired
	private JdbcTemplate jt;

	public List findAllEmployee() {
		List list=jt.queryForList("select * from employee");
		return list;
	}

}
