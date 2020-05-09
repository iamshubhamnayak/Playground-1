#include<iostream>
using namespace std;
int main()
{
  int n, sum=0, dig;
  cin>>n;
  dig=n;
  while(dig!=0)
  {
    sum+=(dig%10);
    dig/=10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  //Type your code here.
}