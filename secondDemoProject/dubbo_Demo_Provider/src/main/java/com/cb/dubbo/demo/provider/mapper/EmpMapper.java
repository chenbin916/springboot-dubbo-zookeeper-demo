package com.cb.dubbo.demo.provider.mapper;

import java.util.List;

import com.cb.dubbo.demo.api.dao.Emp;

public interface EmpMapper {

	//mybatis直接使用注解的方式
		/* @Select("select * from emp where id = #{id}")  
		    Emp selectById(@Param("id")Integer id);  */
		/**
		 * 根据id取emp对象
		 * @param id
		 * @return
		 */
		public Emp  findEmp(int id); 
		/**
		 * 根据id 删除emp对象
		 */
		public void delEmp(int id);
		/**
		 * 根据id修改emp对象的值
		 */
		public void modEmp(Emp emp);
		/**
		 * 添加对象
		 */
		public void addEmp(Emp emp);
		/**
		 * 查找全部对象
		 */
		public List<Emp> findEmps();

}
