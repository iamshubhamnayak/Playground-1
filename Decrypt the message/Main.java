#include<iostream>
using namespace std;
int main()
{
  int e, n, x, i=1, sum=0;
  cin>>e>>n;
  x=e+n;
  while(i<x)
  {
    if(x%i==0)
    {
      sum+=i;
    }
    i++;
  }
  if(x==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}