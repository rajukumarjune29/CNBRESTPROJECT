package com.cnb.model;

import java.util.Date;

public class UserVo {
	private Long userId;
	private String name;
	private String gender;
	private Date dob;
	private String mobileNo;
	private String emailId;
	private Boolean isActive;

	public UserVo() {
		super();
	}

	public UserVo(Long userId, String name, String gender, Date dob, String mobileNo, String emailId,
			Boolean isActive) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.isActive = isActive;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
