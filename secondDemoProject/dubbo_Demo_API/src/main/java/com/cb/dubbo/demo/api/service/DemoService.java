package com.cb.dubbo.demo.api.service;

import java.util.List;

import com.cb.dubbo.demo.api.dao.Emp;
public interface DemoService {

	/**
	 * 根据id取emp对象
	 * @param id
	 * @return
	 */
	public Emp findEmp(int id);
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
