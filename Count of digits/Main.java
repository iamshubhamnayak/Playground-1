#include<iostream>
using namespace std;
int main()
{
  long int n, i=0;
  cin>>n;
  while(n!=0)
  {
    n/=10;
    i++;
  }
  if(i==0)
    cout<<1;
  else
  cout<<i;
  // Type your code here
}