#include<iostream>
using namespace std;
int main()
{
  int s, e, x, i, j, sum;
  cin>>s>>e;
  for(i=s;i<=e;i++)
  {
    sum=0;
    x=i;
    j=1;
    while(j<x)
  {
    if(x%j==0)
    {
      sum+=j;
    }
    j++;
  }
  if(x==sum)
    cout<<i<<" ";
  }
}