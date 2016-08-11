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
