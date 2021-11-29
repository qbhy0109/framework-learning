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
	private Date updateTime;
//	private Integer type;
	
	public User() {		
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
	
	public String getPassWord() {
		return this.password;
	}
	
	public void setPassWord(String password) {
		this.password = password;
	}
	
	public String getNickName() {
		return this.nickname;
	}
	
	public void setNickName(String nickname) {
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












