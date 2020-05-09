#include<iostream>
using namespace std;
int main()
{
  int n, even=0, odd=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      even+=a[i];
    else
      odd+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\nThe sum of the odd numbers in the array is "<<odd;
  //Type your code here.
}