package app.model;

public class User {

	private String name;
	private String surname;
	private String jmbg;
	private String phoneNum;
	private String address;
	private String passportNum;

	public User() {
		super();
	}
	
	

	public User(String name, String surname, String jmbg, String phoneNum, String address, String passportNum) {
		super();
		this.name = name;
		this.surname = surname;
		this.jmbg = jmbg;
		this.phoneNum = phoneNum;
		this.address = address;
		this.passportNum = passportNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	@Override
	public String toString() {
		return "User [firstName=" + name + ", lastName=" + surname + ", email=" + jmbg + ", phoneNum=" + phoneNum
				+ ", address=" + address + " ,passportNum" + passportNum + "]";
	}

}
