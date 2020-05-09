#include<iostream>
using namespace std;
int main()
{
  int n, x, m;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>x;
  if(x>n)
    cout<<"Invalid Input";
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>m;
  cout<<"Array after insertion is\n";
  for(int i=0;i<n;i++)
  {
    if(i==x-1)
      cout<<m<<endl;
    cout<<a[i]<<endl;
  }
  }
  //Type your code here.
}