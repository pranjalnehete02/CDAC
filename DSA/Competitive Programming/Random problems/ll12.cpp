#include <stdio.h>

void printValue(const int* ptr) {
    printf("Value: %d\n", *ptr); // Reading the data pointed to by the pointer
}

int main() {
    int value = 42;
    printValue(&value); // Passing a constant pointer to the value
    return 0;
}
