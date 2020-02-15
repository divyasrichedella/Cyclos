package com.training.bean;

public class LoginBean {
	private String  memberLogin;
	private String comments;

	public LoginBean() {
	}

	public LoginBean( String memeberLogin,String comments) {
		super();
		//this.userName = userName;
		//this.password = password;
		this.memberLogin =memberLogin;
		this.comments = comments;

	}

	/*public String getUserName() {
		return userName;
	}*/
	
	public String getmemberLogin() {
		return memberLogin;
	}
	public String getcomments() {
		return comments;
	}
	
	
	/*public String getPassword() {
		return password;
	}
*/

	/*public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/
	public void setmemberLogin(String memberLogin) {
		this.memberLogin = memberLogin;
	}
	public void setcomments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "LoginBean [memberLogin=" + memberLogin + ", comments=" + comments + "]";
	}

}
