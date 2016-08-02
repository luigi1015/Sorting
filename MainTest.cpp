#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <vector>

class SortingHandler
{
	private:

	protected:

	public:
		int generateRandInt(int min, int max);
		std::vector<int> generateRandInts(int num, int min, int max);
};

//Method for generating a random number for testing the sorting algorithms.
int SortingHandler::generateRandInt(int min, int max)
{
	srand( time(NULL) );//Looks like, at least on my desktop, time(NULL) is always giving the same value within the loop (which makes sense if it's in seconds), so probably want to find something else.
	return rand() % (max - min) + min;
}

//Method for generating a set of random numbers for testing the sorting algorithms.
std::vector<int> SortingHandler::generateRandInts(int num, int min, int max)
{
	std::vector<int> randomInts;
	if( num > 0 )
	{
		for( int i = 0; i < num; i++ )
		{
			int randInt = generateRandInt(min, max);
			randomInts.push_back( randInt );
		}
	}
	return randomInts;
}

int main( int argc, char *argv[] )
{
	SortingHandler sh;
	std::vector<int> randInts = sh.generateRandInts(10, 0, 100 );
	for( std::vector<int>::iterator randIntsIterator = randInts.begin(); randIntsIterator != randInts.end(); randIntsIterator++ )
	{
		std::cout << ' ' << *randIntsIterator;
	}
	std::cout << std::endl;
	return 0;
}
