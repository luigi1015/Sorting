package net.codehobby.sorting;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;

public class PseudoRandomTest
{
	/**
	 * Test the generateRandomInts method of PseudoRandom.
	 */
	@Test public void testGenerateRandomIntsMethod()
	{
		PseudoRandom pseudoRandom = new PseudoRandom();
		int numIntsToGenerate = 10;
		List<Integer> pseudoRandomInts = pseudoRandom.generateRandomInts( numIntsToGenerate );
		assertTrue( "generateRandomInts method sgould generate the number of Integers given by the parameter", pseudoRandomInts.size() == numIntsToGenerate );
	}

	/**
	 * Test the shuffleArray method of PseudoRandom.
	 */
	@Test public void testShuffleArrayMethod()
	{
		PseudoRandom pseudoRandom = new PseudoRandom();
		Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
		Integer[] referenceIntArray = {1,2,3,4,5,6,7,8,9,10};//Array that won't be shuffled for comparison.
		pseudoRandom.shuffleArray( intArray );
		assertTrue( "shuffleArray method sgould modify the array", Arrays.equals(intArray, referenceIntArray) == false );
	}
}
