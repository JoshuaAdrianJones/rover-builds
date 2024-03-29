package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import rover_positioning.MissionSpace;
import rover_positioning.Planet;

public class NumberOfMissionsTest {
	@Test
	public void test() {
		//fail("Not yet implemented");
		//tests for the number of missions on mars being the same as the test case
		//tests for the mission space number being the correct mission space number

		Planet mars =new Planet(1);
		
		//mars.setNumberOfMissions(test.number_of_missions); constructor set's the value 
		//on instantiation rather than using a separate set method.
		
		assertEquals(mars.getNumberOfMissions(),1);//the test case only has 1 mission space
		mars.setMissionSpace("23 59");
		MissionSpace alpha = new MissionSpace(mars.getMissionSpace());//code for a specific MissionSpace
		assertEquals(alpha.getMissionSpaceNumber(),1);//the first mission space number should be 1 
		

		MissionSpace bravo = new MissionSpace(mars.getMissionSpace());//code for a specific MissionSpace
		
		
		assertEquals(bravo.getMissionSpaceNumber(),2);//the first mission space number should be 1 

		MissionSpace charlie = new MissionSpace(mars.getMissionSpace());//code for a specific MissionSpace
		
		assertEquals(charlie.getMissionSpaceNumber(),3);
		
	}

}