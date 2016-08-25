package net.codehobby.sorting;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

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
}
