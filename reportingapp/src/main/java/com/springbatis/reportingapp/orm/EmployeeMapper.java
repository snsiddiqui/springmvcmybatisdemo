package com.springbatis.reportingapp.orm;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.springbatis.reportingapp.domain.Employee;

@Mapper
public interface EmployeeMapper {
	@Select("select 1234 as id, 'John' as name from dual where 1 = #{id}")
	  Employee findById(@Param("id") Integer id);

	@Select("select 1122 as id, 'Simon' as name from dual")
	  Employee getEmployee();
}
