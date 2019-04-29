package com.api.model.user;

import com.api.model.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/7.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends BaseModel implements Serializable{

    private String userName;

    private String sex;

    private String address;

    private String phone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    
    
}
