#include<iostream>
using namespace std;
int main()
{
  int n, even=0, odd=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    {
      cin>>a[i];
      if(a[i]%2==0)
        even++;
      else
        odd++;
    }
  cout<<"The array is ";
  if(even==n && odd==0)
    cout<<"Even";
  else if(odd==n && even==0)
    cout<<"Odd";
  else
    cout<<"Mixed";
  //Type your code here.
}