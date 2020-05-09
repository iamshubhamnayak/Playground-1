#include<iostream>
using namespace std;
int arrsum(int a[], int n) 
{ 
    if (n <= 0) 
        return 0; 
    return (arrsum(a, n-1) + a[n-1]); 
} 
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<arrsum(a, n);
  //Type your code here.
}