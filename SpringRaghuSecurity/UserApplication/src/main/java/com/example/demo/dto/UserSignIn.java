package com.example.demo.dto;

public class UserSignIn {

	String Useremail;
	String userPassword;

	public String getUseremail() {
		return Useremail;
	}

	public void setUseremail(String useremail) {
		Useremail = useremail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserSignIn [Useremail=" + Useremail + ", userPassword=" + userPassword + "]";
	}

}
