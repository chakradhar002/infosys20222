package com.demo.student;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.demo.address.Address;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_Id")
	private long studentId;

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	private String studentName;
     //mapping can be done  using this @OneToOne
	@OneToOne(cascade = CascadeType.ALL) 
	private Address studentAddress;// plugin the address dependency

	public Student() {
	}
                               //notice for you Address studentAddress
	public Student( String studentName, Address studentAddress) {
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/// adding mapping annotation here  // this  is mapping

// look up other tables
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
