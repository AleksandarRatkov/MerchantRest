package app.model;

import java.util.ArrayList;
import java.util.List;

public class TravelInsurance {

	private int duration; // in days
	private String region; // foreign key
	private int less; // users younger than 18
	private int between;// users between 18 and 65
	private int over; // users older than 65
	private boolean doesSport; // foreign key
	private String sport;
	private double insuredAmount;
	private int numOfPersons;// less + between + over
	private List<User> users = new ArrayList<>();

	public TravelInsurance() {
		super();
	}

	public TravelInsurance(int duration, String region, int less, int between, int over, boolean doesSport,
			String sport, double amount, int numOfPersons, List<User> users) {
		super();
		this.duration = duration;
		this.region = region;
		this.less = less;
		this.between = between;
		this.over = over;
		this.doesSport = doesSport;
		this.sport = sport;
		this.insuredAmount = amount;
		this.numOfPersons = numOfPersons;
		this.users = users;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getLess() {
		return less;
	}

	public void setLess(int less) {
		this.less = less;
	}

	public int getBetween() {
		return between;
	}

	public void setBetween(int between) {
		this.between = between;
	}

	public int getOver() {
		return over;
	}

	public void setOver(int over) {
		this.over = over;
	}

	public boolean isDoesSport() {
		return doesSport;
	}

	public void setDoesSport(boolean doesSport) {
		this.doesSport = doesSport;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public int getNumOfPersons() {
		return numOfPersons;
	}

	public void setNumOfPersons(int numOfPersons) {
		this.numOfPersons = numOfPersons;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
