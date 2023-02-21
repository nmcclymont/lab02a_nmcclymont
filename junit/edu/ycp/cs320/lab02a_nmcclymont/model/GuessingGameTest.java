package edu.ycp.cs320.lab02a_nmcclymont.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nmcclymont.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	
	@Test
	public void testIsDone() {
		model.setMin(50);
		model.setMax(100);
		assertFalse(model.isDone());
		model.setMax(50);
		assertTrue(model.isDone());
	}
	
	@Test
	public void testGetGuess() {
		model.setMin(50);
		model.setMax(100);
		// 50 + (100 - 50)) / 2 = 75
		assertEquals(75, model.getGuess());
	}
	
	@Test
	public void testSetIsLessThan() {
		model.setIsLessThan(75);
		assertEquals(74, model.getMax());
	}
	
	@Test
	public void testSetIsGreaterThan() {
		model.setIsGreaterThan(25);
		assertEquals(26, model.getMin());
	}
}
