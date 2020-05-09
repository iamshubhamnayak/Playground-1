#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<n;
    }
    cout<<endl;
    n++;
  }
  n--;
  for(int i=4;i>=1;i--)
  {
    for(int j=i;j>=1;j--)
    {
      cout<<n;
    }
    cout<<endl;
    n--;
  }
}