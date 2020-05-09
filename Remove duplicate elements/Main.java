#include<iostream>
using namespace std;
int main()
{
  int n, i, m=0, flag, count=0, x, j;
  cin>>n;
  int a[n], b[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    x=a[i];
    flag=0;
    for(j=0;j<m;j++)
    {
      if(x==b[j])
        flag++;
    }
    if(flag==0)
    {
      b[m++]=x;
    }
  }
  for(i=0;i<m;i++)
    cout<<b[i]<<endl;
  //Type your code here.
}