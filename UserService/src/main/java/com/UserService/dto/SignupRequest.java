package com.UserService.dto;

import lombok.Data;


public class SignupRequest {
	
	 private String email;
	    private String password;
	    private String name;
		public SignupRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SignupRequest(String email, String password, String name) {
			super();
			this.email = email;
			this.password = password;
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
		

}
