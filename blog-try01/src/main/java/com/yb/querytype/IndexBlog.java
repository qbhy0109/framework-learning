package com.yb.querytype;

import java.util.Date;

//import com.yb.pojo.User;

public class IndexBlog {

	private Long id;//博客编号
    private String user;
    private String title;//博客标题
    private String context;
    private String image;//博客首图
    private String description;//博客描述
    private Integer views;//浏览次数
    private Integer commentCount;//评论个数
    private Date updateTime;//更新时间
    private Date createTime;


    //Type
//    private String typeName;//类型名
    //User

//    private User user;
//    private String nickname;//昵称
//    private String avatar; //头像

    public IndexBlog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public String getTypeName() {
//        return typeName;
//    }
//
//    public void setTypeName(String typeName) {
//        this.typeName = typeName;
//    }
    
    public String getUser() {
    	return this.user;
    }
    
    public void setUser(String user) {
    	this.user = user;
    }

//    public String getNickname() {
//        return nickname;
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public String getAvatar() {
//        return avatar;
//    }
//
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }

    @Override
    public String toString() {
        return "FirstPageBlog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", views=" + views +
                ", commentCount=" + commentCount +
                ", updateTime=" + updateTime +
                ", description='" + description + '\'' +
//                ", typeName='" + typeName + '\'' +
                ", user='" + user + '\'' +
//                ", nickname='" + nickname + '\'' +
//                ", avatar='" + avatar + '\'' +
                '}';
    }
}
