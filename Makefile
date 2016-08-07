all: SelectionSort.o SortingHandler

SortingHandler: SortingHandler.cpp SelectionSort.cpp
	g++ -std=c++11 -Wall -o SortingHandler SortingHandler.cpp SelectionSort.cpp

SelectionSort.o: SelectionSort.cpp
	g++ -std=c++11 -Wall -c -o SelectionSort.o SelectionSort.cpp

clean:
	if [ -e SortingHandler ]; then rm SortingHandler; fi;
	if [ -e *~ ]; then rm *~; fi;
	if [ -e *.o ]; then rm *.o; fi;
	if [ -e *.gch ]; then rm *.gch; fi;
