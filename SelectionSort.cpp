#include <iostream>
#include <vector>
#include <random>
#include <fstream>

template <class T> class SelectionSort
{
	private:
		static bool less( T first, T second )
		{
			return first < second;
		}

		static void exch( std::vector<T> &list, int first, int second )
		{
			T temp = list[first];
			list[first] = list[second];
			list[second] = temp;
		}

		static void show( std::vector<T> list )
		{
			for( int i = 0; i < list.size(); i++ )
			{
				std::cout << list[i] << " ";
			}
			std::cout << std::endl;
		}

	protected:

	public:
		std::vector<T> sort( std::vector<T> &list )
		{
			int length = list.size();
			for( int i = 0; i < length; i++ )
			{
				int min = i;
				for( int j = i+1; j < length; j++ )
				{
					if( list[j] < list[min] )
					{
						min = j;
					}
				}
				exch( list, i, min );
			}
			return list;
		}

		static bool isSorted( std::vector<T> list )
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
};
