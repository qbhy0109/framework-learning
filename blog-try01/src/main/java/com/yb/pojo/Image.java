package com.yb.pojo;

public class Image {

	private Long id;
	private String name;
	private String time;
	private String address;
	private String description;
	
	public Image() {
	}
	
	public Long getId() {
		return this.id;
	}
	 public void setId(Long id) {
		 this.id = id;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getTime() {
		 return this.time;
	 }
	 
	 public void setTime(String time) {
		 this.time = time;
	 }
	 
	 public String getAddress() {
		 return this.address;
	 }
	
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 
	 public String getDescription() {
		 return this.description;
	 }
	 
	 public void setDescription(String description) {
		 this.description = description;
	 }
	
	 @Override
	 public String toString() {
		 return "Picture{" +
	                "id=" + id +
	                ", picturename='" + name + '\'' +
	                ", picturetime='" + time + '\'' +
	                ", pictureaddress='" + address + '\'' +
	                ", picturedescription='" + description + '\'' +
	                '}';
	 }
}











