package app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AgeGroup {

	@Id
	int id;
	int maxAge;
	int minAge;
	
	public AgeGroup() {
		super();
	}
	
	public AgeGroup(int maxAge, int minAge) {
		super();
		this.maxAge = maxAge;
		this.minAge = minAge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	@Override
	public String toString() {
		return "AgeGroup [id=" + id + ", maxAge=" + maxAge + ", minAge=" + minAge + "]";
	}
	
	
}
