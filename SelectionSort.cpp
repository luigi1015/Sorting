#include "SelectionSort.h"

template <class T> std::vector<T> sort( std::vector<T> list )
{
	int length = list.length;
	for( int i = 0; i < length; i++ )
	{
		int min = i;
		for( int j = i+1; j < length; j++ )
		{
			if( less(list[j], list[min]) )
			{
				min = j;
			}
		}
		exch( list, i, min );
	}
	return list;
}
