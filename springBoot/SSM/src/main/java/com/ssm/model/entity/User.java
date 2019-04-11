package com.ssm.model.entity;

public class User {
	  private Integer id;  
	  private String username;  
	  private String password;  
	  private String email;  
	    /**  
	     * 是否可用(0禁用,1可用)  
	     */  
	  private Integer useable;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getUseable() {
			return useable;
		}
		public void setUseable(Integer useable) {
			this.useable = useable;
		}
	  
	  
}
