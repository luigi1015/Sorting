package net.codehobby.sorting;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class SelectionSortTest
{
	/**
	 * Test the less method of AbstractSort.
	 */
	@Test public void testLessMethod()
	{
		AbstractSort<Integer> selSort = new SelectionSort();
		assertTrue( "less method should return 'true' if the first parameter is less than the second.", selSort.less(1, 2) );
	}

	/**
	 * Test the exch method of AbstractSort.
	 */
	@Test public void testExchMethod()
	{
		AbstractSort<Integer> selSort = new SelectionSort();
		List<Integer> testInts = new ArrayList<Integer>();
		testInts.add( 1 );
		testInts.add( 2 );
		selSort.exch( testInts, 0, 1 );
		assertTrue( "exch method should exchange two values in a list.", testInts.get(0) == 2 && testInts.get(1) == 1 );
	}

	/**
	 * Test the exch method of AbstractSort.
	 */
	@Test public void testIsSortedMethod()
	{
		AbstractSort<Integer> selSort = new SelectionSort();
		List<Integer> sortedInts = new ArrayList<Integer>();
		List<Integer> nonsortedInts = new ArrayList<Integer>();

		//Test isSorted on a sorted list.
		sortedInts.add( 1 );
		sortedInts.add( 2 );
		sortedInts.add( 3 );
		assertTrue( "isSorted method should return true if a list is sorted.", selSort.isSorted( sortedInts ) == true );

		//Test isSorted on a sorted list with a duplicate.
		sortedInts.clear();
		sortedInts.add( 1 );
		sortedInts.add( 2 );
		sortedInts.add( 3 );
		sortedInts.add( 3 );
		assertTrue( "isSorted method should return true if a list is sorted with duplicates.", selSort.isSorted( sortedInts ) == true );

		//Test isSorted on a list that is not sorted.
		nonsortedInts.add( 2 );
		nonsortedInts.add( 3 );
		nonsortedInts.add( 1 );
		assertTrue( "isSorted method should return false if a list is not sorted.", selSort.isSorted( nonsortedInts ) == false );
	}

	/**
	 * Test the sort method of SelectionSort.
	 */
	@Test public void testSortMethod()
	{
		AbstractSort<Integer> selSort = new SelectionSort();
		List<Integer> nonsortedInts = new ArrayList<Integer>();

		//Test sort on a list that is not sorted.
		nonsortedInts.add( 2 );
		nonsortedInts.add( 3 );
		nonsortedInts.add( 1 );
		nonsortedInts.add( 9 );
		nonsortedInts.add( 5 );
		nonsortedInts.add( 4 );
		nonsortedInts.add( 8 );
		nonsortedInts.add( 6 );
		nonsortedInts.add( 7 );

		List<Integer> sortedInts = selSort.sort( nonsortedInts );

		assertTrue( "sort method should return sort a list.", selSort.isSorted( sortedInts ) );
	}
}
