#include<iostream>
using namespace std;
int prime(int n, int i=2)
{
  if(i==n)
    return 1;
  else if(n%i==0)
    return 0;
  else
    return prime(n, i+1);
}
int main()
{
  int n;
  cin>>n;
  if(prime(n))
    cout<<"Prime Number";
  else
    cout<<"Not a Prime Number";
  //Type your code here.
}