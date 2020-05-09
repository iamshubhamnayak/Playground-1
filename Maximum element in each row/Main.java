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
  for(int i=0;i<n;i++)
  {
    lar=0;
    for(int j=0;j<m;j++)
    {
      if(lar<a[i][j])
        lar=a[i][j];
    }
    cout<<lar<<endl;
  }
  //Type your code here.
}