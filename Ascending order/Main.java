#include<bits/stdc++.h>
using namespace std;
int main()
{
//fill your code
int n;
cin >> n;
int arr[n];
for(int i = 0; i < n; i++)
{
cin >> arr[i];
}
sort(arr,arr+n);
  cout<<"Sorted array is:\n";
for(int i = 0; i < n; i++)
{
cout << arr[i] <<endl;
}
}