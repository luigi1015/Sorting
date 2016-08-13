package net.codehobby.sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class PseudoRandom
{
	/**
	 * Generates an ArrayList of pseudorandom integers.
	 * 
	 * @param num The number of integers to generate.
	 * @return An ArrayList with num pseudorandom integers in it.
	 */
	public static List<Integer> generateRandomInts( int num )
	{
		int maxVal = 100;//Maximum value to generate.
		List<Integer> randomInts = new ArrayList<Integer>();
		Random rnd = new Random( java.lang.System.currentTimeMillis() );
		for( int i = 0; i < num; i++ )
		{
			randomInts.add( rnd.nextInt(maxVal) );
		}
		return randomInts;
	}
}
