package uber.system.design;

public class Rider {
	private UserDetails rider;
	private Location location;
	
	public Rider(UserDetails userDetails, Location location) {
		this.rider=userDetails;
		this.location=location;
	}

	/**
	 * @return the rider
	 */
	public UserDetails getRider() {
		return rider;
	}

	/**
	 * @param rider the rider to set
	 */
	public void setRider(UserDetails rider) {
		this.rider = rider;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
}
