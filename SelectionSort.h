#ifndef _SELECTION_SORT
#define _SELECTION_SORT

#include "MainSort.h"

class AbstractSort: public MainSort
{
	private:

	protected:

	public:
		template <class T> std::vector<T> sort( std::vector<T> list );
};
#endif
