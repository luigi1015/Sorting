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
		seed();
	}

	/**
	 * Constructor, seeds the random number generator and sets the maximum value.
	 * 
	 * @param newMaxVal The maximum value of the random values.
	 */
	public PseudoRandom( int newMaxVal )
	{
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
	 * Seeds rnd.
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

	/**
	 * Pseudorandomly shuffles an array of generic type.
	 * 
	 * @param arrayToShuffle The array to pseudorandomly shuffle.
	 */
	public <E> void shuffleArray( E[] arrayToShuffle )
	{
		seed();
		for( int i = 0; i  < arrayToShuffle.length; i++ )
		{
			//Get the pseudorandom index to switch with index i.
			int index = rnd.nextInt( i == 0 ? 1 : i );

			//Do the switch.
			E temp = arrayToShuffle[index];
			arrayToShuffle[index] = arrayToShuffle[i];
			arrayToShuffle[i] = temp;
		}
	}
}
