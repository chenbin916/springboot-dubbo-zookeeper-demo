package com.cb.dubbo.demo.consumer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import com.cb.dubbo.demo.api.dao.Emp;
import com.cb.dubbo.demo.api.service.DemoService;


@RestController  //RestController 相当于restbody+controller，所以默认返回的是json数据 
@RequestMapping("/user")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	 Map<String, String> map = new HashMap<String,String>(); //返回的字符串接收不到 所以改成了map集合	 
	/**
	 * 根据id取emp对象
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEmp.do")
	public Emp getEmp(int id){
		Emp emp = demoService.findEmp(id);
		return emp;
	}
	/**
	 * 查找全部对象
	 */
	@RequestMapping("/findEmps.do")
	public List<Emp> findEmpss(){
		List<Emp> emps = demoService.findEmps();
		System.out.println("------------------------------->消费者全查。。。。。。。。。。。。。。。。");
		return emps;
	}
	/**
	 * 根据id 删除emp对象
	 */
	@RequestMapping("/delById.do")
	public String delEmpById(){
	 demoService.delEmp(3);
		return "success";
	}
	/**
	 * 根据id修改emp对象的值
	 */
	@RequestMapping("/modById.do")
	public String modById(Emp emp){
	/*	emp.setId(2);
		emp.setName("dfjjk");
		emp.setGender(3);
		emp.setDeptId(5);*/
		 demoService.modEmp(emp);
		 return "success";
	}
	/**
	 * 添加对象
	 */
	@RequestMapping("/addById.do")
	public  Map<String, String> addById(Emp emp){
		emp.setName("大家风范");
		emp.setGender(2);
		emp.setDeptId(5);
		 demoService.addEmp(emp);
		map.put("fanhui", "success");
		 return map;
	}
	
}
