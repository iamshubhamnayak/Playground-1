#include<iostream>
using namespace std;
int main()
{
  int n, i, sum=0;
  cin>>n;
  for(i=n/2;i>0;i--)
  {
    if(n%i==0)
      sum+=i;
  }
  if(sum>n)
    cout<<"Abundant Number";
  else
    cout<<"Not Abundant Number";
  //Type your code here.
}