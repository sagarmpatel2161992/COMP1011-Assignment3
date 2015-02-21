/**
 * @author SAGAR
 * Program Description - Planet abstract class have attributes for planet and methods needed   
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
	
	//getMoonCount method declared of int data type
	public int getMoonCount() {
		return moonCount;	//return moonCount
	}
	
	//Parametrize setMoonCount method declared of void data type
	public void setMoonCount(int moonCount) {
		this.moonCount = moonCount;
	}
	
	//getOrbitalPeriod method declared of data type double
	public double getOrbitalPeriod() {
		return orbitalPeriod;		//return orbitalPeriod
	}

	//setOrbitalPeriod method declared of data type void
	public void setOrbitalPeriod(double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	//public method getRingCount declared of data type int
	public int getRingCount() {
		return ringCount;	// return ringCount;
	}

	//one Parametrize setRingCount method declared with data type void
	public void setRingCount(int ringCount) {
		this.ringCount = ringCount;
	}

	//getRotationPeriod method declared with data type double
	public double getRotationPeriod() {
		return rotationPeriod;	//return rotationPeriod
	}

	//one Parametrize setRotationPeriod method declared with data type void
	public void setRotationPeriod(double rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	//getDiameter method initialized with data type double
	public double getDiameter() {
		return diameter;	//return diameter
	}

	//getMass method declared with data type double
	public double getMass() {
		return mass;	//return mass
	}

	//getName method declared with data type String
	public String getName() {
		return name;	//return name;
	}

	// toString method declared of String data type
	@Override
	public String toString() {
		return "Planet [diameter=" + diameter + ", mass=" + mass + ", name="
				+ name + "]";	// return value of diameter,mass and name
	}

}	//end of class
