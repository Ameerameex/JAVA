
public class Address {

	String doorNumber,streetName,city,pinCode;

	public final String getDoorNumber() {
		return doorNumber;
	}

	public final void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public final String getStreetName() {
		return streetName;
	}

	public final void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final String getPinCode() {
		return pinCode;
	}

	public final void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", city=" + city + ", pinCode="
				+ pinCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((doorNumber == null) ? 0 : doorNumber.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (doorNumber == null) {
			if (other.doorNumber != null)
				return false;
		} else if (!doorNumber.equals(other.doorNumber))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}
	
}
