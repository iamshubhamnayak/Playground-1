#include<iostream>
using namespace std;
int sum(int n) 
{ 
    if (n == 0) 
       return 0; 
    return (n % 10 + sum(n / 10)); 
} 
int main()
{
  int n, x;
  cin>>n;
  x=sum(n);
  while(x>9)
    x=sum(x);
  cout<<x;
  //Type your code here.
}