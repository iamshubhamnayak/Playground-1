#include<iostream>
using namespace std;
int decbin(int n) 
{ 
    if (n == 0)  
        return 0;  
    else
        return (n % 2 + 10 * decbin(n / 2)); 
} 
int main() 
{ 
    int n;
    cin>>n;
    cout<<decbin(n); 
} 