#include<iostream>
using namespace std;
int main()
{
  int n, cup, tot=0;
  cin>>n>>cup;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    tot+=a[i];
  }
  if(tot<=cup)
    cout<<"YES";
  else
    cout<<"NO";
  //Type your code here.
}