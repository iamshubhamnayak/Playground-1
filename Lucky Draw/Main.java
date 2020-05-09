#include<iostream>
using namespace std;
int main()
{
  int n, i=2;
  cin>>n;
  while(i<n)
  {
    if(n%i==0)
      break;
    i++;
  }
  if(i==n)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}