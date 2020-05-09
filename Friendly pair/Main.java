#include<iostream>
using namespace std;
int main()
{
  int n, m, i, sum1=0, sum2=0;
  cin>>n>>m;
  for(i=n/2;i>0;i--)
  {
    if(n%i==0)
      sum1+=i;
  }
  for(i=m/2;i>0;i--)
  {
    if(m%i==0)
      sum2+=i;
  }
  if((sum1==n)&&(sum2==m))
    cout<<"Friendly Pair";
  else
    cout<<"Not Friendly Pair";
  //Type your code here.
}