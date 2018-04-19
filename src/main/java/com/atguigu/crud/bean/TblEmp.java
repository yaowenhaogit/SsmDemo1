package com.atguigu.crud.bean;

/**
 * tbl_emp
 */
 
 
public class TblEmp{
	// : emp_id 	
	private Long empId; 
	
	// : emp_name 	
	private String empName; 
	
	// : gender 	
	private String gender; 
	
	// : email 	
	private String email; 
	
	// : d_id 	
	private Long dId; 
	

	/**
	 *  : emp_id
	 * 
	 * @return 
	 */
	public Long getEmpId () {
		return empId;
	}
	
	/**
	 *  : emp_id
	 * 
	 * @return 
	 */
	public void setEmpId (Long empId) {
		this.empId = empId;
	}
	/**
	 *  : emp_name
	 * 
	 * @return 
	 */
	public String getEmpName () {
		return empName;
	}
	
	/**
	 *  : emp_name
	 * 
	 * @return 
	 */
	public void setEmpName (String empName) {
		this.empName = empName;
	}
	/**
	 *  : gender
	 * 
	 * @return 
	 */
	public String getGender () {
		return gender;
	}
	
	/**
	 *  : gender
	 * 
	 * @return 
	 */
	public void setGender (String gender) {
		this.gender = gender;
	}
	/**
	 *  : email
	 * 
	 * @return 
	 */
	public String getEmail () {
		return email;
	}
	
	/**
	 *  : email
	 * 
	 * @return 
	 */
	public void setEmail (String email) {
		this.email = email;
	}
	/**
	 *  : d_id
	 * 
	 * @return 
	 */
	public Long getDId () {
		return dId;
	}
	
	/**
	 *  : d_id
	 * 
	 * @return 
	 */
	public void setDId (Long dId) {
		this.dId = dId;
	}

	@Override
	public String toString() {
			return "TblEmp ["+
						",empId=" + empId +
								",empName=" + empName +
								",gender=" + gender +
								",email=" + email +
								",dId=" + dId +
							"]";
	}

 
}
