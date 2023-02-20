package edu.ycp.cs320.lab02a_nmcclymont.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nmcclymont.controller.GuessingGameController;
import edu.ycp.cs320.lab02a_nmcclymont.model.GuessingGame;

public class GuessingGameControllerTest {
	private GuessingGame model;
	private GuessingGameController controller;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
		controller = new GuessingGameController();
		
		model.setMin(1);
		model.setMax(100);
		
		controller.setModel(model);
	}
	
	@Test
	public void testSetNumberFound() {
		int currentGuess = model.getGuess();
		controller.setNumberFound();
		assertTrue(currentGuess == model.getMax());
		assertTrue(currentGuess == model.getMin());
	}
	
	@Test
	public void testNumberIsGreater() {
		int currentGuess = model.getGuess();
		controller.setNumberIsGreaterThanGuess();
		assertTrue(model.getGuess() > currentGuess);
	}
	
	@Test
	public void testNumberIsLess() {
		int currentGuess = model.getGuess();
		controller.setNumberIsLessThanGuess();
		assertTrue(model.getGuess() < currentGuess);
	}
	
	@Test
	public void testNumberIsEqual() {
		int currentGuess = model.getGuess();
		controller.setNumberIsLessThanGuess();
		assertTrue(model.getGuess() < currentGuess);
	}
}
