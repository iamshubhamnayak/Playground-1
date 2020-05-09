#include<iostream>
using namespace std;
int main()
{
  int n, m, flag=0;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(a[i][j]!=a[j][i])
        flag++;
    }
  }
  if(flag==0)
    cout<<"Symmetric";
  else
    cout<<"Not Symmetric";
  //Type your code here.
}