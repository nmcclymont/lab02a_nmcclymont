package edu.ycp.cs320.lab02a_nmcclymont.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nmcclymont.controller.GuessingGameController;
import edu.ycp.cs320.lab02a_nmcclymont.model.GuessingGame;

public class numbersControllerTest {
	private NumbersController controller;
	
	@Before
	public void setUp() {
		controller = new NumbersController();
	}
	
	// 2 + 3 + 4 = 9 quick maffs
		@Test
		public void testAdd() {
			Double result = controller.add(2.0, 3.0, 4.0);
			assertTrue(result == 9.0);
		}
	
	// 2 * 5 = 10 quick maffs
	@Test
	public void testMultiply() {
		Double result = controller.multiply(2.0, 2.0);
		assertTrue(result == 10.0);
	}
	
	// (1 + 1.5 + 3.5) * 2.25 = 6 * 2.25 = 13.5
		@Test
		public void testCombination() {
			Double result = controller.add(1.0, 1.5, 3.5);
			result = controller.multiply(result, 2.25);
			assertTrue(result == 13.5);
		}
}
