package question4;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String state;
		private String city;
		private String Pincode;
		
		public Address() {}

		public Address(String state, String city, String pincode) {
			super();
			this.state = state;
			this.city = city;
			Pincode = pincode;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPincode() {
			return Pincode;
		}

		public void setPincode(String pincode) {
			Pincode = pincode;
		}

		@Override
		public String toString() {
			return "Address [state=" + state + ", city=" + city + ", Pincode=" + Pincode + "]";
		};
		
		
				

}
