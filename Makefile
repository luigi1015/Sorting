all: MainTest

MainTest: MainTest.cpp
	g++ -std=c++11 -Wall -o MainTest MainTest.cpp

clean:
	if [ -e MainTest ]; then rm MainTest; fi;
	if [ -e *~ ]; then rm *~; fi;
	if [ -e *.o ]; then rm *.o; fi;
	if [ -e *.gch ]; then rm *.gch; fi;
