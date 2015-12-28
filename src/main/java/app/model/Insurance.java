package app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Insurance {

	//travel insurance
	@Id
	private String id;
	private VehicleInsurance vehicleIns;
	private RealestateInsurance realstateIns;
	private TravelInsurance travelIns;
	private double totalPrice;

	public Insurance() {
		super();		
	}
	
	

	public Insurance(VehicleInsurance vehicleIns, RealestateInsurance realstateIns, TravelInsurance travelIns,
			double totalPrice) {
		super();
		this.vehicleIns = vehicleIns;
		this.realstateIns = realstateIns;
		this.travelIns = travelIns;
		this.totalPrice = totalPrice;
	}



	public VehicleInsurance getVehicleIns() {
		return vehicleIns;
	}

	public void setVehicleIns(VehicleInsurance vehicleIns) {
		this.vehicleIns = vehicleIns;
	}

	public RealestateInsurance getRealstateIns() {
		return realstateIns;
	}

	public void setRealstateIns(RealestateInsurance realstateIns) {
		this.realstateIns = realstateIns;
	}

	public TravelInsurance getTravelIns() {
		return travelIns;
	}

	public void setTravelIns(TravelInsurance travelIns) {
		this.travelIns = travelIns;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	@Override
	public String toString() {
		return "Insurance [id=" + id + ", vehicleIns=" + vehicleIns + ", realstateIns=" + realstateIns + ", travelIns="
				+ travelIns + ", totalPrice=" + totalPrice + "]";
	}
	
	

}
