/**
 * @author SAGAR
 * Program Description - Planet abstract class . which got main planet attributes and methods  
 * Version: 1.0 19th February 2015
 *  
 *
 */
// public abstract class Planet declared
public abstract class Planet {
	
	//variables initialized
	private double diameter;
	private double mass;
	private int moonCount;
	private String name;
	private double orbitalPeriod;
	private int ringCount;
	private double rotationPeriod;
	
	//Parametrize constructor planet initialized 
	public Planet(double diameter, double mass, String name) {
		super();
		this.diameter = diameter;
		this.mass = mass;
		this.name = name;
	}
	
	
}	//end of class
