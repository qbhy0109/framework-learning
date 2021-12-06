package com.yb.pojo;

import java.util.Date;
//import java.lang.Integer;

public class User {
	
	private Long id;
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String image;
	private Date createTime;
	private Date updateTime = new Date();
//	private Integer type;
	
	public User() {		
	}

	public User(String username, String pwd){
		this.username = username;
		this.password = pwd;
	}

	public User(Long id, String username, String pwd, String nickname, String email, String image, Date d1, Date d2){
		this.id=id;
		this.username=username;
		this.password=pwd;
		this.nickname=nickname;
		this.email=email;
		this.image=image;
		this.createTime=d1;
		this.updateTime=d2;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(Date time) {
		this.createTime = time;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(Date time) {
		this.updateTime = time;
	}
	
//	public Integer getType() {
//		return this.type;
//	}
//	
//	public void setType(Integer type) {
//		this.type = type;
//	}

	@Override
	public String toString() {
		return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +              
//                ", type=" + type +
                '}';
	}
}












