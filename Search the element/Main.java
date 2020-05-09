#include<iostream>
using namespace std;
int Bsearch(int A[], int start, int end, int element) {
   if(start>end) 
     return -1;
      int mid = (start+end)/2;
   if( A[mid] == element ) 
     return mid;
   else if( element < A[mid] )
      Bsearch(A, start, mid-1, element);
   else
      Bsearch(A, mid+1, end, element);
}
int main() {
  int n, res, x;
  cin>>n;
  int A[n];
  for(int i=0;i<n;i++)
    cin>>A[i];
  cin>>x;
  res=Bsearch(A,0,n,x);
  if(res==-1)
    cout<<"The number is not present in the list";
  else
    cout<<x;
}