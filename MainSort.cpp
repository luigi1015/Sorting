#include "MainSort.h"

template <class T> bool AbstractSort::less( T first, T second )
{
	return first < second;
}

template <class T> void AbstractSort::exch( std::vector<T> list, int first, int second )
{
	T temp = list[first];
	list[first] = list[second];
	list[second] = temp;
}

template <class T> void AbstractSort::show( std::vector<T> list )
{
	for( int i = 0; i < list.size(); i++ )
	{
		std::cout << list[i] << " ";
	}
	std::cout << std::endl;
}

template <class T> bool AbstractSort::isSorted( std::vector<T> list )
{
	if( list.size() == 0 )
	{
		return false;
	}

	for( int i = 1; i < list.size(); i++ )
	{
		if( less(list[i], list[i-1]) )
		{
			return false;
		}
	}
	return true;
}
