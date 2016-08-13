package net.codehobby.sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class SortProgram
{
	/**
	 * Main method. Generates some random values and runs the sort.
	 *
	 * @param  args The command line arguments when the program is run.
	 */
	public static void main( String[] args )
	{
		//Selection Sort
		System.out.println( "Selection Sort:" );
		AbstractSort<Integer> selectionSort = new SelectionSort();
		List<Integer> randomInts = PseudoRandom.generateRandomInts( 10 );
		System.out.println( "Random integers:" );
		selectionSort.show( randomInts );
		selectionSort.sort( randomInts );
		System.out.println();
		System.out.println( "Sorted Integers:" );
		selectionSort.show( randomInts );
	}

	/**
	 * Generates an ArrayList of pseudorandom integers.
	 * 
	 * @param num The number of integers to generate.
	 * @return An ArrayList with num pseudorandom integers in it.
	 */
	private static List<Integer> generateRandomInts( int num )
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
