
/**
 * @author SAGAR
 * Program Description - gianplanet class which ectends planet class and implements iHasMoons and iHasRings interfaces 
 * Version: 1.0 19th February 2015
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
		
	}
	
	//hasRings method declared with boolean data type
	public boolean hasRings() {
		
	}

	// toString method declared of String data type
	@Override
	public String toString() {
		
	}
}
