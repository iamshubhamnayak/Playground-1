#include<iostream>
using namespace std;
int main()
{
  int n, odd=0, even=0, dig;
  cin>>n;
  while(n!=0)
  {
    dig=n%10;
    if(dig%2==0)
      even+=dig;
    else
      odd+=dig;
    n/=10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}