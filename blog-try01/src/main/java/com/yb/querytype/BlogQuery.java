package com.yb.querytype;

import java.util.Date;

public class BlogQuery {
	
	private Long id; //博客编号
    private String title; //博客标题
    private Date updateTime; //更新时间
    private Boolean published;//是否发布
    
//    private Long typeId; //类型编号
//    private Boolean recommend; //是否推荐

    public BlogQuery() {
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

//    public Boolean getRecommend() {
//        return recommend;
//    }
//
//    public void setRecommend(Boolean recommend) {
//        this.recommend = recommend;
//    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

//    public Long getTypeId() {
//        return typeId;
//    }
//
//    public void setTypeId(Long typeId) {
//        this.typeId = typeId;
//    }

    @Override
    public String toString() {
        return "BlogQuery{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", updateTime=" + updateTime +
                ", published=" + published +
//                ", typeId=" + typeId +
//                ", recommend=" + recommend +
                '}';
    }

}
