package practice;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Comparable<Customer>,Serializable
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int custid;
 private String custname;
private String email;
private  String phno;
 private Date dob;
 private Address address;
@Override
public int compareTo(Customer o) {
	
	return 0;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int custid, String custname, String email, String phno, Date dob, Address address) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.email = email;
	this.phno = phno;
	this.dob = dob;
	this.address = address;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", email=" + email + ", phno=" + phno + ", dob="
			+ dob + ", address=" + address + "]";
}



}
