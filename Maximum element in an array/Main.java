#include<iostream>
using namespace std;
int findMaxRec(int A[], int n) 
{ 
    if (n == 1) 
        return A[0]; 
    return max(A[n-1], findMaxRec(A, n-1)); 
} 
int main()
{
  int n;
  cout<<"Enter the size of the array\n";
  cin>>n;
  int A[n];
  cout<<"Enter "<<n<<" elements of an array\n";
  for(int i=0;i<n;i++)
    cin>>A[i];
  cout<<"Maximum element in the array is "<<findMaxRec(A, n);
  //Type your code here.
}