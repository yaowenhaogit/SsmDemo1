package com.atguigu.crud.bean;

/**
 * role
 */
 
 
public class Role{
	// : id 	
	private Long id; 
	
	// : role_name 	
	private String roleName; 
	
	// : role_code 	
	private String roleCode; 
	

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
	 *  : role_name
	 * 
	 * @return 
	 */
	public String getRoleName () {
		return roleName;
	}
	
	/**
	 *  : role_name
	 * 
	 * @return 
	 */
	public void setRoleName (String roleName) {
		this.roleName = roleName;
	}
	/**
	 *  : role_code
	 * 
	 * @return 
	 */
	public String getRoleCode () {
		return roleCode;
	}
	
	/**
	 *  : role_code
	 * 
	 * @return 
	 */
	public void setRoleCode (String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public String toString() {
			return "Role ["+
						"id=" + id +
								",roleName=" + roleName +
								",roleCode=" + roleCode +
							"]";
	}

 
}
