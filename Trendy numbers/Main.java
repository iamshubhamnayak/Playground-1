#include<iostream>
using namespace std;
int main()
{
  int n, dig, count=0, mid;
  cin>>n;
  dig = n;
  while(dig!=0)
  {
    count++;
    if(count==2)
      mid = dig%10;
    dig/=10;
  }
  if(count==3 && mid%3==0)
    cout<<"Trendy Number";
  else
    cout<<"Not a Trendy Number";
  //Type your code here.
}