#include<iostream>
using namespace std;
int main()
{
  int n, flag;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=1;i<n;i++)
    for(int j=0;j<i;j++)
      if(a[i][j]!=0)
        flag=0;
  	  else
        flag=1;
  
  if(flag==1)
    cout<<"Upper Triangular Matrix";
  else
    cout<<"Not an Upper Triangular Matrix";
  //Type your code here.
  
}