#include<iostream>
using namespace std;
int main()
{
  int n, flag=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int m;
  cin>>m;
  int b[m];
  for(int i=0;i<m;i++)
    cin>>b[i];
  if(m==n)
  {
    for(int i=0;i<n;i++)
    {
      if(a[i]<b[i])
        flag++;
    }
  }
  else
    flag++;
  if(flag==0)
    cout<<"Compatible";
  else
    cout<<"Incompatible";
  //Type your code here.
}