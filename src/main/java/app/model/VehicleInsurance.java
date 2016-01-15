package app.model;

public class VehicleInsurance {

	private int duration;
	private String model;
	private String typeVehicle;
	private String owner;
	private int productionYear;
	private String registrationNumber;
	private String vinNumber;
	private String packageV;

	public VehicleInsurance() {
		super();
	}

	public VehicleInsurance(int duration, String model, String type, String owner, int productionYear,
			String registrationNumber, String vinNumber, String packageV) {
		super();
		this.duration = duration;
		this.model = model;
		this.typeVehicle = type;
		this.owner = owner;
		this.productionYear = productionYear;
		this.registrationNumber = registrationNumber;
		this.vinNumber = vinNumber;
		this.packageV = packageV;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getPackageV() {
		return packageV;
	}

	public void setPackageV(String packageV) {
		this.packageV = packageV;
	}

}
