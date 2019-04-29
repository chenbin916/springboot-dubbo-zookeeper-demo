package com.cb.dubbo.demo.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;
import com.cb.dubbo.demo.api.dao.Emp;
import com.cb.dubbo.demo.api.service.DemoService;
import com.cb.dubbo.demo.provider.mapper.EmpMapper;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {

	@Autowired
	private EmpMapper empMapper;
	/**
	 * 根据id取emp对象
	 */
	public Emp findEmp(int id) {
		Emp emp=empMapper.findEmp(id);
		System.out.println(emp.getName());
		return emp;
		
	}
	/**
	 * 根据id 删除emp对象
	 */
	public void delEmp(int id) {
		empMapper.delEmp(id);
		System.out.println("删除");
	}
	/**
	 * 根据id修改emp对象的值
	 */
	public void modEmp(Emp emp) {
		empMapper.modEmp(emp);
		System.out.println("修改");
		
	}
	/**
	 * 添加对象
	 */
	public void addEmp(Emp emp) {
		empMapper.addEmp(emp);
		System.out.println("添加");
	}
	/**
	 * 查找全部对象
	 */
	public List<Emp> findEmps() {
		List<Emp>	lists =empMapper.findEmps();
		System.out.println("------------------------------->生产者全查。。。。。。。。。。。。。。。。");
		return lists;
	}

}
