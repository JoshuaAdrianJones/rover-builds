package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import rover_positioning.MissionSpace;
import rover_positioning.Planet;

public class Parseing_Mission_SpaceTest {

	@Test
	public void test() {
	//this test uses the methods from main to set the mission space dimensions when given test space input
		Planet mars = new Planet(1);
		mars.setMissionSpace("5 5");
		
		assertEquals(mars.getMissionSpace(),"5 5");
		
		MissionSpace plateau = new MissionSpace(mars.getMissionSpace());
		
		assertEquals(plateau.getSpacex(),5);
		
		assertEquals(plateau.getSpacey(),5);
		
		
	
	}

}
