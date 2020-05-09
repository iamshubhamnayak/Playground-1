#include<iostream>
using namespace std;
int main()
{
  int n, m, lar;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
  {
    lar=0;
    for(int j=0;j<n;j++)
    {
      if(lar<a[j][i])
        lar=a[j][i];
    }
    cout<<lar<<endl;
  }
  //Type your code here.
}