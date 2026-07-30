package com.practiceoops;

public class member {
	private int MemberID;
	private String MemberName;
	private Long MobileNumber;
	private String Email;
	
	public member(int memberID, String memberName, Long mobileNumber, String email) {
		super();
		MemberID = memberID;
		MemberName = memberName;
		MobileNumber = mobileNumber;
		Email = email;
	
	}
	public int getMemberID() {
		return MemberID;
	}
	public void setMemberID(int memberID) {
		MemberID = memberID;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
}
