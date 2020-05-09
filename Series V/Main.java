#include<iostream>
using namespace std;
int main()
{
  int n, x=11;
  cin>>n;
  for(int i=1;i<=n;i++, x+=4)
    cout<<x*x<<" ";
  //Type your code here.
}