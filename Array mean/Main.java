#include<iostream>
using namespace std;
int main()
{
  int n;
  float sum=0, mean;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum+=a[i];
  }
  mean = sum/n;
  cout<<"The mean of the array is "<<mean;
  //Type your code here.
}