package app.model;

public class TravelInsurance {

	private String name;
	private String surname;
	private String passportNum;
	private String address;
	private String phoneNum;
	private int duration; //in days
	private int regionId; //foreign key
	private int insuredPersonsNum;
	private int ageGroupId; //foreign key
	private int sportId; //foreign key
	private double amount;
	
	
	
	public TravelInsurance() {
		super();
	}

	public TravelInsurance(String name, String surname, String passportNum, String address, String phoneNum,
			int duration, int regionId, int insuredPersonsNum, int ageGroupId, int sportId, double amount) {
		super();
		this.name = name;
		this.surname = surname;
		this.passportNum = passportNum;
		this.address = address;
		this.phoneNum = phoneNum;
		this.duration = duration;
		this.regionId = regionId;
		this.insuredPersonsNum = insuredPersonsNum;
		this.ageGroupId = ageGroupId;
		this.sportId = sportId;
		this.amount = amount;
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

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getInsuredPersonsNum() {
		return insuredPersonsNum;
	}

	public void setInsuredPersonsNum(int insuredPersonsNum) {
		this.insuredPersonsNum = insuredPersonsNum;
	}

	public int getAgeOfPersons() {
		return ageGroupId;
	}

	public void setAgeOfPersons(int ageOfPersons) {
		this.ageGroupId = ageOfPersons;
	}

	
	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
