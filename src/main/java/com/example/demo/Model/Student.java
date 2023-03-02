package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="FamilyDetails")
public class Student {
	@Id
	private int id;
	private String studentName;
	private String departmentName;
	private String section;
	private long mobile;
	private String mailid;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int id, String studentName, String departmentName, String section, long mobile, String mailid,
			String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.section = section;
		this.mobile = mobile;
		this.mailid = mailid;
		this.address = address;
	}
	public Student() {
		
	}
	public String toString() {
		return "id="+id+"studentName="+studentName+"departmentName="+departmentName+"section="+section+"mobile="+mobile+"mailid="+mailid+"address="+address;
	}

}
