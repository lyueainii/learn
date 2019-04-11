package com.dubbo.base.entity;

//import lombok.Data;

import java.io.Serializable;

//@Data
public class UserInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
    private String userPassword;
    private String userSex;
    private String userMobileNo;
    private String userCreatTime;
    private String userCardType;
    private String userCardNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getUserCreatTime() {
		return userCreatTime;
	}
	public void setUserCreatTime(String userCreatTime) {
		this.userCreatTime = userCreatTime;
	}
	public String getUserCardType() {
		return userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}
	public String getUserCardNo() {
		return userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}
}