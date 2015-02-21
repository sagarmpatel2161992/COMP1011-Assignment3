//class terrestialPlanet declared which extends Planet class and implements iHasMoons and iHasRings
public class terrestialPlanet extends Planet implements iHabitable, iHasMoons {
	//variable oxygen initialized with of data type boolean
	private boolean oxygen;

	// four parametrize public constructor terrestialPlanet initialized
	public terrestialPlanet(double diameter, double mass, String name,
			boolean oxygen) {
		super(diameter, mass, name);
		this.oxygen = oxygen;
		// TODO Auto-generated constructor stub
	}

	//habitable method declared with data type boolean
	public boolean habitable() {
		return oxygen;	//return oxygen of type boolean
	}

	//hasMoons method declared with data type boolean
	public boolean hasMoons() {
		if (super.getMoonCount() > 0) {		//if loop
			return true;	//return true if condition satisfied
		}
		return false;		//return false if condition not satisfied
	}

	// toString method declared of String data type
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();	// return string
	}

}	//end of class
