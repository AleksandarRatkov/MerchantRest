package app.model;

public class RealestateInsurance {

	// real estate insurance -- "re"
	private int duration;
	private double sizeRE;
	private double age;
	private double estimatedValue;
	private String owner; // name + surname
	private String packageRE;

	public RealestateInsurance() {
		super();
	}

	public RealestateInsurance(int duration, double size, double age, double estimatedValue, String owner,
			String packageRE) {
		super();
		this.duration = duration;
		this.sizeRE = size;
		this.age = age;
		this.estimatedValue = estimatedValue;
		this.owner = owner;
		this.packageRE = packageRE;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getSizeRE() {
		return sizeRE;
	}

	public void setSizeRE(double sizeRE) {
		this.sizeRE = sizeRE;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPackageRE() {
		return packageRE;
	}

	public void setPackageRE(String packageRE) {
		this.packageRE = packageRE;
	}

}
