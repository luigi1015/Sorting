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
		int maxRandomInteger = 100;
		PseudoRandom rng = new PseudoRandom( maxRandomInteger );
		//Selection Sort
		System.out.println( "Selection Sort:" );
		AbstractSort<Integer> selectionSort = new SelectionSort();
		List<Integer> randomInts = rng.generateRandomInts( 10 );
		System.out.println( "Random integers:" );
		selectionSort.show( randomInts );
		selectionSort.sort( randomInts );
		System.out.println();
		System.out.println( "Sorted Integers:" );
		selectionSort.show( randomInts );
	}
}
