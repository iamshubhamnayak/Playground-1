#include<iostream>
using namespace std;
int decbin(int n, int base) 
{ 
    if (n == 0)  
        return 0;  
    else
        return (n % base + 10 * decbin(n / base, base)); 
} 
int main() 
{ 
    int n, base;
    cout<<"Enter the value of n\n";
    cin>>n;
    cout<<"Enter the base to which you want to convert\n";
    cin>>base;
    cout<<"The number in base "<<base<<" is "<<decbin(n, base); 
} 