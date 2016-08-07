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
