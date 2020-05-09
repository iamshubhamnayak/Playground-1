#include<iostream>
using namespace std;
int main()
{
  int n, lar, sml;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(i==0)
    {
      lar=a[0];
      sml=a[0];
    }
    if(lar<a[i])
      lar=a[i];
    if(sml>a[i])
      sml=a[i];
  }
  cout<<"The range of the array is "<<lar-sml;
  //Type your code here.
}