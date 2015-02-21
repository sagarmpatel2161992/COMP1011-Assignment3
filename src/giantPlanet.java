
/**
 * @author SAGAR
 * Program Description - gianplanet class which extends planet class and implements ihasmoons and ihasrings interfaces
 * Version: 1.0 4th February 2015
 *  
 *
 */
//class giantPlanet declared which extends Planet class and implements iHasMoons and iHasRings
public class giantPlanet extends Planet implements iHasMoons, iHasRings {
	
	// String variable type initialized
	private String type;
	
	//giantPlanet Constructor created for the class giantPlanet with four parameters
	public giantPlanet(double diameter, double mass, String name, String type) {      
		super(diameter, mass, name);
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	// hasMoons method declared with boolean Data type
	public boolean hasMoons() {
		if (super.getMoonCount() > 0) {
			return true;	// return true if condition satisfied
		}
		return false;		//return false if condition not satisfied
	}
	
	//hasRings method declared with boolean data type
	public boolean hasRings() {
		if (super.getRingCount() > 0) {
			return true;	// return true if condition satisfied
		}
		return false;		// return false if condition satisfied
	}

	// toString method declared of String data type
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();	// return string
	}
}
