// C++ program to illustrate std::divides
// by dividing the respective elements of 2 arrays
#include <iostream> // std::cout
#include <functional> // std::divides
#include <algorithm> // std::transform

int main()
{
	// First array
	int first[] = { 10, 20, 30, 40, 50 };

	// Second array
	int second[] = { 1, 2, 3, 4, 5 };

	// Result array
	int results[5];

	// std::transform applies std::divides to the whole array
	std::transform(first, first + 5, second, results, std::divides<int>());

	// Printing the result array
	for (int i = 0; i < 5; i++)
		std::cout << results[i] << " ";

	return 0;
}
