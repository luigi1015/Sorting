import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

//public class SelectionSort<T extends Comparable<? super T>>
public class SelectionSort<T extends Comparable<T>>
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

	/**
	 * Constructor.
	 */
	public SelectionSort()
	{
	}

	/**
	 * Main method. Generates some random values and runs the sort.
	 *
	 * @param  args The command line arguments when the program is run.
	 */
	public static void main( String[] args )
	{
		SelectionSort<Integer> selectionSort = new SelectionSort();
		List<Integer> randomInts = generateRandomInts( 10 );
		selectionSort.show( randomInts );
		selectionSort.sort( randomInts );
		selectionSort.show( randomInts );
		//System.out.println( hw.getTextToDisplay() );
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
