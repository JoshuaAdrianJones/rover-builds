package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import rover_positioning.MissionSpace;
import rover_positioning.Rover;

public class SetMultipleRoversTest {

	@Test
	public void test() {
		//tests that we can set and get multiple rovers
		MissionSpace test_space = new MissionSpace("5 5");
		test_space.setRoversInSpace(2);//set's the number of rovers operating in the mission space
	
		Rover rovers[] = new Rover[test_space.getRoversInSpace()];//set array to length num
		assertEquals(rovers.length,2);
		
		rovers[0]=new Rover();//the array has 2 elements and each element is an object type Rover
		rovers[0].setStartCo("4 4 E");//manually set the value of some rover position and direction
		rovers[1] = new Rover();
		rovers[1].setStartCo("5 2 W");
		
		int [] a = {4,4};
		char dir = 'W';
		int [] b = rovers[0].getStartCo();
		
		assertArrayEquals(b,a);//tests that getStartCo works correctly
		assertEquals(rovers[1].getStartDir(),dir);//tests that getStartDir works correctly.
	}
}
