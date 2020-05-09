#include<iostream>
using namespace std;
int main()
{
  int n, even=0, odd=0, tot;
  cin>>n;
  tot = n*n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(a[i][j]%2==0)
        even++;
      else
        odd++;
    }
  }
  if((even==tot && odd==0)||(odd==tot && even==0))
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}