/**
 * @author SAGAR
 * Program Description - Tester Class 
 * Version: 1.0 19th February 2015
 *  
 *
 */
//public class test defined
public class test {
	
	//Main method starts here
	public static void main(String args[]) {
		giantPlanet mars = new giantPlanet(10, 1000, "Mars", "Gas");	//passing value to parameter mars
		System.out.println(mars);	//print value of mars

		terrestialPlanet sun = new terrestialPlanet(10, 1000, "Sun", true);	//passing value to parameter sun
		System.out.println(sun);	//print value of sun
	}	//end of main
}		//end of class
