import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public abstract class AbstractSort<T extends Comparable<T>>
{
	/**
	 * Checks if one value is less than another.
	 *
	 * @param first The first value to compare.
	 * @param second The second value to compare.
	 * @return True if first < second, false if first >= second.
	 */
	private boolean less( T first, T second )
	{
		return first.compareTo(second) < 0;
	}

	/**
	 * Exchanges two values in a list.
	 *
	 * @param list The list that holds the values to exchange.
	 * @param first The index of one value to exchage.
	 * @param second The index of the other value to exchage.
	 */
	private void exch( List<T> list, int first, int second )
	{
		T temp = list.get( first );
		list.set( first, list.get(second) );
		list.set( second, temp );
	}

	/**
	 * Prints the given list to standard out.
	 *
	 * @param list The list of values to print.
	 */
	private void show( List<T> list )
	{
		for( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get(i) + " " );
		}
		System.out.println();
	}

	/**
	 * Sorts the given list.
	 *
	 * @param list The list to sort.
	 * @return The sorted list.
	 */
	public abstract List<T> sort( List<T> list );

	/**
	 * Checks if the list is sorted.
	 *
	 * @param list The list to check.
	 * @return True if list, false if list isn't sorted.
	 */
	public boolean isSorted( List<T> list )
	{
		if( list.size() == 0 )
		{
			return false;
		}

		for( int i = 1; i < list.size(); i++ )
		{
			if( less(list.get(i), list.get(i-1)) )
			{
				return false;
			}
		}
		return true;
	}
}
