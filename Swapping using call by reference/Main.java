#include <iostream>
using namespace std;

// Function prototype
void swap(int&, int&);

int main()
{
    int a, b;
  	cin>>a>>b;
    cout << "Before swapping a= " << a <<" and b=" << b << endl;

    swap(a, b);

    cout << "After swapping a= " << a << " and b=" << b;

    return 0;
}

void swap(int& n1, int& n2) {
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}