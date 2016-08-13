package net.codehobby.sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T>
{
	/**
	 * Sorts the given list using selection sort.
	 *
	 * @param list The list to sort.
	 * @return The sorted list.
	 */
	public List<T> sort( List<T> list )
	{
		int length = list.size();
		for( int i = 0; i < length; i++ )
		{
			int min = i;
			for( int j = i+1; j < length; j++ )
			{
				if( less(list.get(j), list.get(min)) )
				{
					min = j;
				}
			}
			exch( list, i, min );
		}
		return list;
	}

	/**
	 * Constructor.
	 */
	public SelectionSort()
	{
	}
}
