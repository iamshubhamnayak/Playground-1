#include<iostream>
using namespace std;
void Sum(int arr[], int i, int sum) 
{ 
    if (i < 0)
    { 
        cout<<"The sum of the even elements in the array is "<<sum; 
        return; 
    } 
    if ((arr[i]) % 2 == 0)
        sum += (arr[i]); 
    Sum(arr, i - 1, sum); 
} 
int main()
{
  int n, sum=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  Sum(a, n - 1, sum);
  //Type your code here.
}