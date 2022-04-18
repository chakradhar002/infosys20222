package com.demo.bean;

public class Family {
	

	String familyname;
	String familytype;
	
	public Family(String familyname, String familytype) {
		super();
		this.familyname = familyname;
		this.familytype = familytype;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getFamilytype() {
		return familytype;
	}

	public void setFamilytype(String familytype) {
		this.familytype = familytype;
	}

}
