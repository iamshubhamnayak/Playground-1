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
    for(int j=i+1;j<n;j++)
      if(a[i][j]!=0)
        flag++;
  
  if(flag)
    cout<<"Not a Lower Triangular Matrix";
  else
    cout<<"Lower Triangular Matrix";
  //Type your code here.
  
}