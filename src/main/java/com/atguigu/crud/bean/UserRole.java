package com.atguigu.crud.bean;

/**
 * user_role
 */
 
 
public class UserRole{
	// : id 	
	private Long id; 
	
	// : user_id 	
	private Long userId; 
	
	// : role_id 	
	private Long roleId; 
	

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
	 *  : user_id
	 * 
	 * @return 
	 */
	public Long getUserId () {
		return userId;
	}
	
	/**
	 *  : user_id
	 * 
	 * @return 
	 */
	public void setUserId (Long userId) {
		this.userId = userId;
	}
	/**
	 *  : role_id
	 * 
	 * @return 
	 */
	public Long getRoleId () {
		return roleId;
	}
	
	/**
	 *  : role_id
	 * 
	 * @return 
	 */
	public void setRoleId (Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
			return "UserRole ["+
						"id=" + id +
								",userId=" + userId +
								",roleId=" + roleId +
							"]";
	}

 
}
