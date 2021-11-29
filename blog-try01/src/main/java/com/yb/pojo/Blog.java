package com.yb.pojo;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Date;

public class Blog {
	
	private Long 	userId;
	private Long	id;
	private String 	title;
	private String 	content;
	private String 	image;
	private String 	description;
	private Integer views;
	private Integer commentCount;
	
	private Date	createTime;
	private Date 	updateTime;
	
	private User	user;
	
//	private boolean published; 		// 是否展示；
//	private boolean commentable; 	// 可评论
	
//	private List<Type> type;
// comment...tag...
	
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userid) {
		this.userId = userid;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getViews() {
		return this.views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
//	public void setCreateTime(Date time) {
//		this.createTime = time;
//	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date time) {
		this.updateTime = time;
	}
	
	public User getUser() {
		return this.user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}












