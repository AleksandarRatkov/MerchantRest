package app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Region {
	
	@Id
	private int id;
	private String name;
	
	public Region() {
		super();
	}
	
	public Region(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", name=" + name + "]";
	}
	
	
}
