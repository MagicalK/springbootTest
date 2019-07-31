package com.atguigu.springboot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.atguigu.springboot.entities.Department;
import org.springframework.stereotype.Repository;


@Repository
public class DepartmentDao {

	private static Map<Integer, Department> departments = null;

	//模拟数据库行为
	static{
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101, "D-AA"));
		departments.put(102, new Department(102, "D-BB"));
		departments.put(103, new Department(103, "D-CC"));
		departments.put(104, new Department(104, "D-DD"));
		departments.put(105, new Department(105, "D-EE"));
	}

	/**
	 * 获取所有部门的集合信息，Map.values()
	 * @return 返回的是元素类型为部门的一个集合对象
	 */
	public Collection<Department> getDepartments(){
		return departments.values();
	}

	/**
	 * 通过具体的部门id查找对应的部门信息（部门id+部门名称）
	 * @param id
	 * @return 返回的是单个部门对象
	 */
	public Department getDepartment(Integer id){
		return departments.get(id);
	}
	
}
