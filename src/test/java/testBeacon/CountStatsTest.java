package testBeacon;
import org.junit.Test;

import simpleBeacon.Beacon;


public class CountStatsTest {
	
	String goodResponse1 = "686D693A7AE0FEE0";
	String goodResponse2 = " ";
	String badResponse1 = null;
				
	@Test
	public void testCountStats1() {
		System.out.println("Test good response");
		Beacon.countStats(goodResponse1);			
	}
	
	@Test
	public void testCountStats2() {
		System.out.println("Test good response");
		Beacon.countStats(goodResponse2);		
	}
	
	@Test
	public void testCountStats3() {
		System.out.println("Test bad response");
		Beacon.countStats(badResponse1);			
	}

}
