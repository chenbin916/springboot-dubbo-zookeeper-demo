package com.cb.dubbo.demo.api.dao;

import java.io.Serializable;

public class Emp implements Serializable {
	
	 	private static final long serialVersionUID = 1L;
		private Integer id;
		private String name;
		private Integer gender;
		private Integer deptId;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getGender() {
			return gender;
		}
		public void setGender(Integer gender) {
			this.gender = gender;
		}
		public Integer getDeptId() {
			return deptId;
		}
		public void setDeptId(Integer deptId) {
			this.deptId = deptId;
		}
}
