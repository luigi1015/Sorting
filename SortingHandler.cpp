#include <iostream>
#include <vector>
#include <random>
#include <fstream>
#include "SelectionSort.cpp"

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
	std::ifstream randfile("/dev/urandom");
	unsigned int seed = 0;
	if( randfile.is_open() )
	{
		randfile.read( reinterpret_cast<char*>(&seed), sizeof(seed) );
	}
	randfile.close();
	std::default_random_engine dre(seed);
	std::uniform_int_distribution<int> di(min, max);
	return di(dre);
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

void printVector( std::vector<int> vectorToPrint )
{
	for( std::vector<int>::iterator vectorIterator = vectorToPrint.begin(); vectorIterator != vectorToPrint.end(); vectorIterator++ )
	{
		std::cout << ' ' << *vectorIterator;
	}
	std::cout << std::endl;
}

int main( int argc, char *argv[] )
{
	SortingHandler sh;
	std::vector<int> randInts = sh.generateRandInts(10, 0, 100 );
	printVector( randInts );
	SelectionSort<int>::sort( randInts );
	printVector( randInts );
	if( SelectionSort<int>::isSorted( randInts ) == true )
	{
		std::cout << "Sorted" << std::endl;
	}
	else
	{
		std::cout << "Not Sorted" << std::endl;
	}
	return 0;
}
