package app.model;

public class VehicleInsurance {
	//vehicle insurance --"vi"
	
		private int viDuration;
		private int viPackageId; //foreign key
		
		//about vehicle
		private int viTypeId; //foreign key
		//private String viModel;
		private int viYearOfProduction;
		private String viRegistrationNum;
		private String viVinNum;
		

		public VehicleInsurance() {
			super();
		}

		public VehicleInsurance(int viDuration, int viPackageId, int viTypeId, int viYearOfProduction,
				String viRegistrationNum, String viVinNum) {
			super();
			this.viDuration = viDuration;
			this.viPackageId = viPackageId;
			this.viTypeId = viTypeId;
			this.viYearOfProduction = viYearOfProduction;
			this.viRegistrationNum = viRegistrationNum;
			this.viVinNum = viVinNum;
		}

		public int getViDuration() {
			return viDuration;
		}

		public void setViDuration(int viDuration) {
			this.viDuration = viDuration;
		}

		public int getViPackageId() {
			return viPackageId;
		}

		public void setViPackageId(int viPackageId) {
			this.viPackageId = viPackageId;
		}

		public int getViTypeId() {
			return viTypeId;
		}

		public void setViTypeId(int viTypeId) {
			this.viTypeId = viTypeId;
		}

		public int getViYearOfProduction() {
			return viYearOfProduction;
		}

		public void setViYearOfProduction(int viYearOfProduction) {
			this.viYearOfProduction = viYearOfProduction;
		}

		public String getViRegistrationNum() {
			return viRegistrationNum;
		}

		public void setViRegistrationNum(String viRegistrationNum) {
			this.viRegistrationNum = viRegistrationNum;
		}

		public String getViVinNum() {
			return viVinNum;
		}

		public void setViVinNum(String viVinNum) {
			this.viVinNum = viVinNum;
		}
		
}
