package net.codehobby.sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class PseudoRandom
{
	private int maxVal = 100;//Maximum value to generate.
	private Random rnd;

	/**
	 * Constructor, seeds the random number generator.
	 */
	public PseudoRandom()
	{
		//rnd = new Random( java.lang.System.currentTimeMillis() );
		seed();
	}

	/**
	 * Constructor, seeds the random number generator and sets the maximum value.
	 * 
	 * @param newMaxVal The maximum value of the random values.
	 */
	public PseudoRandom( int newMaxVal )
	{
		//rnd = new Random( java.lang.System.currentTimeMillis() );
		seed();
		setMaxVal( newMaxVal );
	}

	/**
	 * Getter method for the maximum value.
	 * 
	 * @return The maximum value of the random values.
	 */
	public int getMaxVal()
	{
		return maxVal;
	}

	/**
	 * Setter method for the maximum value.
	 * 
	 * @param newMaxVal The maximum value of the random values.
	 */
	public void setMaxVal( int newMaxVal )
	{
		maxVal = newMaxVal;
	}

	/**
	 * Seeds rnd;
	 */
	public void seed()
	{
		rnd = new Random( java.lang.System.currentTimeMillis() );
	}

	/**
	 * Generates an ArrayList of pseudorandom Integers.
	 * 
	 * @param num The number of Integers to generate.
	 * @return An ArrayList with num pseudorandom Integers in it.
	 */
	public List<Integer> generateRandomInts( int num )
	{
		List<Integer> randomInts = new ArrayList<Integer>();
		seed();
		for( int i = 0; i < num; i++ )
		{
			randomInts.add( rnd.nextInt(maxVal) );
		}
		return randomInts;
	}
}
