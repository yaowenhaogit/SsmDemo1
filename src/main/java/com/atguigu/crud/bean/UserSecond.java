package com.atguigu.crud.bean;

/**
 * user_second
 */
 
 
public class UserSecond{
	// : id 	
	private Long id; 
	
	// : username 	
	private String username; 
	
	// : password 	
	private String password; 
	
	// : status 	
	private String status; 
	

	/**
	 *  : id
	 * 
	 * @return 
	 */
	public Long getId () {
		return id;
	}
	
	/**
	 *  : id
	 * 
	 * @return 
	 */
	public void setId (Long id) {
		this.id = id;
	}
	/**
	 *  : username
	 * 
	 * @return 
	 */
	public String getUsername () {
		return username;
	}
	
	/**
	 *  : username
	 * 
	 * @return 
	 */
	public void setUsername (String username) {
		this.username = username;
	}
	/**
	 *  : password
	 * 
	 * @return 
	 */
	public String getPassword () {
		return password;
	}
	
	/**
	 *  : password
	 * 
	 * @return 
	 */
	public void setPassword (String password) {
		this.password = password;
	}
	/**
	 *  : status
	 * 
	 * @return 
	 */
	public String getStatus () {
		return status;
	}
	
	/**
	 *  : status
	 * 
	 * @return 
	 */
	public void setStatus (String status) {
		this.status = status;
	}

	@Override
	public String toString() {
			return "UserSecond ["+
						"id=" + id +
								",username=" + username +
								",password=" + password +
								",status=" + status +
							"]";
	}

 
}
