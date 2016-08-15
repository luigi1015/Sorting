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
}
