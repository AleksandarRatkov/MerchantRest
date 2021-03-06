package app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vehicle {
	@Id
	private String id;
	private String typeName;
	private String model;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String typeName, String model) {
		super();
		this.typeName = typeName;
		this.model = model;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", typeName=" + typeName + ", model=" + model + "]";
	}
	
	
}
