package com.shoppingspringboot.db.model;

public class Member {
	
	private Integer id;
	private String name;
	private String userName;
	private String password;
	private String tel;
	private String phone;
	private String address;
	private String mail;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(Integer id, String name, String userName, String password, String tel, String phone, String address,
			String mail) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.tel = tel;
		this.phone = phone;
		this.address = address;
		this.mail = mail;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}