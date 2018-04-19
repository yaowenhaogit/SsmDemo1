package com.atguigu.crud.bean;

/**
 * tnl_dept
 */
 
 
public class TnlDept{
	// : dept_id 	
	private Long deptId; 
	
	// : dept_name 	
	private String deptName; 
	

	/**
	 *  : dept_id
	 * 
	 * @return 
	 */
	public Long getDeptId () {
		return deptId;
	}
	
	/**
	 *  : dept_id
	 * 
	 * @return 
	 */
	public void setDeptId (Long deptId) {
		this.deptId = deptId;
	}
	/**
	 *  : dept_name
	 * 
	 * @return 
	 */
	public String getDeptName () {
		return deptName;
	}
	
	/**
	 *  : dept_name
	 * 
	 * @return 
	 */
	public void setDeptName (String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
			return "TnlDept ["+
						",deptId=" + deptId +
								",deptName=" + deptName +
							"]";
	}

 
}
