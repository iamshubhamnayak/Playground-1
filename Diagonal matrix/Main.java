#include<iostream>
using namespace std;
int main()
{
  int n, flag=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j && a[i][j]==0)
        flag++;
      else if(i!=j && a[i][j]!=0)
        flag++;
    }
  }
  if(flag==0)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}