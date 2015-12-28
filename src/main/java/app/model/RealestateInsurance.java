package app.model;

public class RealestateInsurance {

	//real estate insurance -- "re"
		private int reDuration;
		private double reSize;
		private double reAge;
		private double reEstimatedVal;
		private int realEstatePackId; //foreign key

		
		
		public RealestateInsurance() {
			super();
		}

		public RealestateInsurance(int reDuration, double reSize, double reAge, double reEstimatedVal,
				int realEstatePackId) {
			super();
			this.reDuration = reDuration;
			this.reSize = reSize;
			this.reAge = reAge;
			this.reEstimatedVal = reEstimatedVal;
			this.realEstatePackId = realEstatePackId;
		}

		public int getReDuration() {
			return reDuration;
		}

		public void setReDuration(int reDuration) {
			this.reDuration = reDuration;
		}

		public double getReSize() {
			return reSize;
		}

		public void setReSize(double reSize) {
			this.reSize = reSize;
		}

		public double getReAge() {
			return reAge;
		}

		public void setReAge(double reAge) {
			this.reAge = reAge;
		}

		public double getReEstimatedVal() {
			return reEstimatedVal;
		}

		public void setReEstimatedVal(double reEstimatedVal) {
			this.reEstimatedVal = reEstimatedVal;
		}

		public int getRealEstatePackId() {
			return realEstatePackId;
		}

		public void setRealEstatePackId(int realEstatePackId) {
			this.realEstatePackId = realEstatePackId;
		}
		
		

}
