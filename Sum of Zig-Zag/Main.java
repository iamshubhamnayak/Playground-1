#include<iostream>
using namespace std;
int main()
{
  int n, m, sum=0;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(i==0)
      	sum += a[i][j];
      else if(i==j)
        sum += a[i][j];
      else if(i==n-1)
        sum += a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  //Type your code here.
}