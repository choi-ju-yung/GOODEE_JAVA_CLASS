package com.jdbc.model.dto;

import java.sql.Date;
import java.util.Objects;

public class EmpDTO {
	private int empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
	private String deptCode;
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private int managerId;
	private Date hireDate;
	private Date entDate;
	private char entYn;
	
	public EmpDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmpDTO(int empId, String empName, String empNo, String email, String phone, String deptCode, String jobCode,
			String salLevel, int salary, double bonus, int managerId, Date hireDate, Date entDate, char entYn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.salLevel = salLevel;
		this.salary = salary;
		this.bonus = bonus;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.entYn = entYn;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getSalLevel() {
		return salLevel;
	}

	public void setSalLevel(String salLevel) {
		this.salLevel = salLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public char getEntYn() {
		return entYn;
	}

	public void setEntYn(char entYn) {
		this.entYn = entYn;
	}

	@Override
	public String toString() {
		return "EmpDTO [empId=" + empId + ", empName=" + empName + ", empNo=" + empNo + ", email=" + email + ", phone="
				+ phone + ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", salLevel=" + salLevel + ", salary="
				+ salary + ", bonus=" + bonus + ", managerId=" + managerId + ", hireDate=" + hireDate + ", entDate="
				+ entDate + ", entYn=" + entYn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bonus, deptCode, email, empId, empName, empNo, entDate, entYn, hireDate, jobCode, managerId,
				phone, salLevel, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpDTO other = (EmpDTO) obj;
		return Double.doubleToLongBits(bonus) == Double.doubleToLongBits(other.bonus)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(email, other.email)
				&& empId == other.empId && Objects.equals(empName, other.empName) && Objects.equals(empNo, other.empNo)
				&& Objects.equals(entDate, other.entDate) && entYn == other.entYn
				&& Objects.equals(hireDate, other.hireDate) && Objects.equals(jobCode, other.jobCode)
				&& managerId == other.managerId && Objects.equals(phone, other.phone)
				&& Objects.equals(salLevel, other.salLevel) && salary == other.salary;
	}
	
	
}
